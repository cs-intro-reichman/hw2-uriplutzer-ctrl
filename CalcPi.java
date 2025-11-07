// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		// Replace this comment with your code
		int numPi = Integer.parseInt(args[0]);
		double piApprox = 0.0;
		int currntRun = 0;
		double denom = 1.0;
		while (currntRun < numPi) {
			piApprox += (1 / denom);
			denom += 2.0;
			piApprox *= -1;
			currntRun++;
		}
		piApprox = Math.abs(piApprox * 4);
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi,approximated:     " + piApprox);

	}
}
