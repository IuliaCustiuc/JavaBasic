/**
  * Java Basic Homework 03
  *
  *@author Iulia Custiuc
  *@todo 12.9.2022
  *@date 21.9.2022
  */
class Homework03 {
    public static void main(String[] args) {
        int[] arr = {14, 16, 18, 20};
        printArray(arr);
        int max = arr[0];
        System.out.println(getMax(max));
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(",");
            }
        }
    }
    static int getMax(int[] max) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } return max;
       }
    }
    
}