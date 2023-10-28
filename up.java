package practise;
class up {
	void up() {
		System.out.println("hi");
	}
	
	
}
class dog extends up{
	void dog() {
		System.out.println("bark");
	}
	public static void main(String[] args) {
		up ref1=new dog();
		dog ref2=(dog)ref1;
		ref2.dog();
		ref2.up();
	}
	}




