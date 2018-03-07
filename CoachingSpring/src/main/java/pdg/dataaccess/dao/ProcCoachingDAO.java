package pdg.dataaccess.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import pdg.dataaccess.api.JpaDaoImpl;

import pdg.modelo.ProcCoaching;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * ProcCoaching entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.ProcCoaching
 */
@Scope("singleton")
@Repository("ProcCoachingDAO")
public class ProcCoachingDAO extends JpaDaoImpl<ProcCoaching, Double>
    implements IProcCoachingDAO {
    private static final Logger log = LoggerFactory.getLogger(ProcCoachingDAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static IProcCoachingDAO getFromApplicationContext(
        ApplicationContext ctx) {
        return (IProcCoachingDAO) ctx.getBean("ProcCoachingDAO");
    }
}
