addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.0.0") // for maintenance of copyright file header
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2") // sources autoformat

// whitesource for tracking licenses and vulnerabilities in dependencies
addSbtPlugin("com.lightbend" % "sbt-whitesource" % "0.1.13")

// pull in scala versions from the travis config and more
//TODO: commented it out because it causes the issue: Unresolved dependency `copy-of-lagom-persistence-test`
//addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.1.3")