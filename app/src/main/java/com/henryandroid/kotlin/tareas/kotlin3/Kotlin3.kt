package com.henryandroid.kotlin.tareas.kotlin3

class Kotlin3 {
    
    // 1. Herencia y polimorfismo básicos
    open class Animal(val name: String) {
        open fun makeSound() {
            // TODO: Imprimir "El animal hace un sonido"
        }
    }

    class Dog(name: String) : Animal(name) {
        override fun makeSound() {
            // TODO: Imprimir "$name ladra"
        }
    }

    // 2. Colecciones en Kotlin
    fun collectionOperations() {
        val numbers = mutableListOf(1, 2, 3, 4, 5)
        // TODO: Agregar el número 6 a la lista
        // TODO: Remover el número 2 de la lista
        // TODO: Usar map para duplicar los valores
        // TODO: Usar filter para obtener solo los números impares
    }

    // 3. Clases de datos y destructuración
    data class Person(val name: String, val age: Int)
    
    fun dataClassExample() {
        val person1 = Person("Juan", 30)
        // TODO: Crear una copia de person1 con otro nombre
        // TODO: Comparar person1 con su copia
        // TODO: Usar destructuración para obtener name y age
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