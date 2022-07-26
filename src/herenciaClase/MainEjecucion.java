
package herenciaClase;


public class MainEjecucion {

    public static void main(String[] args) {
        Estudiante datos= new Estudiante();
        datos.Ingresar();
        datos.imprimir();
         datos.Notas();
         datos.mostrarNotas();
        
       Profesor datosDocente= new Profesor();
         datosDocente.Ingresar();
        datosDocente.imprimir();
}
}