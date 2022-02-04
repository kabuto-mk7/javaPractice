import java.util.ArrayList;

public class LearnJava {

    public static void main(String[] args) {

        //primative types
        int a = 5;
        char b = 'i';
        long c = 400;
        double d = 3.2;

        //non primative types (objects)
        String name = "Kabuto";

        //making use of objects using a method
        name.toUpperCase();

        //printing to console using a method on an object
        System.out.println(name.toUpperCase());
        
        //printing to console using a custom void method
        addExclamationPoint("hot dogs");

        //printing to console using a custom String method
        String exclaim = addExclamationPointString("hot dogs");
        System.out.println(exclaim);

        //printing to console using a custom string method within another class file
        animal animalObject = new animal();
        String dog = animalObject.iAmDog();
        System.out.println(dog);
        
        //other common objects
        ArrayList<Integer> i = new ArrayList<Integer>();

        //using custom methods within an external class
        coolClass cool = new coolClass();
        cool.doStuff();
        cool.doStuffFor();
        cool.doStuffWhile();

    }

    //creating a void method using println
    public static void addExclamationPoint(String s){

        System.out.println(s + "!");

    }

    //creating a String method using return
    public static String addExclamationPointString(String s){

        return s + "!";
    }
    
}
