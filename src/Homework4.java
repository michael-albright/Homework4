import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Homework4 {

	public static void main(String[] args) 
	{
		Integer[] given = {1, 2, 3, 4, 5, 6, 7, 8};
		int sum = 0;
		for(int i=0; i<given.length; i++) 
		{
			sum += given[i];
		}
		System.out.println(sum);
	}
	
}
