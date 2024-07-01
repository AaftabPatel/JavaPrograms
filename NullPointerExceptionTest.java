class NullPointerExceptionTest{
	void display(){
		System.out.println("No exception occured ");
	}
	public static void main(String args[]){
		System.out.println("PROGRAM FOR NULL POINTER EXCEPTION HANDLING-");
		try{
		 NullPointerExceptionTest ob=null;
		 ob.display();
		}
		catch(NullPointerException e){
			System.out.println("Error found"+e.getMessage());
		}
	}
}