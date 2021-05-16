fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')

    val r = readLine()!!.toFloat()

    var i = 0F


    if (r >= 0 && r <= 2000.00) {

        i = 0F

    } else if (r >= 2000.01 && r <= 3000.00) {

        val imposto8 = (r - 2000)
        i = (imposto8 / 100) * 8

    } else if (r >= 3000.01 && r <= 4500.00) {

        val imposto18 = (r - 3000)
        val imposto8 = (r - 2000) - imposto18
        i = ((imposto18 / 100) * 18) + ((imposto8 / 100) * 8)

    } else if (r > 4500.00) {

        val imposto28 = (r - 4500)
        val imposto18 = (r - 3000) - imposto28
        val imposto8 = (r - 2000) - imposto18 - imposto28
        i = ((imposto18 / 100) * 18) + ((imposto8 / 100) * 8) + ((imposto28 / 100) * 28)
    }


    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")


}