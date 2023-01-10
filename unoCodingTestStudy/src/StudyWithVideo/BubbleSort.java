package StudyWithVideo;

class BubbleSort
{
	public static void main(String[] args)
	{
		int intArr[] = {1, 6, 9, 2, 10, 3, 5, 8, 7, 4};
		int arrSize = intArr.length;
		int temp = 0;
		for (int i = 0; i < arrSize; i++)
		{
			for (int j = 0; j < arrSize - 1 - i; j++)
			{
				if (intArr[j] > intArr[j + 1])
				{
					temp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arrSize; i++)
		{
			System.out.println(intArr[i]);
		}
	}
}
class BubbleSort2
{
	public static void main(String[] args)
	{
		int intArr[] = {1, 6, 9, 2, 10, 3, 5, 8, 7, 4};
		int arrSize = intArr.length;
		int temp = 0;
		for (int i = 0; i < arrSize; i++)
		{
			for (int j = 0; j < arrSize - 1 - i; j++)
			{
				if (intArr[j] < intArr[j + 1])
				{
					temp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arrSize; i++)
		{
			System.out.println(intArr[i]);
		}
	}
}
