package builderDesignPattern;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		
		DummyTable dummyTable = new DummyTable.Builder(1)
				.setName("Divyansh Sinha")
				.setDate(new Date())
				.setColumn("Some random column").build();
		
		System.out.println(dummyTable.toString());
	}

}
