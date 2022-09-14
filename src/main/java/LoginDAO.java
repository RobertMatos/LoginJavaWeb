import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginDAO {
	public static boolean validate(String username, String password) {
		boolean valid = false;
		
		// Cria os logins cadastrados
		String[][] data = new String[3][2];
		data[0][0] = "Robert";
		data[0][1] = "12345";
		
		data[1][0] = "Jeane";
		data[1][1] = "#Jeane1";
		
		data[2][0] = "Marcia";
		data[2][1] = "abc";
		
		try {
			// Cria a regex para ver se a senha é forte
			String validarSenha = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#]).{1,}$";
			Pattern p = Pattern.compile(validarSenha);
			Matcher m = p.matcher(password);
			
			//Confere se o usuário e a senha passadas são válidas
			for(int i = 0; i < data.length; i++) {
				if((data[i][0].contentEquals(username)) && (data[i][1].contentEquals(password))) {
					
					if(m.matches() == false) {
						return valid;
					}
					
					return valid = true;
				} 
			}
			
			if(valid  == false) {
				return valid;
			}
			
		} catch(Exception e){System.out.println(e);}
		return valid;
	}
}
