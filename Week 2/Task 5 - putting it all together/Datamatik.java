import java.util.*;

public class Datamatik {
        
public static void main(String[] args) {
    


    Student[] studentArray = new Student[10];
    studentArray[0] = new Student("Christian",19,false,"H");
    studentArray[1] = new Student("Frederik",23,false,"A");
    studentArray[2] = new Student("Inga",28,true,"A");
    studentArray[3] = new Student("Asger",24,false,"A");
    studentArray[4] = new Student("Bjarke",28,false,"J");
    studentArray[5] = new Student("Leo",24,false,"H");
    studentArray[6] = new Student("Mohammed",24,false,"G");
    studentArray[7] = new Student("Mie",21,true,"F");
    studentArray[8] = new Student("Cleve",25,false,"B");
    studentArray[9] = new Student("Bentsen",21,false,"B");
    System.out.println(studentArray[6].name);

    int n = 5;
    int i;

    int myArray[] = {1, 3, 5, 7, 9};
    
    System.out.println(Arrays.toString(myArray));
    int ele = 11;

    myArray = studentArray(n, myArray, ele);

    System.out.println(ele + Arrays.toString(myArray));


    /*
    Student Nikolaj = new Student("Nikolaj", 25, false, "A");
    Student Galler = new Student("Galler", 12, false, "A");


    System.out.println(Nikolaj.name + " fra team " + Nikolaj.datamatikerTeam);
    System.out.println(Galler.name + " fra team " + Galler.datamatikerTeam);
    */

}


public static int[] studentArray(int n, int myarray[], int ele) {

    int i;
    int newArray[] = new int[n + 1];
    // copy original array into new array
    for (i = 0; i < n; i++)
            newArray[i] = myarray[i];

    //add element to the new array
    newArray[n] = ele;

    return newArray;

}
 
}


