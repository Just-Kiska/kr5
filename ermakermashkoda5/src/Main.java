import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
//      Task 1
//        Human dude = new Human("Danila", "Ermak", 2003);
//        dude.displayInfo();
//        Task 2
//        int cathet1 = r.nextInt();
//        int cathet2 = r.nextInt();
//        RightTriangle tr = new RightTriangle(cathet1, cathet2);
//        tr.displayInfo();
//        Task 3
        double m = r.nextInt();
        double h = r.nextInt();
        PotentialEnergy fall = new PotentialEnergy(h, m);
        fall.setH(h);
        fall.setM(m);
        fall.displayInfo();
    }
}
class Human {
    String name;
    String sname;
    int birth;
    int year = 2022;
    int age;
    Human(String name, String sname, int birth) {
        this.name = name;
        this.sname = sname;
        this.birth = birth;
        this.age = (year - birth);
    }
    void displayInfo(){
        System.out.println("First name:" + name + " Second name:" + sname + " Age:" + age);
    }
    
}

class RightTriangle{
    int cathet1;
    int cathet2;
    int hypotenuse;

    RightTriangle(int cathet1, int cathet2){
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
        this.hypotenuse = (int) Math.sqrt((cathet1*cathet1) - (cathet2*cathet2));
    }
    void displayInfo(){
        System.out.println("Length of hypotenuse: " + hypotenuse);
    }

}

class PotentialEnergy{
    static double g = 9.81;
    private double h;
    private double m;
    double en;

    public double getH(){
        return h;
    }
    public void setH(double h){
        this.h = h;
    }

    public double getM(){
        return m;
    }
    public void setM(double m){
        this.m = m;
    }

    PotentialEnergy(double h, double m){
        this.h = h;
        this.m = m;
        this.en = (h*m*g);
    }
    void displayInfo(){
        System.out.println("Potential energy is: " + en);
    }


}