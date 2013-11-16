scriptedSettings

scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
  a => Seq("-Xmx", "-Xms", "-XX").exists(a.startsWith)
)

scriptedBufferLog := false

resolvers += Classpaths.typesafeReleases

