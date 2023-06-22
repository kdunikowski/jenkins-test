#!/usr/bin/env groovy

def call(String message) {
   //if debug on - log - otherwise not
	//example: if (env.debugLevel = 'debug')
    echo 'DEBUG: ' + message + ''
}