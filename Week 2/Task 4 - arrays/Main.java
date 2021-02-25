public class Main {
    public static void main(String[] args) {
        
        int[] intarray = {2,4,6,8};
        String[] stringarray;
        boolean[] booleanarray = {true, false, false};

       
        stringarrayM();

        for (int tal: intarray)  {
            int sum = tal + tal;
            System.out.println(sum);
        }

        for (boolean bool: booleanarray)   {
            System.out.println(bool);
        }
    }

    public static void stringarrayM()   {

        String[] stringarray = {"Datamatiker", "POGGERS", "KomodoHype"};

        for (String str: stringarray)   {
            System.out.println(str);
        }

    }
}


