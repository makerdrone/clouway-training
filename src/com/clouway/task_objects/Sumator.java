
package task_objects;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Stefan Dimitrov
 *
 */
public class Sumator {

	public Sumator() {}
	
	/**
	 * Return the sum of two integers.
	 * @param a
	 * @param b
	 * @return
	 */
	public int sum(int a, int b){
		return a + b;
	}
	
	/**
	 * Return the sum of two doubles.
	 * @param a
	 * @param b
	 * @return
	 */
	public double sum(double a, double b){
		return a + b;
	}
	
	/**
	 * Return the sum of two Strings. The result is a concatenated string.
	 * @param a
	 * @param b
	 * @return
	 */
	public String sum(String a, String b){
		return String.format("%s%s", a, b);
	}
	
	/**
	 * Return the sum of two BigInteger values.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigInteger sum(BigInteger a, BigInteger b){
		BigInteger result = new BigInteger("0");
		result = result.add(a);
		return result.add(b);
	}
	
	/**
	 * Return the sum of two BigDecimal values.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal sum(BigDecimal a, BigDecimal b){
		BigDecimal result = new BigDecimal("0");
		result = result.add(a);
		return result.add(b);
	}
	
	// Mixed sums
	
	/**
	 * Return the sum of a BigInteger and an integer.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigInteger sum(BigInteger a, int b){
		BigInteger result = new BigInteger("0");
		result = result.add(a);
		return result.add(new BigInteger(String.format("%d", b)));
	}
	
	/**
	 * Return the sum of an integer and a BigInteger.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigInteger sum(int a, BigInteger b){
		BigInteger result = new BigInteger("0");
		result = result.add(new BigInteger(String.format("%d", a)));
		return result.add(b);
	}
	
	/**
	 * Return the sum of a BigInteger and a double.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigInteger sum(BigInteger a, double b){
		BigInteger result = new BigInteger("0");
		result = result.add(a);
		return result.add(new BigInteger(String.format("%s", b)));
	}
	
	/**
	 * Return the sum of a double and a BigInteger.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigInteger sum(double a, BigInteger b){
		BigInteger result = new BigInteger("0");
		result = result.add(new BigInteger(String.format("%s", a)));
		return result.add(b);
	}
	
	//=================================
	
	/**
	 * Return the sum of a BigDecimal and an integer.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal sum(BigDecimal a, int b){
		BigDecimal result = new BigDecimal("0");
		result = result.add(a);
		return result.add(new BigDecimal(String.format("%d", b)));
	}
	
	/**
	 * Return the sum of an integer and a BigDecimal.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal sum(int a, BigDecimal b){
		BigDecimal result = new BigDecimal("0");
		result = result.add(new BigDecimal(String.format("%d", a)));
		return result.add(b);
	}
	
	/**
	 * Return the sum of a BigDecimal and a double.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal sum(BigDecimal a, double b){
		BigDecimal result = new BigDecimal("0");
		result = result.add(a);
		return result.add(new BigDecimal(String.format("%s", b)));
	}
	
	/**
	 * Return the sum of a double and a BigDecimal.
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal sum(double a, BigDecimal b){
		BigDecimal result = new BigDecimal("0");
		result = result.add(new BigDecimal(String.format("%s", a)));
		return result.add(b);
	}
}
