/* Karan Anand */

public class NewSort {
	
	void Sort(int arr[])
    {
		
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    void Print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver code to test above


	public static void main(String[] args) {
		NewSort ob = new NewSort();
		int arr[] = {34,53,02,42,76,12,07};
		ob.Sort(arr);
		System.out.println("Sorted Array : ");
		ob.Print(arr);
		    }
		}