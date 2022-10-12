import javax.swing.UIManager.get

fun main(args: Array<String>) {
    //Object Oriented Programming
    val box = Box()

    println("Height : ${box.height}")

    // function open which print
    box.open()

    // function open which print fillContents
    box.fillContents()


    box.height = 40

    println("The new height ${box.height}")

    //Kotlin Visibility Modifiers

    // public : default , can be accessed everywhere
    // private : Available only inside the containing file or class
    // protected : Some as private but available inside subclasses or child classes









}