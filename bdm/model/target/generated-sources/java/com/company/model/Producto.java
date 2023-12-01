
package com.company.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "Producto")
@Table(name = "PRODUCTO", uniqueConstraints = {
    @UniqueConstraint(name = "NUMSERPRDCTUNICO", columnNames = {
        "numSerieProducto"
    })
})
@NamedQueries({
    @NamedQuery(name = "Producto.findByPersistenceId", query = "SELECT p\nFROM Producto p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Producto.findByNumSerieProducto", query = "SELECT p\nFROM Producto p\nWHERE p.numSerieProducto= :numSerieProducto\n"),
    @NamedQuery(name = "Producto.findById", query = "SELECT p\nFROM Producto p\nWHERE p.id= :id\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Producto.find", query = "SELECT p\nFROM Producto p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Producto.countForFindById", query = "SELECT COUNT(p)\nFROM Producto p\nWHERE p.id= :id\n"),
    @NamedQuery(name = "Producto.countForFind", query = "SELECT COUNT(p)\nFROM Producto p\n")
})
public class Producto implements org.bonitasoft.engine.bdm.Entity
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

    public Producto() {
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

}
