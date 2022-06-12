package week1.day2;

public class MissingElementsInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};			
		int length1 = arr.length;		//length = 6
		for(int i=0; i<length1; i++)			
		{				
			
			
			if(i!=arr[i])
			{
				System.out.println(arr[i]);
				break;
		
			}
			
			
		}
	
	}

}
