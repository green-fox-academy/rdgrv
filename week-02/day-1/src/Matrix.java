public class Matrix {
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    for (int i = 0; i < matrix.length; i++) {
      matrix[i][i] = 1;
    }

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }
  }
}




// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output