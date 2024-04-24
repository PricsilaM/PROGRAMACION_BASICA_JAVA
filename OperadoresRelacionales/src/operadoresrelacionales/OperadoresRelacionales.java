
package operadoresrelacionales;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
    //Operador igual (==)
    boolean igual = variableUno == variableDos;
    System.out.println("Igual: "+ igual);
    
    boolean noigual = variableUno != variableDos;
    System.out.println("No Igual: "+ noigual);
    
    boolean mayorQue = variableUno > variableDos;
    System.out.println("Mayor Que: "+ mayorQue);
    
    boolean menorQue = variableUno < variableDos;
    System.out.println("Menor Que: " + mayorQue);
    
    boolean mayorIgualQue = variableUno >= variableDos;
    System.out.println("Mayor Igual Que: " + mayorIgualQue);
    
    boolean menorIgualQue = variableUno <= variableDos;
    System.out.println("Menor Igual Que: " + menorIgualQue);
    
    }
    
}
