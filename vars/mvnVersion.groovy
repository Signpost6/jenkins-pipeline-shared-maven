@Library('jenkins-pipeline-shared-maven@master')

/**
 * Determines the current maven version of the project
 *
 * Usage: mvnVersion()
 *
 * @param body
 */

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    File f = new File()
    println("File - " + f)

}
