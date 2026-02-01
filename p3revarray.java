import java.util.*;
class p3revarray
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size :");
int n = sc.nextInt();
int arr[] = new int[n];
int arrrev[] = new int[n];
for(int i = 0 ; i < n ; i++)
{
    System.out.println("Enter the elements : ");
    arr[i] = sc.nextInt();
    arrrev[n-1-i] = arr[i] ;
}
System.out.println("Revered array :");
{
    for(int i = 0 ; i < n ; i++)
    System.out.println(arrrev[i]);
}
}
}
