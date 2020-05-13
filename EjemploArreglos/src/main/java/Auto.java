public class Auto {
  private String nombre;

Auto(){
}
Auto(String nombre)
{
this.nombre=nombre;
}

public void getNombre(){
    this.nombre=nombre;
}
 public String setNombre(String nombre)
 {
 return this.nombre;
 }
 
 public String toString(){
 return "El nombre del auto es: "+nombre;
 }
        
}
