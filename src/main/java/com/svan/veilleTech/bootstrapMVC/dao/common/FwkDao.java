package com.svan.veilleTech.bootstrapMVC.dao.common;

import java.util.List;

import javax.persistence.Query;

/**
 * <p>
 * Interface for Data Access Object
 * </p>
 * 
 * @author stephane
 * 
 * @param <E>
 *            entity class
 * @param <PK>
 *            primary key type
 * 
 */
public interface FwkDao<E, PK> {

	/**
	 * find all entity from database
	 * 
	 * @return entity list
	 */
	public abstract List<E> findAll();

	/**
	 * return the entity with primary key 'pk'
	 * 
	 * @param pk
	 *            primary key to search for
	 * @return the entity found or null if entity with this p don't exist.
	 */
	public abstract E findByPk(PK pk);

	/**
	 * Synchronize the persistence context to the database
	 */
	public abstract void flush();

	/**
	 * merge the entity into persistence context. Return the managed entity
	 * 
	 * @param entity
	 *            entity to add into context
	 * @return entity managed by context.
	 */
	public abstract E merge(final E entity);

	/**
	 * Persist the entity into database
	 * 
	 * @param entity
	 *            entity to persist
	 */
	public abstract void persist(final E entity);

	/**
	 * delete the entity from database
	 * 
	 * @param entity
	 *            entity to remove (must be in persistence context)
	 */
	public void remove(E entity);

	/**
	 * get a reference (proxy of an entity). This reference is very usefull if
	 * you have to only set data on an object as it will not query the database
	 * first.
	 * 
	 * @param pk
	 *            primary key
	 * @return a proxy to the entity.
	 */
	public E getReferenceByPk(final PK pk);

	/**
	 * Detach the entity from context
	 * 
	 * @param entity
	 *            entity to detach
	 */
	public void detach(final E entity);

	/**
	 * Detach all entity managed by this persistence context from context
	 */
	public void clear();

	/**
	 * Method which help user to exploit single result of query if query's
	 * result has no result, this method return null else method return the
	 * result
	 * 
	 * @param query
	 *            {@link javax.persistence.Query} query
	 * @return result
	 */
	public <T> T singleResultOrNull(final Query query);

	/**
	 * Method which remove element by primary key value.
	 * 
	 * @param primaryKey
	 *            value
	 */
	public void removeByPk(final PK primaryKey);

}