package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = sc.nextLine(); //스캐너에서 읽은 한 줄 전체(엔터키 이전까지) (문자일때 nextLine)
			System.out.println("입력된 문자열: " + inputData);
			
			if(inputData.equals("q")) { //문자열은 == 사용 x(기본타입은 ==) , equals 사용
				break;
		
			}
		}
				
           System.out.println("종료\n");
           
         //Quiz
         //2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시요
         // [입력]   [출력]
         //10 20 => 10,20
           
         //Scanner 클래스는 사용자의 입력을 다양한 타입으로 자동 변환해주는 편리한 기능을 제공한다
           
	int inputData1 = sc.nextInt();  // 숫자일때 nextInt
	int inputData2 = sc.nextInt();
	System.out.println(inputData1 +","+ inputData2);
    System.out.println("퀴즈 종료\n");
    
    
   // 주의!
   // nextInt()나 next()는 입력 후 개행 문자(\n)를 버퍼에 남김
    //따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")이 들어감
    //해결법: 중간에 sc.nextLine()을 한번 호출해 버퍼 정리
    int age = sc.nextInt(); //25 입력 + 엔터
    sc.nextLine();
    String name = sc.nextLine(); // 정상 입력 가능
    System.out.println("name: " + name);
	
	}

}





