/**
 * 2013
 * 31 mars 2013 17:27:38 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veille.site.bsmt.dto.converter.common;

import java.util.Collection;
import java.util.List;

/**
 * Converter of object from Source to Destination (ex : entities to DTO)
 * 
 * 31 mars 2013 17:27:38
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
public interface Converter<S, D> {

	/**
	 * Convert a S to a D
	 * 
	 * @param entity
	 * @return
	 */
	public D toDest(S entity);

	/**
	 * Convert a {@link List} of S to a {@link List} of D
	 * 
	 * @param sources
	 * @return
	 */
	public List<D> toDest(Collection<S> sources);

	/**
	 * Convert a {@link Collection} of S to a {@link Collection} of D
	 * 
	 * @param sources
	 * @param dests
	 */
	public void toDest(Collection<S> sources, Collection<D> dests);
}
