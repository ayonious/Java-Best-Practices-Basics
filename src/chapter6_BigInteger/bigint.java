package chapter6_BigInteger;

import java.math.BigInteger;

public class bigint {
	public static void main(String args[]) throws Exception {

		BigInteger bi = new BigInteger("12323", 10);// string,base
		System.out.println(bi);

		BigInteger[] B = new BigInteger[3];

		int ten = 10;
		B[0] = new BigInteger("11111111111111");
		B[1] = new BigInteger(Integer.valueOf(ten).toString());
		B[2] = B[0].multiply(B[1]);
		System.out.println(B[2]);

		int i;
		BigInteger BG = BigInteger.valueOf(1);

		System.out.println(BG);

		for (i = 1; i <= 100000; i++) {
			// BG=BG.multiply(BigInteger.valueOf(i));

			// System.out.println(BG.bitLength());
		}

		System.out.println(BG.bitLength());

	}
}
