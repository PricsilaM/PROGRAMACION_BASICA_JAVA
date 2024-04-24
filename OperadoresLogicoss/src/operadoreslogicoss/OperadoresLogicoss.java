
package operadoreslogicoss;

public class OperadoresLogicoss {

    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        //Operador AND (&&)
        boolean resultadoAnd = esVerdadero && esFalso;
                System.out.println("AND: "+ resultadoAnd);
                
        //
        boolean resultadoO = esVerdadero || esFalso;
                System.out.println("OR: "+ resultadoO);
        
        //Operador NOT (!)
        boolean resultadoNot = !esVerdadero;
                System.out.println("NOT: "+ resultadoNot);
    }

}
