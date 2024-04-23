
package tipodato;

public class Tipodato {

    public static void main(String[] args) {
        //Cadenas o Strings
        //Declarando
        String Nombre;
        int Edad;
        boolean Estado;
        double Saldo;
        Object TodoTipoDato;
        //Asignado
        
        Nombre = "Pamela Pricsila Bravo Medina";
        Edad = 18;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.26;
        //Imprimiendo
        System.out.println("Nombre: "+Nombre);
        System.out.println("Edad: "+ Edad);
        System.out.println("Saldo: "+ Saldo);
        System.out.println("Dinamico: "+ TodoTipoDato);
    }
    
}
