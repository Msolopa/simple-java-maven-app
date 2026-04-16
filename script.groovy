def buildApp() {
    echo 'Building the application.'
    echo "Building version ${NEW_VERSION}"
    bat 'mvn -B -DskipTests clean package'
}

return this
