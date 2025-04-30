public class Calculator {
	public static int add(int a,int b){
     return a+b;
     }
     
     public static int substraction(int a,int b){
    	 return a-b;
     }
     public static void main (String[] args) { 
        int getadd=add(10,5);
        int getSubstract = substraction(10, 5);

         System.out.println("addition:- "+ add(10,5));
         System.out.println("substraction:- "+substraction(10,5));
         }
     
     }