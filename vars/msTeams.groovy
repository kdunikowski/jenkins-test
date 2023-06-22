def call(Map config) {
    node {
        bat('echo ${config}')
    }
}