package BaekJoon.Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class B2750
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		B2750 B2750 = new B2750();
		B2750.setArray(arr);
		// B2750.selectionSort(arr);
		B2750.bubbleSort(arr);
		B2750.printArray(arr);
	}
	private void printArray(ArrayList<Integer> arr)
	{
		System.out.println("::::::START::::::");
		for (int i : arr)
		{
			System.out.println(i);
		}
		System.out.println(":::::::END:::::::");
	}
	private void setArray(ArrayList<Integer> arr)
	{
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		for (int i = 0; i < index; i++)
		{
			arr.add(sc.nextInt());
		}
		sc.close();
	}
	private void selectionSort(ArrayList<Integer> arr)
	{
		int index = 0;
		for (int i = 0; i < arr.size(); i++)
		{
			int min = 1001;
			for (int j = i; j < arr.size(); j++)
			{
				if (min > arr.get(j))
				{
					min = arr.get(j);
					index = j;
				}
			}
			int temp = arr.get(i);
			arr.set(i, arr.get(index));
			arr.set(index, temp);
		}
	}
	private void bubbleSort(ArrayList<Integer> arr)
	{
		for (int i = 0; i < arr.size(); i++)
		{
			for (int j = 0; j < arr.size() - i - 1; j++)
			{
				if (arr.get(j) > arr.get(j + 1))
				{
					int temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}
		}
	}
}
