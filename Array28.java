//better soln
import java.util.*;
class Array28{
	int singleOccurrence(int arr[]){
		int n=arr.length;
		HashMap<Integer,Integer> mpp=new HashMap<>();
		for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }
		for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
		return -1;
	}
}
class Run{
	public static void main(String[] args){
		int arr[]={1,1,2,3,3,4,4};
		Array28 a=new Array28();
		System.out.println(a.singleOccurrence(arr));
	}
}