import java.util.*;

public class DES{
	public static void main(String[] args){
	 	String msg = hextobin("0123456789ABCDEF");
	 	System.out.println(msg);
	 	String key = hextobin("133457799BBCDFF1");
	 	System.out.println(key);

	 	int[][] pc = new int[8][7];
	 	int rand = 0;
	 	int ans = 0;
	 	int temp = 0;
	 	for(int i = 0; i<8; i++){
	 		for(int j =0; j<7; j++){
	 			rand =  randomWithRange(1,64);
	 			temp = rand%8;
	 			
	 			if(temp!=0){
	 			ans = search(pc,0,8,0,7,rand);

	 			System.out.println("rand no. is : " + rand + " temp : " + temp + " ans is : " + ans);
	 			if(ans == 1){
	 				System.out.println("now rand value is: " + rand);
	 			pc[i][j] = rand;
	 		}
	 		}
	 		
	 		}
	 	}
	 	printMatrix(pc);
	}

	public static String hextobin(String msg){
		Map<String, String> digiMap= new HashMap<>();

    digiMap.put("0", "0000");
    digiMap.put("1", "0001");
    digiMap.put("2", "0010");
	digiMap.put("3", "0011");
	digiMap.put("4", "0100");
	digiMap.put("5", "0101");
	digiMap.put("6", "0110");
	digiMap.put("7", "0111");
	digiMap.put("8", "1000");
	digiMap.put("9", "1001");
	digiMap.put("A", "1010");
	digiMap.put("B", "1011");
	digiMap.put("C", "1100");
	digiMap.put("D", "1101");
	digiMap.put("E", "1110");
	digiMap.put("F", "1111");

	char[] ch = msg.toCharArray();
		String binaryString = "";
		String left="";
		String right = "";
		for(char k : ch){
			binaryString = binaryString + digiMap.get(String.valueOf(k));
		}
		for(int i =0; i<binaryString.length(); i++){
			if(i<binaryString.length()/2){
			left = left + binaryString.charAt(i);
		}
		else{
			right = right + binaryString.charAt(i);
		}
		}
		return binaryString;
	
	}

	public static int randomWithRange(int min, int max){
		
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}

	public static int search(int[][] mat, int fromRow, int toRow,  
                              int fromCol, int toCol, int key){ 
        for(int i =0;i<toRow; i++){
        	for(int j=0; j<toCol; j++){
        		if(key == mat[i][j])
        			return -1;
        	}
        }
        return 1;
    } 

    public static void printMatrix(int[][] matrix){
  //   	for (int i = 0; i < matrix.length; i++) {
  //   	for (int j = 0; j < matrix[i].length; j++) {
  //       System.out.print(matrix[i][j] + " ");
  //   	}
  //   	System.out.println();
		// }

		for(int i =0 ; i< 8 ; i++){
			for(int j =0 ; j< 7 ; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
    }
}

