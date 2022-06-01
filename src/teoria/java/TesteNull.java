package teoria.java;

public class TesteNull {
	
    public static void main(String[] args) {
    	
        System.out.println("Teste de Null");

        String texto = "ABC";
        
        System.out.println( "texto = 'ABC'");
        
        System.out.println(texto);
        
        if ("ABC".equals(texto)) {
        	
            System.out.println("São iguais");
        }
        
        if (texto.equals("ABC")) {
        	
            System.out.println("São iguais");
        }
        
        texto = null;
        
        System.out.println( "texto = 'null'");
        
        System.out.println(texto);

        // O método .equals não aceita ser chamado por uma variável com valor null, ou null, isto é
        // quando tem null.equals, ela não funciona, por isso dá o erro, para resolver isso devemos
        // passar o texto "ABC" que n é nulo para chamar a função, a função não suporta ser chamado 
        // por um "null" mas aceita a fazer comparação com um valor "null"

        if ("ABC".equals(texto)) {
            System.out.println("São iguais");
        }
        
        if (texto.equals("ABC")) {
        	
            System.out.println("São iguais");
        }
    }
}

