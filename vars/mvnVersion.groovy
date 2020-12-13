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

    File f = new File("pom.xml")
    println("File - " + f)

}
