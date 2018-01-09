

Link to Problem of HackerRank:   https://www.hackerrank.com/challenges/arrays-ds/problem

import java.util.Scanner;
import java.util.ArrayList;



class DataStructure
{
       ArrayList arr = new ArrayList();
    
      public void displayAarray()
    {
        for(int index = arr.size() - 1;index >= 0;index--)
        {
            System.out.print(arr.get(index) + " ");
        }
    }
}
public class HackerArray1 {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        
        DataStructure struct = new DataStructure();
        int arraySize = scan.nextInt();

        for(int i = 0; i < arraySize; i++)
        {
            int element = scan.nextInt();
            struct.arr.add(i,element);
        }
        

        struct.displayAarray();
    } 
}
