package Day1;

public class Assignment4 {
	
  int count=0;	
	
	public void m1() {
		count++;
		System.out.println(" m1 calling"+count);
		this.m1();
	}
	
	
	public static void main(String[] args) {
		
		Assignment4 over = new Assignment4();
		over.m1();
	}

}
