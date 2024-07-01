class StringOperations{
	public static void main(String args[]){
		System.out.println("PROGRAM FOR VARIUS STRING OPERATIONS-");
		String s1 = "Aaftab";
		String s2 = "aaftab";
		System.out.println("String s1 is: "+s1);
		System.out.println("String s2 is: "+s2);
		if(s1.equals(s2))
			System.out.println(s1+" is equal to "+s2+" with equals() method");
		else if(s1.equalsIgnoreCase(s2))
			System.out.println(s1+" is equal to "+s2+" with equalIgnoreCase() method");
		System.out.println("indexOf a is:"+s1.indexOf("a")+ "in "+s1);
		int count = 0;
		for(int i=0;i<s1.length();i++){
			if('a' == s1.charAt(i))
				count++;
		}
		System.out.println("number of occurences of a in "+s1+" is: "+count);
		System.out.println("concatination of s1 & s2:"+ s1.concat(s2));
		System.out.println("length of "+ s1 +"is:"+ s1.length());
		System.out.print("reversed string is: ");
		for(int i=s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
		}
		System.out.println(s1 +" in upper case is:"+ s1.toUpperCase());
		System.out.println(s1+" in lower case is:"+ s1.toLowerCase());
		
		if(s1.startsWith("Aa"))
			System.out.println(s1+" starts with Aa");
		else
			System.out.println(s1+" does not starts with Aa");
		
		if(s1.endsWith("ab"))
			System.out.println(s1+" ends with ab");
		else
			System.out.println(s1+" does not ends with ab");
		
		System.out.println("Substring of  "+s1+" ftrom index 1 to 3 is: "+(s1.substring(1,3)));
		
	}
}