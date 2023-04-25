
/*
 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
 */


 import java.util.ArrayList;
 import java.util.Random;
 
 public class Example_3 {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>(10);
         Random rd = new Random();
         for (int i = 0; i < 10; i++) {
             list.add(i, rd.nextInt(-50, 50));
         }
         System.out.println(list);
 
         int max = list.get(0);
         int min = list.get(0);
         double sum = 0;
 
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i) > max) {
                 max = list.get(i);
             }
             if (list.get(i) < min) {
                 min = list.get(i);
             }
             sum = sum + list.get(i);
         }
         double average = sum / list.size();
 
         System.out.printf("Максимальное число из списка: %d",max);
         System.out.printf("\nМинимальное число из списка: %d",min);
         System.out.printf("\nМинимальное число из списка: %f",average);
     }
 }