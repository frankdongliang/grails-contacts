package sample.contact

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_SUPERVISOR'])
class SuController {

	@Secured(['ROLE_USER'])
	def exitUser() {}

	def switchUser() {}
}
