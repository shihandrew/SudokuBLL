package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {

	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;
		if (arr == null)
			return false;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				hasDuplicates = true;
				break;
			}
		}
		return hasDuplicates;
	}

	public boolean doesElementExist(int[] arr, int iValue) {
		if (arr == null)
			return false;

		boolean doesElementExist = false;
		for (int i : arr) {
			if (i == iValue) {
				doesElementExist = true;
			}
		}
		return doesElementExist;
	}

	public boolean hasAllValues(int[] arr, int[] arr2) {
		boolean hasAllValues = false;
		if (arr2 == null)
			return true;
		for (int i = 0; i < arr2.length; i++) {
			hasAllValues = doesElementExist(arr, arr2[i]);
		}
		return hasAllValues;
	}

	public int[] getColumn(int n) {
		int[] column = new int[LatinSquare.length];
		for (int i = 0; i < column.length; i++) {
			column[i] = this.LatinSquare[i][n];
		}
		return column;
	}

	public int[] getRow(int n) {
		int[] row = new int[LatinSquare[0].length];
		for (int i = 0; i < row.length; i++) {
			row[i] = this.LatinSquare[n][i];
		}
		return row;
	}

	public boolean isLatinSquare() {
		if (LatinSquare == null)
			return false;
		boolean isLatinSquare = true;
		boolean valid = true;
		for (int i = 0; i < LatinSquare.length - 1; i++) {
			isLatinSquare = this.hasDuplicates(this.getRow(i));
			if (isLatinSquare == true) {
				valid = false;
			}
		}
		for (int i = 0; i < LatinSquare.length - 1; i++) {
			isLatinSquare = this.hasDuplicates(this.getColumn(i));
			if (isLatinSquare == true) {
				valid = false;
			}
		}
		return valid;
	}
	
	public boolean ContainsZero() {
		boolean ContainsZero = false;
		if (this.LatinSquare == null)
			return false;
		for (int i = 0; i<this.LatinSquare.length; i++) {
			for (int j = 0; j<this.LatinSquare.length; j++) {
				if(this.LatinSquare[i][j]==0)
					ContainsZero = true;
			}
		}			
		return ContainsZero;
	}

}
