
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface IncidenciaDAO
    extends BusinessObjectDAO
{


    public Incidencia findByPersistenceId(Long persistenceId);

    public List<Incidencia> findById(Long id, int startIndex, int maxResults);

    public List<Incidencia> findByNumSerieProducto(String numSerieProducto, int startIndex, int maxResults);

    public List<Incidencia> findByDescripcion(String descripcion, int startIndex, int maxResults);

    public List<Incidencia> findByUsuarioNombre(String usuarioNombre, int startIndex, int maxResults);

    public List<Incidencia> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByNumSerieProducto(String numSerieProducto);

    public Long countForFindByDescripcion(String descripcion);

    public Long countForFindByUsuarioNombre(String usuarioNombre);

    public Long countForFind();

    public Incidencia newInstance(Long id, String numSerieProducto, String descripcion);

}
