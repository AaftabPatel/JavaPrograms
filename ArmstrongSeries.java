
class ArmstrongSeries{	
	public static void  main(String args[]){
		int[] arr ={1,2,3,4,5,6,7,8,9};
		for(int j=0;j<arr.length;j++)
			System.out.println(arr[j]);
		for(int n=100;n<500;n++){
			int res=0,val;
			int m = n;
			for(int i=0;i<3;i++){
				val = m%10;
				res += Math.pow(val, 3);
				m /= 10;
			}
			if(res == n)
				System.out.println(n);
		}
	}
}