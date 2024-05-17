public class Main {
    //print methods
    // 1D array

    //Big O NOTATION = LINEAR TIME: An increase in problem size == increase in algorithm runtime
    //O(n) : where n represents the problem size, think of n as x
    public static void print1D(int[] array){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

    public static void print2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //n*n =n^2

    //nested loops
    /*
    1D- linear time :O(n) : one for loop (can be while loop)
    2D - quadratic time: O(n^2): two level nested for loop (can be while loop)
    3D - cubic time : O(n^3): three level nested loop:: items in a cube :: length * width * Depth arr[][][]*/
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //1-D array

        int[][] numbers2D = {
                {1, 2, 3, 4, 5,}, //0
                {6, 7, 8, 9, 10}, //1
                {11, 12, 13, 14, 15} //2
        };

        //System.out.println("1 Dimension printout");
        //print1D(numbers);

        //print 13, row 2, col2
        //System.out.println(numbers2D[2][2]);

        System.out.println("2 Dimension printout");
        print2D(numbers2D);

        //an increase in problem  (array) size == increase in algorithm runtime
        /*

         */
    }
}