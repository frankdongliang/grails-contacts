grails.plugin.springsecurity.userLookup.userDomainClassName = 'sample.contact.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'sample.contact.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'sample.contact.auth.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/dbconsole/**', access: ['permitAll']],
		[pattern: '/console/**', access: ['permitAll']],
		[pattern: '/static/console/**', access: ['permitAll']],
		[pattern: '/', access: ['permitAll']],
		[pattern: '/error', access: ['permitAll']],
		[pattern: '/index', access: ['permitAll']],
		[pattern: '/index.gsp', access: ['permitAll']],
		[pattern: '/shutdown', access: ['permitAll']],
		[pattern: '/assets/**', access: ['permitAll']],
		[pattern: '/**/js/**', access: ['permitAll']],
		[pattern: '/**/css/**', access: ['permitAll']],
		[pattern: '/**/images/**', access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],

		[pattern: '/login/impersonate', access: ['ROLE_SUPERVISOR']],
		[pattern: '/logout/impersonate', access: ['permitAll']]
]

grails.plugin.springsecurity.useSwitchUserFilter = true
grails.plugin.springsecurity.switchUser.targetUrl = '/secure/'
grails.plugin.springsecurity.adh.errorPage = null // to trigger a 403

grails.resources.pattern = '/**' // refer to http://plugins.grails.org/plugin/sheehan/console