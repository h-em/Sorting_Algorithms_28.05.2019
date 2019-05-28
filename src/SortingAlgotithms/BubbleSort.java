package SortingAlgotithms;

public class BubbleSort {

    public static void sort(int[] a) {
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    int aux =a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                    sorted = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArraysUtils.show(a);
        sort(a);
        ArraysUtils.show(a);
    }
}
