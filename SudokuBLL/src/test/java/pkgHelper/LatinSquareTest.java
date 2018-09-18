package pkgHelper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int[] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test2() {
		
		int[] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test3() {
		
		int[] arr = {1,3,4,5,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test4() {
		
		int[] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void doesElementExist_test1() {
		int[] arr = {1,2,3,4,5};
		int iValue = 3;
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_test2() {
		int[] arr = {1,2,3,4,5};
		int iValue = 99;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_test3() {
		int[] arr = null;
		int iValue = 99;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void hasAllValues_test1() {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr, arr2));
	}
	
	@Test
	public void hasAllValues_test2() {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr, arr2));
	}
	
	@Test
	public void hasAllValues_test3() {
		int[] arr = {1,2,3,4};
		int[] arr2 = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr, arr2));
	}
	
	@Test
	public void hasAllValues_test4() {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = null;
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr, arr2));
	}
	
	@Test
	public void hasAllValues_test5() {
		int[] arr = null;
		int[] arr2 = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr, arr2));
	}
	
	@Test
	public void isLatinSquare_test1() {
		int[][] ls = {{1,2,3}, {2,3,1}, {3,1,2}};
		LatinSquare lq = new LatinSquare(ls);
		lq.setLatinSquare(ls);
		assertTrue(lq.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test2() {
		int[][] ls = {{1,2,3}, {2,3,1}, {1,2,3}};
		LatinSquare lq = new LatinSquare(ls);	
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_test3() {
		int[][] ls = {{1,2,3}, {2,3,1}, {1,1,1}};
		LatinSquare lq = new LatinSquare(ls);	
		System.out.println(lq.hasDuplicates(lq.getRow(2)));
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_test4() {
		int[][] ls = null;
		LatinSquare lq = new LatinSquare(ls);		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void ContainsZero_test1() {
		int[][] ls = {{1,2,3},{0,0,0},{0,0,0}};
		LatinSquare lq = new LatinSquare(ls);
		assertTrue(lq.ContainsZero());
	}
	
	@Test
	public void ContainsZero_test2() {
		int[][] ls = {{1,2},{2,1}};
		LatinSquare lq = new LatinSquare(ls);
		assertFalse(lq.ContainsZero());
	}
	
	@Test
	public void ContainsZero_test3() {
		int[][] ls = null;
		LatinSquare lq = new LatinSquare(ls);
		assertFalse(lq.ContainsZero());
	}
	
}
