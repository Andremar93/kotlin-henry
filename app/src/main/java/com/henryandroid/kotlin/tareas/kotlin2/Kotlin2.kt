package com.henryandroid.kotlin.tareas.kotlin2

import com.henryandroid.kotlin.tareas.kotlin2.Kotlin2.Persona
import com.henryandroid.kotlin.tareas.kotlin2.Kotlin2.Car as Car1

class Kotlin2 {
    
    // 1. Declaración y uso de funciones básicas
    fun greet(name: String) {
        println("Hola $name")
        // TODO: Imprimir "Hola, {name}!" usando println
    }

    fun add(a: Int, b: Int): Int {
        // TODO: Retornar la suma de a y b
        return a + b
    }

    // 2. Funciones inline y de una sola expresión
    inline fun multiply(a: Int, b: Int) = a * b
    
    fun square(n: Int) = n * n // TODO: Convertir esta función a una expresión de una sola línea

    // 3. Introducción a lambdas y funciones de orden superior
    fun lambdaExample() {
        val numbers = listOf(1, 2, 3, 4, 5)
        // TODO: Usar map para duplicar los valores de numbers y almacenarlo en una nueva lista
        val doubledNumbers = numbers.map{number-> number * 2};
        // TODO: Usar filter para obtener solo los números pares
        val pares = numbers.filter { number-> number % 2 == 0 }
        println("Doubled $doubledNumbers")
        println("Pares $pares")

    }

    // 4. Clases y objetos
    class Person(private val name: String, private var age: Int) {
        // TODO: Agregar un método que imprima "Soy {name} y tengo {age} años"

        fun showMessage(){
            println("Soy $name y tengo $age años")
        }
    }

    // 5. Constructores y datos encapsulados
    class Car(val brand: String, val model: String, val year: Int) {
        init {
            println("Auto creado: $brand $model del año $year")
            // TODO: Imprimir "Auto creado: {brand} {model} del año {year}"
        }
    }

    class Persona(private val nombre : String, val apellido: String, var edad : Int) {
        private var hobby: String = "No tiene"
        private var ocupacion: String  = "No especificada"
        private var esMayor: Boolean = false
        init {
            if(edad > 18){
                esMayor = true
            }
        }

        constructor(nombre:String, apellido: String, edad: Int, hobby: String): this(nombre,apellido,edad){ this.hobby = hobby }

        fun obtenerNombre() : String = nombre
        fun obtenerOcupacion() : String = ocupacion

        fun setOcupacion(nuevaOcupacion : String){
            if(nuevaOcupacion.isNotBlank()) ocupacion = nuevaOcupacion
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
        // TODO: Llamar al método que imprime la información de la persona

        val car = Car1("Toyota", "Corolla", 2022)

        // HOMEWORK 5
        val persona = Persona("andrea", "martinez", 31)
        val personConstructor = Persona("rafael", "quijada", 31,  "padel")
        println(persona.obtenerNombre())
        personConstructor.setOcupacion("Desarrollador")
        println( personConstructor.obtenerOcupacion())
        println(persona.obtenerOcupacion())
    }
}

fun main() {
    val kotlin2 = Kotlin2()
    kotlin2.greet("Gaston")
    println("Suma: ${kotlin2.add(3, 5)}")
    println("Multiplicación: ${kotlin2.multiply(4, 2)}")
    println("Cuadrado: ${kotlin2.square(6)}")
    kotlin2.lambdaExample()

    val person = Kotlin2.Person("Juan", 30)
    person.showMessage()

    val car = Kotlin2.Car("Toyota", "Corolla", 2022)


    val persona = Persona("andrea", "martinez", 31)
    val personConstructor = Persona("rafael", "quijada", 31,  "padel")
    println(persona.obtenerNombre())
    personConstructor.setOcupacion("Desarrollador")
    println( personConstructor.obtenerOcupacion())
    println(persona.obtenerOcupacion())
}
