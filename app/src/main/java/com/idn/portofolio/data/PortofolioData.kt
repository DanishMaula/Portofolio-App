package com.idn.portofolio.data

import com.idn.portofolio.R


object PortofolioData {
    private val title = arrayOf(
        "chat app",
        "travel app",
        "contact app",
        "food app",
        "Event Organized App",
        "Daily Profile App",
        "Petshop App",
        "Family Plan App",
        "Task manager App",
        "Office automation App"

    )

    private val poster = intArrayOf(
        R.drawable.chat,
        R.drawable.travel,
        R.drawable.phoneapp,
        R.drawable.food,
        R.drawable.event,
        R.drawable.dailyprofile,
        R.drawable.petshop,
        R.drawable.familyplan,
        R.drawable.taskmanager,
        R.drawable.office,
    )

    private val link = arrayOf(
        "https://search.muz.li/nMu5MmY5YTM4",
        "https://pin.muz.tt/77qUd27",
        "https://pin.muz.it/2RdMJ7Y",
        "https://pin.muz.it/2LhIJHX",
        "https://pin.muz.it/B8Zq5fV",
        "https://pin.muz.it/6JUvToT",
        "https://pin.muz.it/3tWyoXW",
        "https://pin.muz.it/6xnCZEw",
        "https://pin.muz.it/7pn0qvu",

    )
    val listAppAndroid: ArrayList<Portofolio>
        get() {
            val list = arrayListOf<Portofolio>()
            for (position in title.indices){
                val android = Portofolio()
                android.title = title[position]
                android.image = poster[position]
                android.link = link[position]
                list.add(android)
            }
            return list
        }
    private val titleExperience = arrayOf(
        "Android Associated Developeer",
        "Android Pemula",
        "Memulai Program Bahasa Kotlin",
        "Memulai Program Bahasa Phyton",
        "Solid Principle"

    )

    private val detailExperience = arrayOf(
        "Sertifikat ini merupakan sertifikat yang diterapkan langsung oleh Google untuk developer Android",
        "Android pemula merupakan course yang diadakan oleh dicoding untuk memulai belajar program Android",
        "memulai program bahasa kotlin merupan course yang bertujuan untuk mempelajari bahasa Kotlin",
        "memulai program bahasa kotlin merupan course yang bertujuan untuk mempelajari bahasa Phyton",
        "mempelajari tentang oop,clean code, dll"

    )

    private val imageExperience = intArrayOf(
        R.drawable.aad,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert,
        R.drawable.solidcert

    )

    val listDataExperience:ArrayList<Portofolio>
    get() {
        val list = arrayListOf<Portofolio>()
        for (position in titleExperience.indices){
            val experience = Portofolio()
            experience.title = titleExperience[position]
            experience.detail = detailExperience[position]
            experience.image = imageExperience[position]
            list.add(experience)
        }
        return list
    }


}
