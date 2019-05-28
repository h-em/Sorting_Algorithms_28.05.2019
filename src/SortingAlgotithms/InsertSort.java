package SortingAlgotithms;

public class InsertSort {

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int aux = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > aux) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1] = aux;
        }
    }


    public static void main(String[] args) {
        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArraysUtils.show(a);
        sort(a);
        ArraysUtils.show(a);
    }
}
