package SortingAlgotithms;

public class QuickSort {

    public static void sort(int[] a, int l, int r) {
        int pivot = a[(r + l) / 2];
        int i = l;
        int j = r;

        while (i < j) {

            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
            i++;
            j--;
        }

        if(i<r){
            sort(a,i,r);
        }

        if(j>l){
            sort(a,l,j);
        }
    }




    public static void main(String[] args) {
        int[] a = {9, 6, 5, 7, 3, 4,5,34,2,1,0};

        ArraysUtils.show(a);
        sort(a,0,a.length-1);
        ArraysUtils.show(a);

    }
}
