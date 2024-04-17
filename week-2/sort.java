//quick sort...
import java.util.*;
class sort
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the array elements:");
		for(int i=0;i<size;i++)
		{	
			arr[i]=sc.nextInt();
		}
		System.out.print("The entered array is:");
		for(int a:arr)
			System.out.print(a+" ");
			
		quickSort(arr,0,arr.length-1);
		
		System.out.print("\nSorted array is : ");
			for(int a:arr)
				System.out.print(a+" ");
	}
	
	
	public static void quickSort(int arr[], int low, int high) 
	{
    		if (low < high) 
    		{
        		int pivot = partition(arr, low, high);
        		quickSort(arr, low, pivot-1);
        		quickSort(arr, pivot + 1, high);
    		}
	}

	public static int partition(int arr[], int low, int high) 
	{
    		int pivot =low;
    		int i = low;
    		int j = high;
    	while(i<j)
    	{
        	while (arr[i] <=arr[pivot] && i<high) 
        	{
            i++;
        	}
        	while (arr[j] > arr[pivot] && j>low)
        	{
            j--;
        	}
        	if (i<j) 
        	{
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        	}
        }
        	int temp = arr[low];
        	arr[low] = arr[j];
        	arr[j] = temp;
        	return j;
   }
}

	
/*	public static void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int i = low;
        int j = high;
        int pivot = low;
        while (i < j) {
            while (arr[i] <= arr[pivot] && i <= high) {
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
}
}
	
	public static void quickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int i=low;
			int j=high;
			int pivot=low;
			while(i<j)
			{	
				while(arr[i]<=arr[pivot] && i<=high)
				{
					i++;
				}
				while(arr[j]>arr[pivot] && j>=low)
				{
					j--;
				}
				if(i<j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			int temp=arr[j];
			arr[j]=arr[pivot];
			arr[pivot]=temp;
			quickSort(arr,low,j-1);
			quickSort(arr,j+1,high);
		}	
	}
}
	*/
