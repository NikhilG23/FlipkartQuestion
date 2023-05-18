import java.util.*;
class MissingNumber
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int temp=0,i;
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int arr[]=new int[n];

	for (i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();		
		}
		
		int sum=(n+1)*(n+2)/2;	
		System.out.println("Ascending :-");
	for ( i=0;i<arr.length;i++)
	{
		   for (int j=i+1;j<arr.length;j++)
		   {
		   	
		   	if (arr[i]>arr[j]) 
		   		{
		   			temp=arr[i];
		   			arr[i]=arr[j];
		   			arr[j]=temp;
		   		}
		   		
		   }
		  	System.out.println(arr[i]);
		   sum=sum-arr[i];

		   
		}
		System.out.println("Missing element is :- " +sum);
	}

}