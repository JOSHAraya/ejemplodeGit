
package herenciaClase;

import javax.swing.JOptionPane;

public class Profesor  extends Persona {
    private  String Especialidad;
    private String GradoAcademico; 
    
     public Profesor(){
        
    }

    public Profesor(String Especialidad, String GradoAcademico, String nombre, String apellido, int edad, int ID) {
        super(nombre, apellido, edad, ID);
        this.Especialidad = Especialidad;
        this.GradoAcademico = GradoAcademico;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }
     
    public void Ingresar(){
    

      
      Especialidad=(JOptionPane.showInputDialog("Digite el grado Academico "));
       GradoAcademico=(JOptionPane.showInputDialog("Digite la Especialidad "));

       
      
 }
 public void imprimir(){
   JOptionPane.showMessageDialog(null,"El grado academico  es: "+ getGradoAcademico()
   + "\n"+ "La especialidad  es :"+ getEspecialidad());
   

   
     }
    
    
}
