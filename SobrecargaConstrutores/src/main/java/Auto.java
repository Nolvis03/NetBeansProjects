public class Auto {
private int idAuto;
private String nombre;
private int km;
private static int contador;

Auto(){
this.idAuto=++contador;
}
Auto(String nombre, int km){
    this();// Cargo constructor vacio y sus argumentos
    this.nombre=nombre;
    this.km=km;
    

}


    
}
