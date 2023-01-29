fun main() {
//    val titular: String = "Mario"
//    val numeroConta: Int = 6938539
//    var saldo: Double = 15000.0
//    podeSacar(saldo)
//    println("Bem-vindo, $titular!")
//    println("Seu saldo é de R$ $saldo.")
    val conta = Conta("Mario", 6938539)
    conta.depositar(15000.0)
//    conta.titular = "Mario"
//    conta.numero = 6938539
//    conta.saldo = 15000.00

    val conta2 = Conta("Renata", 23514)
    conta2.depositar(35000.0)
    println("Olá, ${conta.titular}. O saldo de sua conta é de R$ ${conta.saldo}")
    println()

    conta.depositar(500.0)
    conta.sacar(100.0)
    conta2.depositar(20000.0)
    var deposito = conta.transferir(10000.0, conta2)
    deposito = conta2.transferir(500.0, conta)

    println("Você recebeu um depósito de $deposito. Seu saldo é de ${conta2.saldo}")

    val carro = Car("Onix", "LT")

    println("${carro.id}  ${carro.type}")
}


class Conta(var titular: String, var numero: Int) {
    var saldo: Double = 0.0
    private set
    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
        println("Olá, $titular. Depósito realizado com sucesso. Novo saldo é de $saldo")
        println()
    }

    fun sacar(valor: Double) {
        if (saldo > 0) {
            this.saldo -= valor
        }
        println("Olá, $titular. Saque realizado com sucesso. Novo saldo é de $saldo")
        println()
    }

    fun transferir(valor: Double, destino: Conta): Double {
        if (saldo > 0) {
            this.saldo -= valor
            destino.depositar(valor)
        }
        println("Olá, $titular. Transferência realizada com sucesso. Novo saldo é de $saldo")
        println()

        val deposito: Double = valor
        return deposito
    }

}

class Car {
    val id: String
    val type: String

    constructor(id: String, type: String) {
        this.id = id
        this.type = type
    }
}

fun podeSacar(saldo: Double) {
    if (saldo > 0) {
        println("Saldo de R$ $saldo. Pode sacar.")
    } else
        println("Saldo insuficiente.")
    println()
}

fun forTest() {
    for (i in 1..5) {
        val titular = "Mario $i"
        val numeroConta = 1000 + i
        val saldo = i + 10.0

        println(saldo)
        println()
    }

    for (i in 5 downTo 1 step 2) {
        val titular = "Mario $i"
        val numeroConta = 1000 + i
        val saldo = i + 10.0

        println(saldo)
        println()
    }

}

fun whileTest() {
    var saldo: Double = 15000.0
    while (saldo > 0) {
        println("Saldo positivo: $saldo")
        saldo -= 200.0
        if (saldo == 0.0) {
            println("Seu saldo é $saldo. Se fodeu.")
        }
    }
    println()
}
