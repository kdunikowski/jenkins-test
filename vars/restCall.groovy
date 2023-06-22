#!/usr/bin/env groovy
def call(String message) {
    def postmanPost = new URL('https://postman-echo.com/post')
    def postConnection = postmanPost.openConnection()
    postConnection.requestMethod = 'POST'
    def form = "param1=This is request parameter."
    postConnection.doOutput = true
    echo 'INFO: 'postConnection.responseCode
    echo 'INFO': 'postConnection
}
