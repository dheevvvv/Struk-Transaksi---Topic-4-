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
        if (total in 150.000..200.000){
            bonus = "1 buah pena kecil"
        }
        else if (total in 200.000..300.000){
            bonus = "1 buah buku catatan"
        }
        else if (total > 300.000){
            bonus = "potongan sebesar 50.000"
            total-=50.000
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
            println("Harga Buku: $harga")
            println("Total : $total")
            println("Uang bayar : $uangBayar")
            println("Kembalian : $kembalian ")
            println("Bonus : $bonus ")

            println("""
        |   ------------------TERIMAKASIH---------------
        |                   TOKO BUKU AND5
        |   ==============================================
        """.trimMargin())

        }
    }
}