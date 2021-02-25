public class Main {

    public static int[] intarray = {2,4,6,8};
    public static int sum = 0;
    public static int avg = 0;
    public static String[] stringarray;
    public static boolean[] booleanarray = {true, false, false};

    public static void main(String[] args) {
        
    
        for (boolean bool: booleanarray)   {
        System.out.println(bool);
        }

    summer();

    }   
}


public static void stringarrayM()   {

    String[] stringarray = {"Datamatiker", "POGGERS", "KomodoHype"};

    for (String str: stringarray)   {
        System.out.println(str);
    }

}

public int summer(int sum)  {
        
    for (int tal: intarray)  {
        sum += tal;
        return sum;
    }
}

public int averager(int avg)  {
    
    for (int tal: intarray)  {
        sum += tal;
        int len = intarray.length;
        avg = sum/len;
        return avg;
    }
}




public static void sortArr(int[] inputArr)
    {
        int tmp = 0;

        for(int i = 0; i < inputArr.length; i++)
        {
            for (int j = i + 1; j < inputArr.length; j++)
            {
                
                if (inputArr[i] > inputArr[j])
                {
                    tmp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = tmp;
                }
            }
            System.out.println(inputArr[i]);
        }

    }



