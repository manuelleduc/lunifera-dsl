/**
 * Copyright 2009-2013 Oy Vaadin Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lunifera.dsl.dto.lib.services.filters;

import java.util.Collection;
import java.util.List;

/**
 * Container that supports a bit more advanced filtering than {@link Filterable}
 * . It has been designed to be used explicitly with JPA.
 * 
 * @author Petter Holmström (Vaadin Ltd)
 * @since 1.0
 */
public interface LAdvancedFilterable {

	/**
	 * Gets the IDs of all the properties that are filterable.
	 * 
	 * @return an unmodifiable collection of property IDs (never null).
	 */
	public Collection<Object> getFilterablePropertyIds();

	/**
	 * Checks if <code>propertyId</code> is filterable.
	 * 
	 * @param propertyId
	 *            the property ID to check (must not be null).
	 * @return true if the property is filterable, false otherwise.
	 */
	public boolean isFilterable(Object propertyId);

	/**
	 * Gets the list of filters to apply. The filters will be applied as a
	 * conjunction (i.e. AND) in the order they appear in.
	 * 
	 * @return an unmodifiable list of filters (never null).
	 */
	public List<ILFilter> getFilters();

	/**
	 * Gets the list of filters that are currently applied. If
	 * {@link #isApplyFiltersImmediately() } returns true, this list will be the
	 * same as the one returned by {@link #getFilters() }.
	 * 
	 * @return an unmodifiable list of filters (never null).
	 */
	public List<ILFilter> getAppliedFilters();

	/**
	 * Sets whether the filters should be applied immediately when a filter is
	 * added or removed.
	 * 
	 * @see #isApplyFiltersImmediately()
	 * @param applyFiltersImmediately
	 *            true to apply filters immediately, false to apply when
	 *            {@link #applyFilters() } is called.
	 */
	public void setApplyFiltersImmediately(boolean applyFiltersImmediately);

	/**
	 * Returns whether the filters should be applied immediately when a filter
	 * is added or removed. Default is true. If false, {@link #applyFilters() }
	 * has to be called to apply the filters and update the container.
	 * 
	 * @see #setApplyFiltersImmediately(boolean)
	 * @return true if the filters are applied immediately, false otherwise.
	 */
	public boolean isApplyFiltersImmediately();

	/**
	 * Applies the filters to the data, possibly causing the items in the
	 * container to change.
	 * 
	 * @see FiltersAppliedEvent
	 */
	public void applyFilters();

	/**
	 * Checks if there are filters that have not yet been applied, or applied
	 * filters that have been removed using {@link #removeAllFilters() } or
	 * {@link #removeFilter(org.lunifera.ILFilter.web.vaadin.components.fields.container.IFilter) }
	 * .
	 * <p>
	 * If {@link #isApplyFiltersImmediately() } is true, this method always
	 * returns false.
	 * 
	 * @see #applyFilters()
	 * @return true if there are unapplied filters, false otherwise.
	 */
	public boolean hasUnappliedFilters();

}
