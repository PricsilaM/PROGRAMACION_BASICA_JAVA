
package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //Incremento
        //variableUno= variableUno + 1;
        variableUno ++;
        System.out.println("Incremento: "+variableUno);
        
        //Decremento
        //variableDos= variableDos - 1;
        variableDos --;
        System.out.println("Decremento: "+variableDos);
        
        //Suma
        int suma = variableUno + variableDos;
        System.out.println("El resultado de la suma es: "+suma);
        
        //Resta
        int resta = variableUno - variableDos;
        System.out.println("El resultado de la resta es: "+resta);
        
        //Multiplicacion
        int multiplicacion = variableUno * variableDos;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        
        //Division
        int division = variableUno / variableDos;
        System.out.println("El resultado de la division es: "+division);
        
        //Modulo
        int modulo = variableUno % variableDos;
        System.out.println("El resultado del modulo es: "+modulo);
        
    }
    
}
