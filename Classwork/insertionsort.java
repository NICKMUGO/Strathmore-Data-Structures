public class insertionsort {
        public static void insertionSort(int[] data) {
            int n = data.length;
            for (int i = 1; i < n; i++) {
                int key =data[i];
                int x =i-1;
            while (x >= 0 && key < data[x]) {
                data[x + 1] =data[x];
                x --;
                
            }
            data[x +1] = key;
        }
        }
        public static void main(String[] args) {
            int[] numbers = {23, 12, 11, 18, 19, 26};
            insertionSort(numbers);
            for (int i : numbers) {
                System.out.print(i+"");
        
            }
        }
}
        
        // 11 12 18 19 23 26
        
        /*
        *- Insert items into correct positions as we nav. through a s
        *- B < A < C: while A<B && B<C
        */

