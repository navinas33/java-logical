package demo_logic;

public class numbers {

	public static void main(String[] args) {
		int input1 = 723, input2 = 6, input3 = 39, input4 = 2;
		String in1 = Integer.toString(input1);
		String in2 = Integer.toString(input2);
		String in3 = Integer.toString(input3);
		int value1 = 0, value2 = 0, value3 = 0;
		if (input1 < 100 && input4 >= 2) {
			value1 = 2;

		} else if (input1 < 10 && input4 >= 1) {
			value1 = 1;

		} else {
			value1 = in1.charAt(in1.length() - input4 - 1) - '0';
		}

		if (input2 < 100 && input4 >= 2) {
			value2 = 2;

		} else if (input2 < 10 && input4 >= 1) {
			value2 = 1;

		} else {
			value2 = in2.charAt(in2.length() - input4 - 1) - '0';
		}
		if (input3 < 100 && input4 >= 2) {
			value3 = 2;

		} else if (input3 < 10 && input4 >= 1) {
			value3 = 1;

		} else {
			value3 = in3.charAt(in3.length() - input4 - 1) - '0';
		}
		System.out.print(value1 + value2 + value3);
	}

}
