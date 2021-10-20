package software.ensemble.ensemble_light.context

import com.google.inject.*
import org.openqa.selenium.WebElement
import software.ensemble.ensemble_light.core.interfaces.UiWrapper
import software.ensemble.ensemble_light.integrations.web_driver.UiWebDriver
import software.ensemble.ensemble_light.tdo.ui.LoginPage
import software.ensemble.ensemble_light.tdo.ui.SuccessAuthPage

/**
 * UI test context class
 */
class ExampleUiContext : Module {

    /**
     * All of dependings needed for test run
     * can be defined there (TDO must be binded if it not a part of test repository)
     */
    override fun configure(binder: Binder) {
        with(binder) {
            bind(object : TypeLiteral<UiWrapper<WebElement>>() {}).toInstance(UiWebDriver())
            bind(object : TypeLiteral<LoginPage<WebElement>>() {})
            bind(object : TypeLiteral<SuccessAuthPage<WebElement>>() {})
        }
    }
}