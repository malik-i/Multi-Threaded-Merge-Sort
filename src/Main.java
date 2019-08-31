public class Main {

    public static void main(String[] args) {
        int[] sortThis = {2,8,5,3,9,4,1,7};
        mergeSort(sortThis);
    }

    public static int[] mergeSort(int[] sortThis){
        int[] sortedLeft, sortedRight; // the split into two arrays
        int midpoint = sortThis.length/2; // finding the midpoint

        sortedLeft = new int[midpoint]; // the left array will always be half of the length of orig

        if(sortThis.length % 2 == 0) { // if the length of orig is even then...
            sortedRight = new int[midpoint]; // ... set the right as size of the midpoint
        } else { // if not ...
            sortedRight = new int[midpoint+1]; // ...set the Right as size of midpoint plus 1
        }

        for(int i = 0; i < sortThis.length; i++){
            if(i < midpoint){
                sortedLeft[i] =  sortThis[i];
//                i++;
            }
        }

        for(int j = 0; j < sortThis.length; j++){
            if(j < sortedRight.length){
                sortedRight[j] = sortThis[j+midpoint];
            }
        }
        for(int n : sortedLeft){
            System.out.println("Sorted Left: " + n);
        }

        for(int n : sortedRight){
            System.out.println("Sorted Right: " + n);
        }
        return sortThis;
    }
}
