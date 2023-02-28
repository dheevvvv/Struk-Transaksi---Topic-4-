import java.text.NumberFormat
import java.util.*
import kotlin.math.absoluteValue

class Transaksi(
    private var namaPembeli: String,
    private var judulBuku:String,
    private var jumlah:Int,
    private var harga:Double,
    private var uangBayar:Double
) {
    init {
        menampilkanStruk()
    }

    private fun menampilkanStruk() {
        var total = harga*jumlah
        var bonus = " "
        val formatAngka = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        formatAngka.maximumFractionDigits = 10
        formatAngka.currency = Currency.getInstance("IDR")

        if (total in 150000.00..200000.00){
            bonus = "1 buah pena kecil"
        }
        else if (total in 200000.00..300000.00){
            bonus = "1 buah buku catatan"
        }
        else if (total > 300000.00){
            bonus = "potongan sebesar Rp50.000,00"
            total-=50000.00
        }
        val kembalian = (uangBayar-total).absoluteValue


        if (uangBayar < total) {
            println("TRANSAKSI GAGAL MAAF UANG YANG DIBAYARKAN KURANG SEBESAR $kembalian")
        }
        else{
            println("""
        |   ---------------------------------------------------------
        |   STRUK PEMBELIAN BUKU TOKO AND5
        |   ---------------------------------------------------------
        """.trimMargin())

            println("Nama Pembeli : $namaPembeli")
            println("Judul Buku : $judulBuku")
            println("Jumlah Buku : $jumlah")
            println("Harga Buku: ${formatAngka.format(harga)}")
            println("Total : ${formatAngka.format(total)}")
            println("Uang bayar : ${formatAngka.format(uangBayar)}")
            println("Kembalian : ${formatAngka.format(kembalian)} ")
            println("Bonus : $bonus ")

            println("""
        |   ------------------TERIMAKASIH---------------
        |                   TOKO BUKU AND5
        |   ==============================================
        """.trimMargin())

        }
    }
}