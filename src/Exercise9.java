public class Exercise9 {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10]; //Declaration and Instantiation
        boolean thereWasOne;
        int countRowsAll0 = 0;


        //Initialization
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {

                matrix[row][col] = 0;
            }

        }
        matrix[0][4] = 1;
        matrix[2][6] = 1;
        matrix[3][1] = 1;
        matrix[8][6] = 1;

        for (int row = 0; row < matrix.length; row++) {
            thereWasOne = false;
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 1) {
                    thereWasOne = true;
                    break;
                }
            }
            if (!thereWasOne) {
                countRowsAll0++;

            }


        }
        System.out.println("N. rows all 0: " + countRowsAll0);

        for (int col = 0; col < matrix[0].length; col++) {
            thereWasOne = false;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    thereWasOne = true;
                    break;
                }
            }
            if (!thereWasOne) {
                countRowsAll0++;
            }
        }
        System.out.println("N. of cols with all 0: " + countRowsAll0);
    }
}