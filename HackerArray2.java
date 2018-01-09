
// Link to HackerRank Challenge:  https://www.hackerrank.com/challenges/2d-array/problem

import java.util.*;


public class GitHub_2 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = -9999;
        int[][] arr = new int[6][6];
        for(int i = 0; i < 6; i++)
        {
            String inputline = scan.nextLine();
            String[]  numString = inputline.split(" ");
            int[] numbers = new int[numString.length];
                        int j = 0;
                        for(int index = 0; index < numString.length; index++)
                        {
                            numbers[index] = Integer.parseInt(numString[index]);
                            arr [i][j] = numbers[index];
                            j += 1;
                        }
        }
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                int tempsum = 0;
                int temp;
                for(int index = i; index <= i + 2; index++)
                {
                    for(int jindex = j; jindex <= j + 2; jindex++)
                    {
                        if(index == i + 1 && jindex == j + 0 || index == i + 1 && jindex == j + 2)
                        {
                            //Nothing Block
                        }
                        else
                        {
                            tempsum = tempsum + arr[index][jindex];
                        }

                    }
                }
                if(tempsum>sum)
                {
                    temp = sum;
                    sum = tempsum;
                }   
            }
        }
        System.out.print(sum);
    }
    
}
