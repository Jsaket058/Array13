//optimal soln
class Array29{
	int singleOccurrence(int arr[]){
	int XOR=0;
    for(int i=0;i<arr.length;i++){
		XOR=XOR^arr[i];
	}
    return XOR;	
	}
}
class Run{
	public static void main(String[] args){
	int arr[]={1,1,2,3,3,4,4};
		Array29 a=new Array29();
		System.out.println(a.singleOccurrence(arr));
	}
}