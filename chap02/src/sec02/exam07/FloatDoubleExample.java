package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//float(4byte), double(8byte)
		//부동소수점 방식으로 저장 
		//=> 같은 크기를 갖는 int(4byte), long(8byte)보다 더 큰 수를 저장할 수 있음
		//int<long<float<double
		//double에서 float로 변환할 수 없다
		
	//	float var1 = 3.14; // 자바 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석
		//double 타입을 float 타입에 바로 넣을 수 없음
		//F 또는 f를 붙여 float 타입임을 알려줌
		float var2 = 3.14f;
		double var3 = 3.14;
		System.out.println(var2);
		System.out.println(var3);
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		System.out.println(var4);
		System.out.println(var5);
		
		// e 사용하기
		double var6 = 3e6; //소문자 대문자 상관없음(e는 실수 int에 저장 불가) , 3.0 * 10^6
	//	int var = 3e6; // 크기가 큰 double을 int쪽으로 넣을 수 없다, E 또는 e가 포함되면 실수 리터널
		float var7 = 3e6F;
		double var8 = 2e-3; // 2.0 * 10^-3
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		
		
	}

}
