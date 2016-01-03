/**
 * 2013
 * 31 mars 2013 17:19:16 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Abstract implementation for {@link Converter}
 * 
 * 
 * @author stephane stephane.gronowski@gmail.com 31 mars 2013 17:19:16
 * 
 */
public abstract class AbstractConverter<S, D> implements Converter<S, D> {

	@Override
	public abstract D toDest(S entity);

	@Override
	public final List<D> toDest(Collection<S> sources) {
		if (sources == null) {
			return null;
		}

		List<D> dests = new ArrayList<D>(sources.size());

		toDest(sources, dests);

		return dests;
	}

	@Override
	public final void toDest(Collection<S> sources, Collection<D> dests) {
		if (sources == null) {
			return;
		}
		if (dests == null) {
			throw new IllegalArgumentException("Collection of S is null");
		}

		for (S source : sources) {
			dests.add(toDest(source));
		}
	}

}
