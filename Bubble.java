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
		{	for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
					for(int z=0;z<arr.length;z++)
								{	System.out.print(arr[z]+" ");
								}
							System.out.println();
				
				}
			}
		}
		System.out.println("After bubble sorting ");
		for(int i=0;i<arr.length;i++)
		{	System.out.print(arr[i]+" ");
		}
	
		
	}


}