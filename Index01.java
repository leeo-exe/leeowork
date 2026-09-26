import java.util.Scanner;

/**
  Index01
 */
public class Index01{
    public static void main (String args []){

        //input 
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);
        Scanner vc = new Scanner(System.in);
        int a= vc.nextInt();
        int b= vc.nextInt();
        int sum = a+b;
        System.out.println(sum);

    }
}


/**    public static void main (String args []) {
        System.out.println("are u ready to learn java");

        //variables 
         String name ="tony";
        int a=25;
        int b=45;
        int age =25;
         a=10;
       b=5;


       int sum = a+b;
       int diff =a-b;
       int mul=a*b;
       int divide =a/b;
       int ans = a*b/a-b;
       int ans2 = (a*b)/(a-b);
       System.out.println(sum);
       System.out.println(diff);
       System.out.println(mul);
       System.out.println(divide);
       System.out.println(ans);
       System.out.println(ans2);


       System.out.println("*");
        System.out.print("**\n");
        System.out.println("***");
        System.out.print("****\n"); 
        System.out.println(mul);
    }
}*/