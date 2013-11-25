package task_introduction;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.printf("GCD of 9 and 2: %d\n", Mathematical.gcd(9, 2));
		System.out.printf("LCM of 48 and 15: %d\n", Mathematical.lcm(48, 15));
		
		int [] arr = {1, 2, 3, -5, 6, -8, -1, 15};
		
		System.out.print("Array: ");
        ArrayUtils.printArray(arr);
//		System.out.print("\n");
		System.out.printf("Minimal element in the array: %d\n", ArrayUtils.getMinElement(arr));
		System.out.printf("Sum of elements in the array: %d\n", ArrayUtils.getSum(arr));

        ArrayUtils.quicksort(arr);
		System.out.print("Sorted array: ");
        ArrayUtils.printArray(arr);

        ArrayUtils.reverseArray(arr);
		System.out.print("Reversed array: ");
        ArrayUtils.printArray(arr);

        StringGenerator strGen = new StringGenerator();
		System.out.printf("Random string: %s", strGen.randString(30));
	}
}

