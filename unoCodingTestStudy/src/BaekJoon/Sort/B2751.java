package BaekJoon.Sort;

public class B2751
{
	
	public static void main(String[] args)
	{
		// TODO 100만개의 수를 정렬하시오 - 퀵정렬사용
		int[] arr = {1, 3, 5, 7, 8, 9, 10, 2, 4, 6};
		quickSort(arr, 0, arr.length - 1);
		for (int i : arr)
		{
			System.out.println(i);
		}
		
	}
	static void quickSort(int[] data, int start, int end)
	{
		if (start >= end) return;
		int pivot = start;
		int i = start;
		int j = end;
		while (i <= j)
		{
			while (i <= end && data[i] <= data[pivot])
			{
				i++;
			}
			while (j >= pivot && data[j] > data[pivot])
			{
				j--;
			}
			if (i > j)
			{
				int tmp = data[j];
				data[j] = data[pivot];
				data[pivot] = tmp;
			}
			else
			{
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
			}
		}
		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);
	}
}
