package JavaCollections;

public class Recursion {
	int funn(int n) {
		int result;
		if(n==1) 
			return 1;
		result=funn(n-1);
		return result;
			
		
	}

}
