package com.fauzan.covid.model

object HospitalData {

    private val provinceName = arrayOf(
        "1. Daftar rumah sakit rujukan COVID-19 di Aceh",
        "2. Daftar rumah sakit rujukan COVID-19 di Sumatera Utara",
        "3. Daftar rumah sakit rujukan COVID-19 di Sumatera Barat",
        "4. Daftar rumah sakit rujukan COVID-19 di Riau",
        "5. Daftar rumah sakit rujukan COVID-19 di Kepulauan Riau",
        "6. Daftar rumah sakit rujukan COVID-19 di Jambi",
        "7. Daftar rumah sakit rujukan COVID-19 di Sumatera Selatan",
        "8. Daftar rumah sakit rujukan COVID-19 di Bangka Belitung",
        "9. Daftar rumah sakit rujukan COVID-19 di Bengkulu",
        "10. Daftar rumah sakit rujukan COVID-19 di Lampung",
        "11. Daftar rumah sakit rujukan COVID-19 di DKI Jakarta",
        "12. Daftar rumah sakit rujukan COVID-19 di Jawa Barat",
        "13. Daftar rumah sakit rujukan COVID-19 di Banten",
        "14. Daftar rumah sakit rujukan COVID-19 di Jawa Tengah",
        "15. Daftar rumah sakit rujukan COVID-19 di DI Yogyakarta",
        "16. Daftar rumah sakit rujukan COVID-19 di Jawa Timur",
        "17. Daftar rumah sakit rujukan COVID-19 di Bali",
        "18. Daftar rumah sakit rujukan COVID-19 di Nusa Tenggara Barat",
        "19. Daftar rumah sakit rujukan COVID-19 di Nusa Tenggara Timur",
        "20. Daftar rumah sakit rujukan COVID-19 di Kalimantan Barat",
        "21. Daftar rumah sakit rujukan COVID-19 di Kalimantan Tengah",
        "22. Daftar rumah sakit rujukan COVID-19 di Kalimantan Selatan",
        "23. Daftar rumah sakit rujukan COVID-19 di Kalimantan Timur",
        "24. Daftar rumah sakit rujukan COVID-19 di Kalimantan Utara",
        "25. Daftar rumah sakit rujukan COVID-19 di Gorontalo",
        "26. Daftar rumah sakit rujukan COVID-19 di Sulawesi Utara",
        "27. Daftar rumah sakit rujukan COVID-19 di Sulawesi Barat",
        "28. Daftar rumah sakit rujukan COVID-19 di Sulawesi Tengah",
        "29. Daftar rumah sakit rujukan COVID-19 di Sulawesi Selatan",
        "30. Daftar rumah sakit rujukan COVID-19 di Sulawesi Tenggara",
        "31. Daftar rumah sakit rujukan COVID-19 di Maluku",
        "32. Daftar rumah sakit rujukan COVID-19 di Maluku Utara",
        "33. Daftar rumah sakit rujukan COVID-19 di Papua",
        "34. Daftar rumah sakit rujukan COVID-19 di Papua Barat"
    )

    private val hospitalName = arrayOf(
        "a. RSUD Dr Zainoel Abidin\n" +
                "b. RSU Cut Meutia",
        "a. RSUP H Adam Malik\n" +
                "b. RSU Djasamen Saragih\n" +
                "c. RSU Padang Sidempuan\n" +
                "d. RSU Kabanjahe\n" +
                "e. RSUD Tarutung",
        "a. RSUP dr M Djamil\n" +
                "b. RSU Achmad Mochtar",
        "a. RSU Arifin Achmad\n" +
                "b. RSUD Kota Dumai\n" +
                "c. RSUD Puri Husada Tembilahan",
        "a. RSUD Prov Kep Riau Tanjung Pinang\n" +
                "b. RSUD Embung Fatimah\n" +
                "c. RSUD Muhammad Sani Kab Karimun\n" +
                "d. RS Badan Pengusahaan Batam",
        "a. RSUD Raden Mattaher",
        "a. RSUP M Hoesin\n" +
                "b. RS Dr Rivai Abdullah\n" +
                "c. RSUD Siti Fatimah Prov Sumsel\n" +
                "d. RSUD Lahat\n" +
                "e. RSUD Kayuagung",
        "a. RSUD Depati Hamzah\n" +
                "b. RSUD dr H Marsidi Judono",
        "a. RSUD M Yunus Bengkulu\n" +
                "b. RSUD Arga Makmur\n" +
                "c. RSUD Hasanuddin Damrah Manna",
        "a. RSUD Dr H Abdul Moeloek\n" +
                "b. RSUD Ahmad Yani Metro\n" +
                "c. RSUD Dr H Bob Bazar, SKM\n" +
                "d. RSUD Mayjen HM Ryacudu",
        "a. RSPI Prof Dr Sulianti Saroso\n" +
                "b. RSUP Persahabatan\n" +
                "c. RSUP Fatmawati\n" +
                "d. RSUD Cengkareng\n" +
                "e. RSUD Pasar Minggu\n" +
                "f. RS Bhayangkara Tk I R Said Sukanto\n" +
                "g. RSPAD Gatot Soebroto\n" +
                "h. RSAL dr Mintoharjo",
        "a. RSUP dr Hasan Sadikin\n" +
                "b. RS Paru Dr HA Rotinsulu\n" +
                "c. RS Paru dr M Goenawan Partowidigdo\n" +
                "d. RSUD Gunung Jati Cirebon\n" +
                "e. RSUD R Syamsudin, SH Sukabumi\n" +
                "f. RSUD dr Slamet Garut\n" +
                "g. RSUD Kab Indramayu\n" +
                "h. RSU Tk II Dustira",
        "a. RSUD Kab Tangerang\n" +
                "b. RSUD dr Drajat Prawiranegara Serang",
        "a. RSUP dr Kariadi\n" +
                "b. RS dr Soeradji Tirtonegoro Klaten\n" +
                "c. RS Paru dr Ario Wirawan\n" +
                "d. RSUD Prof Dr Margono Soekarjo\n" +
                "e. RSUD dr Moewardi Surakarta\n" +
                "f. RSUD Tidar Magelang\n" +
                "g. RSUD KRMT Wongsonegoro\n" +
                "h. RSUD Kardinah Tegal\n" +
                "i. RSUD Banyumas\n" +
                "j. RSU dr Loekmonohadi\n" +
                "k. RSUD Kraton Kab Pekalongan\n" +
                "l. RSUD dr Soeselo Slawi\n" +
                "m. RSUD RAA Soewondo Kendal",
        "a. RSUP dr Sardjito\n" +
                "b. RSUD Panembahan Senopati Bantul\n" +
                "c. RSUD Kota Yogyakarta\n" +
                "d. RSUD Wates",
        "a. RSUD dr Soetomo\n" +
                "b. RSUD dr Soedono Madiun\n" +
                "c. RSUD dr Saiful Anwar\n" +
                "d. RSUD dr Soebandi Jember\n" +
                "e. RSUD Kab Kediri Pare\n" +
                "f. RSUD dr R Koesma tuban\n" +
                "g. RSUD Blambangan\n" +
                "h. RSUD Dr R Sosodoro Djatikoesoemo\n" +
                "i. RSUD Dr Iskak Tulungagung\n" +
                "j. RSUD Sidoarjo\n" +
                "k. RS Universitas Airlangga",
        "a. RSUP Sanglah\n" +
                "b. RSUD Sanjiwani Gianyar\n" +
                "c. RSUD Tabanan\n" +
                "d. RSUD Kab Buleleng",
        "a. RSUD NTB\n" +
                "b. RSUD Kota Bima\n" +
                "c. RSUD Dr R Sudjono\n" +
                "d. RSUD HL Manambai Abdul Kadir",
        "a. RSU Prof dr WZ Johannes\n" +
                "b. RSU dr TC Hillers Maumere\n" +
                "c. RSUD Komodo Labuan Bajo",
        "a. RSUD dr Soedarso Pontianak\n" +
                "b. RSUD dr Abdul Azis Singkawang\n" +
                "c. RSUD Ade Mohammad Djoen Sintang\n" +
                "d. RSUD dr Agoesdjam Ketapang",
        "a. RSUD dr Doris Sylvanus Palangkaraya\n" +
                "b. RSUD dr Murjani Sampit\n" +
                "c. RSUD Sultan Imanuddin Pangkalan Bun",
        "a. RSUD Ulin Banjarmasin\n" +
                "b. RSUD H Boejasin Pelaihari",
        "a. RSUD Abdul Wahab Sjahrani\n" +
                "b. RSUD dr Kanujoso Djatiwibowo\n" +
                "c. RSU Taman Husada Bontang\n" +
                "d. RSUD Panglima Sebaya\n" +
                "e. RSUD Aji Muhammad Parikesit",
        "a. RSU Kota Tarakan\n" +
                "b. RSUD Tanjung Selor",
        "a. RSUD Prod dr H Aloei Saboe",
        "a. RSUP Prof dr RD Kandou\n" +
                "b. RSU Ratatotok Buyat\n" +
                "c. RSUD Kota Kotamobagu\n" +
                "d. RSUD dr Sam Ratulangi",
        "a. RSUD Provinsi Sulawesi Barat",
        "a. RSUD Undata Palu\n" +
                "b. RSU Anutapura Palu\n" +
                "c. RSUD Kan Banggai Luwuk\n" +
                "d. RSU Mokopido Toli-Toli\n" +
                "e. RSUD Kolonedale",
        "a. RSUP dr Wahidin Sudirohusodo\n" +
                "b. RS Dr Tadjudin Chalid, MPH\n" +
                "c. RSUD Labuang Baji\n" +
                "d. RSU Andi Makkasau Parepare\n" +
                "e. RSU Lakipadada Toraja\n" +
                "f. RSUD Kab Sinjai\n" +
                "g. RS TK II Pelamonia",
        "a. RS Bahtera Mas Kendari",
        "a. RSUP dr J Leimena\n" +
                "b. RSU Dr M Haulussy Ambon\n" +
                "c. RSUD dr PP Magretti Saumlaki",
        "a. RSUD dr H Chasan Boesoirie",
        "a. RSU Jayapura\n" +
                "b. RSU Nabire\n" +
                "c. RSU Merauke",
        "a. RSUD Kabupaten Sorong\n" +
                "b. RSUD Manokwari"
    )

    val list: ArrayList<Hospital>
        get() {
            val list = arrayListOf<Hospital>()
            for (position in provinceName.indices) {
                val hospital = Hospital()
                hospital.province = provinceName[position]
                hospital.hospital = hospitalName[position]
                list.add(hospital)
            }
            return list
        }
}