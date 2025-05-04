package com.henryandroid.kotlin.soluciones

class Kotlin2Soluciones {
    
    // 1. Declaración y uso de funciones básicas
    fun greet(name: String) {
        println("Hola, $name!")
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // 2. Funciones inline y de una sola expresión
    inline fun multiply(a: Int, b: Int) = a * b
    
    fun square(n: Int) = n * n
    
    // 3. Introducción a lambdas y funciones de orden superior
    fun lambdaExample() {
        val numbers = listOf(1, 2, 3, 4, 5)
        val doubled = numbers.map { it * 2 }
        val evens = numbers.filter { it % 2 == 0 }
        println("Doblados: $doubled")
        println("Pares: $evens")
    }

    // 4. Clases y objetos
    class Person(private val name: String, private var age: Int) {
        fun introduce() {
            println("Soy $name y tengo $age años")
        }
    }

    // 5. Constructores y datos encapsulados
    class Car(val brand: String, val model: String, val year: Int) {
        init {
            println("Auto creado: $brand $model del año $year")
        }
    }
    
    fun main() {
        // Llamar a las funciones de prueba
        greet("Gaston")
        println("Suma: ${add(3, 5)}")
        println("Multiplicación: ${multiply(4, 2)}")
        println("Cuadrado: ${square(6)}")
        lambdaExample()

        // Creación de objetos y uso de clases
        val person = Person("Juan", 30)
        person.introduce()
        
        val car = Car("Toyota", "Corolla", 2022)
    }
}