fun main() {
    println("""
        |   ---------------------------------------------------------
        |   INPUT TRANSAKSI PENJUALAN TOKO BUKU AND5
        |   ---------------------------------------------------------
        """.trimMargin())
    print("Masukan Nama :")
    val namapembeli = readLine().toString()

    print("Masukan Judul Buku :")
    val judulBuku = readLine().toString()

    print("Masukan Jumlah Buku :")
    val jumlahBuku = readLine()!!.toInt()

    print("Masukan Harga Buku (Tanpa/Tidak Menggunakan Titik) :")
    val hargaBuku = readLine()!!.toDouble()

    print("Masukan Jumlah Uang Bayar (Tanpa/Tidak Menggunakan Titik) :")
    val uangBayar = readLine()!!.toDouble()

    val transaksi1 = Transaksi(namapembeli,judulBuku,jumlahBuku,hargaBuku,uangBayar)


}