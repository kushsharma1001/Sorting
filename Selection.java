import java.io.*;
import java.util.Scanner;
class Selection
{		public static void main(String args[]) throws Exception
		{	//	Console con=System.console();	
		Scanner s=new Scanner(System.in);
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int arr[]=new int[6];
				System.out.println("Enter "+arr.length+" elements.");
			for(int i=0;i<arr.length;i++)
			{			//arr[i] = Integer.parseInt(con.readLine());	
						arr[i] = s.nextInt();
					/*	try{
							arr[i]=Integer.parseInt(br.readLine());				//SELECTION SORT	
						}
						catch(Exception any)
						{
							any.printStackTrace();
						}*/
			
			}
		//	br.close();
					for(int i=0;i<arr.length;i++)
			{	System.out.print(arr[i]+" ");
		
			}
			System.out.println();
				
		
			for(int i=0;i<arr.length-1;i++)
			{	int minIndex=i;
					for(int j=i+1;j<arr.length;j++)
					{		if(arr[j]<arr[minIndex])
							{	minIndex=j;				
							}
					}
					
					if(minIndex!=i)
					{	int temp=arr[i];
						arr[i]=arr[minIndex];
						arr[minIndex]=temp;
							
							for(int z=0;z<arr.length;z++)
								{	System.out.print(arr[z]+" ");
		
								}
							System.out.println();
																			
					}
			}
			
			
		/*	for(int i=0;i<arr.length;i++)
				{
    				  for(int j=i+1;j<arr.length;j++)
    				  	{
       					    if(arr[i]>arr[j])
       					    	{
           					    	int temp=arr[i];
            						arr[i]=arr[j];
             						arr[j]=temp;
             					
             						for(int z=0;z<arr.length;z++)
									{	System.out.print(arr[z]+" ");
		
									}
									System.out.println();
             					
             					
           						}
     					 }
				}*/

				/*
				 for(int i = 0; i < A.length; ++i) {  
            				int min_index = findMinIndex(A, i);  
  
            				if(i != min_index)  
                			swap(A, i, min_index);  
        			 }  
				*/
			
			System.out.println("After Slection sorting:");
		
			for(int i=0;i<arr.length;i++)
			{	System.out.print(arr[i]+" ");
		
			}
		
	}
}

Best   Avge     Worst
O(n^2) O(n^2) O(n^2)
	
4 2 5 1 3 : Input array
1 2 5 4 3 : find minimum from i=0 and then swap min with i=0. Min is 1 so swap with i=0
1 2 5 4 3 : find min from i=1 and swap min with i=1. Here min is 2 and its already at i=1. So No Swap.
1 2 3 4 5 : find min from i=2 and it is 3. so swap 3 with i=2.	
