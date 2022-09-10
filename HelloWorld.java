class HelloWorld {
    public static void main(String[] args) {
       
        int a = 10;
        System.out.println(a);
        float b = 5 / 2f;
        System.out.println(b);
        char c = 'q';
        System.out.println(c);
        boolean f = true;
        System.out.println(f);
        int[] array = new int[24];
        array[0] = 11;
        System.out.println( array[1]);
        float x = a * 3 + b;
        System.out.println(x);
        System.out.println(Math.PI);
        f = a > 10;
        System.out.println(f);
        System.out.printf("a = %d, b = %f, f = %s, s = %s", a, b, f, "JAVA");
    int Width = 5;
		int Length = 7;
		int Perimeter = 2 * (Width + Length);
		int Area = Width * Length;
		System.out.printf("Perimeter = %d, Area = %d", Perimeter, Area)
    }
    
}