package StudyWithVideo;

class InsertionSort
{
	public static void main(String[] args)
	{
		int arr[] = {1, 6, 9, 2, 10, 3, 5, 8, 7, 4};
		
		int temp = 0;
		int size = arr.length;
		for (int i = 0; i < size - 1; i++)
		{
			int j = i;
			while (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}
		}
		for (int i : arr)
		{
			System.out.println(i);
		}
	}
}
