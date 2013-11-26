package org.javier.questions.sort;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] val = {4,9,10, 5, 2, 8,9};
		
		sort(val);
		
		for(int i=0;i<val.length;++i) {
			System.out.print(val[i]);
		}

	}
	
	static void sort(int[] val) {
		int[] results = new int[val.length];
		int low = 0;
		int high = val.length - 1;
		
		mergeSort(val, results, low, high);
		
	}
	
	static void mergeSort(int[] val, int[] auxArray, int low, int high) {
		//START

		
		if(low<high) {
			int middle = (low+high)/2;
			mergeSort(val, auxArray, low, middle);
			mergeSort(val, auxArray, middle+1, high);
			merge(val, auxArray, low, middle, high);
		}
		//END
	}

	static void merge(int[] val, int[] auxArray, int low, int middle, int high) {
//		int[] results = new int[low+high];
		//START

		for(int i=0; i<=high; ++i) {
			auxArray[i] = val[i];
		}
		
		int lowPos = low;
		int highPos = middle+1;
		int pos = low;
		while(lowPos<=middle && highPos<=high) {
			if (auxArray[lowPos]<=auxArray[highPos]) {
				//add lower
				val[pos] = auxArray[lowPos];
				++lowPos;
			} else {
				//add higher
				val[pos] = auxArray[highPos];
				++highPos;
			}
			++pos;
		}
		int remaining = middle - lowPos;
		
		for(int i=0; i<=remaining;++i) {
			val[pos+i] = auxArray[lowPos+i];
		}
	
		
		//END
	}
	
}
