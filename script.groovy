def buildApp() {
    echo 'Building the application.'
    echo "Building version ${NEW_VERSION}"
    bat 'mvn -B -DskipTests clean package'
}

def testApp() {
    echo 'Building the application.'
    echo "Building version ${NEW_VERSION}"
    bat 'mvn test'
}


def deployApp() {
    echo 'Building the application.'
    echo "Building version ${NEW_VERSION}"
    bat 'mvn deploy'
}

return this
