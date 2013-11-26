package task_objects;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        System.out.println("Testing 'StringSumator':");
		testSumator();

        System.out.println("\nTesting homogeneous tree:");
        testTreeHomogeneous();

        System.out.println("\nTesting heterogeneous tree:");
        testTreeHeterogeneous();
	}

    /**
     * Test the StringSumator class
     */
	public static void testSumator() {
		Sumator smtr = new Sumator();
		System.out.printf("Sum strings(concatenate): %s\n", smtr.sum("One", " and two."));
		System.out.printf("Sum integers: %s\n", smtr.sum(23, 2));
		System.out.printf("Sum doubles: %s\n", smtr.sum(23.5, 2.52));
		System.out.printf("Sum BigIntegers: %s\n", smtr.sum(new BigInteger("47"), new BigInteger("20")));
		System.out.printf("Sum BigDecimals: %s\n", smtr.sum(new BigDecimal("74"), new BigDecimal("20")));
		System.out.printf("Sum BigDecimal and integer: %s\n", smtr.sum(new BigDecimal("74"), 34));
	}

    /**
     * Test the homogeneous Tree class
     */
    public static void testTreeHomogeneous(){
        HomogenTree tree = new HomogenTree(0);
        tree.add(10);
        tree.add(4);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(2);
        tree.add(8);
        tree.add(9);
        
        tree.printElements();
        int searchElement = 7;
        System.out.printf("\nHas element %s: %s", searchElement, tree.hasElement(searchElement));
        
        tree.seekRoot();
        tree.seekChildren(0, 1, 1);
        int data = tree.getData();
        
        System.out.printf("\nCurrent element: %s", data);
        System.out.println();
    }

    /**
     * Test the HeterogeneousTree class
     */
    public static void testTreeHeterogeneous(){
        HeterogenTree tree = new HeterogenTree("root");
        tree.add(new Integer(2));
        tree.add(new Integer(3));
        tree.add(new Double(3.5));
        tree.add(new Integer(5));
        
        tree.printElements();
        System.out.printf("\nhas element 3.5: %s\n", tree.hasElement(new Double(3.5)));
        
    }

}
