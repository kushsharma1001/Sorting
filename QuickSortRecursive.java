import java.io.*;
public class QuickSortRecursive
{  public static void main(String[] args)
   {	int[] x = { 9, 2, 4, 7, 3, 7, 10 };  printArray(x);
		int low = 0;    int high = x.length - 1;
 		quickSort(x, low, high);  
 			printArray(x); //this method prints all array elements
	}
 	public static void quickSort(int[] arr, int low, int high)
	{
      if(low<high){
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
      }
	}
  public static int partition(int arr[], int low, int high){
      int pivot = arr[high];
      int partitionIndex = low;
      for(int i=low; i<high; i++){
          if(arr[i] <= pivot){
            int temp = arr[i];
            arr[i] = arr[partitionIndex];
            arr[partitionIndex] = temp;
            partitionIndex++;
          }
      }
      int temp = arr[partitionIndex];
      arr[partitionIndex] = arr[high];
      arr[high] = temp;
      return partitionIndex;
  }
 	public static void printArray(int[] x) 
	{	
    for (int a : x)
		System.out.print(a + " ");
		System.out.println();
	}
}

/*Worst    Avge     Best
O(nLogn) O(nLogn) O(n^2)
*/
