package com.example.tugas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas.databinding.ActivityMainBinding
import com.example.tugas.databinding.ActivityTugas4Binding

class Tugas4Activity : ComponentActivity() {
    private lateinit var binding: ActivityTugas4Binding
    private lateinit var planetRecyclerView: RecyclerView
    private lateinit var planetAdapter: MyAdapterActivity
    private lateinit var listplanet: ArrayList<ItemdataActivity>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas4)
        binding = ActivityTugas4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iVback.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


        planetRecyclerView = findViewById(R.id.PlanetRV)
        listplanet = ArrayList()

        listplanet.add(ItemdataActivity(R.drawable.sun, nama = "SUN", desc = "The Sun is a massive ball of hot gas at the center of the solar system, mostly made of hydrogen and helium. It produces energy through nuclear fusion, giving light and heat to all the planets."))
        listplanet.add(ItemdataActivity(R.drawable.mercury, nama = "MERCURY", desc = "Mercury is the smallest and closest planet to the Sun with no atmosphere to trap heat. It has extreme temperatures between day and night."))
        listplanet.add(ItemdataActivity(R.drawable.venus, nama = "VENUS", desc = "Venus is similar in size to Earth but has a thick atmosphere of carbon dioxide that traps heat. It’s the hottest planet and rotates in the opposite direction."))
        listplanet.add(ItemdataActivity(R.drawable.earth, nama = "EARTH", desc = "Earth is the only planet known to support life with a perfect mix of water, atmosphere, and temperature. It has one natural satellite, the Moon."))
        listplanet.add(ItemdataActivity(R.drawable.mars, nama = "MARS", desc = "Mars is known as the Red Planet due to its iron-rich soil. Scientists believe it may have had water and possibly life in the past."))
        listplanet.add(ItemdataActivity(R.drawable.jupiter, nama = "JUPITER", desc = "Jupiter is the largest planet, a gas giant with a massive storm called the Great Red Spot. It has over 90 moons, including the largest one, Ganymede."))
        listplanet.add(ItemdataActivity(R.drawable.saturn, nama = "SATURN", desc = "Saturn is famous for its beautiful rings made of ice and rock. It has over 100 moons, and Titan is the largest."))
        listplanet.add(ItemdataActivity(R.drawable.uranus, nama = "URANUS", desc = "Uranus spins on its side and has a pale blue color due to methane gas. It’s an ice giant with very cold temperatures."))
        listplanet.add(ItemdataActivity(R.drawable.neptun, nama = "NEPTUN", desc = "Neptune is the farthest planet from the Sun and has the strongest winds in the solar system. It has a deep blue color and dark storms."))

        planetRecyclerView.layoutManager = LinearLayoutManager(this)
        planetRecyclerView.setHasFixedSize(true)
        planetAdapter = MyAdapterActivity(listplanet)
        planetRecyclerView.adapter = planetAdapter

    }
}