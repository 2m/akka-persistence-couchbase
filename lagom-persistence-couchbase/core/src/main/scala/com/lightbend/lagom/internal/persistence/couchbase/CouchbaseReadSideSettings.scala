/*
 * Copyright (C) 2016-2018 Lightbend Inc. <https://www.lightbend.com>
 */

package com.lightbend.lagom.internal.persistence.couchbase

import javax.inject.Inject
import akka.actor.ActorSystem

/**
 * Internal API
 */
private[lagom] class CouchbaseReadSideSettings @Inject() (system: ActorSystem) {
  private val couchbaseConfig = system.settings.config.getConfig("lagom.persistence.read-side.couchbase")

}
