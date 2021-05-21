import java.io.*;
class Insertion
{		public static void main(String args[])
		{	int arr[]=new int[]{25, 17, 31, 13, 2};
			for(int k=0;k<arr.length;k++)
			{ System.out.print(arr[k]+" ");}							}
			System.out.println();
			
			for(int i=1;i<arr.length;i++)
			{		for(int j=i;j>0;j--)
					{	if(arr[j]<arr[j-1])
						{	int temp=arr[j];
						 	arr[j]=arr[j-1];
						 	arr[j-1]=temp;
						}
					}
			}
		/*		for (i = 1; i < length; i++)
				{      j = i;
					while (j > 0 && arr[j - 1] > arr[j]) 
					{       	tmp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = tmp;
							j--;
					}
				}
		*/
		System.out.println("After Insertion sorting:");
		for(int i=0;i<arr.length;i++)
		{	System.out.print(arr[i]+" ");
		}
	}
}
