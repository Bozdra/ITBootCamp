package stringBuilder;

public class StringBilder {

	public static void main(String[] args) {
			
		StringBuilder sb = new StringBuilder();
		
		sb.append("Ja ");
		sb.append("volim ");
		sb.append("cokoladu! ");
		
		String a = sb.substring(3, 8); // sece string od indexa do indexa
		
		System.out.println(a);
		
		sb.insert(3, "ne ");
		
		
		System.out.println(sb.toString());
		
		sb.replace(3, 6, "mnogo ");
		
		System.out.println(sb.toString());

		sb.delete(3, 9);
		System.out.println(sb.toString());
		
		sb.append("Ali nije dobra za mene");
	
		System.out.println(sb.toString());
		
		System.out.println(sb.indexOf("cokoladu"));
	}

}
