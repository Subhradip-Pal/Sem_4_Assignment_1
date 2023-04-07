package Assignment1;

public class Q5 {
	static void rightRotate(int[] a,int n, int k)
	{
		k=k%n;
		for(int i = 0; i < n; i++)
		{
			if(i<k)
			{
				System.out.print(a[n + i - k]+ " ");
			}
			else
			{
				System.out.print(a[i - k] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {2,3,5,8,4,9};
		rightRotate(arr,arr.length,3);
	
	}

}
