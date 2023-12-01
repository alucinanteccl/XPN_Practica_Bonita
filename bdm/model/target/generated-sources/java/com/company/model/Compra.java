
package com.company.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
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
@javax.persistence.Entity(name = "Compra")
@Table(name = "COMPRA")
@NamedQueries({
    @NamedQuery(name = "Compra.findByPersistenceId", query = "SELECT c\nFROM Compra c\nWHERE c.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Compra.findById", query = "SELECT c\nFROM Compra c\nWHERE c.id= :id\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Compra.findByFecha", query = "SELECT c\nFROM Compra c\nWHERE c.fecha= :fecha\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Compra.findByPrecioTotal", query = "SELECT c\nFROM Compra c\nWHERE c.precioTotal= :precioTotal\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Compra.find", query = "SELECT c\nFROM Compra c\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Compra.countForFindById", query = "SELECT COUNT(c)\nFROM Compra c\nWHERE c.id= :id\n"),
    @NamedQuery(name = "Compra.countForFindByFecha", query = "SELECT COUNT(c)\nFROM Compra c\nWHERE c.fecha= :fecha\n"),
    @NamedQuery(name = "Compra.countForFindByPrecioTotal", query = "SELECT COUNT(c)\nFROM Compra c\nWHERE c.precioTotal= :precioTotal\n"),
    @NamedQuery(name = "Compra.countForFind", query = "SELECT COUNT(c)\nFROM Compra c\n")
})
public class Compra implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "FECHA", nullable = false, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateAndTimeConverter.class)
    private LocalDateTime fecha;
    @Column(name = "PRECIOTOTAL", nullable = false)
    private Float precioTotal;

    public Compra() {
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

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

}
