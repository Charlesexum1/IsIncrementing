public class IsIncrementing {
	static private double[] arrayA = {10, 12, 14, 16};
	static private double[] arrayB = {10, 9, 12, 13};
		
	private static boolean isIncrementing(double[] in) {
		boolean goingUp = false;
		for (int x = 0; x < in.length - 1; x++) {
			if (in[x + 1] > in[x]) {
				goingUp = true;
				}
			else {
				goingUp = false;
				break;
				}	
			}		
		return goingUp;
		}
	public static void main(String[] args) {
		IsIncrementing demo = new IsIncrementing();
		System.out.println(demo.isIncrementing(arrayA));
		System.out.println(demo.isIncrementing(arrayB));
		}	
	
	}
