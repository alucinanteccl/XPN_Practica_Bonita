
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface ProductoDAO
    extends BusinessObjectDAO
{


    public Producto findByPersistenceId(Long persistenceId);

    public Producto findByNumSerieProducto(String numSerieProducto);

    public List<Producto> findById(Long id, int startIndex, int maxResults);

    public List<Producto> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFind();

    public Producto newInstance(Long id, String numSerieProducto);

}
