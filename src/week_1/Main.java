package week_1;

public class Main {
    public static void main(String[] args) {

        Time t1=new Time(2,9,40);

        System.out.println(  t1.displayTime());



        Rectangle r1=new Rectangle(7,7,20,20);
        r1.setLength(-5);
        System.out.println("length is "+r1.getLength());
        r1.setWidth(5);
        System.out.println("width is "+r1.getWidth());

        System.out.println("area is "+ r1.area());
        System.out.println("circumference is "+ r1.circumference());



        Rectangle r2=new Rectangle(6,6,15,10);

        System.out.println("area is "+ r2.area());
        System.out.println("circumference is "+ r2.circumference());
        Rectangle mini=r1.calMin(r1,r2);
        System.out.println(mini);
        System.out.println(r1.cal(r1,r2));
//to check the overlapping

        System.out.println(r1.intersect(r1,r2));






    }
}
