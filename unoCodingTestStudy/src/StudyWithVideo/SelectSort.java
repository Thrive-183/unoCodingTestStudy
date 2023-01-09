package StudyWithVideo;

public class SelectSort
{
	/**
	 * @apiNote unokim
	 * @apiNote 선택정렬 공부
	 */
	public static void main(String[] args)
	{
		int intArr[] = {1, 6, 9, 2, 10, 3, 5, 8, 7, 4};
		int arrSize = intArr.length;
		int index = 0;
		for (int i = 0; i < arrSize; i++)
		{
			int minInt = 99;
			int temp = 0;
			for (int j = i; j < arrSize; j++)
			{
				if (minInt > intArr[j])
				{
					minInt = intArr[j];
					index = j;
				}
			}
			temp = intArr[i];
			intArr[i] = intArr[index];
			intArr[index] = temp;
		}
		for (int i = 0; i < arrSize; i++)
		{
			System.out.println(intArr[i]);
		}
	}
}
