def buildApp() {
    echo 'Building the application.'
        bat 'mvn -B -DskipTests clean package'
}

def testApp() {
    echo 'Building the application.'
        bat 'mvn test'
}


def deployApp() {
    echo 'Building the application.'
        bat 'mvn deploy'
}

return this
