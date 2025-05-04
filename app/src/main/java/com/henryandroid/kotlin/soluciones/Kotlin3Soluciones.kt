package com.henryandroid.kotlin.soluciones

class Kotlin3Soluciones {
    
    // 1. Herencia y polimorfismo básicos
    open class Animal(val name: String) {
        open fun makeSound() {
            println("El animal hace un sonido")
        }
    }

    class Dog(name: String) : Animal(name) {
        override fun makeSound() {
            println("$name ladra")
        }
    }

    // 2. Colecciones en Kotlin
    fun collectionOperations() {
        val numbers = mutableListOf(1, 2, 3, 4, 5)
        numbers.add(6)
        numbers.remove(2)
        val doubled = numbers.map { it * 2 }
        val oddNumbers = numbers.filter { it % 2 != 0 }
        println("Lista original: $numbers")
        println("Duplicados: $doubled")
        println("Números impares: $oddNumbers")
    }

    // 3. Clases de datos y destructuración
    data class Person(val name: String, val age: Int)
    
    fun dataClassExample() {
        val person1 = Person("Juan", 30)
        val person2 = person1.copy(name = "Pedro")
        println("Person1: $person1")
        println("Person2: $person2")
        println("¿Son iguales? ${person1 == person2}")
        
        val (name, age) = person1
        println("Nombre: $name, Edad: $age")
    }
    
    fun main() {
        // Herencia y polimorfismo
        val dog = Dog("Firulais")
        dog.makeSound()
        
        // Colecciones
        collectionOperations()
        
        // Clases de datos y destructuración
        dataClassExample()
    }
}