
package operacionesconcadenas;

public class OperacionesConCadenas {
    
    public static void main(String[] args) {
        String Nombres = "Pamela Pricsila";
        String Apellidos = "Bravo Medina";
        
        //Concatenar
        String NombreCompleto  = Nombres + " " + Apellidos ;
        System.out.println("Nombre Completo: " + NombreCompleto);

        //Mayusculas
        String NombreCompleto1 = Nombres + " "+ Apellidos ;
        System.out.println("Nombre Completo: " + NombreCompleto1.toUpperCase());
        
        //Minuscula
        String NombreCompleto2 = Nombres + " "+ Apellidos ;
        System.out.println("Nombre Completo: " + NombreCompleto2.toLowerCase());
        
        //Contar
        String NombreCompleto3 = Nombres + " "+ Apellidos ;
        System.out.println("Cantidad caracteres: " + NombreCompleto3.length());
        
        //Contar Cadena
        String NombreCompleto4 = Nombres + " "+ Apellidos ;
        //["Pamela","Pricsila","Bravo","Medina"]
        String[] NombreCortado = NombreCompleto4.split(" ");
        //System.out.println (NombreCortado[1]);
//        for(int i = 0 ; i < NombreCortado.length; i++){
//               System.out.println (NombreCortado[i]);
//        }
        for(String nombre : NombreCortado){
            System.out.println(nombre);
        }
        
        //Equals
        //boolean comparacion = Nombres.equals(Apellidos);
        boolean comparacion = Nombres == Apellidos;
        System.out.println("Comparacion: "+comparacion);
        
        //Importacion de variables
        String n ="Pamela";
        String a = "Bravo";
        int e = 18;
        String mensaje = String.format("Mi nombre es %s y mi apellido es %s y tengo %d años", n , a, e);
        System.out.println(mensaje);
        
    }
    
}
