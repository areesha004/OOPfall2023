package week_2;

public class Main {
    public static void main(String[] args) {

        Singer s1 = new Singer("atif aslam", "male", "pakistani", new Date(12, 9, 2013));

        Music m1 = new Music("depacito", "25minutes", "music", new Date(23, 8, 2015), new Singer("arijit", "male", "indian", new Date(23, 8, 2015)));

        Music m2 = new Music("depacito", "25minutes", "music", new Date(23, 8, 2015), new Singer("arijit", "male", "indian", new Date(23, 8, 2015)));
//        System.out.println(s1.toString());
        System.out.println(m1.toString());

        System.out.println(m1.equals(m2));
    }
}
