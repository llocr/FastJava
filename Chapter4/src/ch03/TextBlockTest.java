package ch03;

public class TextBlockTest {

	public static void main(String[] args) {
		
		String textBlocks = """
				Hello,
				hi,
				How are you
				""";
		
		System.out.println(textBlocks);
		System.out.println(getBlocksOfHtml());
	
	}
	
	public static String getBlocksOfHtml() {
		return """
				<html>
					<body>
						<span>example text</span>
					</body>
				</html>
				""";
	}

}
