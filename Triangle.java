import java.util.*;
class Triangle
{
public static void main(String args[])
 {
   int n=5;
   int k = 2*n - 1;
   for (int i=0; i<n; i++)
 {
   for (int j=0; j<k; j++)
 {
   System.out.println(" ");
 }
   k = k - 1;
   for (int j=0; j<=i; j++ )
    System.out.print("*");
  
 }
   System.out.println();
 }
}