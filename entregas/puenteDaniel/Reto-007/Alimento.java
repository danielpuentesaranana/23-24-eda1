public class Alimento implements Comparable<Alimento> {
    private int gramos;
    private String nombre;
    public Alimento(String nombre, int gramos) {
        this.gramos = gramos;
        this.nombre = nombre;
    }
    public int getGramos() {
        return gramos;
    }
    public void setGramos(int gramos) {
        this.gramos = gramos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int compareTo(Alimento o) {
        if (this.getNombre().compareTo(o.getNombre())> 0){
            return 1;

        }else if (this.getNombre().compareTo(o.getNombre())<0){
            return -1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return " Nombre: "+nombre+" Gramos: "+gramos;
    }
}