package SortingAlgotithms;

public class MergeSort {

    public static void sort(int[] a, int[] b) {
        int i, j, k;
        i = j = k = 0;
        int[] c = new int[a.length + b.length];

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;

        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;

        }

        ArraysUtils.show(c);


    }

    public static void merge(int[] a,int l,int m,int r) {

        int sizeL = m-l+1;
        int sizeR  = r-(m+1)+1;

        int[] left = new int[sizeL];
        int[] right = new int[sizeR];


        for(int i=l; i<=m; i++ ){
            left[i-l] = a[i];
        }

        for(int i=m+1; i<=r; i++){
            right[i-(m+1)]=a[i];
        }

       /* ArraysUtils.show(left);
        ArraysUtils.show(right);
        System.out.println();*/

        int i,j,k;
        i=j=0;
        k=l;


        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            a[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) {
            a[k] = right[j];
            j++;
            k++;


        }


    }

    public static void mergeSort(int[] a,int l ,int r) {
        if(l!=r) {
            int m =(r+l)/2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a,l,m,r);
        }


        //ArraysUtils.show(a);
    }



    public static void main(String[] args) {
        int[] a = {9,6,5,7,3,4};

        ArraysUtils.show(a);
        mergeSort(a,0,a.length-1);
        ArraysUtils.show(a);

    }
}
