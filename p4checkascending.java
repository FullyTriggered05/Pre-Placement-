import java.util.*;
class p4checkascending
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
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
if(arr[i] < arr[i+1])
{
System.out.println("Its in ascending order.");
}
else
System.out.println("Its not in ascending order.");
}
}
}