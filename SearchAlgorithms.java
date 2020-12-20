public class SearchAlgorithms {

	// Search for integer x in the integer array arr linearly
	// If x is present, return the index, else return -1
	// T(n) = O(n)
	private static int linearSearch(int x, int arr[]) {   	
		for(int i=0; i<arr.length; i++){
		 	if(arr[i] == x){
		 		// return the position or the index
		 		return i;
		 	}
		} 
		return -1;
	}

	public static void main(String[] args) throws Exception {
		SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

		int[] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.printf("The index of %d in the array is: %d\n", 3, searchAlgorithms.linearSearch(3, intArr));
	}
}
