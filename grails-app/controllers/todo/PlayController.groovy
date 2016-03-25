package todo
import grails.converters.*;
class PlayController {
    static defaultAction = "hello"
    def index() {
      render "Hello World"
    }

    def hello(){
      params.format = params.format ?: 'json'
      def result = [message: "Hello World ${params.format}"]
      respond result
    }

    def helloJson(){
      def result = [message: "Hello World"]
      render result as JSON
    }

    def helloXml(){
      def result = [message: "Hello World"]
      render result as XML
    }

    def helloName(){
      def name = params.name ?: "Grails"
      render "Hello ${name}"
    }
}
