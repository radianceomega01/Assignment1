import java.util.*;

public class AddAnyNumber{
	
	public int add(int[] numbers){
		
		int sum = 0;
		for(int n : numbers){
			sum += n;
		}
		
		return sum;
	}
	
	//Due to compilation error, we changed the method name
	public String concatNum(int[] numbers){
		
		String str = "";
		
		for(int n: numbers){
			str += String.valueOf(n)+" ";
		}
		
		return str;
	}
	
	
	public static void main(String[] args){
		
		AddAnyNumber an = new AddAnyNumber();
		int[] arr = {1,2,3,4,5}; 
		
		System.out.println("Sum : "+an.add(arr));
		System.out.println("After Concatenation : "+an.concatNum(arr));
		
	}
	
}