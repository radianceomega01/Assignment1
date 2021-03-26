import java.util.*;

public class AddAnyNumbers{
	
	public int add(int[] num){
		
		int sum = 0;
		for(int n : num){
			sum += n;
		}
		
		return sum;
	}
	
	
}