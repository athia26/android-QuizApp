package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Siapa bapak dari Rasulullah SAW?",
            "Abdullah bin Abdul Muthalib",
            "Abdul Muthalib bin Hasyim",
            "Hamzah bin Abdul Muthalib",
            "Abu Thalib bin Abdul Muthalib",
            1)

        questionsList.add(que1)

        val que2 = Question(
            2,
            "Siapa anak pertama Rasulullah SAW?",
            "Zainab",
            "Qasim",
            "Fatimah",
            "Ummu Kultsum",
            2)

        questionsList.add(que2)

        val que3 = Question(
            3,
            "Berapa jumlah anak Rasulullah SAW?",
            "Empat",
            "Lima",
            "Enam",
            "Tujuh",
            4)

        questionsList.add(que3)

        val que4 = Question(
            4,
            "Apa julukan untuk Hamzah bin Abdul Muthalib?",
            "Pedang Yang Tajam",
            "Singa Padang Pasir",
            "Pemilik Dua Cahaya",
            "Singa Allah",
            4)

        questionsList.add(que4)

        val que5 = Question(
            5,
            "Kapan Rasulullah SAW diangkat menjadi rasul?",
            "63 tahun",
            "45 tahun",
            "40 tahun",
            "50 tahun",
            3)

        questionsList.add(que5)

        val que6 = Question(
            6,
            "Siapa salah satu Khalafaur Rasyidin diantara sahabat-sahabat Rasul di bawah ini?",
            "Abdurrahman bin Auf",
            "Utsman bin Affan",
            "Zaid bin Haritsah",
            "Anas bin Malik",
            2)

        questionsList.add(que6)

        val que7 = Question(
            7,
            "Apa wahyu yang dibawakan oleh Malaikat Jibril pertama kali kepada Rasulullah?",
            "Al-Maidah: 3",
            "Al Mudatsir: 1-7",
            "Al-Alaq: 1-5",
            "Al-Alaq: 1-15",
            3)

        questionsList.add(que7)

        val que8 = Question(
            8,
            "Dari putri manakah garis keturunan Rasulullah SAW berlanjut?",
            "Fatimah Az-Zahra",
            "Ruqayyah",
            "Ummu Kultsum",
            "Zainab",
            1)

        questionsList.add(que8)

        val que9 = Question(
            9,
            "Siapakah sahabat yang dikenal dengan sebutan Pedang Allah?",
            "Umar bin Khattab",
            "Hamzah bin Abdul Muthalib",
            "Anas bin Malik",
            "Khalid bin Walid",
            4)

        questionsList.add(que9)

        val que10 = Question(
            10,
            "Siapakah sahabat yang dikenal sebagai Al-Faruq?",
            "Anas bin Malik",
            "Khalid bin Walid",
            "Umar bin Khattab",
            "Hamzah bin Abdul Muthalib",
            3)

        questionsList.add(que10)

        return questionsList
    }
}