job('FirstMaven-DSL'){
    descreption("frist maven dsl on ${new Date()}")
    scm {
        git("https://github.com/abduallahii/Jenkins_Upgradev3.git",master)
    }
    triggrs {
        scm('* * * * *')
    }
    steps {
        maven('clean package','maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}
