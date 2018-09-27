
public class NullPointer {

	public static void main(String[] args) {

		try {
		Object obj = null;
		System.out.println(obj.hashCode());
		
		}
		catch(Exception e){
			System.out.println(e);			
		}
		
		System.out.println("working...");
	}

}
