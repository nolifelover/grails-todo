package todo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Todo)
class TodoSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test subject must greater than 5 character"() {
      when: 'subject less than 5 character'
      def todo = new Todo(subject:"hell")
      then: 'validate should fail'
      !todo.validate()
    }
}
