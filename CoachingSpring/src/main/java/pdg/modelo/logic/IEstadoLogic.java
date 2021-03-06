package pdg.modelo.logic;

import pdg.modelo.Estado;

import pdg.modelo.dto.EstadoDTO;

import java.math.BigDecimal;

import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IEstadoLogic {
    public List<Estado> getEstado() throws Exception;

    /**
         * Save an new Estado entity
         */
    public void saveEstado(Estado entity) throws Exception;

    /**
         * Delete an existing Estado entity
         *
         */
    public void deleteEstado(Estado entity) throws Exception;

    /**
        * Update an existing Estado entity
        *
        */
    public void updateEstado(Estado entity) throws Exception;

    /**
         * Load an existing Estado entity
         *
         */
    public Estado getEstado(Long long1) throws Exception;

    public List<Estado> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Estado> findPageEstado(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberEstado() throws Exception;

    public List<EstadoDTO> getDataEstado() throws Exception;

    public void validateEstado(Estado estado) throws Exception;
}
