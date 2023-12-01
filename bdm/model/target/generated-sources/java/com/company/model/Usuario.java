
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
@javax.persistence.Entity(name = "Usuario")
@Table(name = "USUARIO", uniqueConstraints = {
    @UniqueConstraint(name = "NOMBRE_UNICO", columnNames = {
        "nombreUsuario"
    })
})
@NamedQueries({
    @NamedQuery(name = "Usuario.findByPersistenceId", query = "SELECT u\nFROM Usuario u\nWHERE u.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u\nFROM Usuario u\nWHERE u.nombreUsuario= :nombreUsuario\n"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u\nFROM Usuario u\nWHERE u.id= :id\nORDER BY u.persistenceId"),
    @NamedQuery(name = "Usuario.findByContrasena", query = "SELECT u\nFROM Usuario u\nWHERE u.contrasena= :contrasena\nORDER BY u.persistenceId"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u\nFROM Usuario u\nWHERE u.email= :email\nORDER BY u.persistenceId"),
    @NamedQuery(name = "Usuario.find", query = "SELECT u\nFROM Usuario u\nORDER BY u.persistenceId"),
    @NamedQuery(name = "Usuario.countForFindById", query = "SELECT COUNT(u)\nFROM Usuario u\nWHERE u.id= :id\n"),
    @NamedQuery(name = "Usuario.countForFindByContrasena", query = "SELECT COUNT(u)\nFROM Usuario u\nWHERE u.contrasena= :contrasena\n"),
    @NamedQuery(name = "Usuario.countForFindByEmail", query = "SELECT COUNT(u)\nFROM Usuario u\nWHERE u.email= :email\n"),
    @NamedQuery(name = "Usuario.countForFind", query = "SELECT COUNT(u)\nFROM Usuario u\n")
})
public class Usuario implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "NOMBREUSUARIO", nullable = false, length = 255)
    private String nombreUsuario;
    @Column(name = "CONTRASENA", nullable = false, length = 255)
    private String contrasena;
    @Column(name = "EMAIL", nullable = false, length = 255)
    private String email;

    public Usuario() {
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

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
