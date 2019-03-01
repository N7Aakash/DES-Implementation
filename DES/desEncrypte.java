public class desEncrypte{

	public static void main(String args[]){

		String m  = "0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111";
		m = m.replaceAll("\\s+","");
		// System.out.println(m);

		String l = "";
		String r = "";

		for(int i = 0 ; i < m.length(); i++){
			if(i<32)
				l = l + m.charAt(i);
			else
				r = r + m.charAt(i);
		}
		// System.out.println(l);
		// System.out.println(r);

		String k = "00010011 00110100 01010111 01111001 10011011 10111100 11011111 11110001";
		k = k.replaceAll("\\s+", "");
		// System.out.println(k);
		String kPlus = "";

		int[][] matrix = {{57,49,41,33,25,17,9},{1,58,50,42,34,26,18},{10,2,59,51,43,35,27},{19,11,3,60,52,44,36},{63,55,47,39,31,23,15},{7,62,54,46,38,30,22},{14,6,61,53,45,37,29},{21,13,5,28,20,12,4}};

		for(int i = 0 ; i < 8; i++){
			for(int j = 0 ; j< 7 ; j++){
				// System.out.print(" " + matrix[i][j]);
				kPlus += k.charAt(matrix[i][j]-1);
			}
			// System.out.println();
		}

		System.out.println(kPlus);

		String cZero = "";
		String dZero = "";

		for(int i = 0 ; i < 56 ; i++){
			if(i < 28)
				cZero += kPlus.charAt(i);
			else
				dZero += kPlus.charAt(i);
		}


		String c1 = shiftFunction(1,cZero);
		String d1 = shiftFunction(1,dZero);

		String c2 = shiftFunction(1,c1);
		String d2 = shiftFunction(1,d1);
		String c3 = shiftFunction(2,c2);
		String d3 = shiftFunction(2,d2);
		String c4 = shiftFunction(2,c3);
		String d4 = shiftFunction(2,d3);
		String c5 = shiftFunction(2,c4);
		String d5 = shiftFunction(2,d4);
		String c6 = shiftFunction(2,c5);
		String d6 = shiftFunction(2,d5);
		String c7 = shiftFunction(2,c6);
		String d7 = shiftFunction(2,d6);
		String c8 = shiftFunction(2,c7);
		String d8 = shiftFunction(2,d7);
		String c9 = shiftFunction(1,c8);
		String d9 = shiftFunction(1,d8);
		String c10 = shiftFunction(2,c9);
		String d10 = shiftFunction(2,d9);
		String c11 = shiftFunction(2,c10);
		String d11 = shiftFunction(2,d10);
		String c12 = shiftFunction(2,c11);
		String d12 = shiftFunction(2,d11);
		String c13 = shiftFunction(2,c12);
		String d13 = shiftFunction(2,d12);
		String c14 = shiftFunction(2,c13);
		String d14 = shiftFunction(2,d13);
		String c15 = shiftFunction(2,c14);
		String d15 = shiftFunction(2,d14);
		String c16 = shiftFunction(1,c15);
		String d16 = shiftFunction(1,d15);

		String c1o = "1111111000011001100101010101";
		System.out.println(c1o);
		System.out.println(c14);
		if(c14.equals(c1o))
			System.out.println("match");


		int[][] matrix2 = {{14,17,11,24,1,5},{3,28,15,6,21,10},{23,19,12,4,26,8},{16,7,27,20,13,2},{41,52,31,37,47,55},{30,40,51,45,33,48},{44,49,39,56,34,53},{46,42,50,36,29,32}};


		String k1 = keyGeneration(c1,d1,matrix2);
		String k2 = keyGeneration(c2,d2,matrix2);
		String k3 = keyGeneration(c3,d3,matrix2);
		String k4 = keyGeneration(c4,d4,matrix2);
		String k5 = keyGeneration(c5,d5,matrix2);
		String k6 = keyGeneration(c6,d6,matrix2);
		String k7 = keyGeneration(c7,d7,matrix2);
		String k8 = keyGeneration(c8,d8,matrix2);
		String k9 = keyGeneration(c9,d9,matrix2);
		String k10 = keyGeneration(c10,d10,matrix2);
		String k11 = keyGeneration(c11,d11,matrix2);
		String k12 = keyGeneration(c12,d12,matrix2);
		String k13 = keyGeneration(c13,d13,matrix2);
		String k14 = keyGeneration(c14,d14,matrix2);
		String k15 = keyGeneration(c15,d15,matrix2);
		String k16 = keyGeneration(c16,d16,matrix2);


		
		String ip = "";

		int[][] matrix3 = {{58,50,42,34,26,18,10,2},{60,52,44,36,28,20,12,4},{62,54,46,38,30,22,14,6},{64,56,48,40,32,24,16,8},{57,49,41,33,25,17,9,1},{59,51,43,35,27,19,11,3},{61,53,45,37,29,21,13,5},{63,55,47,39,31,23,15,7}};

		for(int i =0 ; i< 8 ; i++){
			for(int j =0 ; j< 8 ; j++){
				ip += m.charAt(matrix3[i][j]-1);
			}
		}

		

		String ipLeft = "";
		String ipRight = "";
		for(int i = 0 ; i < ip.length(); i++){
			if(i<32)
				ipLeft = ipLeft + ip.charAt(i);
			else
				ipRight = ipRight + ip.charAt(i);
		}


		String l1 = ipRight;
		String r1 = xor(ipLeft,change(ipRight,k1));	

		

		String l2 = r1;
		String r2 = xor(l1,change(r1,k2));	
		String l3 = r2;
		String r3 = xor(l2,change(r2,k3));	
		String l4 = r3;
		String r4 = xor(l3,change(r3,k4));	
		String l5 = r4;
		String r5 = xor(l4,change(r4,k5));	
		String l6 = r5;
		String r6 = xor(l5,change(r5,k6));	
		String l7 = r6;
		String r7 = xor(l6,change(r6,k7));	
		String l8 = r7;
		String r8 = xor(l7,change(r7,k8));	
		String l9 = r8;
		String r9 = xor(l8,change(r8,k9));	
		String l10 = r9;
		String r10 = xor(l9,change(r9,k10));	
		String l11 = r10;
		String r11 = xor(l10,change(r10,k11));	
		String l12 = r11;
		String r12 = xor(l11,change(r11,k12));	
		String l13 = r12;
		String r13 = xor(l12,change(r12,k13));	
		String l14 = r13;
		String r14 = xor(l13,change(r13,k14));	
		String l15 = r14;
		String r15 = xor(l14,change(r14,k15));	
		String l16 = r15;
		String r16 = xor(l15,change(r15,k16));	

		// if(r16.equals("0000 1010 0100 1100 1101 1001 1001 0101".replaceAll("\\s+", "")))
		// 	System.out.println("r16 matches");

		String insert = r16 + l16 + "";

		

		int[][] matrix6 = {{40,8,48,16,56,24,64,32},{39,7,47,15,55,23,63,31},{38,6,46,14,54,22,62,30},{7,5,45,13,53,21,61,29},{36,4,44,12,52,20,60,28},{35,3,43,11,51,19,59,27},{34,2,42,10,50,18,58,26},{33,1,41,9,49,17,57,25}};

		String check = "";

		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				check += insert.charAt(matrix6[i][j]-1);
			}
		}

		String orig = "00001010 01001100 11011001 10010101 01000011 01000010 00110010 00110100".replaceAll("\\s+", "");

		if(insert.equals(orig))
			System.out.println("des samapt");

		System.out.println(insert);
		System.out.println(orig);

	}


	public static String keyGeneration(String c , String d , int[][] matrix2){

		String cd = c + d;
		String k = "";
		for(int i =0; i < 8; i++){
			for(int j =0 ; j < 6 ; j++){

				k += cd.charAt(matrix2[i][j]-1);

			}
		}

		return k;



	}

	public static String shiftFunction(int leftShift , String cZero ){
		String cOne = "";
		int leftShift1 = leftShift ;
		for(int i = 0 ; i < 28 - leftShift1 ; i++){
			cOne += cZero.charAt(leftShift);
			// dOne += dZero.charAt(leftShift);
			leftShift++;
			if(leftShift == 28)
				break;
		}
		for(int i =0 ;i< leftShift1 ; i++){
			cOne += cZero.charAt(i);
			// dOne += dZero.charAt(i);
		}

		return cOne;
	}

	public static String change(String r0,String k1){
		String er0 = "";
		int[][] matrix4 = {{32,1,2,3,4,5},{4,5,6,7,8,9},{8,9,10,11,12,13},{12,13,14,15,16,17},{16,17,18,19,20,21},{20,21,22,23,24,25},{24,25,26,27,28,29},{28,29,30,31,32,1}};

		for(int i =0 ; i< 8 ;i++){
			for(int j = 0; j<6 ; j++){
				er0 += r0.charAt(matrix4[i][j]-1);
			}
		}

		er0 = xor(er0,k1);

		String b1 = "";
		String b2 = "";
		String b3 = "";
		String b4 = "";
		String b5 = "";
		String b6 = "";
		String b7 = "";
		String b8 = "";

		for(int i=0;i<48;i++){
			if(i<6)
				b1 += er0.charAt(i);
			if(i<12 && i>=6)
				b2 += er0.charAt(i);
			if(i<18 && i>=12)
				b3 += er0.charAt(i);
			if(i<24 && i>=18)
				b4 += er0.charAt(i);
			if(i<30 && i>=24)
				b5 += er0.charAt(i);
			if(i<36 && i>=30)
				b6 += er0.charAt(i);
			if(i<42 && i>=36)
				b7 += er0.charAt(i);
			if(i<48 && i>=42)
				b8 += er0.charAt(i);
		}


		int[] input = new int[]{14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7,0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8,4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0,15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13};
		int[][] s1 = matrix16x4(input);
		input = new int[]{15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10,3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5,0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15,13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9};
		int[][] s2 = matrix16x4(input);
		input = new int[]{10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8,13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1,13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7,1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12};
		int[][] s3 = matrix16x4(input);
		input = new int[]{7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15,13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9,10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4,3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14};
		int[][] s4 = matrix16x4(input);
		input = new int[]{2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9,14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6,4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14,11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3};
		int[][] s5 = matrix16x4(input);
		input = new int[]{12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11,10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8,9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6,4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13};
		int[][] s6 = matrix16x4(input);
		input = new int[]{4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1,13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6,1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2,6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12};
		int[][] s7 = matrix16x4(input);
		input = new int[]{13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7,1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2,7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8,2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11};
		int[][] s8 = matrix16x4(input);


		String funcAns = "";

		funcAns += reduction(s1,b1);
		funcAns += reduction(s2,b2);
		funcAns += reduction(s3,b3);
		funcAns += reduction(s4,b4);
		funcAns += reduction(s5,b5);
		funcAns += reduction(s6,b6);
		funcAns += reduction(s7,b7);
		funcAns += reduction(s8,b8);

		// System.out.println("func ans is : " + funcAns);

		// for(int i =0;i<4;i++){
		// 	for(int j=0;j<16;j++){
		// 		System.out.print(s5[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }

		int[][] matrix5 = {{16,7,20,21},{29,12,28,17},{1,15,23,26},{5,18,31,10},{2,8,24,14},{32,27,3,9},{19,13,30,6},{22,11,4,25}};

		String ans = "";

		for(int i=0;i<8;i++){
			for(int j =0 ; j <4;j++){
				ans += funcAns.charAt(matrix5[i][j]-1);
			}
		}

		// System.out.println(ans);

		return ans;
		

	}

	public static String xor(String s1 , String s2){
		String ans = "";
		for(int i = 0 ; i < s1.length() ; i++){

			if((s1.charAt(i) == '0' && s2.charAt(i) == '0') || (s1.charAt(i) == '1' && s2.charAt(i) == '1'))
				ans += '0';
			else
				ans += '1';

		}

		return ans;

	}

	public static int[][] matrix16x4(int [] input){

		int[][] ans = new int[4][16];
		int temp =0;
		for(int i = 0 ; i< 4; i++){
			for(int j=0;j<16;j++){
				ans[i][j] = input[temp];
				temp++;
			}
		}

		return ans;

	}

	public static int stringToBinary(String s){

		if(s.equals("0000"))
			return 0;
		if(s.equals("0001"))
			return 1;
		if(s.equals("0010"))
			return 2;
		if(s.equals("0011"))
			return 3;
		if(s.equals("0100"))
			return 4;
		if(s.equals("0101"))
			return 5;
		if(s.equals("0110"))
			return 6;
		if(s.equals("0111"))
			return 7;
		if(s.equals("1000"))
			return 8;
		if(s.equals("1001"))
			return 9;
		if(s.equals("1010"))
			return 10;
		if(s.equals("1011"))
			return 11;
		if(s.equals("1100"))
			return 12;
		if(s.equals("1101"))
			return 13;
		if(s.equals("1110"))
			return 14;
		if(s.equals("1111"))
			return 15;

		return 0;
	}

	public static String intToString(int n){

		if(n==0)
			return "0000";
		if(n==1)
			return "0001";
		if(n==2)
			return "0010";
		if(n==3)
			return "0011";
		if(n==4)
			return "0100";
		if(n==5)
			return "0101";
		if(n==6)
			return "0110";
		if(n==7)
			return "0111";
		if(n==8)
			return "1000";
		if(n==9)
			return "1001";
		if(n==10)
			return "1010";
		if(n==11)
			return "1011";
		if(n==12)
			return "1100";
		if(n==13)
			return "1101";
		if(n==14)
			return "1110";
		if(n==15)
			return "1111";

		return "";
	}

	public static String reduction(int[][] s1 , String b1){

		String row = "00" + b1.charAt(0) + b1.charAt(5);

		String col = "" + b1.charAt(1) + b1.charAt(2) + b1.charAt(3) + b1.charAt(4) + "";

		int r = stringToBinary(row);
		int c = stringToBinary(col);

		int temp = s1[r][c];

		String ans = intToString(temp);

		// System.out.println(ans);

		return ans;

	}

}