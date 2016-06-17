package ChassiUtil;

public class ChassiUtil {
	
	public int obterAno(String chassi, int posicao){
		
		if(chassi == null || chassi.trim().length()!= 17){
			throw new IllegalArgumentException("O chassi informado é inválido!");
		}
		
		if(posicao < 0 || posicao > 17){
			throw new IllegalArgumentException("Posição informada incorreta!");
		}
		
		char caractere = chassi.toUpperCase().charAt(posicao -1);
		return (caractere - 'A') + 2010;
	}

}
