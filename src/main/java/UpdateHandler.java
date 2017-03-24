import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import sign.signlink;

public class UpdateHandler {

        public client client;
        public final int BUFFER = 1024;

        private URL url;
        public String clientVLink = "http://www.project-decimate.net/clientData.php?req=client";
        public String cacheVLink = "http://www.project-decimate.net/clientData.php?req=cache";
        public String cacheLink = "http://www.project-decimate.net/cache.zip";
        public int localClientVersion = 10;

        public String clientLink = "http://www.project-decimate.net/Project-Decimate.jar";
        public String fileToExtract = getCacheDir() + getArchivedName();

        public UpdateHandler(client client) {
                this.client = client;
        }

        public void drawLoadingText(String text) {
                client.drawLoadingText(35, text);
        }

        public void drawLoadingText(int amount, String text) {
                client.drawLoadingText(amount, text);
        }

        public String getCacheDir() {
                return signlink.findcachedir();
        }

        public String getCacheLink() {
                return cacheLink;
        }

        public String getClientLink() {
                return clientLink;
        }

        public UpdateHandler checkForUpdates() {
                String clientV;
                String cacheV;
                int clientVersion = 0;
                int cacheVersion = 0;
                URLConnection conn;

                try {
                        url = new URL(clientVLink);
                        conn = url.openConnection();
                        BufferedReader br = new BufferedReader(new InputStreamReader(
                                        conn.getInputStream()));
                        while ((clientV = br.readLine()) != null) {
                                System.out.println("Client version: " + clientV);
                                clientVersion = Integer.parseInt(clientV);
                        }
                        br.close();

                        url = new URL(cacheVLink);
                        conn = url.openConnection();
                        br = new BufferedReader(
                                        new InputStreamReader(conn.getInputStream()));
                        while ((cacheV = br.readLine()) != null) {
                                System.out.println("Cache version: " + cacheV);
                                cacheVersion = Integer.parseInt(cacheV);
                        }
                        br.close();

                        if (cacheUpdate(cacheVersion)) {
                                System.out.println("Downloading cache.");
                                downloadCache(getCacheLink(), getArchivedName());
                                unZip();
                                deleteArchive(getArchivedName());
								try {
									BufferedWriter versionFile = new BufferedWriter(new FileWriter(getCacheDir() + "/cv" + cacheVersion + ".dat"));
								} catch(Exception e) {
								
								}
                        }
						
                        if (clientVersion > localClientVersion) {
                                System.out.println("Downloading client.");
                                downloadClient(getClientLink(), getClientName());
                        }
                        if (clientVersion == cacheVersion) {
                                System.out.println("Everything is good!");
                        }
                } catch (Exception e) {
                }
                return null;
        }

		public boolean cacheUpdate(int currentCacheVersion)
		{
			try{
				File version = new File(getCacheDir() + "/cv" + currentCacheVersion + ".dat");
				if(!version.exists()) {
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
        public void downloadClient(String address, String localFileName) {
                
                File path = new File(System.getProperty("user.home") + "/Desktop/"
                                + localFileName);
                if(!path.exists()) {
                        
                }
                OutputStream out = null;
                URLConnection conn;
                InputStream in = null;
                try {
                        URL url = new URL(address);
                        if(!path.exists()) {
                                out = new BufferedOutputStream(new FileOutputStream(System.getProperty("user.home") + "/Desktop/" + localFileName));
                        } else {
                                deleteClient(getClientName());
                                out = new BufferedOutputStream(new FileOutputStream(System.getProperty("user.home") + "/Desktop/" + localFileName));
                        }
                        conn = url.openConnection();
                        in = conn.getInputStream();
                        byte[] data = new byte[BUFFER];
                        int numRead;
                        long numWritten = 0;
                        int length = conn.getContentLength();
                        while ((numRead = in.read(data)) != -1) {
                                out.write(data, 0, numRead);
                                numWritten += numRead;
                                int percentage = (int) (((double) numWritten / (double) length) * 100D);
                                drawLoadingText(percentage, "Downloading Client" + percentage
                                                + "%");
                        }
                        drawLoadingText("Finished downloading " + getClientName() + "!");
                } catch (Exception exception) {
                        exception.printStackTrace();
                } finally {
                        try {
                                if (in != null) {
                                        in.close();
                                }
                                if (out != null) {
                                        out.close();
                                }
                        } catch (IOException ioe) {
                        }
                }
				drawLoadingText("Please load the new client on your desktop.");
				try {
				Thread.sleep(10000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
                System.exit(0);
        }

        public void downloadCache(String address, String localFileName) {
                OutputStream out = null;
                URLConnection conn;
                InputStream in = null;
                try {
                        URL url = new URL(address);
                        out = new BufferedOutputStream(new FileOutputStream(getCacheDir()
                                        + "/" + localFileName));
                        conn = url.openConnection();
                        in = conn.getInputStream();
                        byte[] data = new byte[BUFFER];
                        int numRead;
                        long numWritten = 0;
                        int length = conn.getContentLength();
                        while ((numRead = in.read(data)) != -1) {
                                out.write(data, 0, numRead);
                                numWritten += numRead;
                                int percentage = (int) (((double) numWritten / (double) length) * 100D);
                                drawLoadingText(percentage, "Downloading Cache " + percentage
                                                + "%");
                        }
                        drawLoadingText("Finished downloading " + getArchivedName() + "!");
                } catch (Exception exception) {
                        exception.printStackTrace();
                } finally {
                        try {
                                if (in != null) {
                                        in.close();
                                }
                                if (out != null) {
                                        out.close();
                                }
                        } catch (IOException ioe) {
                        }
                }
        }

        public String getArchivedName() {
                int lastSlashIndex = getCacheLink().lastIndexOf('/');
                if (lastSlashIndex >= 0 && lastSlashIndex < getCacheLink().length() - 1) {
                        return getCacheLink().substring(lastSlashIndex + 1);
                } else {
                }
                return "";
        }

        public String getClientName() {
                int lastSlashIndex = getClientLink().lastIndexOf('/');
                if (lastSlashIndex >= 0
                                && lastSlashIndex < getClientLink().length() - 1) {
                        return getClientLink().substring(lastSlashIndex + 1);
                } else {
                }
                return "";
        }

        public void deleteArchive(String fileName) {
                File f = new File(getCacheDir() + fileName);
                if (!f.exists())
                        throw new IllegalArgumentException(
                                        "Delete: no such file or directory: " + fileName);
                if (!f.canWrite())
                        throw new IllegalArgumentException("Delete: write protected: "
                                        + fileName);
                if (f.isDirectory()) {
                        String[] files = f.list();
                        if (files.length > 0)
                                throw new IllegalArgumentException(
                                                "Delete: directory not empty: " + fileName);
                }
                boolean success = f.delete();
                if (!success)
                        throw new IllegalArgumentException("Delete: deletion failed");
        }
        
        public void deleteClient(String fileName) {
                File f = new File(System.getProperty("user.home") + "/Desktop/" + fileName);
                if (!f.exists())
                        throw new IllegalArgumentException(
                                        "Delete: no such file or directory: " + fileName);
                if (!f.canWrite())
                        throw new IllegalArgumentException("Delete: write protected: "
                                        + fileName);
                if (f.isDirectory()) {
                        String[] files = f.list();
                        if (files.length > 0)
                                throw new IllegalArgumentException(
                                                "Delete: directory not empty: " + fileName);
                }
                boolean success = f.delete();
                if (!success)
                        throw new IllegalArgumentException("Delete: deletion failed");
        }

        public static boolean delete(String path) {
                if (path == null || path.trim().length() == 0)
                        return false;
                return delete(new File(path));
        }

        public static boolean delete(File fileOrDirectory) {
                if (fileOrDirectory == null)
                        return false;
                if (!fileOrDirectory.exists())
                        return false;
                if (fileOrDirectory.isDirectory()) {
                        for (File childFile : fileOrDirectory.listFiles()) {
                                delete(childFile);
                        }
                }
                return fileOrDirectory.delete();
        }

        public void unZip() {
                try {
                        InputStream in = new BufferedInputStream(new FileInputStream(
                                        fileToExtract));
                        ZipInputStream zin = new ZipInputStream(in);
                        ZipEntry e;
                        while ((e = zin.getNextEntry()) != null) {
                                if (e.isDirectory()) {
                                        (new File(getCacheDir() + e.getName())).mkdir();
                                } else {
                                        if (e.getName().equals(fileToExtract)) {
                                                unzip(zin, fileToExtract);
                                                break;
                                        }
                                        unzip(zin, getCacheDir() + e.getName());
                                }
                        }
                        zin.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        public void unzip(ZipInputStream zin, String s) throws IOException {
                FileOutputStream out = new FileOutputStream(s);
                byte[] b = new byte[BUFFER];
                int len = 0;
                while ((len = zin.read(b)) != -1) {
                        out.write(b, 0, len);
                }
                out.close();
        }
}