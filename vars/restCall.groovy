#!/usr/bin/env groovy
def call(String message) {
    def postmanPost = new URL('https://postman-echo.com/post')
    def postConnection = postmanPost.openConnection()
    def form = "param1=This is request parameter."
    postConnection.doOutput = true
    def text
    postConnection.with {
        outputStream.withWriter { outputStreamWriter ->
            outputStreamWriter << form
        }
        text = content.text
    }
    echo 'INFO: 'postConnection.responseCode
}
