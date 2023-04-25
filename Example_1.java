// Функция сортировки слиянием

// Оформим приведенный код как рекурсивную функцию, которая станет разделять массивы до тех пор, пока это возможно, с параметрами, 
// соответствующими целому массиву при первом вызове, его половинам при втором и третьем вызовах и т. д.


// Здесь:
// a – массив;
// lo – позиция первого элемента в массиве (для первой итерации = 0);
// hi – позиция последнего элемента в массиве (для первой итерации = a.length — 1).

// import java.util.Arrays;

// public class Example_1 {
//     public static void main(String[] args) {
//         int[] arr = new int[] { 16, 34, 9, 56, 26, 11, 4, 89 };
//         SortUnsorted(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
//     }
//     private static void SortUnsorted(int[] a, int lo, int hi) {  

//     if (hi <= lo)
//         return;
//     int mid = lo + (hi - lo) / 2;
//     SortUnsorted(a, lo, mid);
//     SortUnsorted(a, mid + 1, hi);

//     int[] buf = Arrays.copyOf(a, a.length);

//     for (int k = lo; k <= hi; k++)
//         buf[k] = a[k];

//     int i = lo, j = mid + 1;
//     for (int k = lo; k <= hi; k++) {

//         if (i > mid) {
//             a[k] = buf[j];
//             j++;
//         } else if (j > hi) {
//             a[k] = buf[i];
//             i++;
//         } else if (buf[j] < buf[i]) {
//             a[k] = buf[j];
//             j++;
//         } else {
//             a[k] = buf[i];
//             i++;
//         }
//     }
// }
// }

import java.util.Arrays;

public class Example_1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 16, 34, 9, 56, 26, 1, 775, 63, 2 };
        int[] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }
    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int[] arrLeft = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrRight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        arrLeft = mergeSort(arrLeft);
        arrRight = mergeSort(arrRight);
        return merge(arrLeft, arrRight);
    }
    private static int[] merge(int[] arrLeft, int[] arrRight) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[arrLeft.length + arrRight.length];
        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] < arrRight[j]) {
                res[k] = arrLeft[i];
                i++;
            } else {
                res[k] = arrRight[j];
                j++;
            }
            k++;
        }
        while (i < arrLeft.length) {
            res[k] = arrLeft[i];
            i++;
            k++;
        }
        while (j < arrRight.length) {
            res[k] = arrRight[j];
            j++;
            k++;
        }
        return res;
    }
}