/* Author : K<aran Anand */


public class BubbleSort {

	public static void main(String[] args) {
	

		int[]arr={43,32,04,56,92,11,23}; //array
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array :");
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
	}

}

