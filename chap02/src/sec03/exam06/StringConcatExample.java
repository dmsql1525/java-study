package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		//""일 경우 나머지도 문자열
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8"; //10 +2 = 12하고 문자열"8" 결합 = 128
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8; //"102" + 8 -> "1028"
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8; //"102" + 8 -> "1028"
		System.out.println("str3: " + str3);
		
		String str4 = "10" +(2 + 8); //()는 최우선 연산, "10" + 10 -> 1010
		System.out.println("str4: " + str4);
		
		
		
	}

}
