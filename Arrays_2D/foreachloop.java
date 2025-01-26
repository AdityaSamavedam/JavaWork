package Arrays_2D;

public class foreachloop {
    public static void printMatrix(int matrix[][]){
		for (int [] row : matrix)
		{
			
			for (int element : row)
			{
				
				System.out.print( element  + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] matrix = {  { 3, 2, 1, 7 },
					  { 9, 11, 5, 4 },
					  { 6, 0, 13, 17 },
					  { 7, 21, 14, 15 } };
		printMatrix(matrix);
	}
}
