package pe.isil.microservicios_2978.model;
import javax.persistence.*;
@Entity
@Table(name = "vendedor")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer RUC;
    private String nombre;
    private String correo;
    public Vendedor(){
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getRUC() {
        return RUC;
    }
    public void setRUC(Integer RUC) {
        this.RUC = RUC;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
