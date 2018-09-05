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
    listOf(1,2,3).apply {
        println(get(0))
        println(get(1))
        println(get(2))
        println("print 10 fold")
        stream().map { it * 10}.forEach { println(it) }
        println("print Odd number")
        stream().filter{ it % 2 == 1}.forEach { println(it)}
    }
    log {
        add.name
    }
    
    log {
        add.street
    }
}