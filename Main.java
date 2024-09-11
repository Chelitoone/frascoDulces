public class Main {
    
    public static void main(String[] args) {
        /*
         * Crear un frasco de dulce
         * Tratar de envasar 250 gramos de dulce
         * Mostrar si fue posible envasar los 250 gramos o solo 200
         * 
         * intenta sacar 150 gramos de dulce y luego sacar 60 gramos
         * Mostrar la cantidad de dulce que efectivamente se puede sacar
         * y mostrar la cantidad que queda en el frasco 
         *       
         * */
        

         FrascoDulce frasco = new FrascoDulce();

         //Se intentarán envasar 250 gramos de dulce 
         System.out.println( frasco.envasarDulce(250));
         //Nos retornará un "false" ya que la cantidad excede la del vaso, y se envasará hasta alacanzar el maximo de 200 gr 


         // Ya que si imprimimos la cantidad en el vaso nos dará "200 gr"
         System.out.println("La cantidad actual es de: " +frasco.consultarCantidad());


         //Intentaremos sacar 150 gr 
        System.out.println("Se van a sacar del Frasco: " +frasco.sacarDulce(150));
        System.out.println("La cantidad actual es de: " +frasco.consultarCantidad() );
        
        //Y luego 60 gr
        System.out.println(" Se van a sacar del Frasco: " +frasco.sacarDulce(60)); 


        //La cantidad final del vaso tendría que ser 0 
        System.out.println("La cantidad final en el vaso es de: " +frasco.consultarCantidad());


      



         



    }

}