package code.example

public class Address { 
  public var name: String? = ""
  public var street: String? = ""
  public var city: String? = ""
  public var state: String? = ""
  public var zip: String? = ""
}

public inline fun <T> T.apply(block: T.() -> Unit): T { block(); return this }

fun log(f: () -> String?) {
    println (f())
}
fun main(args: Array<String>) {
    log {
        "Hello"
    }
    var add = Address()
    add.apply {
        name = "test"
        street = "street"
    }

    log {
        add.name
    }
    
    log {
        add.street
    }
}