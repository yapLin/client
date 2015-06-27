package client;

public class test {
	int a = 0;
	
	public static void main(String[] args){
		test t = new test();
		t.go();
	}
	
	public void go(){
		System.out.println(a);
		change(a);
		qq q = new qq();
		q.here();
		System.out.println(a);
	}
	
	public void change(int q){
		System.out.println(q);
		//a = 1;
		System.out.println(q);
	}
	
	public void cc(int q){
		System.out.println(q);
		q = 3;
		System.out.println(q);
	}
	
	public class qq{
		int a = 1;
		
		public void here(){
			System.out.println(a);
			a = 2;
			System.out.println(a);
		}
	}
}
