// Question No: 1 : Write a program to generate unique random numbers between two given numbers without using math.random().
import java.util.Scanner;
import java.io.*;
class Random{
     public static void main(String args[])
        {
             Scanner in = new Scanner(System.in);
             //Reading number of test cases from user
             System.out.println("Enter the number of test cases:");
             int test_case=in.nextInt();
            //Setting a random float value to variable k
             double k=0.333;
           //Asking users to enter lower_limit and Upper_limit
             for(int i=0;i<test_case;i++)
                 {
                     System.out.println("Enter  the lower limit:");
                     int lower_limit=in.nextInt();
                     System.out.println("Enter  the Upper limit:");
                     int upper_limit=in.nextInt();
            // Check whether the difference of limits are more than 10 and Value of  variable k is less than 5 
            // If yes the increment is more
                     if((lower_limit-upper_limit)>10 && k<5)
                      {
                        while((lower_limit+k)<upper_limit)
                              {
           //generating random number 
                                     double rand=lower_limit+k;
                                     k=k+.09;
                                    System.out.println(rand);
                             }
                     }
                    else
                      {
           //Check whether value of lower limit + k is greater than upper limit
          //if yes set a new small value for k
                            if((lower_limit+k)>upper_limit)
                              k=0.01;
                            while((lower_limit+k)<upper_limit)
                              {
          //generating random number 
                                     double rand=lower_limit+k;
                                     k=k+.03;
                                    System.out.println(rand);
                             }
                      }
               }
       }
 }