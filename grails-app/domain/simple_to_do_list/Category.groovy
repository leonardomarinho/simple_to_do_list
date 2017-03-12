package simple_to_do_list

class Category {
    String name
    
    static constraints = {
        name nullable: false
    }
}
