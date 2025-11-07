// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Replace this comment with your code
		int seedRun = Integer.parseInt(args[0]);
		String letter = args[1];
		int seed;
		// int currntRow = 0;
		int currntNum;
		int lastOne;
		int count;
		// System.out.print("1 ");
		if (letter.equals("v")) {
			for (seed = 1; seed <= seedRun; seed++) {
				currntNum = seed;
				count = 0;
				lastOne = 0;
				if (seed <= seedRun) {
					System.out.print(seed + " ");
					count++;
				}
				while (lastOne != 1) {
					if (currntNum % 2 == 0) {
						currntNum = currntNum / 2;
						// System.out.print(currntNum + " ");
						lastOne = currntNum;
						count++;
					} else {
						currntNum = (currntNum * 3) + 1;
						// System.out.print(currntNum + " ");
						lastOne = currntNum;
						count++;
					}
					System.out.print(currntNum + " ");
					// System.out.print(lastOne + " (" + count + ")");
				}

				System.out.print("(" + count + ")");
				System.out.println();
			}

			System.out.println("Every one of the first " + seedRun + " hailstone sequences reached 1.");

		} else if (letter.equals("c")) {
			System.out.println("Every one of the first " + seedRun + " hailstone sequences reached 1.");
		}

	}
}
