/**
 * 
 * @author Marcelo Sepúlveda Londoño 11065 
 * @version 1.0 
 * @since 04 / 09 / 2024
 * 
 */

//Clase inicial llamada FrascoDulce con 3 atributos (sabor,cantidad,envase)
public class FrascoDulce {
    
    String sabor;
    int cantidad;
    String fechaEnvase;

    //Creación de 3 metodos 

    //Metodo para envasarDulce
    public boolean envasarDulce (int cantidadEnvasar ) {

        if (this.cantidad + cantidadEnvasar >= 200){
            System.out.print("No se pudo envasar todo lo solicitado, se excede la cantidad maxima 200 gr ");
            this.cantidad = 200;
            return false;
        }else {
            this.cantidad += cantidadEnvasar;
            return true;
        }
    }

    //Metodo para sacarDulce 
    public int sacarDulce (int cantidadAsacar){

        int cantidadSacada;

        if (this.consultarCantidad() >= cantidadAsacar ){

            this.cantidad -= cantidadAsacar;
            cantidadSacada = cantidadAsacar;

         } else {

            System.out.println("El frasco está vacío, no se pudo extraer todo lo solicitado: " +cantidadAsacar);
            cantidadSacada = this.cantidad;
            this.cantidad = 0;
        }

        return cantidadSacada;
    }

    //Metodo para consultarCantidad
    public int consultarCantidad (){

        return this.cantidad;
    }

}