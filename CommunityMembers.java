class CommunityMember { //community members class
	String nm;
	String address;
	String contact;
	String date;
	CommunityMember(String nm,String address,String contact,String date)
	{
		this.nm=nm;
		this.address=address;
		this.contact=contact;
		this.date=date;
	}
    //functions to get information
	String getName(){
		return nm;
	}
	String getAddress(){
		return address;
	}
	String getContact(){
		return contact;
	}
	String getDate(){
		return date;
	}
 }
 //class employee extends community member
 class Employee extends CommunityMember{
	String qual;
	String nm;
	String address;
	String contact;
	String date;
	Employee(String qual,String nm,String address,String contact,String date){
		super(nm,address,contact,date);
		this.qual=qual;
	}
	String getQualification(){
		return qual;
	}
 }
 //class student extends community member
 class Student extends CommunityMember{
	String qual;
	String nm;
	String address;
	String contact;
	String date;
	Student(String qual,String nm,String address,String contact,String date){
		super(nm,address,contact,date);
		this.qual=qual;
	}
	String getQualification(){
		return qual;
	}
 }
 class CommunityMembers{
	public static void main(String args[])
	{
        System.out.println("PROGRAM TO GET COMMUNITY MEMBERS DETAILS-");
		Student s=new Student("MTech","Aaftab Patel","Vaubhav Nagar","9783194000","18 may");
		
		String qual=s.getQualification();
		String name=s.getName();
		String address=s.getAddress();
		String contact=s.getContact();
		String date=s.getDate();
		System.out.println("\n Qualification: "+qual+"\n Name: "+name+"\n Address: "+address+"\n Contact: "+contact+"\n Date: "+date);
		
		Employee e=new Employee("MCA","Ankit Kumar","Sanchar Nagar","9234841743","29 feb");
		 qual=e.getQualification();
		 name=e.getName();
		 address=e.getAddress();
		 contact=e.getContact();
		 date=e.getDate();
		System.out.println("\n Qualification: "+qual+"\n Name: "+name+"\n Address: "+address+"\n Contact: "+contact+"\n Date: "+date);
		
	}
 
 }