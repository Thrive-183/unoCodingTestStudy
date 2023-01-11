package StudyWithVideo;

class QuickSort
{
	public static void main(String[] args)
	{
		int[] arr = {1, 3, 5, 7, 8, 9, 10, 2, 4, 6};
		quickSort(arr);
		for (int i : arr)
		{
			System.out.println(i);
		}
	}
	
	public static void quickSort(int[] arr)
	{
		quickSort(arr, 0, arr.length - 1);
	}
	
	private static void quickSort(int[] arr, int start, int end)
	{
		if (start >= end)
		{
			return;
		}
		int pivot = start;
		int lo = start + 1;
		int hi = end;
		while (lo <= hi)
		{
			while (lo <= end && arr[lo] <= arr[pivot])
			{
				lo++;
			}
			while (hi > start && arr[hi] >= arr[pivot])
			{
				hi--;
			}
			if (lo > hi)
			{
				swap(arr, hi, pivot);
			}
			else
			{
				swap(arr, lo, hi);
			}
		}
		quickSort(arr, start, hi - 1);
		quickSort(arr, hi + 1, end);
	}
	private static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
class QuickSort2
{
	public static void main(String[] args)
	{
		int[] arr = {1, 3, 5, 7, 8, 9, 10, 2, 4, 6};
		quickSort(arr, 0, arr.length - 1);
		for (int i : arr)
		{
			System.out.println(i);
		}
	}
	private static void quickSort(int[] arr, int start, int end)
	{
		if (start >= end)
		{
			return;
		}
		int pivot = start;
		int i = start + 1;
		int j = end;
		while (i <= j)
		{
			while (i <= end && arr[i] <= arr[pivot])
			{
				i++;
			}
			while (j >= pivot && arr[j] > arr[pivot])
			{
				j--;
			}
			if (i > j)
			{
				swap(arr, pivot, j);
			}
			else
			{
				swap(arr, i, j);
			}
		}
		quickSort(arr, start, j - 1);
		quickSort(arr, j + 1, end);
	}
	private static void swap(int arr[], int i, int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}