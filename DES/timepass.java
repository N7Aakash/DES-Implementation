import java.lang.Integer;

public class timepass{

	public static void main(String args[]){

		// byte b2 = (byte) 2;
		// // String s2 = String.format("%8s", Integer.toBinaryString(b2 & 0xFF)).replace(' ', '0');
		// String s2 = String.format("%8s", Integer.toBinaryString(b2)).replace(' ', '0');
		// System.out.println(s2); // 00000010

		// String hex = "";
		// String hex2 = hex;

		// hex2 += "hello";

		// System.out.println(hex);

		// String tp = "0 15   7  4  14  2  13  1  10  6  12 11   9  5   3  8 4  1  14  8  13  6   2 11  15 12   9  7   3 10   5  0 15 12   8  2   4  9   1  7   5 11   3 14  10  0   6 13";
		// String tp = "131 2   8  4   6 15  11  1  10  9   3 14   5  0  12  7 1 15  13  8  10  3   7  4  12  5   6 11   0 14   9  2 7 11   4  1   9 12  14  2   0  6  10 13  15  3   5  8 2  1  14  7   4 10   8 13  15 12   9  0   3  5   6 11";
		String tp = "33     1   41     9    49   17    57   25";
		tp = tp.replaceAll("\\s+", ",");

		System.out.println(tp);
	}

}