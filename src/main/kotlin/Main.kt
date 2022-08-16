abstract class Car(val model:String, val color: String,val speed:Int):Priceable {
    abstract fun getFuelType()
}
class BMW( model:String,  color: String, speed:Int):Car(model,color,speed) {
    override fun getFuelType() {
        println("Fuel is gasoline.")
    }

    override fun printPrice() {
        println("It cost $100000")
    }
}
class Tesla( model:String,  color: String, speed:Int):Car(model,color,speed) {
    override fun getFuelType() {
        println("Fuel is electricity.")
    }
    override fun printPrice() {
        println("It cost $10000000000")
    }
}
interface Priceable {
    fun printPrice()
}

fun main(args: Array<String>) {
    var car1:Car=BMW("2020","White",220)
    var car2:Car=Tesla("2022","Red",300)
    car1.getFuelType()
    car2.getFuelType()

    car1.printPrice()
    car2.printPrice()








}