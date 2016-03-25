package todo

class Todo {
    String subject
    Date dueDate
    Integer priority = 1
    //Adding field
    String description
    static constraints = {
      subject nullable:false, blank:false, size: 5..200
      dueDate nullable:false
      priority nullable:false
      description nullable:true, size:0..1000
    }
}
