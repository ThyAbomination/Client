import sign.signlink;

public final class Animation
{
public static int[] fm = {97910860,97910798,97910886,97910826,97910880,97910787,97910793,97910873,97910876,97910814,97910848,97910861,97910900,97910803,97910862,97910905,97910895,97910843,97910825,97910840,97910878,97910853,97910818,97910891,97910799,97910799,97910828,97910850,97910850,97910832,97910813,97910824,97910835,97910785,97910821,97910801,97910810,97910822,97910872,97910805,97910792,97910868,97910906,97910858,97910864,97910839,97910893,97910841,97910869,97910786,97910875,97910823,97910807,97910797,97910819,97910904,97910877,97910866,97910890,97910827,97910837,97910796,97910898,97910811,97910902,97910827,97910837,97910796,97910898,97910811,97910902,97910889,97910817,97910802,97910809,97910885,97910879,97910845,97910892,97910863,97910812,97910830,97910881,97910831,97910784,97910847,97910884,97910851,97910867,97910896,97910894,97910836,97910874};
public static int[] sk = {7,5,5,5,3,5,5,5,5,5,5,5,5,5,5,8,5,7,5,5,5,5,5,5,10,30,15,7,15,3,8,5,5,5,5,3,8,5,5,5,5,6,5,4,5,5,5,5,5,6,5,5,5,6,5,5,5,5,5,6,5,5,5,5,5,6,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1,5,1,5,1,5,1,5};


    public static final int ATTACK_ANIMS[] = {
    };
    public static String loc = (new StringBuilder()).append(signlink.findcachedir()).append("Data/Animation/").toString();
    public static Animation anims[];
    public int anInt352;
    public int anIntArray353[];
    public int anIntArray354[];
    private int anIntArray355[];
    public int anInt356;
    public int anIntArray357[];
    public boolean aBoolean358;
    public int anInt359;
    public int anInt360;
    public int anInt361;
    public int anInt362;
    public int anInt363;
    public int anInt364;
    public int anInt365;
    public static int anInt367;

    public static byte[] getData(String s)
    {
        return FileOperations.ReadFile(s);
    }

    public static void unpackConfig(StreamLoader streamLoader)
    {
        Stream stream = new Stream(streamLoader.getDataForName("seq.dat"));
        int length = stream.readUnsignedWord();
        if(anims == null)
        {
            anims = new Animation[length+7000];
        }
       for(int j = 0; j < length; j++)
        {
          if(anims[j] == null)
                anims[j] = new Animation();
            anims[j].readValues(stream);
			if (j == 4000) {
				anims[j].anInt352 = 28;
				anims[j].anIntArray355 = new int[]{3,2,2,2,3,3,3,3,3,2,2,2,2,2,3,3,2,1,1,3,3,3,3,3,3,3,3,3};
				anims[j].anIntArray353 = new int[]{223019263,223019511,223019120,223019119,223019242,223019278,223019027,223019504,223019417,223019428,223019705,223019087,223019664,223019465,223019589,223019707,223019322,223019644,223019174,223019574,223019108,223019335,223019521,223019401,223019300,223019029,223019276,223019115};
				anims[j].anInt363 = 0;
				anims[j].anInt364 = 0;
			}
			if (j == 4001) {
				anims[j].anInt352 = 15;
				anims[j].anIntArray355 = new int[]{9,3,3,3,3,3,2,2,15,4,3,3,3,3,3};
				anims[j].anIntArray353 = new int[]{219742346,219742338,219742330,219742335,219742341,219742348,219742322,219742325,219742318,219742320,219742323,219742349,219742334,219742317,219742347};
			}
			if (j == 4002) {
				anims[j].anInt352 = 40;
				anims[j].anIntArray355 = new int[]{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
				anims[j].anIntArray353 = new int[]{219742278,219742256,219742218,219742282,219742223,219742222,219742253,219742232,219742300,219742239,219742254,219742252,219742245,219742224,219742219,219742294,219742209,219742241,219742299,219742230,219742279,219742238,219742221,219742214,219742283,219742305,219742312,219742280,219742265,219742211,219742210,219742208,219742212,219742234,219742314,219742240,219742292,219742313,219742267,219742263};
			}
			if (j == 10464) { //Stand
				anims[j].anInt352 = 24;
				anims[j].anIntArray355 = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
				anims[j].anIntArray353 = new int[]{250609690, 250609706, 250609808, 250609726, 250609712, 250609765, 250609680, 250609705, 250609738, 250609709, 250609687, 250609748, 250609722, 250609766, 250609739, 250609747, 250609741, 250609771, 250609778, 250609780, 250609720, 250609727, 250609784, 250609814};
			}
			if (j == 10465) { //Walk
				anims[j].anInt352 = 28;
				anims[j].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
				anims[j].anIntArray353 = new int[]{250609792, 250609730, 250609769, 250609806, 250609801, 250609760, 250609787, 250609749, 250609734, 250609696, 250609689, 250609685, 250609700, 250609764, 250609671, 250609731, 250609681, 250609774, 250609821, 250609677, 250609711, 250609742, 250609758, 250609703, 250609721, 250609804, 250609666, 250609737};
			}
			if (j == 10466) { //Melee
				anims[j].anInt352 = 20;
				anims[j].anInt359 = 6;
				anims[j].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
				anims[j].anIntArray353 = new int[]{250609789, 250609819, 250609762, 250609728, 250609793, 250609818, 250609718, 250609704, 250609740, 250609672, 250609756, 250609686, 250609719, 250609753, 250609682, 250609674, 250609668, 250609708, 250609678, 250609746};
			}
			if (j == 10468) { //Block
				anims[j].anInt352 = 23;
				anims[j].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
				anims[j].anIntArray353 = new int[]{250609744, 250609798, 250609698, 250609675, 250609669, 250609750, 250609694, 250609807, 250609803, 250609811, 250609810, 250609714, 250609776, 250609800, 250609710, 250609665, 250609713, 250609691, 250609781, 250609743, 250609797, 250609777, 250609794};
			}
			if (j == 10470) { //Mage/range?
				anims[j].anInt352 = 19;
				anims[j].anInt359 = 7;
				anims[j].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
				anims[j].anIntArray353 = new int[]{250609667, 250609763, 250609755, 250609779, 250609745, 250609799, 250609770, 250609802, 250609767, 250609702, 250609785, 250609679, 250609790, 250609816, 250609717, 250609815, 250609809, 250609759, 250609725};
			}
			if (j == 10473) { //death
				anims[j].anInt352 = 43;
				//anims[j].loopDelay = 1;
				anims[j].anInt359 = 10;
				anims[j].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 3};
				anims[j].anIntArray353 = new int[]{250609813, 250609795, 250609699, 250609754, 250609736, 250609732, 250609775, 250609688, 250609664, 250609683, 250609786, 250609707, 250609724, 250609768, 250609761, 250609697, 250609782, 250609796, 250609757, 250609805, 250609791, 250609715, 250609735, 250609701, 250609693, 250609817, 250609692, 250609788, 250609783, 250609670, 250609751, 250609752, 250609723, 250609695, 250609684, 250609716, 250609673, 250609812, 250609729, 250609772, 250609676, 250609820, 250609773};
			}
			if(j == 115)
			{
				anims[j].anInt352 = fm.length;
			  anims[j].anIntArray353 = fm;
			  anims[j].anIntArray355 = sk;
			}
        }
		/*start of nex*/
		anims[6319] = new Animation();
		anims[6319].anInt352 = 24;
		anims[6319].anIntArray355 = new int[] { 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2 };
		anims[6319].anIntArray353 = new int[] { 229507415, 229507219, 229507411, 229507095, 229507202, 229507224, 229507326, 229507235, 229507337, 229507288, 229507430, 229507317, 229507239, 229507312, 229507404, 229507121, 229507464, 229507413, 229507329, 229507378, 229507173, 229507150, 229507292, 229507308 };
		anims[6319].anInt359 = 4;
		anims[6319].anInt363 = 0;
		anims[6319].anInt364 = 0;
		
		anims[6320] = new Animation();
		anims[6320].anInt352 = 32;
		anims[6320].anIntArray355 = new int[] { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
		anims[6320].anIntArray353 = new int[] { 229507242, 229507350, 229507403, 229507099, 229507086, 229507365, 229507148, 229507289, 229507075, 229507246, 229507229, 229507171, 229507371, 229507296, 229507153, 229507333, 229507310, 229507198, 229507399, 229507458, 229507344, 229507142, 229507402, 229507154, 229507393, 229507220, 229507180, 229507479, 229507133, 229507450, 229507469, 229507204 };
		anims[6320].anInt359 = 2;
		anims[6320].anInt363 = 0;
		anims[6320].anInt364 = 0;
	
		anims[6321] = new Animation();
		anims[6321].anInt352 = 53;
		anims[6321].anIntArray355 = new int[] { 1, 3, 4, 4, 3, 3, 3, 3, 2, 2, 2, 2, 7, 7, 4, 6, 3, 2, 3, 2, 2, 2, 2, 3, 4, 3, 3, 3, 2, 6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 6, 6, 5, 5, 6, 2 };
		anims[6321].anIntArray353 = new int[] { 229507234, 229507100, 229507316, 229507266, 229507363, 229507217, 229507382, 229507257, 229507177, 229507092, 229507389, 229507163, 229507117, 229507354, 229507347, 229507123, 229507111, 229507081, 229507453, 229507309, 229507390, 229507258, 229507160, 229507213, 229507162, 229507282, 229507304, 229507164, 229507098, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507174, 229507394, 229507225, 229507376, 229507271, 229507332 };
		anims[6321].anInt359 = 10;
		anims[6321].anInt363 = 0;
		anims[6321].anInt364 = 0;
	
		anims[6326] = new Animation();
		anims[6326].anInt352 = 36;
		anims[6326].anIntArray355 = new int[] { 1, 3, 3, 4, 3, 3, 3, 3, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 8, 8, 7, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2 };
		anims[6326].anIntArray353 = new int[] { 229507157, 229507156, 229507446, 229507440, 229507406, 229507431, 229507247, 229507218, 229507465, 229507474, 229507077, 229507357, 229507327, 229507482, 229507116, 229507259, 229507129, 229507275, 229507322, 229507087, 229507102, 229507436, 229507268, 229507443, 229507361, 229507128, 229507372, 229507407, 229507185, 229507293, 229507226, 229507323, 229507255, 229507352, 229507401, 229507159 };
		anims[6326].anInt359 = 10;
		anims[6326].anInt363 = 0;
		anims[6326].anInt364 = 0;
	
		anims[6354] = new Animation();
		anims[6354].anInt352 = 25;
		anims[6354].anIntArray355 = new int[] { 1, 1, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 2, 1, 1, 2, 2, 3 };
		anims[6354].anIntArray353 = new int[] { 229507373, 229507203, 229507097, 229507298, 229507386, 229507264, 229507277, 229507080, 229507089, 229507481, 229507078, 229507094, 229507451, 229507384, 229507183, 229507385, 229507209, 229507414, 229507417, 229507335, 229507270, 229507178, 229507331, 229507096, 229507260 };
		anims[6354].anInt359 = 8;
		anims[6354].anInt363 = 0;
		anims[6354].anInt364 = 0;
	
		anims[6355] = new Animation();
		anims[6355].anInt352 = 36;
		anims[6355].anIntArray355 = new int[] { 2, 3, 2, 2, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 2, 2, 2, 2, 2, 3, 2, 1, 1, 1, 2, 2, 1, 2, 2, 3, 6, 5, 3, 1, 1, 1 };
		anims[6355].anIntArray353 = new int[] { 229507412, 229507243, 229507299, 229507483, 229507428, 229507470, 229507113, 229507122, 229507468, 229507197, 229507251, 229507284, 229507215, 229507125, 229507447, 229507471, 229507303, 229507265, 229507093, 229507328, 229507273, 229507283, 229507346, 229507302, 229507480, 229507141, 229507475, 229507208, 229507396, 229507172, 229507375, 229507355, 229507305, 229507387, 229507138, 229507082 };
		anims[6355].anInt359 = 10;
		anims[6355].anInt363 = 0;
		anims[6355].anInt364 = 0;

		anims[6948] = new Animation();
		anims[6948].anInt352 = 29;
		anims[6948].anIntArray355 = new int[] { 5, 5, 6, 3, 3, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 3, 3, 4, 5, 8 };
		anims[6948].anIntArray353 = new int[] { 229507301, 229507367, 229507205, 229507131, 229507132, 229507395, 229507318, 229507194, 229507462, 229507395, 229507318, 229507194, 229507462, 229507395, 229507318, 229507194, 229507462, 229507395, 229507318, 229507194, 229507462, 229507395, 229507318, 229507194, 229507426, 229507278, 229507147, 229507236, 229507353 };
		anims[6948].anInt359 = 10;
		anims[6948].anInt363 = 0;
		anims[6948].anInt364 = 0;
	
		anims[6951] = new Animation();
		anims[6951].anInt352 = 65;
		anims[6951].anIntArray355 = new int[] { 4, 4, 3, 3, 4, 6, 5, 5, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 4, 4, 8, 6, 5, 1, 1, 1, 1, 3, 3, 3, 3, 3, 5, 6, 6, 6, 6, 36, 22, 22 };
		anims[6951].anIntArray353 = new int[] { 229507307, 229507427, 229507228, 229507272, 229507422, 229507168, 229507107, 229507306, 229507249, 229507409, 229507476, 229507294, 229507250, 229507109, 229507461, 229507211, 229507244, 229507364, 229507348, 229507237, 229507341, 229507405, 229507408, 229507090, 229507079, 229507280, 229507290, 229507398, 229507119, 229507467, 229507330, 229507319, 229507181, 229507200, 229507112, 229507167, 229507334, 229507254, 229507340, 229507410, 229507383, 229507106, 229507377, 229507151, 229507269, 229507429, 229507196, 229507073, 229507136, 229507311, 229507313, 229507088, 229507432, 229507388, 229507074, 229507477, 229507456, 229507188, 229507274, 229507165, 229507212, 229507439, 229507118, 229507356, 229507438 };
		anims[6951].anInt359 = 10;
		anims[6951].anInt363 = 0;
		anims[6951].anInt364 = 0;

		anims[6983] = new Animation();
		anims[6983].anInt352 = 32;
		anims[6983].anIntArray355 = new int[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
		anims[6983].anIntArray353 = new int[] { 229507321, 229507140, 229507338, 229507135, 229507374, 229507419, 229507230, 229507320, 229507454, 229507392, 229507421, 229507084, 229507166, 229507444, 229507425, 229507120, 229507201, 229507459, 229507449, 229507190, 229507435, 229507110, 229507380, 229507083, 229507420, 229507206, 229507360, 229507452, 229507297, 229507262, 229507381, 229507104 };
		anims[6983].anInt359 = 2;
		anims[6983].anInt363 = 0;
		anims[6983].anInt364 = 0;

		anims[6984] = new Animation();
		anims[6984].anInt352 = 25;
		anims[6984].anIntArray355 = new int[] { 3, 5, 5, 5, 4, 4, 3, 3, 3, 3, 5, 8, 6, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 3, 3 };
		anims[6984].anIntArray353 = new int[] { 229507276, 229507448, 229507161, 229507325, 229507145, 229507076, 229507416, 229507351, 229507170, 229507358, 229507418, 229507457, 229507115, 229507158, 229507473, 229507169, 229507362, 229507182, 229507287, 229507191, 229507240, 229507434, 229507279, 229507091, 229507126 };
		anims[6984].anInt359 = 8;
		anims[6984].anInt363 = 0;
		anims[6984].anInt364 = 0;
	
		anims[6985] = new Animation();
		anims[6985].anInt352 = 9;
		anims[6985].anIntArray355 = new int[] { 3, 3, 2, 3, 4, 4, 4, 4, 3 };
		anims[6985].anIntArray353 = new int[] { 229507397, 229507424, 229507186, 229507245, 229507175, 229507248, 229507445, 229507139, 229507291 };
		anims[6985].anInt359 = 10;
		anims[6985].anInt363 = 0;
		anims[6985].anInt364 = 0;
	
		anims[6986] = new Animation();
		anims[6986].anInt352 = 33;
		anims[6986].anIntArray355 = new int[] { 4, 4, 8, 4, 4, 4, 4, 4, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2 };
		anims[6986].anIntArray353 = new int[] { 229507149, 229507222, 229507134, 229507114, 229507130, 229507423, 229507144, 229507127, 229507227, 229507189, 229507463, 229507101, 229507263, 229507400, 229507324, 229507267, 229507238, 229507295, 229507072, 229507342, 229507300, 229507179, 229507359, 229507281, 229507105, 229507192, 229507343, 229507370, 229507339, 229507437, 229507146, 229507369, 229507252 };
		anims[6986].anInt359 = 6;
		anims[6986].anInt363 = 0;
		anims[6986].anInt364 = 0;
		
		anims[6987] = new Animation();
		anims[6987].anInt352 = 28;
		anims[6987].anIntArray355 = new int[] { 2, 6, 6, 5, 2, 3, 4, 4, 4, 4, 4, 2, 2, 3, 3, 2, 2, 3, 2, 4, 4, 3, 3, 3, 3, 2, 3, 2 };
		anims[6987].anIntArray353 = new int[] { 229507216, 229507231, 229507442, 229507315, 229507478, 229507108, 229507193, 229507472, 229507261, 229507441, 229507460, 229507433, 229507285, 229507210, 229507155, 229507336, 229507286, 229507232, 229507366, 229507368, 229507391, 229507124, 229507253, 229507233, 229507221, 229507345, 229507143, 229507466 };
		anims[6987].anInt359 = 6;
		anims[6987].anInt363 = 0;
		anims[6987].anInt364 = 0;
			/*end of nex*/
    }

    public int method258(int i)
    {
        int j = anIntArray355[i];
        if(j == 0)
        {
             Class36 class36 = Class36.method531(anIntArray353[i]);
             if(class36 != null)
            {
                j = anIntArray355[i] = class36.anInt636;
            }
        }
        if(j == 0)
        {
            j = 1;
        }
        return j;
    }

	public void readValues(Stream stream)
	{
		do {
			int i = stream.readUnsignedByte();
			if(i == 0)
				break;
			if(i == 1) {
				anInt352 = stream.readUnsignedWord();
				anIntArray353 = new int[anInt352];
				anIntArray354 = new int[anInt352];
				anIntArray355 = new int[anInt352];
				for(int i_ = 0; i_ < anInt352; i_++){
					anIntArray353[i_] = stream.readDWord();
					anIntArray354[i_] = -1;
				}
				for(int i_ = 0; i_ < anInt352; i_++)
					anIntArray355[i_] = stream.readUnsignedByte();
			}
			else if(i == 2)
				anInt356 = stream.readUnsignedWord();
			else if(i == 3) {
				int k = stream.readUnsignedByte();
				anIntArray357 = new int[k + 1];
				for(int l = 0; l < k; l++)
					anIntArray357[l] = stream.readUnsignedByte();
				anIntArray357[k] = 0x98967f;
			}
			else if(i == 4)
				aBoolean358 = true;
			else if(i == 5)
				anInt359 = stream.readUnsignedByte();
			else if(i == 6)
				anInt360 = stream.readUnsignedWord();
			else if(i == 7)
				anInt361 = stream.readUnsignedWord();
			else if(i == 8)
				anInt362 = stream.readUnsignedByte();
			else if(i == 9)
				anInt363 = stream.readUnsignedByte();
			else if(i == 10)
				anInt364 = stream.readUnsignedByte();
			else if(i == 11)
				anInt365 = stream.readUnsignedByte();
			else 
				System.out.println("Unrecognized seq.dat config code: "+i);
		} while(true);
		if(anInt352 == 0)
		{
			anInt352 = 1;
			anIntArray353 = new int[1];
			anIntArray353[0] = -1;
			anIntArray354 = new int[1];
			anIntArray354[0] = -1;
			anIntArray355 = new int[1];
			anIntArray355[0] = -1;
		}
		if(anInt363 == -1)
			if(anIntArray357 != null)
				anInt363 = 2;
			else
				anInt363 = 0;
		if(anInt364 == -1)
		{
			if(anIntArray357 != null)
			{
				anInt364 = 2;
				return;
			}
			anInt364 = 0;
		}
	}

    private Animation()
    {
        anInt356 = -1;
        aBoolean358 = false;
        anInt359 = 5;
        anInt360 = -1;
        anInt361 = -1;
        anInt362 = 99;
        anInt363 = -1;
        anInt364 = -1;
        anInt365 = 2;
    }

}