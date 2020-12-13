
/**
 * Determines the current maven version of the project
 *
 * Usage: mvnVersion()
 *
 * @param body
 */

def call(body) {

    if (body != null) {
        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()
    }

    File f = new File("${env.workspace}/pom.xml")
    def xmlSlurper = new XmlSlurper()
    def pom = xmlSlurper.parse(f)

    println("Version = " + pom.version)

}
