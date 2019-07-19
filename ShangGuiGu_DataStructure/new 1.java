
public class bubbleSort{
	public static void main(String args[]){
		int[] array1 = {12,4,-6,-18,20};
		int temp = 0;
		for(int i = 0;i < array1.length - 1;i++){
			for(int j=0;j < array1.length - 1 -i;j++){
				if(array1 [j]>array1[j+1]){
				temp = array1[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				}
		}
		System.out.println(Arrays.toString(array1));
	}
}

