package CS210;
import java.util.* ;   
import java.security.*;
import java.io.*;
//Student Name: Maksymilian Glowacki
//Student Number: 20369071

public class CS210ProjectMaksymilianGlowacki {
	public static void main(String args[]) throws FileNotFoundException { //I used this throw exception 
		//This is where i import sentences from the book Crime And Punishment.
		/*I had problems importing a .txt file so i decided 
		to place them in manually and declaring each sentence as a separate String.*/
Scanner sc = new Scanner(new File("C:\\Users\\maksg\\Documents\\Crime And Punishment.txt")); //Originally this was my way to import a text file
String a1 = "He had successfully avoided meeting his landlady on the staircase." ; //starting from here each sentence i used is declared as a String
String a2 = "The sentence was commuted to hard labour."; 
String a3 = "Raskolnikov went out in complete confusion.";
String a4 = "His conversation seemed to excite a general though languid interest."; 
String a5 = "He filled his glass, emptied it and paused.";
String a6 = "The boys at the counter fell to sniggering.";
String a7 = "I was drinking some coffee.";  
String a8 = "I shall never forgive myself for not asking her to.";
String a9 = "He Drank coffee, and talked for an hour.";
String a10 = "Hi, how are you.";
String a11 = "She was a great hand at telling fortunes.";
String a12 = "It�s because I chatter that I do nothing.";
String a13 = "The heat in the street was terrible."; 
String a14 = "The insufferable stench from the pot-houses."; 
String a15 = "The drunken men whom he met continually."; 
String a16 = "An expression of the profoundest disgust gleamed for a moment."; 
String a17 = "Soon he sank into deep thought."; 
String a18 = "Yes, my hat is too noticeable."; 
String a19 = "What matters is that people would remember it.";
String a20 = "Trifles, trifles are what matter!"; 
String a21 = "Why, it�s just such trifles that always ruin everything."; 
String a22 = "It was a back staircase, dark and narrow.";
String a23 = "This German was moving out then."; 
String a24 = "Step in, my good sir."; 
String a25 = "The little room into which the young man walked.";
String a26 = "It�s in the houses of spiteful old widows."; 
String a27 = "The month was up the day before yesterday."; 
String a28 = "I will bring you the interest for another month."; 
String a29 = "You come with such trifles, my good sir."; 
String a30 = "The old woman fumbled in her pocket for her keys."; 
String a31 = "The old woman came back.";
String a32 = "His movements were precise and definite.";
String a33 = "A minute later he was in the street.";
String a34 =  "Raskolnikov crossed the square.";
String a35 = "He pushed his way into the thickest part of it.";
String a36 = "Go along with you!";
String a37 ="I�ll go, sweetie!";
String a38 = "He went into another street.";
String a39 = "Raskolnikov knew he would come up to him.";
String a40 = "They are children, simpletons, not criminals!";
String a41 ="In the corridor they came upon Luzhin.";
String a42 = "It was evident that his intentions were friendly.";
String a43 = "Pyotr Petrovitch began with great dignity, though affably.";
String a44 = "Sonia burst into tears.";

	       String[] sentences = new String[] {a1,a2,a3,a4,  // Here is an array that stores those sentences i used
	    		   a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,
	    		   a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,
	    		   a35,a36,a37,a38,a39,a40,a41,a42,a43,a44};
	        //from here I turn the sentences into sha256 hashes and store them in different Strings
	       String s1 = sha256(a1); 
	       String s2 = sha256(a2);
	       String s3 = sha256(a3);
	       String s4 = sha256(a4);
	       String s5 = sha256(a5);
	       String s6 = sha256(a6);
	       String s7 = sha256(a7);
	       String s8 = sha256(a8);
	       String s9 = sha256(a9);
	       String s10 = sha256(a10);
	       String s11 = sha256(a11);
	       String s12 = sha256(a12);
	       String s13 = sha256(a13); 
	       String s14 = sha256(a14); 
	       String s15 = sha256(a15); 
	       String s16 = sha256(a16);
	       String s17 = sha256(a17); 
	       String s18 = sha256(a18); 
	       String s19 = sha256(a19); 
	       String s20 = sha256(a20);
	       String s21 = sha256(a21);
	       String s22 = sha256(a22);
	       String s23 = sha256(a23);
	       String s24 = sha256(a24);
	       String s25 = sha256(a25);
	       String s26 = sha256(a26);
	       String s27 = sha256(a27);
	       String s28 = sha256(a28);
	       String s29 = sha256(a29);
	       String s30 = sha256(a30);
	       String s31 = sha256(a31);
	       String s32 = sha256(a32);
	       String s33 = sha256(a33);
	       String s34 = sha256(a34);
	       String s35 = sha256(a35);
	       String s36 = sha256(a36);
	       String s37 = sha256(a37);
	       String s38 = sha256(a38);
	       String s39 = sha256(a39);
	       String s40 = sha256(a40);
	       String s41 = sha256(a41);
	       String s42 = sha256(a42);
	       String s43 = sha256(a43);
	       String s44 = sha256(a44);
	       
	       String [] hashes = new String[] {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11, // Here i store the those hashes in a separate array
	    		   s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,
	    		   s27,s28,s29,s30,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40,s41,s42,s43,s44};
	        //check first position in array with rest of array
	       int check = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[1]); 
	       int check6 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[8]);
	       int check1 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[3]);
	       int check7 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[9]);
	       int check2 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[4]); 
	       int check8 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[10]);
	       int check3 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[5]); 
	       int check9 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[11]);
	       int check4 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[6]); 
	       int check10 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[12]);
	       int check5 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[7]);
	       int check11 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[13]);
	       int check12 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[14]);
	       int check13 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[15]); 
	       int check14 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[16]);
	       int check15 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[17]); 
	       int check16 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[18]);
	       int check17 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[19]); 
	       int check18 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[20]);
	       int check19 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[21]);
	       int check20 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[22]); 
	       int check21 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[23]);
	       int check22 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[24]);
	       int check23 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[25]);
	       int check24 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[26]);
	       int check25 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[27]);
	       int check26 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[28]);
	       int check27 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[29]);
	       int check28 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[30]);
	       int a = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[31]);
	       int b = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[32]);
	       int c = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[33]);
	       int d = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[34]);
	       int e = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[35]);
	       int f = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[36]);
	       int g = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[37]);
	       int h = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[38]);
	       int I = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[39]);
	       int k1 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[40]);
	       int k2 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[41]);
	       int k3 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[42]);
	       int k4 = CheckForSimilaritiesBetweenHashes(hashes[0],hashes[39]);
	       //check second position with rest
	       int check29 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[2]); 
	       int check30 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[8]);
	       int check31 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[3]); 
	       int check32 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[9]);
	       int check33 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[4]); 
	       int check34 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[10]);
	       int check35 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[5]); 
	       int check36 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[11]);
	       int check37 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[6]); 
	       int check38 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[12]);
	       int check39 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[7]);  
	
	       int check40 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[13]);
	       int check41 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[14]);
	       int check42 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[15]); 
	       int check43 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[16]);
	       int check44 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[17]); 
	       int check45 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[18]);
	       int check46 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[19]); 
	       int check47 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[20]);
	       int check48 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[21]);
	       int check49 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[22]); 
	       int check50 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[23]);
	       int check51 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[24]);
	       int check52 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[25]);
	       int check53 =CheckForSimilaritiesBetweenHashes(hashes[1],hashes[26]);
	       int check54 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[27]);
	       int check55 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[28]);
	       int check56 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[29]);
	       int check57 = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[30]);
	       int aa = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[31]);
	       int bb = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[32]);
	       int cc = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[33]);
	       int dd = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[34]);
	       int ee = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[35]);
	       int ff = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[36]);
	       int gg = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[37]);
	       int hh= CheckForSimilaritiesBetweenHashes(hashes[1],hashes[38]);
	       int II = CheckForSimilaritiesBetweenHashes(hashes[1],hashes[39]);
	       //check third position with rest
	       int check58 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[1]); 
	       int check59 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[3]);
	       int check60 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[4]); 
	       int check61 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[5]);
	       int check62 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[6]); 
	       int check63 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[7]);
	       int check64 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[8]); 
	       int check65 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[9]);
	       int check66 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[10]); 
	       int check67 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[11]);
	       int check68 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[12]);  
	       int check69 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[13]);
	       int check70 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[14]);
	       int check71 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[15]); 
	       int check72 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[16]);
	       int check73 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[17]); 
	       int check74 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[18]);
	       int check75 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[19]); 
	       int check76 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[20]);
	       int check77 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[21]);
	       int check78 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[22]); 
	       int check79 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[23]);
	       int check80 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[24]);
	       int check81 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[25]);
	       int check82 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[26]);
	       int check83 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[27]);
	       int check84 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[28]);
	       int check85 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[29]);
	       int check86 = CheckForSimilaritiesBetweenHashes(hashes[2],hashes[30]);
	       //fourth position check
	       int check87 =CheckForSimilaritiesBetweenHashes(hashes[3],hashes[1]); 
	       int check88 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[2]);
	       int check89 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[4]); 
	       int check90 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[5]);
	       int check91 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[6]); 
	       int check92 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[7]);
	       int check93 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[8]); 
	       int check94 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[9]);
	       int check95 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[10]); 
	       int check96 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[11]);
	       int check97 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[12]);  
	       int check98 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[13]);
	       int check99 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[14]);
	       int check100 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[15]); 
	       int check101 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[16]);
	       int check102 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[17]); 
	       int check103 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[18]);
	       int check104 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[19]); 
	       int check105 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[20]);
	       int check106 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[21]);
	       int check107 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[22]); 
	       int check108 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[23]);
	       int check109 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[24]);
	       int check110 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[25]);
	       int check111 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[26]);
	       int check112 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[27]);
	       int check113 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[28]);
	       int check114 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[29]);
	       int check115 = CheckForSimilaritiesBetweenHashes(hashes[3],hashes[30]);
	       //fifth position check
	       int check116 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[1]); 
	       int check117 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[2]);
	       int check118 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[3]); 
	       int check119 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[5]);
	       int check120 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[6]); 
	       int check121 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[7]);
	       int check122 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[8]); 
	       int check123 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[9]);
	       int check124 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[10]); 
	       int check125 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[11]);
	       int check126 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[12]);  
	       int check127 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[13]);
	       int check128 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[14]);
	       int check129 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[15]); 
	       int check130 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[16]);
	       int check131 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[17]); 
	       int check132 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[18]);
	       int check133 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[19]); 
	       int check134 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[20]);
	       int check135 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[21]);
	       int check136 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[22]); 
	       int check137 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[23]);
	       int check138 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[24]);
	       int check139 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[25]);
	       int check140 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[26]);
	       int check141 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[27]);
	       int check142 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[28]);
	       int check143 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[29]);
	       int check144 = CheckForSimilaritiesBetweenHashes(hashes[4],hashes[30]);
	       //sixth position check
	       int check145 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[1]); 
	       int check146 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[2]);
	       int check147 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[3]); 
	       int check148 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[4]);
	       int check149 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[6]); 
	       int check150 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[7]);
	       int check151 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[8]); 
	       int check152 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[9]);
	       int check153 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[10]); 
	       int check154 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[11]);
	       int check155 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[12]);  
	       int check156 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[13]);
	       int check157 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[14]);
	       int check158 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[15]); 
	       int check159 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[16]);
	       int check160 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[17]); 
	       int check161 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[18]);
	       int check162 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[19]); 
	       int check163 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[20]);
	       int check164 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[21]);
	       int check165 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[22]); 
	       int check166 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[23]);
	       int check167 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[24]);
	       int check168 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[25]);
	       int check169 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[26]);
	       int check171 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[27]);
	       int check172 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[28]);
	       int check173 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[29]);
	       int check174 = CheckForSimilaritiesBetweenHashes(hashes[5],hashes[30]);
	       //seventh position check
	       int check175 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[1]); 
	       int check176 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[2]);
	       int check177 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[3]); 
	       int check178 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[4]);
	       int check179 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[5]); 
	       int check180 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[7]);
	       int check181 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[8]); 
	       int check182 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[9]);
	       int check183 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[10]); 
	       int check184 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[11]);
	       int check185 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[12]);  
	       int check186 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[13]);
	       int check187 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[14]);
	       int check188 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[15]); 
	       int check189 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[16]);
	       int check190 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[17]); 
	       int check191 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[18]);
	       int check192 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[19]); 
	       int check193 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[20]);
	       int check194 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[21]);
	       int check195 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[22]); 
	       int check196 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[23]);
	       int check197 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[24]);
	       int check198 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[25]);
	       int check199 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[26]);
	       int check200 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[27]);
	       int check201 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[28]);
	       int check202 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[29]);
	       int check203 = CheckForSimilaritiesBetweenHashes(hashes[6],hashes[30]);
	       
	       /* With this loop i had made space in array for those sentences
	        * and hashes
	        */
	       for(int i =0; i<44; i++) {
	       	   System.out.println(sentences[i]); //print out the English sentences
	    	   System.out.println(hashes[i]);  //print out hashes of those sentences
	       	}	
	       /*Here is a big chunk of printing to see what's the number of similarities 
	        * between two hashes
	        */
	       /*printing of those checks that give back an integer which is a sum of similarities
	        * between two sentences
	        */
	       System.out.println(check);
	       	System.out.println(check1);
	       	System.out.println(check2);
	       	System.out.println(check3);
	       	System.out.println(check4);
	       	System.out.println(check5);
	       	System.out.println(check6);
	       	System.out.println(check7);
	       	System.out.println(check8);
	       	System.out.println(check9);
	       	System.out.println(check10);
	       	System.out.println(check11);
	       	System.out.println(check12);
	        System.out.println(check13);
	       	System.out.println(check14);
	       	System.out.println(check15);
	       	System.out.println(check16);
	       	System.out.println(check17);
	       	System.out.println(check18);
	       	System.out.println(check19);
	       	System.out.println(check20);
	       	System.out.println(check21);
	       	System.out.println(check22);
	       	System.out.println(check23);
	       	System.out.println(check24);
	       	System.out.println(check25);
	       	System.out.println(check26);
	      	System.out.println(check27);
	      	System.out.println(check28);
	      	System.out.println(a);
	       	System.out.println(b);
	       	System.out.println(c);
	       	System.out.println(d);
	       	System.out.println(e);
	       	System.out.println(f);
	       	System.out.println(g);
	      	System.out.println(h);
	      	System.out.println(I);
	      	System.out.println(k1);
	       	System.out.println(k2);
	      	System.out.println(k3);
	      	System.out.println(k4);
	      	System.out.println("");
	        //second with rest
	      	System.out.println(check29);
	       	System.out.println(check30);
	       	System.out.println(check31);
	       	System.out.println(check32);
	       	System.out.println(check33);
	       	System.out.println(check34);
	       	System.out.println(check35);
	       	System.out.println(check36);
	       	System.out.println(check37);
	       	System.out.println(check38);
	       	System.out.println(check39);
	       	System.out.println(check40);
	       	System.out.println(check41);
	        System.out.println(check42);
	       	System.out.println(check43);
	       	System.out.println(check44);
	       	System.out.println(check45);
	       	System.out.println(check46);
	       	System.out.println(check47);
	       	System.out.println(check48);
	       	System.out.println(check49);
	       	System.out.println(check50);
	       	System.out.println(check51);
	       	System.out.println(check52);
	       	System.out.println(check53);
	       	System.out.println(check54);
	       	System.out.println(check55);
	      	System.out.println(check56);
	      	System.out.println(check57);
	      	System.out.println(aa);
	       	System.out.println(bb);
	       	System.out.println(cc);
	       	System.out.println(dd);
	       	System.out.println(ee);
	       	System.out.println(ff);
	       	System.out.println(gg);
	      	System.out.println(hh);
	      	System.out.println(II);
	      	System.out.println("");
	      	//third with rest
	      	System.out.println(check58);
	       	System.out.println(check59);
	       	System.out.println(check60);
	       	System.out.println(check61);
	       	System.out.println(check62);
	       	System.out.println(check63);
	       	System.out.println(check64);
	       	System.out.println(check65);
	       	System.out.println(check66);
	       	System.out.println(check67);
	       	System.out.println(check68);
	       	System.out.println(check69);
	       	System.out.println(check70);
	        System.out.println(check71);
	       	System.out.println(check72);
	       	System.out.println(check73);
	       	System.out.println(check74);
	       	System.out.println(check75);
	       	System.out.println(check76);
	       	System.out.println(check77);
	       	System.out.println(check78);
	       	System.out.println(check79);
	       	System.out.println(check80);
	       	System.out.println(check81);
	       	System.out.println(check82);
	       	System.out.println(check83);
	       	System.out.println(check84);
	      	System.out.println(check85);
	      	System.out.println(check86);
	      	System.out.println("");
	      	//fourth with rest
	      	System.out.println(check87);
	       	System.out.println(check88);
	       	System.out.println(check89);
	       	System.out.println(check90);
	       	System.out.println(check91);
	       	System.out.println(check92);
	       	System.out.println(check93);
	       	System.out.println(check94);
	       	System.out.println(check95);
	       	System.out.println(check96);
	       	System.out.println(check97);
	       	System.out.println(check98);
	       	System.out.println(check99);
	        System.out.println(check100);
	       	System.out.println(check101);
	       	System.out.println(check102);
	       	System.out.println(check103);
	       	System.out.println(check104);
	       	System.out.println(check105);
	       	System.out.println(check106);
	       	System.out.println(check107);
	       	System.out.println(check108);
	       	System.out.println(check109);
	       	System.out.println(check110);
	       	System.out.println(check111);
	       	System.out.println(check112);
	       	System.out.println(check113);
	      	System.out.println(check114);
	      	System.out.println(check115);
	      	System.out.println("");
	      	//fifth
	      	System.out.println(check116);
	       	System.out.println(check117);
	       	System.out.println(check118);
	       	System.out.println(check119);
	       	System.out.println(check120);
	       	System.out.println(check121);
	       	System.out.println(check122);
	       	System.out.println(check123);
	       	System.out.println(check124);
	       	System.out.println(check125);
	       	System.out.println(check126);
	       	System.out.println(check127);
	       	System.out.println(check128);
	        System.out.println(check129);
	       	System.out.println(check130);
	       	System.out.println(check131);
	       	System.out.println(check132);
	       	System.out.println(check133);
	       	System.out.println(check134);
	       	System.out.println(check135);
	       	System.out.println(check136);
	       	System.out.println(check137);
	       	System.out.println(check138);
	       	System.out.println(check139);
	       	System.out.println(check140);
	       	System.out.println(check141);
	       	System.out.println(check142);
	      	System.out.println(check143);
	      	System.out.println(check144);
	      	System.out.println("");
	      	//sixth
	      	System.out.println(check145);
	       	System.out.println(check146);
	       	System.out.println(check147);
	       	System.out.println(check148);
	       	System.out.println(check149);
	       	System.out.println(check150);
	       	System.out.println(check151);
	       	System.out.println(check152);
	       	System.out.println(check153);
	       	System.out.println(check154);
	       	System.out.println(check155);
	       	System.out.println(check156);
	       	System.out.println(check157);
	        System.out.println(check158);
	       	System.out.println(check159);
	       	System.out.println(check160);
	       	System.out.println(check161);
	       	System.out.println(check162);
	       	System.out.println(check163);
	       	System.out.println(check164);
	       	System.out.println(check165);
	       	System.out.println(check166);
	       	System.out.println(check167);
	       	System.out.println(check168);
	       	System.out.println(check169);
	       	System.out.println(check171);
	      	System.out.println(check172); 
	      	System.out.println(check173);
	      	System.out.println(check174);
	      	//seventh
	      	System.out.println(check175);
	       	System.out.println(check176);
	       	System.out.println(check177);
	       	System.out.println(check178);
	       	System.out.println(check179);
	       	System.out.println(check180);
	       	System.out.println(check181);
	       	System.out.println(check182);
	       	System.out.println(check183);
	       	System.out.println(check184);
	       	System.out.println(check185);
	       	System.out.println(check186);
	       	System.out.println(check187);
	        System.out.println(check188);
	       	System.out.println(check189);
	       	System.out.println(check190);
	       	System.out.println(check191);
	       	System.out.println(check192);
	       	System.out.println(check193);
	       	System.out.println(check194);
	       	System.out.println(check195);
	       	System.out.println(check196);
	       	System.out.println(check197);
	       	System.out.println(check198);
	       	System.out.println(check199);
	       	System.out.println(check200);
	      	System.out.println(check201); 
	      	System.out.println(check202);
	      	System.out.println(check203);
	      	System.out.println(""); // I used this to separate the similarities
	      	//
	      	
/*This array largestSimilarity stores those check results 
 * from method CheckForSimilaritiesBetweenHashes
	      	 * I use those checks to compare them with each other in method TheLargestSimilarity
	      	 */
	      	int [] largestSimilarity = new int[] {check,check1,check2,check3,check4,check5,check6,
check7,check8,check9,check10,check11,check12,check13,check14,check15,check16,check17,
check18,check19,check20,check21,check22,check23,check24,check25,check26,check27,check28,
check29,check30,check31,check32,check33,check34,check35,check36,check37,check38,check39,
check40,check41,check42,check43,check44,check45,check46,check47,check48,check49,check50,
check51,check52,check53,check54,check55,check56,check57,check58,check59,check60,check61,
check62,check63,check64,check65,check66,check67,check68,check69,check70,check71,check72,
check73,check74,check75,check76,check77,check78,check79,check80,check81,check82,check83,
check84,check85,check86,check87,check88,check89,check90,check91,check92,check93,check94,
check95,check96,check97,check98,check99,check100,check101,check102,check103,check104,check105,
check106,check107,check108,check109,check110,check111,check112,check113,check114,check115,check116,
check117,check118,check119,check120,check121,check122,check123,check124,check125,check126,check127,
check128,check129,check130,check131,check132,check133,check134,check135,check136,check137,check138,
check139,check140,check141,check142,check143,check144,check145,check146,check147,check148,check149,
check150,check151,check152,check153,check154,check155,check156,check157,check158,check159,check160,
check161,check162,check163,check164,check165,check166,check167,check168,check169,check171,
check172,check173,check174,check175,check176,check177,check178,check179,check180,check181,check182,
check183,check184,check185,check186,check187,check188,check189,check190,check191,check192,check193,
check194,check195,check196,check197,check198,check199,check200,check201,check202,check203,a,b,c,d,e,f,I,k1,k2,k3,k4,
aa,bb,cc,dd,ee,ff,gg,hh,II};
	      	
	 System.out.println(sentences[1]);//prints out the second sentence 
	 System.out.println(hashes[1]); // prints out the second hash 
	 System.out.println(sentences[2]); //prints out third sentence
	 System.out.println(hashes[2]); //prints out third hash
	 System.out.println("The highest Similarity is:"); 
	 System.out.println(TheLargestSimilarity(largestSimilarity));
	 /*The last system.out.println prints out the result from the method TheLargestSimilarity
	  * The highest currently is 10 
	  */
	}
		
	//
	public static int TheLargestSimilarity(int[]array) { //this method takes in an array and returns maximum value from that array
		int maximum = array[0]; // int maximum stores the first value from the array
		for(int i = 1; i <array.length; i++) { //for loop compares i which is less than the whole array
			if(maximum<array[i]) { // if loop that if max value is less than array[i], then maximum will store the array[i]
				maximum=array[i];  // array[i] keeps the 
			}
		}
		return maximum; //returns highest value of array 
	}
	//CODE FROM MOODLE
	    public static String sha256(String input){
	        try{
	            MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
	            byte[] salt = "CS210+".getBytes("UTF-8");
	            mDigest.update(salt);
	            byte[] data = mDigest.digest(input.getBytes("UTF-8"));
	            StringBuffer sb = new StringBuffer();
	            for (int i=0;i<data.length;i++){
	                sb.append(Integer.toString((data[i]&0xff)+0x100,16).substring(1));
	            }
	            return sb.toString();
	        }catch(Exception e){
	            return(e.toString());
	        }
	    }
	    //Method for looking and counting the similarities of two hashes
	    public static int CheckForSimilaritiesBetweenHashes(String One, String Two) {
	     	int position =0; // This value keeps the position which is set to zero
	     	int counter = 0; // This value will be counting similarities
	     	while(position < One.length()) { // This while loop will be beginning at beginning of the string
	     		if(One.charAt(position)==Two.charAt(position)) { /*If loop to check
	     		 first string at position 0 is the same as second string with the same position this will be going through both hashes*/
	     			counter++; // Counter counts each similarity between them and stores the result
	     		}
	     	position++; //position increases 
	     }
	     	return counter; //return the integer number of similarities
	     	}
	    

}

