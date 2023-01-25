package BaekJoon.Sort;

public class B2751
{
	
	public static void main(String[] args)
	{
		// TODO 100만개의 수를 정렬하시오 - 퀵정렬사용
		int[] arr = {1, 3, 5, 7, 8, 9, 10, 2, 4, 6};
		퀵정렬(arr, 0, arr.length - 1);
		for (int i : arr)
		{
			System.out.println(i);
		}
		
	}
	static void 퀵정렬(int[] data, int start, int end)
	{
		if (start >= end) return;
		int KEY = start;
		int i = start;
		int j = end;
		while (i <= j)
		{
			while (i <= end && data[KEY] >= data[i]) i++;
			while (j > start && data[KEY] <= data[j]) j--;
			if (i > j)
			{
				정렬(data, j, KEY);
			}
			else
			{
				정렬(data, i, j);
			}
		}
		퀵정렬(data, start, j - 1);
		퀵정렬(data, j + 1, end);
	}
	static void 정렬(int[] data, int i, int j)
	{
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}
}
