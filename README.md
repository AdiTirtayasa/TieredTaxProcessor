# UTS Kelompok 2 - Tiered Tax Processor

## Deskripsi Project

Project ini merupakan aplikasi sederhana berbasis Java untuk menghitung pajak penghasilan berdasarkan sistem tarif progresif (tiered tax).
Program ini mempertimbangkan:

* Penghasilan tahunan
* Status kepemilikan NPWP
* PTKP (Penghasilan Tidak Kena Pajak)
* Tarif pajak progresif sesuai lapisan penghasilan

## Fitur Utama

* Menghitung pajak berdasarkan tarif progresif
* Mendukung perhitungan wajib pajak dengan NPWP dan non-NPWP

---

## Struktur Tarif Pajak

| Lapisan Penghasilan Kena Pajak | Tarif NPWP | Tarif Non-NPWP |
| ------------------------------ | ---------- | -------------- |
| Rp0 - Rp50.000.000             | 5%         | 6%             |
| Rp50.000.001 - Rp250.000.000   | 15%        | 18%            |
| Rp250.000.001 - Rp500.000.000  | 25%        | 30%            |
| > Rp500.000.000                | 30%        | 36%            |

## Bila menggunakan Git clone
1.buat folder kosong

2.masuk ke vs code terus buka foldernya

3.bukak terminal ketik = git clone https://github.com/AdiTirtayasa/TieredTaxProcessor.git

4.lalu di terminal tetik = cd .\TieredTaxProcessor\tax_calculator\

## Cara Menjalankan test Project
1.pastikan kalian sudah masuk ke dalam folder tertama di terminal pastikan kalina sudah berada di TieredTaxProcessor\tax_calculator
2.buat buat file baru di test/java/com/tax, dengan nama file yang yang sama dengan file yang ingin di uji/test dan berikan Test Di akhir
3.tulis test yang kalian ingin lakukan menggunakan JUnit 5
4.jalankan mvn test

## Anggota Kelompok 2

* I Komang Adi Tirtayasa
* I Nyoman Gede Arta Nugraha
* Muhammad Akmal Arifin Khalis
* Ni Komang Ayu Sinta Prameswari
* Lanny Desya Wulandari



