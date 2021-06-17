package ejercicioclaseclinicaveterinaria;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


/**
 * Clase Publica 
 * @author 
 */
public class ClinicaVeterinaria {
    // Atributos
    private ArrayList<Animal> listaAnimales;
    
   
    /**
     *  Constructor de la clase Clinica Veterianaria 
     */
    public ClinicaVeterinaria() {
        listaAnimales = new ArrayList<>();
    }
    
    // Métodos de instancia
    /**
     * Metodo por el cual le pasamos un parametro Animal y no guarda en un lista los objetos de la clase 
     * @param pAnimal 
     */
    public void insertaAnimal(Animal pAnimal) {
        listaAnimales.add(pAnimal);
    }
    
    /**
     * Metodo con el cual pasamos un parametro y no recorre con un ciclo for un lista y no devuelve el Objeto Animal solicitado 
     * @param pNombre
     * @return 
     */
    public String buscaAnimal(String pNombre) {
        for (Animal a: this.listaAnimales) {
            if (a.getNombre().equals(pNombre)) {
                return a.toString();
            }
        }
        return null;
    }
    
    /**
     * Metodo que a travez de los parametros a continuacion permite 
     * @param pNombre
     * @param pComent 
     */
    public void modificaComentarioAnimal(String pNombre, String pComent) {
        for (Animal a: this.listaAnimales) {
            if (a.getNombre().equals(pNombre)) {
                a.setComentarios(pComent);
            }
        }
    }
    /**
     * Metodo sobreescrito toString que me retorna una listaAnimales
     * @return 
     */

    @Override
    public String toString() {
        return this.listaAnimales.toString();
    }

/*    public static void main(String[] args) {
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();
        clinica.insertaAnimal(new Perro("Chispa",RazaPerro.DALMATA,LocalDate.of(2020, Month.MARCH, 12),25,""));
        clinica.insertaAnimal(new Pajaro("Quico",LocalDate.of(2021, Month.MARCH,5),0.5,EspeciePajaro.CANARIO,true));
        clinica.modificaComentarioAnimal("Quico", "Canario de canarias");
        System.out.println("Encontrada "+clinica.buscaAnimal("Quico"));
        
    }*/
    
    
    
    
    
}
