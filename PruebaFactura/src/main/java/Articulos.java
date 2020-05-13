// Clase Articulos

public class Articulos {
//Atributos:

    private int idArticulo;
    private String nombreArt;
    int precioArt;

//Constructor con variables apuntadas
    Articulos() {
    }

    Articulos(int idArticulo, String nombreArt, int precioArt) {
// Aclaro y apunto variables a tomar
        this.idArticulo = idArticulo;
        this.nombreArt = nombreArt;
        this.precioArt = precioArt;
    }
//Se crean metodos de la clase Articulos
// Get para retornar valor ingresado -- Set para modificar valor en variable indicada

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getIdArticulo() {
        return this.idArticulo;
    }

    public String getNombreArt() {
        return this.nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public double getPrecioArt() {
        return this.precioArt;
    }

    public void setPrecioArt(int precioArt) {
        this.precioArt = precioArt;
    }

}
