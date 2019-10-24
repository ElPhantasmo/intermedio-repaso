package ar.edu.utn.intermedio.java.clase2;

public class QRParser {

	public static void main(String[] args) {

		
		String qr = "mailto:mlennard.utn@gmail.com?subject=Asunto del mail&body=Un mensaje a la sociedad";
		
//A)
		
		String a = qr.substring(0, 6);
		System.out.println(a);
		
	
//B)
		
		Boolean b = qr.contains("@");
		System.out.println(b);
		

//C)
		
		Boolean c = qr.contains("subject");
		System.out.println(c);
		
		
//D)
		
		String body = "body=";
		Integer index = qr.indexOf(body);
		System.out.println(qr.substring(index + body.length()));
		
		
	}

}
