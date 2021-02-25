class Main{

public static boolean happy = true;


public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

System.out.println(intSum(5,7));
System.out.println(upperCase("test"));
System.out.println(isUpperCase("TEST"));

}


public static boolean iAmHappy()
{
  return happy;
}


public static int intSum(int int1, int int2) {

    return int1 + int2;
}

public static String upperCase(String str)  {

    str = str.toUpperCase();

    return str;
}

public static boolean isUpperCase(String str)    {


    //Character.isUpperCase(str.charAt(0));

    return Character.isUpperCase(str.charAt(0));
}

}