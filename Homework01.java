/**
 * Java Basic Homework 01
 *
 * @author Iulia Custiuc
 * @version 10.09.2022
 *
 */
class Homework01 {
    public static void main (String[] args) {
	    int width = 5;
		int length = 7;
		int perimeter = 2 * (width + length);
		int area = width * length;
		System.out.printf("perimeter = %d, area = %d", perimeter, area);
        
        int a = 5;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        System.out.printf(" slojenia = %d, vicitanie = %d, umnojenia = %d, delenia = %d",c, d, e, f);
        
        int [] array = new int[5];
        array[0] = 2;
        System.out.println(array[1]);
        
        int diameter = 10;
        int radius = diameter / 2;
        final double PI = 3.141592653;
        double pizzaArea = PI * Math.pow(radius,2);
        double calories = pizzaArea * 40;
        System.out.println("pizza calories =" + calories);
        
	}

}