public class Main {
    public static void main(String[] args) {
        //Create an object of StudentClass
        StudentClass studentClass1=new StudentClass<>();
        //Call getQuery method
        studentClass1.getQuery("Raja Rani Vinay Rahul Arun", "1,r");
        studentClass1.getQuery("Raja Rani Vinay Rahul Arun", "2,B- B+ AB+ B+ AB-");
        studentClass1.getQuery("96 90 3 45","3,90");
        studentClass1.getQuery("96 90 3 45","4");
        studentClass1.getQuery("96.89 95.0 3.67 46.8","5");
    }
}
