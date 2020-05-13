
class Auto {

    private int idAuto;
    private String nombre;
    private static int contadorId; //Variable privada tipo estatico

    Auto(String nombre) {
        this.nombre = nombre;
        ++contadorId;
        this.idAuto = contadorId;
        }

    public int getIdAuto() {
        return this.idAuto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorId() {

        return contadorId;
    }

}

