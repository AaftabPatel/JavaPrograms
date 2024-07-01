class SmallLarge{
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
	int max=arr[0],min=arr[0];
	float avg = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]>max)
			max=arr[i];
		if(arr[i]<min)
			min=arr[i];
		avg+=arr[i];
	}
	System.out.println("Maximum value is:"+max);
	System.out.println("Minimum value is:"+min);
	System.out.println("Average value is:"+avg/5);
  }
}