package simple_to_do_list

class Subtask {
    String title
    Boolean done

    static belongsTo = {task: Task}

    static constraints = {
        title nullable: false
    }
}
