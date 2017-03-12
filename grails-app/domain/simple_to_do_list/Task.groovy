package simple_to_do_list

class Task {
    String title
    String description
    Date dueDate
    Priority priority
    Category category
    Boolean done
    Boolean favorite

    static hasMany ={subtaskList: Subtask}

    static constraints = {
        title nullable: false, blank: false, unique: false
        description nullable: true, blank: true, unique: false
        dueDate nullable: true, blank: true, unique: false
        priority nullable: true, blank: true, unique: false
        category nullable: true, blank: true, unique: false
    }
}
