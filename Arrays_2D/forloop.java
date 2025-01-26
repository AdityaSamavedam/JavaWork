//2D Array Traversal
//

package Arrays_2D;

public class forloop {
    public static void main(String[] args) {

	    int[][] matrix = new int[4][4];
	    for (int i = 0; i < matrix.length; i++)
	    {
		 
		 System.out.print("row " + i + " : ");
		 for (int j = 0; j < matrix[i].length; j++)
		 {
		    
		    System.out.print("col " + j + "  ");
		 }
	    System.out.println();
	   }
	}
}
