
public class Start {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		ObjStack s2 = new ObjStack();
	
		int[] arrayInt = new int[50000];
		for(int i = 0; i < arrayInt.length; i++){
			arrayInt[i] = (int)(Math.random() * 10);
		}
		
		char[] arrayChar = new char[50000];
		for(int i = 0; i < arrayChar.length; i++){
			arrayChar[i] = (char)('a' + 26*Math.random());
		}
		
		String[] arrayString = new String[50000];
		for(int i = 0; i < arrayString.length; i++){
		arrayString[i] = String.valueOf((char)('a' + 26*Math.random()));
		}
		
		//-----START-STACK---------------------------
		
		long start1 = System.currentTimeMillis();

		//-----PUSH----------------------------------
		
		for(int i : arrayInt)
			s1.push(i);
		
//		for(char i : arrayChar)
//			s1.push(i);
		
//		for(String i : arrayString)
//			s1.push(i);

		//-----POP----------------------------------
		
		while(!s1.isEmpty())
			s1.pop();
		
		long ende1 = System.currentTimeMillis();
		
		System.out.println("\n" + "Die Laufzeit vom Stack ist: " + (ende1-start1) + "ms");
		
		System.out.println();
		
		
		
		
		
		//-----START-OBJSTACK---------------------------
		
		long start2 = System.currentTimeMillis();

		//-----PUSH----------------------------------

		for(int i : arrayInt)
			s2.push(i);
		
//		for(char i : arrayChar)
//			s2.push(i);
		
//		for(String i : arrayString)
//			s2.push(i);

		//-----POP----------------------------------
		
		while(!s2.isEmpty())
			s2.pop();
		
		long ende2 = System.currentTimeMillis();
		
		System.out.println("\n" + "Die Laufzeit vom ObjStack ist: " + (ende2-start2) + "ms");
	}
	//---http://www.angelikalanger.com/Articles/EffectiveJava/05.Clone-Part1/05.Clone-Part1.html---
}
