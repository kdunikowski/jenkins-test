#!/usr/bin/env groovy

def call(def steps, String subject = 'testSubject', String mailBody = 'test Mail', String recipients = 'rafal.kalinowski@ttpsc.pl') {
	steps.echo 'Sending mail:'
	steps.echo 'Subject :[' + subject + ']'
	steps.echo 'Body :[' + mailBody + ']'
	steps.echo 'Recipients :[' + recipients + ']'
	steps.emailext body: '' + mailBody, subject: '' + subject, to: '' + recipients
}