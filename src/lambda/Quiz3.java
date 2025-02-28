package lambda;

public class Quiz3 {

	public static void main(String[] args) {
		StringConverter stringConverter = new StringConverter() {
			
			@Override
			public String convert(String str) {
				return str.toUpperCase();
			}
		};
		
		System.out.println(stringConverter.convert("Hello, World!"));
		
		// 또는
		
		// 슬슬 람다식으로 쓰는게 감 잡혀짐
		StringConverter stringConverter2 = (String str) -> str.toUpperCase();
		
		System.out.println(stringConverter2.convert("Hello, world!!"));
		
		// 또는
		
		// 읽기 편한건 이거
		StringConverterImpl stringConverterImpl = new StringConverterImpl();
		
		System.out.println(stringConverterImpl.convert("hello, world!!!"));
		
	}

}

@FunctionalInterface
interface StringConverter {
	// 문자열을 대문자로 변환하여 반환하는 함수
	String convert(String str);
}

class StringConverterImpl implements StringConverter {

	@Override
	public String convert(String str) {
		return str.toUpperCase();
	}
	
}
