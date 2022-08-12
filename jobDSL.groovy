job('FirstMaven-DSL'){
    description("frist maven dsl on ${new Date()} , the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/abduallahii/Jenkins_Upgradev3.git",'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package','maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}
