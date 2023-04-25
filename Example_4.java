
/*
 Реализовать разность массивов и симметрическую разность.
 */


 import java.util.ArrayList;
 import java.util.Arrays;
 
 public class Example_4 {
     public static void main(String[] args) {
         ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
         System.out.println(arr1);
         System.out.println(arr2);
         System.out.println(difference1(arr1, arr2)); // функция для a - b
         System.out.println(difference2(arr1, arr2)); // функция для b - a
         System.out.println(difference3(arr1, arr2)); // функция для симметрической разницы
     }
 
     // функция для a - b
     public static ArrayList<Integer> difference1(ArrayList<Integer> arr_1, ArrayList<Integer> arr_2) {
         ArrayList<Integer> arr_difference = new ArrayList<>();
         for (Integer item : arr_1) {
             if (!arr_2.contains(item)) {
                 arr_difference.add(item);
             }
         }
         return arr_difference;
     }
 
     // функция для b - a
     public static ArrayList<Integer> difference2(ArrayList<Integer> arr_1, ArrayList<Integer> arr_2) {
         ArrayList<Integer> arr_difference2 = new ArrayList<>();
         for (Integer item : arr_2) {
             if (!arr_1.contains(item)) {
                 arr_difference2.add(item);
             }
         }
         return arr_difference2;
     }
 
     // функция для симметрической разницы
     public static ArrayList<Integer> difference3(ArrayList<Integer> arr_1, ArrayList<Integer> arr_2) {
         ArrayList<Integer> arr_symmetrical_difference = new ArrayList<Integer>();
         for (Integer item : arr_1) {
             if (!arr_2.contains(item)) {
                 arr_symmetrical_difference.add(item);
             }
         }
         for (Integer item : arr_2) {
             if (!arr_1.contains(item)) {
                 arr_symmetrical_difference.add(item);
             }
         }
         return arr_symmetrical_difference;
     }
 }