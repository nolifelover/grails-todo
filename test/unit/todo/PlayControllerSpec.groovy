package todo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PlayController)
class PlayControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test index"() {
      when:
      controller.index()
      then:
      response.text == "Hello World"
    }

    void "test hello"(){
      when:
      params.format = "json"
      controller.hello()

      then:
      response.json.message == "Hello World json"
    }
}
