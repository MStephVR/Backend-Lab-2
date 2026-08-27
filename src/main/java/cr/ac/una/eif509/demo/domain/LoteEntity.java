package cr.ac.una.eif509.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "lotes")
public class LoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private String ubicacion;
    private String proposito;

    public LoteEntity() {
    }

    public LoteEntity(String nombre, String ubicacion, String proposito) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.proposito = proposito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }
}
