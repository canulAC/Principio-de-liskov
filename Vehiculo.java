
package CLASES;


abstract class Vehiculo {
    
    protected double kilometrosRecorridos;
    
    //Metodo para mover el vehiculo (puede ser sobreescrito en subclases)
    public abstract void mover(double distancia);
    
    //Metodo para calcular la autonomia (puede ser sobreescrito en subclases)
    public abstract double  calcularAutonomia();
}
