
package com.company.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "Incidencia")
@Table(name = "INCIDENCIA")
@NamedQueries({
    @NamedQuery(name = "Incidencia.findByPersistenceId", query = "SELECT i\nFROM Incidencia i\nWHERE i.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Incidencia.findById", query = "SELECT i\nFROM Incidencia i\nWHERE i.id= :id\nORDER BY i.persistenceId"),
    @NamedQuery(name = "Incidencia.findByNumSerieProducto", query = "SELECT i\nFROM Incidencia i\nWHERE i.numSerieProducto= :numSerieProducto\nORDER BY i.persistenceId"),
    @NamedQuery(name = "Incidencia.findByDescripcion", query = "SELECT i\nFROM Incidencia i\nWHERE i.descripcion= :descripcion\nORDER BY i.persistenceId"),
    @NamedQuery(name = "Incidencia.findByUsuarioNombre", query = "SELECT i\nFROM Incidencia i\nWHERE i.usuarioNombre= :usuarioNombre\nORDER BY i.persistenceId"),
    @NamedQuery(name = "Incidencia.find", query = "SELECT i\nFROM Incidencia i\nORDER BY i.persistenceId"),
    @NamedQuery(name = "Incidencia.countForFindById", query = "SELECT COUNT(i)\nFROM Incidencia i\nWHERE i.id= :id\n"),
    @NamedQuery(name = "Incidencia.countForFindByNumSerieProducto", query = "SELECT COUNT(i)\nFROM Incidencia i\nWHERE i.numSerieProducto= :numSerieProducto\n"),
    @NamedQuery(name = "Incidencia.countForFindByDescripcion", query = "SELECT COUNT(i)\nFROM Incidencia i\nWHERE i.descripcion= :descripcion\n"),
    @NamedQuery(name = "Incidencia.countForFindByUsuarioNombre", query = "SELECT COUNT(i)\nFROM Incidencia i\nWHERE i.usuarioNombre= :usuarioNombre\n"),
    @NamedQuery(name = "Incidencia.countForFind", query = "SELECT COUNT(i)\nFROM Incidencia i\n")
})
public class Incidencia implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NUMSERIEPRODUCTO", nullable = false, length = 255)
    private String numSerieProducto;
    @Column(name = "DESCRIPCION", nullable = false, length = 512)
    private String descripcion;
    @Column(name = "USUARIONOMBRE", nullable = true, length = 255)
    private String usuarioNombre;

    public Incidencia() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNumSerieProducto(String numSerieProducto) {
        this.numSerieProducto = numSerieProducto;
    }

    public String getNumSerieProducto() {
        return numSerieProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

}
