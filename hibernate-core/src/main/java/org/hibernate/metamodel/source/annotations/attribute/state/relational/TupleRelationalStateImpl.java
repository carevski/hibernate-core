/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2011, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.metamodel.source.annotations.attribute.state.relational;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.metamodel.relational.state.SimpleValueRelationalState;
import org.hibernate.metamodel.relational.state.TupleRelationalState;

/**
 * @author Hardy Ferentschik
 */
public class TupleRelationalStateImpl implements TupleRelationalState {
	List<SimpleValueRelationalState> valueStates = new ArrayList<SimpleValueRelationalState>();

	public void addValueState(SimpleValueRelationalState state) {
		valueStates.add( state );
	}

	@Override
	public List<SimpleValueRelationalState> getRelationalStates() {
		return valueStates;
	}
}


