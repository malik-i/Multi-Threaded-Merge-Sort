public class Main {

    public static void main(String[] args) {
        int[] sortThis = {2,8,5,3,9,4,1,7};
        mergeSort(sortThis);
    }

    public static int[] mergeSort(int[] sortThis){
        int[] sortedLeft, sortedRight; // the split into two arrays
        int midpoint = sortThis.length/2; // finding the midpoint

        sortedLeft = new int[midpoint]; // the left array will always be half of the length of orig

        if(sortThis.length <= 1) {
            return sortThis;
        }

        if(sortThis.length % 2 == 0) { // if the length of orig is even then...
            sortedRight = new int[midpoint]; // ... set the right as size of the midpoint
        } else { // if not ...
            sortedRight = new int[midpoint+1]; // ...set the Right as size of midpoint plus 1
        }

        for(int i = 0; i < sortThis.length; i++){
            if(i < midpoint){
                sortedLeft[i] =  sortThis[i]; // storing the values into the left half, ready to be sorted
//                i++;
            }
        }

        for(int j = 0; j < sortThis.length; j++){
            if(j < sortedRight.length){
                sortedRight[j] = sortThis[j+midpoint]; // storing the values into the right half, read to be sorted
            }
        }

        int [] result = new int[sortThis.length]; // the resulting array

        sortedLeft = mergeSort(sortedLeft); // this is where the recursion occurs
        sortedRight = mergeSort(sortedRight);



//        // Using this to print all the values in both the right and left arrays
//
//        for(int n : sortedLeft){
//            System.out.println("Sorted Left: " + n);
//        }
//
//        for(int n : sortedRight){
//            System.out.println("Sorted Right: " + n);
//        }
//        return sortThis;

        result = merge(sortedLeft, sortedRight);

        return result; /// this is NOT correct, just put it in there for git commit
   }

   private static int[] merge(int[] sortedLeft, int[] sortedRight){
        int[] resultingArray = new int[sortedLeft.length + sortedRight.length];

        int leftPtr, rightPtr, resultPtr;
        leftPtr = 0; rightPtr = 0; resultPtr = 0;

        return resultingArray;
   }
}
