package teoria.java;

public class TesteNull {
	
    public static void main(String[] args) {
    	
        System.out.println("Teste de Null");

        String texto = "ABC";
        
        System.out.println( "texto = 'ABC'");
        
        System.out.println(texto);
        
        if ("ABC".equals(texto)) {
        	
            System.out.println("S�o iguais");
        }
        
        if (texto.equals("ABC")) {
        	
            System.out.println("S�o iguais");
        }
        
        texto = null;
        
        System.out.println( "texto = 'null'");
        
        System.out.println(texto);

        // O m�todo .equals n�o aceita ser chamado por uma vari�vel com valor null, ou null, isto �
        // quando tem null.equals, ela n�o funciona, por isso d� o erro, para resolver isso devemos
        // passar o texto "ABC" que n � nulo para chamar a fun��o, a fun��o n�o suporta ser chamado 
        // por um "null" mas aceita a fazer compara��o com um valor "null"

        if ("ABC".equals(texto)) {
            System.out.println("S�o iguais");
        }
        
        if (texto.equals("ABC")) {
        	
            System.out.println("S�o iguais");
        }
    }
}

