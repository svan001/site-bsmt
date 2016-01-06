/**
 * 
 */
package com.svan.veille.site.bsmt.dao.common;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 * 
 * Abstract {@link FwkDao}
 *
 * @author stephane 31 août 2014
 *
 */
public abstract class AbstractFwkDao<E, PK> implements FwkDao<E, PK> {
	/**
	 * Abstract method to retrieve the entityManager. This abstract method is
	 * needed as each DAO can have its particular manager (multi database
	 * environment).
	 * 
	 * @return JPA entityManager.
	 */
	protected abstract EntityManager getEntityManager();

	/**
	 * This will contain the class of the entity.
	 */
	private final Class<? extends E> entityClass;

	/**
	 * Default constructor : computes {@link #entityClass} from class type
	 * arguments.
	 */
	@SuppressWarnings("unchecked")
	public AbstractFwkDao() {
		super();
		this.entityClass = (Class<E>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/**
	 * This constructor will override the entity. With this constructor, it is
	 * possible to query entity with discriminator and return the generic
	 * entity. Ex: If you have a "User" entity and "Employee", "Partner" entity
	 * that extends User, then : public class MyEmployeeDao extends
	 * AbstractDaoBaseJpa<User, Long> implements ...{ ... public
	 * MyEmployeeDao(){ super(Employee.class); } } will retrive only the
	 * Employee but method parameter/result will use User class.
	 * 
	 * @param aEntityClass
	 *            the entity class we want to query. (must extend the {@link #E}
	 *            parameter)
	 */
	public AbstractFwkDao(final Class<? extends E> aEntityClass) {
		super();
		this.entityClass = aEntityClass;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		return getEntityManager().createQuery(
				" select E from " + entityClass.getName() + " E ")
				.getResultList();
	}

	/**
	 * {@inheritDoc}
	 */
	public E findByPk(final PK pk) {
		return getEntityManager().find(this.entityClass, pk);
	}

	/**
	 * {@inheritDoc}
	 */
	public E getReferenceByPk(final PK pk) {
		return getEntityManager().getReference(this.entityClass, pk);
	}

	/**
	 * {@inheritDoc}
	 */
	protected String getEntityName() {
		return entityClass.getName();
	}

	/**
	 * {@inheritDoc}
	 */
	public E merge(final E entity) {
		return getEntityManager().merge(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	public void persist(final E entity) {
		getEntityManager().persist(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	public void remove(final E entity) {
		getEntityManager().remove(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	public void clear() {
		getEntityManager().clear();
	}

	/**
	 * {@inheritDoc}
	 */
	public void flush() {
		getEntityManager().flush();
	}

	/**
	 * {@inheritDoc}
	 */
	public void detach(final E entity) {
		getEntityManager().detach(entity);
	}

	@SuppressWarnings("unchecked")
	public final <T> T singleResultOrNull(final Query query) {
		try {
			// TODO bug hibernate NonUniqueResultException non jetter
			T tmp = (T) query.getSingleResult();

			/*
			query.setMaxResults(2);
			List<T> res = query.getResultList();
			switch (res.size()) {
			case 1:
				return res.get(0);
			case 0:
				return null;
			default:
				throw new NonUniqueResultException(
						"More than one result for query : " + query);
			}*/
			return tmp;
			
		} catch (final NoResultException e) {
			return null;
		}

	}

	public final void removeByPk(final PK keyValue) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("delete from ");
		queryStr.append(this.getEntityName());
		queryStr.append(" where id= :keyValue");

		final Query query = getEntityManager().createQuery(queryStr.toString());
		query.setParameter("keyValue", keyValue);

		query.executeUpdate();
	}

}