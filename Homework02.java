 /**
  * Java Basic Homework 02
  *
  *@author Iulia Custiuc
  *@todo 7.9.2022
  *@date 14.9.2022
  */
class Homework02 {
    public static void main(String[] args) {
        checkWeather (0);
        
        System.out.println(canWalk());
        
        System.out.println(addition(1,2));
        System.out.println(subtraction(1,2));
        System.out.println(multiplication(1,2));
        System.out.println(division(1,2));
        
        dayOfWeek(2);
        
    }
        // task 1
    static void checkWeather(int t) {
            
            if (t < 0){
                System.out.println("It's frost");
            } else if (t <= 18) {
                System.out.println("It's cold");
            } else if (t <= 28){
                System.out.println("It's warm");
            } else if (t >= 29){
                System.out.println("It's hot");
            }
        }
        
        // task 2
        
        static boolean canWalk() {
        boolean isWeekend = true;
        boolean isRain = false;
        return isWeekend;
        } 
        
        
        
        //task 3
        static int addition(int a, int b) {
            int c = a + b;
            return c;
        }
        
        static int subtraction(int a, int b) {
            int c = a - b;
            return c;
        }
        
        static int multiplication(int a, int b) {
            int c = a * b;
            return c;
        }
        
        static int division(int a, int b) {
            int c = a / b;
            return c;
        }
        
        //task 4
        static void dayOfWeek(int d) {
            if (d == 1) {
                System.out.println("It's Monday");
            } else if (d == 2) {
                System.out.println("It's Tuesday");
            } else if (d == 3) {
                System.out.println("It's Wednesday");
            } else if (d == 4) {
                System.out.println("It's Thursday");
            } else if (d == 5) {
                System.out.println("It's Friday");
            } else if (d == 6) {
                System.out.println("It's Saturday");
            } else if (d == 7) {
                System.out.println("It's Sunday");
            }
        }
        
        
    }
    
    
    


