import java.io.*;
class Bubble
{	public static void main(String args[])
	{	Console con=System.console();	
			int arr[]=new int[6];	
		System.out.println("Enter 6 elements ");
	
		for(int i=0;i<arr.length;i++)
		{	arr[i]=Integer.parseInt(con.readLine()); 								//BUBBLE SORT
		}
		
			for(int z=0;z<arr.length;z++)
								{	System.out.print(arr[z]+" ");
								}
			System.out.println();
		
		for(int i=0;i<arr.length-1;i++)
		{	int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
					for(int z=0;z<arr.length;z++)
								{	System.out.print(arr[z]+" ");
								}
							System.out.println();
				
				}
			}
		 		
		 	if(flag==0){
				break;
			}
		}
		System.out.println("After bubble sorting ");
		for(int i=0;i<arr.length;i++)
		{	System.out.print(arr[i]+" ");
		}
	
		
	}
}

Best: O(n) Else: O(n^2)
Demo:
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
Second Pass: 
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 ) 
Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
Third Pass: 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
