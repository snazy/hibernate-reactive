/* Hibernate, Relational Persistence for Idiomatic Java
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 * Copyright: Red Hat Inc. and Hibernate Authors
 */
package org.hibernate.reactive.session;

import org.hibernate.Incubating;
import org.hibernate.reactive.pool.ReactiveConnection;

/**
 * A source of {@link ReactiveConnection}s.
 */
@Incubating
public interface ReactiveConnectionSupplier {
    ReactiveConnection getReactiveConnection();
}