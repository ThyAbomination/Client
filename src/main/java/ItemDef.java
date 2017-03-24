import java.io.*;
import sign.signlink;

public final class ItemDef {
	
	   /**
         * Dumps the currently loaded list of items into ItemList.txt.
         * The resultant file will contain their IDs and names.
         */
		 
        public static void dumpItems() {
                // Initialising our bw object and writing the list header
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter("ItemList.txt", true));
					bw.write("ID\t\tName");
					bw.newLine();
					
                // Looping through definitions
                for (int i = 0; i < 25085; i++) {
					ItemDef itemDef = ItemDef.forID(i);
                        // Checking if the current definition has a valid name
                        if (itemDef.name != null) {
							try {
                                bw.write(i + "\t\t" + itemDef.name);
                                bw.newLine();
								} catch (IOException ioe2) {
								
								}
                        }
                }
               
                // Terminating the bw object after flushing the queue
                bw.flush();
                bw.close();
				} catch (IOException ioe2) {
				
				}
        }
		
	public static void dumpItem(int id){
                        ItemDef itemDef = ItemDef.forID(id);
                        BufferedWriter bw = null;
                        try {
                                bw = new BufferedWriter(new FileWriter("ItemDef.txt", true));
                                if(itemDef.name != null) {
                                        bw.write("case "+id+":\nitemDef.name = "+itemDef.name+";");
                                        bw.newLine();
                                        bw.write("itemDef.itemActions = new String[] {"+itemDef.actions[1] + ", "
                                        +itemDef.actions[2] + ", "+itemDef.actions[3] + ", "+itemDef.actions[4] + "}; ");
                                        bw.newLine();
                                        bw.write("itemDef.groundActions = new String[] {"+itemDef.groundActions[1] + ", "
                                        +itemDef.groundActions[2] + ", "+itemDef.groundActions[3] + ", "+itemDef.groundActions[4] + "}; ");
                                        bw.newLine();
                                        bw.write("itemDef.anInt165 = "+ itemDef.anInt165+ ";\n itemDef.anInt200 = "+itemDef.anInt200+";");
                                        bw.newLine();
                                        bw.write("itemDef.modelID = "+itemDef.modelID+";");
                                        bw.newLine();
                                        bw.write("itemDef.description = "+itemDef.description);
                                        bw.newLine();
                                        bw.write("itemDef.modelZoom = "+itemDef.modelZoom+";");
                                        bw.newLine();
                                        bw.write("itemDef.modelRotation1 = "+itemDef.modelRotation1+";");
                                        bw.newLine();
                                        bw.write("itemDef.modelRotation2 = "+itemDef.modelRotation2+";");
                                        bw.newLine();
                                        bw.write("itemDef.modelOffset1 = "+itemDef.modelOffset1+";");
                                        bw.newLine();
                                        bw.write("itemDef.modelOffset2 = "+itemDef.modelOffset2+";");
                                        bw.newLine();
                                        bw.write("break;");
                                        bw.newLine();
                                        bw.flush();
                                        bw.close();
                                }
                        } catch (IOException ioe2) {
                        }
                }

	public static void nullLoader() {
		mruNodes2 = null;
		mruNodes1 = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public boolean method192(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		return flag;
	}

	public Model method194(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return null;
		Model model = Model.method462(k);
		if (l != -1) {
			Model model_1 = Model.method462(l);
			Model models[] = { model, model_1 };
			model = new Model(2, models);
		}
		if (editedModelColor != null) {
			for (int i1 = 0; i1 < editedModelColor.length; i1++)
				model.method476(editedModelColor[i1], newModelColor[i1]);
		}
		return model;
	}

	public boolean method195(int j) {
		int k = anInt165;
		int l = anInt188;
		int i1 = anInt185;
		if (j == 1) {
			k = anInt200;
			l = anInt164;
			i1 = anInt162;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		if (i1 != -1 && !Model.method463(i1))
			flag = false;
		return flag;
	}

	public Model method196(int i) {
		int j = anInt165;
		int k = anInt188;
		int l = anInt185;
		if (i == 1) {
			j = anInt200;
			k = anInt164;
			l = anInt162;
		}
		if (j == -1)
			return null;
		Model model = Model.method462(j);
		if (k != -1)
			if (l != -1) {
				Model model_1 = Model.method462(k);
				Model model_3 = Model.method462(l);
				Model model_1s[] = { model, model_1, model_3 };
				model = new Model(3, model_1s);
			} else {
				Model model_2 = Model.method462(k);
				Model models[] = { model, model_2 };
				model = new Model(2, models);
			}
		if (i == 0 && aByte205 != 0)
			model.method475(0, aByte205, 0);
		if (i == 1 && aByte154 != 0)
			model.method475(0, aByte154, 0);
		if (editedModelColor != null) {
			for (int i1 = 0; i1 < editedModelColor.length; i1++)
				model.method476(editedModelColor[i1], newModelColor[i1]);
		}
		return model;
	}

	public void setDefaults() {
		modelID = 0;
		name = null;
		description = null;
		editedModelColor = null;
		newModelColor = null;
		modelZoom = 2000;
		modelRotation1 = 0;
		modelRotation2 = 0;
		anInt204 = 0;
		modelOffset1 = 0;
		modelOffset2 = 0;
		stackable = false;
		value = 1;
		membersObject = false;
		groundActions = null;
		actions = null;
		anInt165 = -1;
		anInt188 = -1;
		aByte205 = 0;
		anInt200 = -1;
		anInt164 = -1;
		aByte154 = 0;
		anInt185 = -1;
		anInt162 = -1;
		anInt175 = -1;
		anInt166 = -1;
		anInt197 = -1;
		anInt173 = -1;
		stackIDs = null;
		stackAmounts = null;
		certID = -1;
		certTemplateID = -1;
		anInt167 = 128;
		anInt192 = 128;
		anInt191 = 128;
		anInt196 = 0;
		anInt184 = 0;
		team = 0;
		lendID = -1;
		lentItemID = -1;
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		/*stream = new Stream(FileOperations.ReadFile("./Cache/obj.dat"));
		Stream stream = new Stream(FileOperations.ReadFile("./Cache/obj.idx")); */
		stream = new Stream(streamLoader.getDataForName("obj.dat"));
		Stream stream = new Stream(streamLoader.getDataForName("obj.idx"));
		totalItems = stream.readUnsignedWord();
		streamIndices = new int[totalItems+1000];
		int i = 2;
		for (int j = 0; j < totalItems; j++) {
			streamIndices[j] = i;
			i += stream.readUnsignedWord();
		}
		cache = new ItemDef[10];
		for (int k = 0; k < 10; k++)
			cache[k] = new ItemDef();
	}
 

	public static ItemDef forID(int i) {
		for (int j = 0; j < 10; j++)
			if (cache[j].ID == i)
				return cache[j];
		cacheIndex = (cacheIndex + 1) % 10;
		ItemDef itemDef = cache[cacheIndex];
		stream.currentOffset = streamIndices[i];
		itemDef.ID = i;
		itemDef.setDefaults();
		itemDef.readValues(stream);
		if (itemDef.certTemplateID != -1)
			itemDef.toNote();
		if (itemDef.lentItemID != -1)
			itemDef.toLend();
        if (itemDef.editedModelColor != null) {
			for (int i2 = 0; i2 < itemDef.editedModelColor.length; i2++) {
				if (itemDef.newModelColor[i2] == 0) {
					itemDef.newModelColor[i2] = 1;
				}
			}
		}
        if (itemDef.ID == 6568 || itemDef.ID == 14479 || itemDef.ID == 3140	
		|| itemDef.ID == 10338 || itemDef.ID == 10340 || itemDef.ID == 10344
		|| itemDef.ID == 559 || itemDef.ID == 10499 || itemDef.ID == 11789
		|| itemDef.ID == 19337 || itemDef.ID == 19342 || itemDef.ID == 19336
		|| itemDef.ID == 19341 || itemDef.ID == 11335 && itemDef.newModelColor == null) {
			itemDef.editedModelColor = new int [1];
			itemDef.newModelColor = new int [1];
			itemDef.editedModelColor[0] = 0;
			itemDef.newModelColor[0] = 1;
		}
		if (!isMembers && itemDef.membersObject) {
			itemDef.name = "Members Object";
			itemDef.description = "Login to a members' server to use this object.";
			itemDef.groundActions = null;
			itemDef.actions = null;
			itemDef.team = 0;
		}
			switch (itemDef.ID) {
		case 19021:
			itemDef.name = "Ragefire boots";
			itemDef.modelID = 53897;
			itemDef.modelZoom = 900;
			itemDef.modelRotation1 = 165;
			itemDef.modelRotation2 = 99;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 =-7;
			itemDef.anInt165 = 53330;
			itemDef.anInt200 = 53330;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.description = "Ragefire boots";
		break;
		case 19022:
			itemDef.name = "Steadfast Boots";
			itemDef.modelID = 53835;
			itemDef.modelZoom = 900;
			itemDef.modelRotation1 = 165;
			itemDef.modelRotation2 = 99;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 =-7;
			itemDef.anInt165 = 53327;
			itemDef.anInt200 = 53327;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.description = "Steadfast boots";
		break;
		case 19023:
			itemDef.name = "Glaiven boots";
			itemDef.modelID = 53828;
			itemDef.modelZoom = 900;
			itemDef.modelRotation1 = 165;
			itemDef.modelRotation2 = 99;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 =-7;
			itemDef.anInt165 = 53309;
			itemDef.anInt200 = 53309;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.description = "Glaiven boots";
		break;
		case 19011:
			itemDef.name = "Ganodermic visor";
			itemDef.description = "Ganodermic visor";
			itemDef.modelID = 10935;
			itemDef.anInt165 = 10373;
			itemDef.anInt200 = 10523;
			itemDef.modelZoom = 1118;
			itemDef.modelRotation1 = 215;
			itemDef.modelRotation2 = 175;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -30;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
		break;
		case 19012:
			itemDef.name = "Ganodermic poncho";
			itemDef.description = "Ganodermic poncho";
			itemDef.modelID = 10919;
			itemDef.anInt165 = 10490;
			itemDef.anInt200 = 10664;
			itemDef.modelZoom = 1513;
			itemDef.modelRotation1 = 485;
			itemDef.modelRotation2 = 13;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -3;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
		break;
		case 19013:
			itemDef.name = "Ganodermic leggings";
			itemDef.description = "Ganodermic leggings";
			itemDef.modelID = 10942;
			itemDef.anInt165 = 10486;
			itemDef.anInt200 = 10578;
			itemDef.modelZoom = 1513;
			itemDef.modelRotation1 = 498;
			itemDef.modelRotation2 = 0;
			itemDef.modelOffset1 = 8;
			itemDef.modelOffset2 = -18;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
		break;
		case 19014:
			itemDef.name = "Polypore staff";
			itemDef.description = "Polypore staff";
			itemDef.modelID = 13426;
			itemDef.anInt165 = 13417;
			itemDef.anInt200 = 13417;
			itemDef.modelZoom = 3750;
			itemDef.modelRotation1 = 1454;
			itemDef.modelRotation2 = 997;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = 8;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
		break;
		case 19864:
			itemDef.name = "PvP token";
			itemDef.description = "You may redeem these tokens at the PvP Exchange.";
		break;
		case 10831:
			itemDef.name = "Empty coin bag";
			itemDef.actions[0] = "Fill";
		    itemDef.description = "Empty coin bag";
			break;
		case 10835:
			itemDef.name = "Full coin bag";
			itemDef.actions[0] = "Empty";
			itemDef.description = "Full coin bag";
		break;
		case 19003:
		itemDef.modelID = 62693;
		itemDef.name = "Pernix cowl";
		itemDef.description = "Pernix cowl";
		itemDef.modelZoom = 800;
		itemDef.modelRotation1 = 532;
		itemDef.modelRotation2 = 14;
		itemDef.modelOffset1 = -1;
		itemDef.modelOffset2 = 1;
		itemDef.anInt165 = 62739;
		itemDef.anInt200 = 62756;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
		itemDef.anInt175 = 62731;
		itemDef.anInt197 = 62727;
		itemDef.editedModelColor = new int[2];
  		itemDef.newModelColor = new int[2];
   		itemDef.editedModelColor[0] = 4550;
   		itemDef.newModelColor[0] = 0;
   		itemDef.editedModelColor[1] = 4540;
   		itemDef.newModelColor[1] = 0;
	break;

	case 19004:
		itemDef.modelID = 62709;
		itemDef.name = "Pernix body";
		itemDef.description = "Pernix body";
		itemDef.modelZoom = 1378;
		itemDef.modelRotation1 = 485;
		itemDef.modelRotation2 = 2042;
		itemDef.modelOffset1 = -1;
		itemDef.modelOffset2 = 7;
		itemDef.anInt165 = 62744;
		itemDef.anInt200 = 62765;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
	break;

	case 19005:
		itemDef.modelID = 62695;
		itemDef.name = "Pernix chaps";
		itemDef.description = "Pernix chaps";
		itemDef.modelZoom = 1740;
		itemDef.modelRotation1 = 504;
		itemDef.modelRotation2 = 0;
		itemDef.modelOffset1 = 4;
		itemDef.modelOffset2 = 3;
		itemDef.anInt165 = 62741;
		itemDef.anInt200 = 62757;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
	break;
	
	case 19006:
		itemDef.modelID = 62710;
		itemDef.name = "Virtus mask";
		itemDef.description = "Virtus mask";
		itemDef.modelZoom = 928;
		itemDef.modelRotation1 = 406;
		itemDef.modelRotation2 = 2041;
		itemDef.modelOffset1 = 1;
		itemDef.modelOffset2 = -5;
		itemDef.anInt165 = 62736;
		itemDef.anInt200 = 62755;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
		itemDef.anInt175 = 62728;
		itemDef.anInt197 = 62728;
	break;

	case 19007:
		itemDef.modelID = 62704;
		itemDef.name = "Virtus robe top";
		itemDef.description = "Virtus robe top";
		itemDef.modelZoom = 1122;
		itemDef.modelRotation1 = 488;
		itemDef.modelRotation2 = 3;
		itemDef.modelOffset1 = 1;
		itemDef.modelOffset2 = 0;
		itemDef.anInt165 = 62748;
		itemDef.anInt200 = 62764;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
	break;

	case 19008:
		itemDef.modelID = 62700;
		itemDef.name = "Virtus robe legs";
		itemDef.description = "Virtus robe legs";
		itemDef.modelZoom = 1740;
		itemDef.modelRotation1 = 498;
		itemDef.modelRotation2 = 2045;
		itemDef.modelOffset1 = -1;
		itemDef.modelOffset2 = 4;
		itemDef.anInt165 = 62742;
		itemDef.anInt200 = 62758;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
	break;
	case 19016:
		itemDef.modelID = 62694;
		itemDef.name = "Ancient ceremonial hood";
		itemDef.modelZoom = 980;
		itemDef.modelRotation1 = 208;
		itemDef.modelRotation2 = 220;
		itemDef.modelOffset1 = 0;
		itemDef.modelOffset2 = -18;
		itemDef.anInt165 = 62737;
		itemDef.anInt200 = 62753;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[4] = "Drop";
		itemDef.anInt175 = 62730;
		itemDef.anInt197 = 62730;
	break;

	case 19017:
		itemDef.modelID = 62705;
		itemDef.name = "Ancient ceremonial top";
		itemDef.modelZoom = 1316;
		itemDef.modelRotation1 = 477;
		itemDef.modelRotation2 = 9;
		itemDef.modelOffset1 = 0;
		itemDef.modelOffset2 = 13;
		itemDef.anInt165 = 62745;
		itemDef.anInt200 = 62763;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[4] = "Drop";
		itemDef.anInt204 = 54;
	break;

	case 19018:
		itemDef.modelID = 62707;
		itemDef.name = "Ancient ceremonial legs";
		itemDef.modelZoom = 1828;
		itemDef.modelRotation1 = 539;
		itemDef.modelRotation2 = 0;
		itemDef.modelOffset1 = -1;
		itemDef.modelOffset2 = 0;
		itemDef.anInt165 = 62740;
		itemDef.anInt200 = 62759;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[4] = "Drop";
		itemDef.anInt204 = 40;
		itemDef.anInt196 = 30;
		itemDef.anInt184 = 100;
	break;

	case 19019:
		itemDef.modelID = 62697;
		itemDef.name = "Ancient ceremonial gloves";
		itemDef.modelZoom = 548;
		itemDef.modelRotation1 = 618;
		itemDef.modelRotation2 = 1143;
		itemDef.modelOffset1 = 0;
		itemDef.modelOffset2 = -5;
		itemDef.anInt165 = 62735;
		itemDef.anInt200 = 62752;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[4] = "Drop";
	break;

	case 19020:
		itemDef.modelID = 62696;
		itemDef.name = "Ancient ceremonial boots";
		itemDef.modelZoom = 676;
		itemDef.modelRotation1 = 63;
		itemDef.modelRotation2 = 106;
		itemDef.modelOffset1 = 5;
		itemDef.modelOffset2 = -1;
		itemDef.anInt165 = 62734;
		itemDef.anInt200 = 62751;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[4] = "Drop";
	break;

		case 14207:
	itemDef.name = "Potion flask";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61741;
break;
case 14200:
	itemDef.name = "Prayer flask (6)";
	itemDef.description = "6 doses of prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 28488 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61732;
break;
case 14198:
	itemDef.name = "Prayer flask (5)";
	itemDef.description = "5 doses of prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 28488 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61729;
break;
case 14196:
	itemDef.name = "Prayer flask (4)";
	itemDef.description = "4 doses of prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 28488 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61764;
break;
case 14194:
	itemDef.name = "Prayer flask (3)";
	itemDef.description = "3 doses of prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 28488 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61727;
break;
case 14192:
	itemDef.name = "Prayer flask (2)";
	itemDef.description = "2 doses of prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 28488 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61731;
break;
case 14190:
	itemDef.name = "Prayer flask (1)";
	itemDef.description = "1 dose of prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 28488 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61812;
break;
case 14188:
	itemDef.name = "Super attack flask (6)";
	itemDef.description = "6 doses of super attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 43848 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61732;
break;
case 14186:
	itemDef.name = "Super attack flask (5)";
	itemDef.description = "5 doses of super attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 43848 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61729;
break;
case 14184:
	itemDef.name = "Super attack flask (4)";
	itemDef.description = "4 doses of super attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 43848 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61764;
break;
case 14182:
	itemDef.name = "Super attack flask (3)";
	itemDef.description = "3 doses of super attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 43848 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61727;
break;
case 14180:
	itemDef.name = "Super attack flask (2)";
	itemDef.description = "2 doses of super attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 43848 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61731;
break;
case 14178:
	itemDef.name = "Super attack flask (1)";
	itemDef.description = "1 dose of super attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 43848 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61812;
break;
case 14176:
	itemDef.name = "Super strength flask (6)";
	itemDef.description = "6 doses of super strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 119 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61732;
break;
case 14174:
	itemDef.name = "Super strength flask (5)";
	itemDef.description = "5 doses of super strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 119 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61729;
break;
case 14172:
	itemDef.name = "Super strength flask (4)";
	itemDef.description = "4 doses of super strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 119 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61764;
break;
case 14170:
	itemDef.name = "Super strength flask (3)";
	itemDef.description = "3 doses of super strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 119 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61727;
break;
case 14168:
	itemDef.name = "Super strength flask (2)";
	itemDef.description = "2 doses of super strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 119 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61731;
break;
case 14166:
	itemDef.name = "Super strength flask (1)";
	itemDef.description = "1 dose of super strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 119 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61812;
break;
case 14164:
	itemDef.name = "Super defence flask (6)";
	itemDef.description = "6 doses of super defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 8008 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61732;
break;
case 14162:
	itemDef.name = "Super defence flask (5)";
	itemDef.description = "5 doses of super defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 8008 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
itemDef.modelID = 61729;
break;
case 14160:
	itemDef.name = "Super defence flask (4)";
	itemDef.description = "4 doses of super defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 8008 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14158:
	itemDef.name = "Super defence flask (3)";
	itemDef.description = "3 doses of super defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 8008 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14156:
	itemDef.name = "Super defence flask (2)";
	itemDef.description = "2 doses of super defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 8008 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14154:
	itemDef.name = "Super defence flask (1)";
	itemDef.description = "1 dose of super defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 8008 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14152:
	itemDef.name = "Ranging flask (6)";
	itemDef.description = "6 doses of ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 36680 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14150:
	itemDef.name = "Ranging flask (5)";
	itemDef.description = "5 doses of ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 36680 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14148:
	itemDef.name = "Ranging flask (4)";
	itemDef.description = "4 doses of ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 36680 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14146:
	itemDef.name = "Ranging flask (3)";
	itemDef.description = "3 doses of ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 36680 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14144:
	itemDef.name = "Ranging flask (2)";
	itemDef.description = "2 doses of ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 36680 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14142:
	itemDef.name = "Ranging flask (1)";
	itemDef.description = "1 dose of ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 36680 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14140:
	itemDef.name = "Super antipoison flask (6)";
	itemDef.description = "6 doses of super antipoison.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62404 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14138:
	itemDef.name = "Super antipoison flask (5)";
	itemDef.description = "5 doses of super antipoison.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62404 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14136:
	itemDef.name = "Super antipoison flask (4)";
	itemDef.description = "4 doses of super antipoison.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62404 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14134:
	itemDef.name = "Super antipoison flask (3)";
	itemDef.description = "3 doses of super antipoison.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62404 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14132:
	itemDef.name = "Super antipoison flask (2)";
	itemDef.description = "2 doses of super antipoison.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62404 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14130:
	itemDef.name = "Super antipoison flask (1)";
	itemDef.description = "1 dose of super antipoison.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62404 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14128:
	itemDef.name = "Saradomin brew flask (6)";
	itemDef.description = "6 doses of saradomin brew.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10939 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
	itemDef.anInt196 = 40;
	itemDef.anInt184 = 200;
break;
case 14126:
	itemDef.name = "Saradomin brew flask (5)";
	itemDef.description = "5 doses of saradomin brew.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10939 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
	itemDef.anInt196 = 40;
	itemDef.anInt184 = 200;
break;
case 14124:
	itemDef.name = "Saradomin brew flask (4)";
	itemDef.description = "4 doses of saradomin brew.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10939 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
	itemDef.anInt196 = 40;
	itemDef.anInt184 = 200;
break;
case 14122:
	itemDef.name = "Saradomin brew flask (3)";
	itemDef.description = "3 doses of saradomin brew.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10939 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
	itemDef.anInt196 = 40;
	itemDef.anInt184 = 200;
break;
case 14419:
	itemDef.name = "Saradomin brew flask (2)";
	itemDef.description = "2 doses of saradomin brew.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10939 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
	itemDef.anInt196 = 40;
	itemDef.anInt184 = 200;
break;
case 14417:
	itemDef.name = "Saradomin brew flask (1)";
	itemDef.description = "1 dose of saradomin brew.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10939 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
	itemDef.anInt196 = 40;
	itemDef.anInt184 = 200;
break;
case 14415:
	itemDef.name = "Super restore flask (6)";
	itemDef.description = "6 doses of super restore potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62135 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14413:
	itemDef.name = "Super restore flask (5)";
	itemDef.description = "5 doses of super restore potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62135 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14411:
	itemDef.name = "Super restore flask (4)";
	itemDef.description = "4 doses of super restore potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62135 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14409:
	itemDef.name = "Super restore flask (3)";
	itemDef.description = "3 doses of super restore potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62135 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14407:
	itemDef.name = "Super restore flask (2)";
	itemDef.description = "2 doses of super restore potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62135 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14405:
	itemDef.name = "Super restore flask (1)";
	itemDef.description = "1 dose of super restore potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 62135 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14403:
	itemDef.name = "Magic flask (6)";
	itemDef.description = "6 doses of magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 37440 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14401:
	itemDef.name = "Magic flask (5)";
	itemDef.description = "5 doses of magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 37440 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14399:
	itemDef.name = "Magic flask (4)";
	itemDef.description = "4 doses of magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 37440 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14397:
	itemDef.name = "Magic flask (3)";
	itemDef.description = "3 doses of magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 37440 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14395:
	itemDef.name = "Magic flask (2)";
	itemDef.description = "2 doses of magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 37440 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14393:
	itemDef.name = "Magic flask (1)";
	itemDef.description = "1 dose of magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 37440 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14385:
	itemDef.name = "Recover special flask (6)";
	itemDef.description = "6 doses of recover special.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 38222 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14383:
	itemDef.name = "Recover special flask (5)";
	itemDef.description = "5 doses of recover special.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 38222 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14381:
	itemDef.name = "Recover special flask (4)";
	itemDef.description = "4 doses of recover special.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 38222 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14379:
	itemDef.name = "Recover special flask (3)";
	itemDef.description = "3 doses of recover special.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 38222 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14377:
	itemDef.name = "Recover special flask (2)";
	itemDef.description = "2 doses of recover special.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 38222 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14375:
	itemDef.name = "Recover special flask (1)";
	itemDef.description = "1 dose of recover special.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 38222 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14373:
	itemDef.name = "Extreme attack flask (6)";
	itemDef.description = "6 doses of extreme attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33112 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14371:
	itemDef.name = "Extreme attack flask (5)";
	itemDef.description = "5 doses of extreme attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33112 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14369:
	itemDef.name = "Extreme attack flask (4)";
	itemDef.description = "4 doses of extreme attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33112 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14367:
	itemDef.name = "Extreme attack flask (3)";
	itemDef.description = "3 doses of extreme attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33112 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14365:
	itemDef.name = "Extreme attack flask (2)";
	itemDef.description = "2 doses of extreme attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33112 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14363:
	itemDef.name = "Extreme attack flask (1)";
	itemDef.description = "1 dose of extreme attack potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33112 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14361:
	itemDef.name = "Extreme strength flask (6)";
	itemDef.description = "6 doses of extreme strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 127 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14359:
	itemDef.name = "Extreme strength flask (5)";
	itemDef.description = "5 doses of extreme strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 127 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14357:
	itemDef.name = "Extreme strength flask (4)";
	itemDef.description = "4 doses of extreme strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 127 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14355:
	itemDef.name = "Extreme strength flask (3)";
	itemDef.description = "3 doses of extreme strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 127 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14353:
	itemDef.name = "Extreme strength flask (2)";
	itemDef.description = "2 doses of extreme strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 127 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14351:
	itemDef.name = "Extreme strength flask (1)";
	itemDef.description = "1 dose of extreme strength potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 127 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14349:
	itemDef.name = "Extreme defence flask (6)";
	itemDef.description = "6 doses of extreme defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10198 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14347:
	itemDef.name = "Extreme defence flask (5)";
	itemDef.description = "5 doses of extreme defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10198 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14345:
	itemDef.name = "Extreme defence flask (4)";
	itemDef.description = "4 doses of extreme defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10198 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14343:
	itemDef.name = "Extreme defence flask (3)";
	itemDef.description = "3 doses of extreme defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10198 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14341:
	itemDef.name = "Extreme defence flask (2)";
	itemDef.description = "2 doses of extreme defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10198 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14339:
	itemDef.name = "Extreme defence flask (1)";
	itemDef.description = "1 dose of extreme defence potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 10198 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61812;
break;
case 14337:
	itemDef.name = "Extreme magic flask (6)";
	itemDef.description = "6 doses of extreme magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33490 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14335:
	itemDef.name = "Extreme magic flask (5)";
	itemDef.description = "5 doses of extreme magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33490 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14333:
	itemDef.name = "Extreme magic flask (4)";
	itemDef.description = "4 doses of extreme magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33490 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14331:
	itemDef.name = "Extreme magic flask (3)";
	itemDef.description = "3 doses of extreme magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33490 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61727;
break;
case 14329:
	itemDef.name = "Extreme magic flask (2)";
	itemDef.description = "2 doses of extreme magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33490 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61731;
break;
case 14327:
	itemDef.name = "Extreme magic flask (1)";
	itemDef.description = "1 dose of extreme magic potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 33490 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61812;
break;
case 14325:
	itemDef.name = "Extreme ranging flask (6)";
	itemDef.description = "6 doses of extreme ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 13111 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61732;
break;
case 14323:
	itemDef.name = "Extreme ranging flask (5)";
	itemDef.description = "5 doses of extreme ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 13111 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61729;
break;
case 14321:
	itemDef.name = "Extreme ranging flask (4)";
	itemDef.description = "4 doses of extreme ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 13111 };
	itemDef.editedModelColor  = new int[] { 33715 };
		itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
	itemDef.modelID = 61764;
break;
case 14319:
	itemDef.name = "Extreme ranging flask (3)";
	itemDef.description = " 3 doses of extreme ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 13111 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
itemDef.groundActions[2] = "Take";
itemDef.actions = new String[5];
itemDef.actions[1] = "Drink";
itemDef.actions[4] = "Drop";
	itemDef.modelID = 61727;
break;
case 14317:
	itemDef.name = "Extreme ranging flask (2)";
	itemDef.description = "2 doses of extreme ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 13111 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61731;
break;
case 14315:
	itemDef.name = "Extreme ranging flask (1)";
	itemDef.description = "1 dose of extreme ranging potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 13111 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61812;
break;
case 14313:
	itemDef.name = "Super prayer flask (6)";
	itemDef.description = "6 doses of super prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 3016 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61732;
break;
case 14311:
	itemDef.name = "Super prayer flask (5)";
	itemDef.description = "5 doses of super prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 3016 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61729;
break;
case 14309:
	itemDef.name = "Super prayer flask (4)";
	itemDef.description = "4 doses of super prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 3016 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";
	itemDef.modelID = 61764;
break;
case 14307:
	itemDef.name = "Super prayer flask (3)";
	itemDef.description = "3 doses of super prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 3016 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61727;
break;
case 14305:
	itemDef.name = "Super prayer flask (2)";
	itemDef.description = "2 doses of super prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 3016 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61731;
break;
case 14303:
	itemDef.name = "Super prayer flask (1)";
	itemDef.description = "1 dose of super prayer potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 3016 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61812;
break;
case 14301:
	itemDef.name = "Overload flask (6)";
	itemDef.description = "6 doses of overload potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 4 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61732;
break;
case 14299:
	itemDef.name = "Overload flask (5)";
	itemDef.description = "5 doses of overload potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 4 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61729;
break;
case 14297:
	itemDef.name = "Overload flask (4)";
	itemDef.description = "4 doses of overload potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 4 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61764;
break;
case 14295:
	itemDef.name = "Overload flask (3)";
	itemDef.description = "3 doses of overload potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 4 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61727;
break;
case 14293:
	itemDef.name = "Overload flask (2)";
	itemDef.description = "2 doses of overload potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 4 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61731;
break;
case 14291:
	itemDef.name = "Overload flask (1)";
	itemDef.description = "1 dose of overload potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 4 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61812;
break;
case 14289:
	itemDef.name = "Prayer renewal flask (6)";
	itemDef.description = "6 doses of prayer renewal.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 926 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61732;
break;
case 14287:
	itemDef.name = "Prayer renewal flask (5)";
	itemDef.description = "5 doses of prayer renewal.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 926 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61729;
break;
case 15123:
	itemDef.name = "Prayer renewal flask (4)";
	itemDef.description = "4 doses of prayer renewal potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 926 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61764;
break;
case 15121:
	itemDef.name = "Prayer renewal flask (3)";
	itemDef.description = "3 doses of prayer renewal potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 926 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61727;
break;
case 15119:
	itemDef.name = "Prayer renewal flask (2)";
	itemDef.description = "2 doses of prayer renewal potion.";
	itemDef.modelZoom = 804;
	itemDef.modelRotation1 = 131;
	itemDef.modelRotation2 = 198;
	itemDef.modelOffset2 = 1;
	itemDef.modelOffset1 = -1;
	itemDef.newModelColor = new int[] { 926 };
	itemDef.editedModelColor  = new int[] { 33715 };
	itemDef.groundActions = new String[5];
	itemDef.groundActions[2] = "Take";
	itemDef.actions = new String[5];
	itemDef.actions[1] = "Drink";
	itemDef.actions[4] = "Drop";itemDef.modelID = 61731;
break;
		case 7340:
			itemDef.name = "Prayer renewal flask (1)";
			itemDef.description = "1 dose of prayer renewal potion";
			itemDef.modelZoom = 804;
			itemDef.modelRotation1 = 131;
			itemDef.modelRotation2 = 198;
			itemDef.modelOffset2 = 1;
			itemDef.modelOffset1 = -1;
			itemDef.newModelColor = new int[] { 926 };
			itemDef.editedModelColor  = new int[] { 33715 };
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Drink";
			itemDef.actions[4] = "Drop";itemDef.modelID = 61812;
			break;
	
		case 19000:
		itemDef.modelID = 62714;
		itemDef.name = "Torva full helm";
		itemDef.description = "Torva full helm";
		itemDef.modelZoom = 672;
		itemDef.modelRotation1 = 85;
		itemDef.modelRotation2 = 1867;
		itemDef.modelOffset1 = 0;
		itemDef.modelOffset2 = -3;
		itemDef.anInt165 = 62738;
		itemDef.anInt200 = 62754;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
		break;	
    case 19002:
		itemDef.modelID = 62701;
		itemDef.name = "Torva platelegs";
		itemDef.description = "Torva platelegs";
		itemDef.modelZoom = 1740;
		itemDef.modelRotation1 = 474;
		itemDef.modelRotation2 = 2045;
		itemDef.modelOffset1 = 0;
		itemDef.modelOffset2 = -5;
		itemDef.anInt165 = 62743;
		itemDef.anInt200 = 62760;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
	break;
	
	case 607:
		itemDef.name = "Imbue Scroll";
		itemDef.description = "A scroll for imbuing certain rings.";
	break;
	
	case 16909:
		itemDef.name = "Thok's Sword";
		itemDef.description = "The almighty Thok's Sword";
	break;
	
	case 16910:
		itemDef.name = "Thok's Sword";
		itemDef.description = "The almighty Thok's Sword";
	break;
		

	case 19001:
		itemDef.modelID = 62699;
		itemDef.name = "Torva platebody";
		itemDef.description = "Torva platebody";
		itemDef.modelZoom = 1506;
		itemDef.modelRotation1 = 473;
		itemDef.modelRotation2 = 2042;
		itemDef.modelOffset1 = 0;
		itemDef.modelOffset2 = 0;
		itemDef.anInt165 = 62746;
		itemDef.anInt200 = 62762;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[2] = "Check-charges";
		itemDef.actions[4] = "Drop";
	break;
	case 19015:
		itemDef.name ="TokHaar-Kal";
		itemDef.value = 41000000;
		itemDef.anInt165 = 62575;
		itemDef.anInt200 = 62582;
		itemDef.groundActions = new String[5];
		itemDef.groundActions[2] = "Take";
		itemDef.modelOffset1 = -4;
		itemDef.modelID = 62592;
		itemDef.stackable = false;
		itemDef.description = "TokHaar-Kal";
		itemDef.modelZoom = 2086;
		itemDef.actions = new String[5];
		itemDef.actions[1] = "Wear";
		itemDef.actions[4] = "Drop";
		itemDef.modelOffset2 = 0;
		itemDef.modelRotation1 = 533;
		itemDef.modelRotation2 = 333;
		break;
		case 19010:
				itemDef.modelID = 65270;
				itemDef.name = "Completionist cape";
				itemDef.description = "Completionist cape";
				itemDef.modelZoom = 1385;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 24;
				itemDef.modelRotation1 = 279;
				itemDef.modelRotation2 = 948;
				itemDef.anInt165 = 65297;
				itemDef.anInt200 = 65297;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
		break;		
		case 19009:
				itemDef.modelID = 65262;
				itemDef.name = "Max cape";
				itemDef.description = "Max cape";
				itemDef.modelZoom = 1385;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 24;
				itemDef.modelRotation1 = 279;
				itemDef.modelRotation2 = 948;
				itemDef.anInt165 = 65300;
				itemDef.anInt200 = 65322;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
			break;
		}
		return itemDef;
	}
	
	private void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1) {
				modelID = stream.readUnsignedWord();
			} else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readString();
			else if (i == 4)
				modelZoom = stream.readUnsignedWord();
			else if (i == 5)
				modelRotation1 = stream.readUnsignedWord();
			else if (i == 6)
				modelRotation2 = stream.readUnsignedWord();
			else if (i == 7) {
				modelOffset1 = stream.readUnsignedWord();
				if (modelOffset1 > 32767)
					modelOffset1 -= 0x10000;
			} else if (i == 8) {
				modelOffset2 = stream.readUnsignedWord();
				if (modelOffset2 > 32767)
					modelOffset2 -= 0x10000;
			} else if (i == 10)
				stream.readUnsignedWord();
			else if (i == 11)
				stackable = true;
			else if (i == 12)
				value = stream.readUnsignedWord();
			else if (i == 16)
				membersObject = true;
			else if (i == 23) {
				anInt165 = stream.readUnsignedWord();
				aByte205 = stream.readSignedByte();
			} else if (i == 24)
				anInt188 = stream.readUnsignedWord();
			else if (i == 25) {
				anInt200 = stream.readUnsignedWord();
				aByte154 = stream.readSignedByte();
			} else if (i == 26)
				anInt164 = stream.readUnsignedWord();
			else if (i >= 30 && i < 35) {
				if (groundActions == null)
					groundActions = new String[5];
				groundActions[i - 30] = stream.readString();
				if (groundActions[i - 30].equalsIgnoreCase("hidden"))
					groundActions[i - 30] = null;
			} else if (i >= 35 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 35] = stream.readString();
				if (actions[i - 35].equalsIgnoreCase("null"))
					actions[i - 35] = null;
			} else if (i == 40) {
				int j = stream.readUnsignedByte();
				editedModelColor = new int[j];
				newModelColor = new int[j];
				for (int k = 0; k < j; k++) {
					editedModelColor[k] = stream.readUnsignedWord();
					newModelColor[k] = stream.readUnsignedWord();
				}
			} else if (i == 78)
				anInt185 = stream.readUnsignedWord();
			else if (i == 79)
				anInt162 = stream.readUnsignedWord();
			else if (i == 90)
				anInt175 = stream.readUnsignedWord();
			else if (i == 91)
				anInt197 = stream.readUnsignedWord();
			else if (i == 92)
				anInt166 = stream.readUnsignedWord();
			else if (i == 93)
				anInt173 = stream.readUnsignedWord();
			else if (i == 95)
				anInt204 = stream.readUnsignedWord();
			else if (i == 97)
				certID = stream.readUnsignedWord();
			else if (i == 98)
				certTemplateID = stream.readUnsignedWord();
			else if (i >= 100 && i < 110) {
				if (stackIDs == null) {
					stackIDs = new int[10];
					stackAmounts = new int[10];
				}
				stackIDs[i - 100] = stream.readUnsignedWord();
				stackAmounts[i - 100] = stream.readUnsignedWord();
			} else if (i == 110)
				anInt167 = stream.readUnsignedWord();
			else if (i == 111)
				anInt192 = stream.readUnsignedWord();
			else if (i == 112)
				anInt191 = stream.readUnsignedWord();
			else if (i == 113)
				anInt196 = stream.readSignedByte();
			else if (i == 114)
				anInt184 = stream.readSignedByte() * 5;
			else if (i == 115)
				team = stream.readUnsignedByte();
			else if (i == 116)
				lendID = stream.readUnsignedWord();
			else if (i == 117)
				lentItemID = stream.readUnsignedWord();
		} while (true);
	}
	
	public void toNote() {
		ItemDef itemDef = forID(certTemplateID);
		modelID = itemDef.modelID;
		modelZoom = itemDef.modelZoom;
		modelRotation1 = itemDef.modelRotation1;
		modelRotation2 = itemDef.modelRotation2;
		anInt204 = itemDef.anInt204;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		editedModelColor = itemDef.editedModelColor;
		newModelColor = itemDef.newModelColor;
		ItemDef itemDef_1 = forID(certID);
		name = itemDef_1.name;
		membersObject = itemDef_1.membersObject;
		value = itemDef_1.value;
		String s = "a";
		char c = itemDef_1.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			s = "an";
		description = ("Swap this note at any bank for " + s + " " + itemDef_1.name + ".");
		stackable = true;
	}
	
	private void toLend() {
		ItemDef itemDef = forID(lentItemID);
		actions = new String[5];
		modelID = itemDef.modelID;
		modelOffset1 = itemDef.modelOffset1;
		modelRotation2 = itemDef.modelRotation2;
		modelOffset2 = itemDef.modelOffset2;
		modelZoom = itemDef.modelZoom;
		modelRotation1 = itemDef.modelRotation1;
		anInt204 = itemDef.anInt204;
		value = 0;
		ItemDef itemDef_1 = forID(lendID);
		anInt166 = itemDef_1.anInt166;
		editedModelColor = itemDef_1.editedModelColor;
		anInt185 = itemDef_1.anInt185;
		anInt188 = itemDef_1.anInt188;
		anInt173 = itemDef_1.anInt173;
		anInt175 = itemDef_1.anInt175;
		groundActions = itemDef_1.groundActions;
		anInt165 = itemDef_1.anInt165;
		name = itemDef_1.name;
		anInt200 = itemDef_1.anInt200;
		membersObject = itemDef_1.membersObject;
		anInt197 = itemDef_1.anInt197;
		anInt164 = itemDef_1.anInt164;
		anInt162 = itemDef_1.anInt162;
		newModelColor = itemDef_1.newModelColor;
		team = itemDef_1.team;
		if (itemDef_1.actions != null) {
			for (int i_33_ = 0; i_33_ < 4; i_33_++)
				actions[i_33_] = itemDef_1.actions[i_33_];
		}
		actions[4] = "Discard";
	}

	public static Sprite getSprite(int i, int j, int k) {
		if (k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if (sprite != null && sprite.anInt1445 != j && sprite.anInt1445 != -1) {
				sprite.unlink();
				sprite = null;
			}
			if (sprite != null)
				return sprite;
		}
		ItemDef itemDef = forID(i);
		if (itemDef.stackIDs == null)
			j = -1;
		if (j > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++)
				if (j >= itemDef.stackAmounts[j1] && itemDef.stackAmounts[j1] != 0)
					i1 = itemDef.stackIDs[j1];
			if (i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.method201(1);
		if (model == null)
			return null;
		Sprite sprite = null;
		if (itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if (sprite == null)
				return null;
		}
		if (itemDef.lentItemID != -1) {
			sprite = getSprite(itemDef.lendID, 50, 0);
			if (sprite == null)
				return null;
		}
		Sprite sprite2 = new Sprite(32, 32);
		int k1 = Texture.textureInt1;
		int l1 = Texture.textureInt2;
		int ai[] = Texture.anIntArray1472;
		int ai1[] = DrawingArea.pixels;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Texture.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, sprite2.myPixels);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Texture.method364();
		int k3 = itemDef.modelZoom;
		if (k == -1)
			k3 = (int) ((double) k3 * 1.5D);
		if (k > 0)
			k3 = (int) ((double) k3 * 1.04D);
		int l3 = Texture.anIntArray1470[itemDef.modelRotation1] * k3 >> 16;
		int i4 = Texture.anIntArray1471[itemDef.modelRotation1] * k3 >> 16;
		model.method482(itemDef.modelRotation2, itemDef.anInt204, itemDef.modelRotation1, itemDef.modelOffset1, l3 + model.modelHeight / 2 + itemDef.modelOffset2, i4 + itemDef.modelOffset2);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--)
				if (sprite2.myPixels[i5 + j4 * 32] == 0)
					if (i5 > 0 && sprite2.myPixels[(i5 - 1) + j4 * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if (j4 > 0 && sprite2.myPixels[i5 + (j4 - 1) * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if (i5 < 31 && sprite2.myPixels[i5 + 1 + j4 * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if (j4 < 31 && sprite2.myPixels[i5 + (j4 + 1) * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
		}
		if (k > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--)
					if (sprite2.myPixels[j5 + k4 * 32] == 0)
						if (j5 > 0 && sprite2.myPixels[(j5 - 1) + k4 * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if (k4 > 0 && sprite2.myPixels[j5 + (k4 - 1) * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if (j5 < 31 && sprite2.myPixels[j5 + 1 + k4 * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if (k4 < 31 && sprite2.myPixels[j5 + (k4 + 1) * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
			}
		} else if (k == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--)
					if (sprite2.myPixels[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && sprite2.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						sprite2.myPixels[k5 + l4 * 32] = 0x302020;
			}
		}
		if (itemDef.certTemplateID != -1) {
			int l5 = sprite.anInt1444;
			int j6 = sprite.anInt1445;
			sprite.anInt1444 = 32;
			sprite.anInt1445 = 32;
			sprite.drawSprite(0, 0);
			sprite.anInt1444 = l5;
			sprite.anInt1445 = j6;
		}
		if (itemDef.lentItemID != -1) {
			int l5 = sprite.anInt1444;
			int j6 = sprite.anInt1445;
			sprite.anInt1444 = 32;
			sprite.anInt1445 = 32;
			sprite.drawSprite(0, 0);
			sprite.anInt1444 = l5;
			sprite.anInt1445 = j6;
		}
		if (k == 0)
			mruNodes1.removeFromCache(sprite2, i);
		DrawingArea.initDrawingArea(j2, i2, ai1);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Texture.textureInt1 = k1;
		Texture.textureInt2 = l1;
		Texture.anIntArray1472 = ai;
		Texture.aBoolean1464 = true;
		if (itemDef.stackable)
			sprite2.anInt1444 = 33;
		else
			sprite2.anInt1444 = 32;
		sprite2.anInt1445 = j;
		return sprite2;
	}

	public Model method201(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];
			if (j != -1)
				return forID(j).method201(1);
		}
		Model model = (Model) mruNodes2.insertFromCache(ID);
		if (model != null)
			return model;
		model = Model.method462(modelID);
		if (model == null)
			return null;
		if (anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (editedModelColor != null) {
			for (int l = 0; l < editedModelColor.length; l++)
				model.method476(editedModelColor[l], newModelColor[l]);
		}
		model.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, ID);
		return model;
	}

	public Model method202(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];
			if (j != -1)
				return forID(j).method202(1);
		}
		Model model = Model.method462(modelID);
		if (model == null)
			return null;
		if (editedModelColor != null) {
			for (int l = 0; l < editedModelColor.length; l++)
				model.method476(editedModelColor[l], newModelColor[l]);
		}
		return model;
	}

	public ItemDef() {
		ID = -1;
	}

	public byte aByte154;
	public int value;
	public int[] editedModelColor;
	public int ID;
	static MRUNodes mruNodes1 = new MRUNodes(100);
	public static MRUNodes mruNodes2 = new MRUNodes(50);
	public int[] newModelColor;
	public boolean membersObject;
	public int anInt162;
	public int certTemplateID;
	public int anInt164;
	public int anInt165;
	public int anInt166;
	public int anInt167;
	public String groundActions[];
	public int modelOffset1;
	public String name;
	public static ItemDef[] cache;
	public int anInt173;
	public int modelID;
	public int anInt175;
	public boolean stackable;
	public String description;
	public int certID;
	public static int cacheIndex;
	public int modelZoom;
	public static boolean isMembers = true;
	public static Stream stream;
	public int anInt184;
	public int anInt185;
	public int anInt188;
	public String actions[];
	public int modelRotation1;
	public int anInt191;
	public int anInt192;
	public int[] stackIDs;
	public int modelOffset2;
	public static int[] streamIndices;
	public int anInt196;
	public int anInt197;
	public int modelRotation2;
	public int anInt200;
	public int[] stackAmounts;
	public int team;
	public static int totalItems;
	public int anInt204;
	public byte aByte205;
	public int lendID;
	public int lentItemID;
}