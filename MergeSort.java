import java.io.*;   import java.util.*;  import java.lang.*;
class MergeSort 
{     public static void main (String[] args) throws java.lang.Exception
	{
		int[] numbers = { 3, 8, 7, 5, 2, 1, 9, 6, 4 };
      int len = 9; System.out.println("MergeSort By Recursive Method");
       mergeSort(numbers, 0, len - 1);
        for (int i = 0; i < 9; i++)
        System.out.println(numbers[i]);
	}
	
    static public void merge(int Arr[], int start, int mid, int end) {

	// create a temp array
	int temp[] = new int[end - start + 1];

	// crawlers for both intervals and for temp
	int i = start, j = mid+1, k = 0;

	// traverse both arrays and in each iteration add smaller of both elements in temp 
	while(i <= mid && j <= end) {
		if(Arr[i] <= Arr[j]) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}
		else {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}
	}

	// add elements left in the first interval 
	while(i <= mid) {
		temp[k] = Arr[i];
		k += 1; i += 1;
	}

	// add elements left in the second interval 
	while(j <= end) {
		temp[k] = Arr[j];
		k += 1; j += 1;
	}

	// copy temp to original interval
	for(i = start; i <= end; i += 1) {
		Arr[i] = temp[i - start];
	}
}
     
    static public void mergeSort(int Arr[], int start, int end) {

	if(start < end) {
		int mid = (start + end) / 2;
		mergeSort(Arr, start, mid);
		mergeSort(Arr, mid+1, end);
		merge(Arr, start, mid, end);
	}
}
}
