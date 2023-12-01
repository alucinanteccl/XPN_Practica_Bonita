
package com.company.model;

import java.time.LocalDateTime;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface CompraDAO
    extends BusinessObjectDAO
{


    public Compra findByPersistenceId(Long persistenceId);

    public List<Compra> findById(Long id, int startIndex, int maxResults);

    public List<Compra> findByFecha(LocalDateTime fecha, int startIndex, int maxResults);

    public List<Compra> findByPrecioTotal(Float precioTotal, int startIndex, int maxResults);

    public List<Compra> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByFecha(LocalDateTime fecha);

    public Long countForFindByPrecioTotal(Float precioTotal);

    public Long countForFind();

    public Compra newInstance(Long id, LocalDateTime fecha, Float precioTotal);

}
