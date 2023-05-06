class calc{
	public boolean check(int n) {	
		int sum=0,temp,temp_n=n;		
			while(n>0) {			
			temp=n%10;			
			sum=sum+temp*temp*temp;			
			n=n/10;			
			}
		System.out.println(sum);		
		if(sum==temp_n) return true;		
		else return false;	
	}
}

public class TestClass{
	public static void main(String args[]) {	
		calc c=new calc();
		int []arr= {99,370,153,371,407,125,1634,809};
		for(int i=0;i<arr.length;i++) {
			System.out.println(c.check(arr[i]));
		}	
	}

}