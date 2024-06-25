package Assignment1;
public class Solution166915 {

    // Fields
    public int peak;
    public int[] array;
    

    // Constructors

    // Methods
    public int peak(int[] array){
        //return if no arr is passed or there is one element
        if (array.length == 0){
            return 0;
        }

        if (array.length ==1){
            return array[0] ;
        }
        for (int i = 1;i<array.length;i++){
            if ( array[i]>array[i-1] && array[i]>array[i+1] ){
                peak=array[i] ;
                return peak ;
            }
        }

        //edge case 1
        if (array[0] > array[1]){
            peak = array[0] ;
            return peak ;
        }

        //edge case 2
        if (array[array.length -1] >array[array.length -2] ){
            return array[array.length -1] ;
        }
        return -1;
    }

    // Main method (if applicable)
    public static void main(String[] args) {
        Solution166915 solution = new Solution166915();
        int[] array =  {13, 18, 26, 34, 27, 19, 19};
        int peak = solution.peak(array);
        System.out.println("Peak: " + peak);
    }
}