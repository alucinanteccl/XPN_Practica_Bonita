
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface UsuarioDAO
    extends BusinessObjectDAO
{


    public Usuario findByPersistenceId(Long persistenceId);

    public Usuario findByNombreUsuario(String nombreUsuario);

    public List<Usuario> findById(Long id, int startIndex, int maxResults);

    public List<Usuario> findByContrasena(String contrasena, int startIndex, int maxResults);

    public List<Usuario> findByEmail(String email, int startIndex, int maxResults);

    public List<Usuario> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByContrasena(String contrasena);

    public Long countForFindByEmail(String email);

    public Long countForFind();

    public Usuario newInstance(Long id, String nombreUsuario, String contrasena, String email);

}
