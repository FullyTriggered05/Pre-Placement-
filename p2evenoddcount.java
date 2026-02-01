import java.util.*;
class p2evenoddcount
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int evenc =0 , oddc = 0 ;
int sum = 0 ;
System.out.println("Enter the size :");
int n = sc.nextInt();
int arr[] = new int[n];
for(int i = 0 ; i < n ; i++)
{
System.out.println("Enter the elements : ");
arr[i] = sc.nextInt();
}
for(int i = 0 ; i < n ; i++)
{
    if(arr[i] % 2 == 0)
    evenc++ ;
    else
    oddc++ ;
}
System.out.println("Even and odd count are = " + evenc+ " " + oddc);
}
}
