package day2.assignment;
import java.util.Arrays;
public class findMissingElement {
public static void main(String[] args) {
		
	int[] arr = { 1, 4, 3, 2, 8, 6, 7};
	Arrays.sort(arr);

	for (int i = 0; i < arr.length-1; i++) {

		if (arr[i] + 1 != arr[i + 1]) {
			System.out.println("Missing Number Is: " + (arr[i] + 1));
		
		}}}}

