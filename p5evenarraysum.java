import java.util.*;
class p5evenarraysum
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
if(arr[i] % 2 == 0)
{
sum = sum + arr[i] ;
}
}
System.out.println("array even sum is :" + sum);
}
}