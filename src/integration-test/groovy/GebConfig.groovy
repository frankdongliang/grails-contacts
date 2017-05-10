// See: http://www.gebish.org/manual/current/configuration.html

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities

import geb.report.ReportState
import geb.report.Reporter
import geb.report.ReportingListener

// Refer to http://guides.grails.org/grails-geb-multiple-browsers/guide/index.html for example on how to run the test.
environments {

	// run as 'grails -Dgeb.env=phantomjs test-app'
	// See: http://code.google.com/p/selenium/wiki/HtmlUnitDriver
	htmlunit {
		driver = { new PhantomJSDriver(new DesiredCapabilities()) }
	}

	// run as 'grails -Dgeb.env=chrome test-app'
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	// run as 'grails -Dgeb.env=firefox test-app'
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = { new FirefoxDriver() }
	}
}
