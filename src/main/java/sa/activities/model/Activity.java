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
    private String[] tags_especificos;
    private String[] notas_adicionales;
    private String categoria;
    private boolean recurrente;
    private String lugar;
    private String hora;
    private String fecha;
    private String banner;
    private String Administrador;


    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(String administrador) {
        Administrador = administrador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isRecurrente() {
        return recurrente;
    }

    public void setRecurrente(boolean recurrente) {
        this.recurrente = recurrente;
    }

    public String[] getTags_especificos() {
        return tags_especificos;
    }

    public void setTags_especificos(String[] tags_especificos) {
        this.tags_especificos = tags_especificos;
    }

    public String[] getNotas_adicionales() {
        return notas_adicionales;
    }

    public void setNotas_adicionales(String[] notas_adicionales) {
        this.notas_adicionales = notas_adicionales;
    }

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
