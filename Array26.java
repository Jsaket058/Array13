//brute force
class Array26{
	int singleOccurrence(int arr[]){
		for(int i=0;i<arr.length;i++){
			int c=0;
			int x=arr[i];
			int j=0;
			for(;j<arr.length;j++){
				if(arr[j]==x)c++;
				if(c>1)break;
			}
			if(j==arr.length)return x;
		}
		return -1;
	}
}
class Run{
	public static void main(String[] args){
		int arr[]={1,1,2,3,3,4,4};
		Array26 a=new Array26();
		System.out.println(a.singleOccurrence(arr));
	}
}