
package herenciaClase;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Estudiante extends Persona{
      //atributos 
    DecimalFormat df= new DecimalFormat("#.00");
    private  String grado;
    private String seccion; 
    private  String institucion ;
    private  double  Nota1 ;
    private  double  Nota2 ;
    private  double  Nota3 ;
    private  double  Prom ;
    
    public Estudiante(){
        
    }
    //Atributos 

    public Estudiante(String grado, String seccion, String institucion, double Nota1, double Nota2, double Nota3, double Prom, String nombre, String apellido, int edad, int ID) {
        super(nombre, apellido, edad, ID);
        this.grado = grado;
        this.seccion = seccion;
        this.institucion = institucion;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Prom = Prom;
    }

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getProm() {
        return Prom;
    }

    public void setProm(double Prom) {
        this.Prom = Prom;
    }
   
    
 public void Ingresar(){
      setNombre(JOptionPane.showInputDialog("Digite el nombre "));
      setApellido(JOptionPane.showInputDialog("Digite el apellido "));
      setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad ")));
      setID(Integer.parseInt(JOptionPane.showInputDialog("Digite el  ID ")));
      
      grado=(JOptionPane.showInputDialog("Digite el grado "));
      seccion=(JOptionPane.showInputDialog("Digite la sección "));
      institucion=(JOptionPane.showInputDialog("Digite la institución "));
      
      
 }
 public void imprimir(){
   JOptionPane.showMessageDialog(null,"El nombre es: "+ getNombre() 
   + "\n"+ "El apellido del alumno es :"+ getApellido()+ "\n"+ "La edad del alumno es : "+ getEdad()
   + "\n"+ "EL ID del alumno es: "+ getID()+ "\n"+"El grado del alumno es : " + getGrado()
   +"\n"+ "La Sección del alumno es : " + getSeccion()+ "\n"+"La institución es: "+ getInstitucion());
   
    
   
     }
  public void Notas(){
    setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite la Nota 1 ")));
    setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite la Nota 2 ")));
    setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite la Nota 3 ")));
    
      Prom=(Nota1+Nota2+Nota3)/3;
      
  }
   public void mostrarNotas(){
      JOptionPane.showMessageDialog(null,"El promedio es: "+ df.format(Prom) );
  }
}
