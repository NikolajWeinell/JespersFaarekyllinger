
public class Main {
    public static void main(String[] args) {
        
        stringInput("Test");
        printLine();
        nameage("Nikolaj", 25);

    }

    public static void printLine()  {

        System.out.println("");
    }
    
    public static void stringInput(String param)    {

        System.out.println(param);
    }

    public static void nameage(String name, int age) {

        System.out.println("My name is " + name + ", I am " + age + " years old");
    }
}