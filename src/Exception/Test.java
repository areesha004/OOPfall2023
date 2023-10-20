package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
class Errordetection{

    void zero(int a,int b){
      try{
          System.out.println(" a/b = " + a/b);
      }
      catch(ArithmeticException e){
          System.out.println("arithmetic error found....");
      }
        System.out.println("yohooooo....");
    }
}
class Exception{
    public  void Number(int[] array,int i) throws ArrayIndexOutOfBoundsException{
        int index;
        for(index=0;index< array.length;index++) {
            if(i>array.length){

                throw new ArrayIndexOutOfBoundsException();
            }
        }

    }


}

public class Test {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
//
        Exception e1= new Exception();
        int[] array=new int[10];
        array[0]=2;
        array[1]=4;
        array[2]=8;
        array[3]=10;

        try {
            e1.Number(array,8);

        }
        catch(java.lang.Exception e){
            System.out.println("array out of bound exception occurs");
        }




//        int a ;
////        System.out.println(a[4]);
//
//        try{
//            a=sc.nextInt();
//            System.out.println(a);
//
//        }
//        catch(InputMismatchException e){
//            System.out.println("input mismatch error seen");
//        }
//
//        System.out.println("this is the end of program");

//        int a;
//        a=sc.nextInt();
//        if(a<0){
//            throw new RuntimeException("error occurerred");
//        }
//        System.out.println("a,b,c");


    }
//     System.out.println("ENTER VALUE OF A ");
//        int  a= sc.nextInt();
////        int b=sc.nextInt();
//        if(a<0) {
//            try {
//                System.out.println("value  of a is " + a);
//                throw new ArithmeticException("NUMBER CANT BE NEGATIVE");
//
//            } catch (ArithmeticException e) {
//                System.out.println(e.getMessage());
//            }
//        }

}
