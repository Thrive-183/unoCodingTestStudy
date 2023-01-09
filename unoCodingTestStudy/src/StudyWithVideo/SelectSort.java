package StudyWithVideo;

class SelectSort
{
	/**
	 * @작성자 unokim
	 * @알고리즘유형 선택정렬 공부
	 * @문제설명 주어진 배열을 오름차순으로 정렬하시오
	 * @알고리즘설명 오름차순으로 정렬하기 위해서는 주어진 배열의 최소값을 찾아야하며, 찾는방법은 2번째의 반복문내에서 남은 배열의 수중
	 *         최소값의 인덱스를 추출하는 조건문을 수행시킨다. 그리고 2번째 반복문이 종료된다면 추출된 인덱스를 이용해 소팅시킨다.
	 *         스와핑을 통해 해당수들의 위치를 교환시킨다.
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
class SelectSortDescending
{
	/**
	 * @작성자 unokim
	 * @응용해보기 내림차순으로 변경해보기
	 * @알고리즘유형 선택정렬 응용
	 */
	public static void main(String[] args)
	{
		int intArr[] = {1, 6, 9, 2, 10, 3, 5, 8, 7, 4};
		int arrSize = intArr.length;
		int index = 0;
		for (int i = 0; i < arrSize; i++)
		{
			int maxInt = 0;
			int temp = 0;
			for (int j = i; j < arrSize; j++)
			{
				if (maxInt < intArr[j])
				{
					maxInt = intArr[j];
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