//better soln
import java.util.*;
class Array27{
	int singleOccurrence(int arr[]){
		int max=-9999;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int x[]=new int[max+1];
		for(int i=0;i<arr.length;i++){
			x[arr[i]]++;
		}
		for(int i=0;i<x.length;i++){
			if(x[i]==1)return i;
		}
		return -1;
	}
}
class Run{
	public static void main(String[] args){
		int arr[]={1,1,2,3,3,4,4};
		Array27 a=new Array27();
		System.out.println(a.singleOccurrence(arr));
	}
}