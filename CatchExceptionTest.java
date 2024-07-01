class CatchExceptionTest{
	public static void main(String args[]){
		System.out.println("PROGRAM TO CATCH EXCEPTION IN ONE METHOD THROWN FRO ANOTHER METHOD-");
        int a ;
		try{
		 a=Integer.parseInt(args[0]);
            CatchExceptionTest ob=new CatchExceptionTest();
			int cat=ob.one();
			if(a>50)
				throw ( new ArithmeticException("......myMessage...... \n The number is greater than 50"));
		System.out.println("no is less then 50  ="+a);
		}
		catch(ArithmeticException e){
			System.out.println("Error found"+e.getMessage());
		}
		finally{
			System.out.println("Done .....");
		}
	}
	int one()throws ArithmeticException{
		CatchExceptionTest ob1=new CatchExceptionTest();
		int a=12,b=0;
		int c=ob1.two(a,b);
		return c;
	}
	int two(int a,int b){ 
		int c1=a/b;
		return c1;
	}
}