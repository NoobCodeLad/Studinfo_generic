public class Main {
    public static void main(String[] args) {
        //Create an object of StudentClass
        StudentClass studentClass1=new StudentClass<>();
        //Call getQuery method
        String s = "";
        s = studentClass1.getQuery("Raja Rani Vinay Rahul Arun", "1,r");    System.out.println(s);
        //s = studentClass1.getQuery("Raja Rani Vinay Rahul Arun", "2,B- B+ AB+ B+ AB-,B+"); System.out.println(s);
        //s = studentClass1.getQuery("96 90 3 45","3,90");    System.out.println(s);
        //s = studentClass1.getQuery("96 90 3 45","4");   System.out.println(s);
        //s = studentClass1.getQuery("96.89 95.0 3.67 46.8","5"); System.out.println(s);

    }
}
