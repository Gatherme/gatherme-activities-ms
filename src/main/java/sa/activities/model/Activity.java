package sa.activities.model;

import javax.persistence.*;

@Entity
@Table(name = "activities")
@NamedQueries({@NamedQuery(name = Activity.FIND_ALL, query = "SELECT u FROM Activity u")})
public class Activity {
    public static final String FIND_ALL = "Activity.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String informacion;
    private String nombre;
    private String descripcion;
    private String[] lista_miembros;

    public String[] getLista_miembros() {
        return lista_miembros;
    }

    public void setLista_miembros(String[] lista_miembros) {
        this.lista_miembros = lista_miembros;
    }


    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
