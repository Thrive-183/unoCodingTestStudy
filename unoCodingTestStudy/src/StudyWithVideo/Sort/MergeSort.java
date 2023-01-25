package StudyWithVideo.Sort;

public class MergeSort
{
	int sortedArr[] = new int[8];
	
	public static void main(String[] args)
	{
		int[] intArr = {7, 6, 5, 8, 3, 5, 9, 1};
		MergeSort ms = new MergeSort();
		ms.mergeSort(intArr, 0, intArr.length - 1);
		for (int i : intArr) System.out.println(i);
	}
	void merge(int arr[], int m, int middle, int n)
	{
		int i = m;
		int j = middle + 1;
		int k = m;
		// 작은순서대로 배열에 삽입
		while (i <= middle && j <= n)
		{
			if (arr[i] <= arr[j])
			{
				sortedArr[k] = arr[i];
				i++;
			}
			else
			{
				sortedArr[k] = arr[j];
				j++;
			}
			k++;
		}
		// 남은 데이터도 삽입
		if (i > middle)
		{
			for (int t = j; t <= n; t++)
			{
				sortedArr[k] = arr[t];
				k++;
			}
		}
		else
		{
			for (int t = i; t <= middle; t++)
			{
				sortedArr[k] = arr[t];
				k++;
			}
		}
		// 정렬된 배열을 삽입
		for (int t = m; t <= n; t++)
		{
			arr[t] = sortedArr[t];
		}
	}
	void mergeSort(int arr[], int m, int n)
	{
		if (m < n)
		{
			int middle = (m + n) / 2;
			mergeSort(arr, m, middle);
			mergeSort(arr, middle + 1, n);
			merge(arr, m, middle, n);
		}
	}
}
