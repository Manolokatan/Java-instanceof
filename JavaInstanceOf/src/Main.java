import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {

        List l = new ArrayList(); // create an array list the excepts objects(every type)

        //now well add values to the list
        l.add(0,'a');       // at index 0 we place a char
        l.add(1,4);         // at index 1 we place an integer
        l.add(2,true);      // at index 2 we place a boolean
        l.add(3,"string");  // at index 3 we place a string
        l.add(4,5.6);       // at index 4 we place a double
        l.add(5,4);         // at index 5 we place another integer

        int counter = 0; // create a variable that will count the number of integers in the list

        for(Object o : l) // go over each index of the array
        {
            if(o instanceof Integer) // if the current index is an integer
            {
                counter++; // add 1 to counter
            }
        }
        System.out.println("number of integers: " + counter);//print the number of integers that are in the list

    }
}
