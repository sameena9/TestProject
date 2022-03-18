package mypackage;

import java.util.ArrayList;


public class Calculation 
{
	
		public static boolean containsElement(ArrayList<Integer> al,int n)
		{
			if(al.contains(n))
				return true;
			else
				return false;
		}
		
		// Finding max element from array
			public static int findMax(int arr[])
			{
				int max=arr[0];
				for (int i=1;i<arr.length;i++)
				{
					if(max<arr[i])
						max=arr[i];
				}
				return max;
			}

	}


