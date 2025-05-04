package com.henryandroid.kotlin.soluciones

class Kotlin1Soluciones {

    // Solución Ejercicio 1
    fun ejercicio1() {
        val nombre: String = "Estudiante"
        var edad: Int = 25
        var direccion: String? = null
        
        println("---- Ejercicio 1 ----")
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Direccion: $direccion")
    }

    // Solución Ejercicio 2
    fun ejercicio2() {
        val numero1 = 10
        val numero2 = 5
        
        val suma = numero1 + numero2
        val multiplicacion = numero1 * numero2
        val division = numero1 / numero2
        
        println("---- Ejercicio 2 ----")
        println("Suma: $suma")
        println("Multiplicación: $multiplicacion")
        println("División: $division")
    }

    // Solución Ejercicio 3
    fun ejercicio3() {
        val a = 10
        val b = 20
        
        val comparacion1 = a < b
        val comparacion2 = a != b
        val comparacion3 = a <= b
        
        println("---- Ejercicio 3 ----")
        println("Comparaciones: $comparacion1, $comparacion2, $comparacion3")
    }

    // Solución Ejercicio 4
    fun ejercicio4(edad: Int) {
        println("---- Ejercicio 4 ----")
        if (edad < 18) {
            println("Menor de edad")
        } else if (edad <= 65) {
            println("Adulto")
        } else {
            println("Adulto mayor")
        }
    }

    // Solución Ejercicio 5
    fun ejercicio5(nota: Int) {
        println("---- Ejercicio 5 ----")
        when {
            nota in 9..10 -> println("Sobresaliente")
            nota in 7..8 -> println("Notable")
            nota in 5..6 -> println("Aprobado")
            else -> println("Suspenso")
        }
    }

    // Solución Ejercicio 6
    fun ejercicio6() {
        println("---- Ejercicio 6 ----")
        for (i in 1..5) {
            println(i)
        }
    }

    // Solución Ejercicio 7
    fun ejercicio7(texto: String?) {
        println("---- Ejercicio 7 ----")
        println(texto ?: "Texto vacío")
    }

    // Solución Ejercicio 8
    fun ejercicio8() {
        println("---- Ejercicio 8 ----")
        var numero = 1
        while (!(numero % 2 == 0 && numero % 3 == 0)) {
            numero++
        }
        println("El primer número divisible por 2 y 3 es: $numero")
    }
}

fun main() {
    val soluciones = Kotlin1Soluciones()
    soluciones.ejercicio1()
    soluciones.ejercicio2()
    soluciones.ejercicio3()
    soluciones.ejercicio4(25)
    soluciones.ejercicio5(8)
    soluciones.ejercicio6()
    soluciones.ejercicio7(null)
    soluciones.ejercicio8()
}