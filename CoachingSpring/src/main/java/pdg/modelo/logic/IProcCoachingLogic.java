package pdg.modelo.logic;

import pdg.modelo.ProcCoaching;

import pdg.modelo.dto.ProcCoachingDTO;

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
public interface IProcCoachingLogic {
    public List<ProcCoaching> getProcCoaching() throws Exception;

    /**
         * Save an new ProcCoaching entity
         */
    public void saveProcCoaching(ProcCoaching entity) throws Exception;

    /**
         * Delete an existing ProcCoaching entity
         *
         */
    public void deleteProcCoaching(ProcCoaching entity)
        throws Exception;

    /**
        * Update an existing ProcCoaching entity
        *
        */
    public void updateProcCoaching(ProcCoaching entity)
        throws Exception;

    /**
         * Load an existing ProcCoaching entity
         *
         */
    public ProcCoaching getProcCoaching(Long long1)
        throws Exception;

    public List<ProcCoaching> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<ProcCoaching> findPageProcCoaching(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberProcCoaching() throws Exception;

    public List<ProcCoachingDTO> getDataProcCoaching()
        throws Exception;

    public void validateProcCoaching(ProcCoaching procCoaching)
        throws Exception;
}
