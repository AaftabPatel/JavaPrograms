import Volume.SphereVol;
class ClassNotFoundExceptionTest{
	public static void main(String args[]){
		System.out.println("PROGRAM FOR CLASS NOT FOUND EXCEPTION HANDLING-");
		try{
			SphereVol sph = new SphereVol();	
            sph.vol();
        }
		catch(Exception e){
			System.out.println("Class not found");
		}
	}
}