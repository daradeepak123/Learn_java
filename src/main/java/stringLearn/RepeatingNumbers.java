package stringLearn;

public class RepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <= 1000; i++) {
            String numString = Integer.toString(i);
            boolean hasRepeatingDigits = false;
            for (int j = 0; j < numString.length(); j++) {
                char digit = numString.charAt(j);
                if (numString.indexOf(digit) != numString.lastIndexOf(digit)) {
                    hasRepeatingDigits = true;
                    break;
                }
            }
            if (hasRepeatingDigits) {
                System.out.println(i);
            }
        }

	}

}
