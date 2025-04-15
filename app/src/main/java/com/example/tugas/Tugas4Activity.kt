package com.example.tugas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas.databinding.ActivityTugas4Binding

class Tugas4Activity : ComponentActivity() {
    private lateinit var binding: ActivityTugas4Binding
    private lateinit var listplanetRecyclerView: RecyclerView
    private lateinit var listplanetAdapter: MyAdapterActivity
    private lateinit var listplanet: ArrayList<ItemDataActivity>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas4Binding.inflate(layoutInflater)
        setContentView(binding.root)


        listplanetRecyclerView = findViewById(R.id.PlanetRV)
        listplanet = ArrayList()

        listplanet.add(
            ItemDataActivity(
                R.drawable.sun,
                "SUN",
                "Center star of the Solar System",
                "The Sun is a massive, glowing ball of gas that serves as the heart of our Solar System. Classified as a G-type main-sequence star (G2V), it is located about 150 million kilometers (93 million miles) from Earth. With a diameter of approximately 1.39 million kilometers, it contains 99.86% of the total mass of the Solar System. The Sun is primarily composed of hydrogen (about 74%) and helium (about 24%), with trace amounts of heavier elements. Through a process called nuclear fusion, hydrogen atoms in its core are fused into helium, releasing vast amounts of energy in the form of light and heat. This energy radiates outward, sustaining life on Earth and driving the climate and weather patterns of the entire Solar System. The Sun has several layers, including the core, radiative zone, convective zone, photosphere (its visible surface), chromosphere, and corona. The solar wind—a stream of charged particles emitted from the corona—extends far beyond the planets, forming the heliosphere."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.mercury,
                "MERCURY",
                "Smallest and closest planet",
                "Mercury is the closest planet to the Sun and the smallest of the eight planets in our Solar System, with a diameter of only 4,880 kilometers. Because of its proximity to the Sun, it experiences some of the most extreme temperature fluctuations of any planet. Daytime temperatures can soar to around 427°C (800°F), while nighttime temperatures plunge to -173°C (-280°F) due to its thin atmosphere, which cannot retain heat. Mercury has almost no atmosphere to speak of—what exists is an exosphere, made up of atoms blasted off its surface by solar wind and micrometeoroids. Its surface is rocky and covered with craters, making it look similar to the Moon. Mercury has no moons and no rings. It orbits the Sun in just 88 Earth days, the shortest orbit of any planet, but it rotates very slowly—one day on Mercury (sunrise to sunrise) lasts about 176 Earth days. Despite its proximity to the Sun, it is not the hottest planet (that title belongs to Venus)."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.venus,
                "VENUS",
                "Hottest rocky planet",
                "Venus, the second planet from the Sun, is often called Earth’s \"sister planet\" due to its similar size and mass—its diameter is about 12,104 kilometers. However, the similarities end there. Venus is enveloped in a thick atmosphere composed mainly of carbon dioxide, with clouds of sulfuric acid, creating a runaway greenhouse effect that traps heat. As a result, Venus is the hottest planet in the Solar System, with surface temperatures averaging around 464°C (867°F). The atmospheric pressure on the surface is about 92 times that of Earth’s, equivalent to being nearly 1 km (0.6 miles) underwater on Earth. The surface is rocky, volcanic, and completely hidden from view due to the dense cloud cover. It rotates extremely slowly and in the opposite direction of most planets, with one day lasting about 243 Earth days—longer than its year (225 Earth days). Venus has no moons or rings, and its hostile environment makes it one of the most challenging planets to explore."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.earth,
                "EARTH",
                "Only planet with life",
                "Earth is the third planet from the Sun and the only known world in the universe to support life. It has a diameter of about 12,742 kilometers and a diverse environment that includes vast oceans, continents, an atmosphere, and a magnetic field. Earth's atmosphere is composed primarily of nitrogen (78%) and oxygen (21%), which are essential for life as we know it. About 71% of Earth’s surface is covered with water, and it has a wide range of climates and ecosystems. Earth’s magnetic field, generated by movements in its liquid iron core, protects the planet from harmful solar radiation. Earth has one natural satellite, the Moon, which helps regulate the planet’s tides and stabilizes its axial tilt. The Earth orbits the Sun once every 365.25 days, leading to the cycle of seasons. Its rotation period is approximately 24 hours, giving us day and night. Earth remains the only place in the cosmos where life is confirmed to exist."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.mars,
                "MARS",
                "Red, Earth-like planet",
                "Mars, the fourth planet from the Sun, is often referred to as the \"Red Planet\" because of its reddish appearance caused by iron oxide (rust) on its surface. It has a diameter of about 6,779 kilometers, making it roughly half the size of Earth. Mars has a thin atmosphere composed mostly of carbon dioxide, with traces of nitrogen and argon, and surface temperatures average around -63°C (-81°F), though they can vary widely depending on location and time. The planet is home to the tallest volcano in the Solar System, Olympus Mons, and the largest canyon, Valles Marineris. Mars has polar ice caps made of water and carbon dioxide, and evidence suggests it once had flowing water and perhaps a thicker atmosphere. These signs of ancient habitability make it a prime target for exploration. Mars has two small moons, Phobos and Deimos, which are likely captured asteroids. Several robotic missions, such as NASA’s Perseverance rover, are currently studying the planet’s surface and climate."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.jupiter,
                "JUPITER",
                "Largest gas giant",
                "Jupiter is the fifth planet from the Sun and by far the largest in the Solar System, with a staggering diameter of about 139,820 kilometers—more than 11 times that of Earth. This gas giant is mostly made of hydrogen and helium, and it lacks a solid surface. Its most iconic feature is the Great Red Spot, a massive, persistent storm system larger than Earth that has raged for at least 350 years. Jupiter’s atmosphere is marked by colorful bands and swirls, driven by strong winds and rapid rotation (a day on Jupiter lasts about 10 Earth hours). Jupiter has a powerful magnetic field and at least 95 confirmed moons, including Ganymede, the largest moon in the Solar System, which is even bigger than Mercury. The planet also has a faint ring system. Jupiter’s immense gravitational influence helps shape the orbits of other objects in the Solar System, acting as a kind of cosmic shield."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.saturn,
                "SATURN",
                "Ringed gas giant",
                "Saturn is the sixth planet from the Sun and the second-largest, with a diameter of around 116,460 kilometers. It is a gas giant like Jupiter, primarily composed of hydrogen and helium, and it has a low density—so low that it would float in water if a body of water large enough existed. Saturn is famous for its stunning system of rings, which are made up of billions of particles of ice and rock ranging in size from dust to boulders. These rings are divided into several main parts and extend thousands of kilometers from the planet’s surface. Saturn also has a complex system of moons—over 80 known—with Titan being the largest. Titan is of particular interest because it has a thick atmosphere and lakes of liquid methane. Saturn’s day lasts about 10.7 Earth hours, and it completes an orbit around the Sun every 29.5 Earth years. Despite its serene appearance, Saturn’s atmosphere contains fierce storms and high-speed winds."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.uranus,
                "URANUS",
                "Tilted, icy blue planet",
                "Uranus is the seventh planet from the Sun and an ice giant, with a diameter of about 50,724 kilometers. Unlike the gas giants Jupiter and Saturn, Uranus contains more “ices” such as water, ammonia, and methane. This gives it a bluish-green color due to the absorption of red light by methane in the upper atmosphere. Uranus is unique in that it rotates on its side, with an axial tilt of about 98 degrees, likely caused by a massive collision early in its history. This extreme tilt leads to unusual seasons that last over 20 Earth years each. The planet’s atmosphere is very cold, with average temperatures around -224°C (-371°F), making it the coldest planet in the Solar System. Uranus has a faint ring system and at least 27 known moons, named after characters from the works of Shakespeare and Alexander Pope. Its internal heat is minimal, which adds to the mystery of its atmospheric behavior."
            )
        )
        listplanet.add(
            ItemDataActivity(
                R.drawable.neptun,
                "NEPTUNE",
                "Farthest, windy blue planet",
                "Neptune, the eighth and farthest known planet from the Sun, is another ice giant with a diameter of about 49,244 kilometers. Like Uranus, it has a deep blue color due to methane in its atmosphere, but it appears darker and more vivid. Neptune is known for its incredibly strong winds, which can exceed 2,000 kilometers per hour (1,200 miles per hour)—the fastest in the Solar System. Its atmosphere also features giant storms, including the now-vanished Great Dark Spot observed by Voyager 2 in 1989. Neptune orbits the Sun every 165 Earth years and has a rotation period of about 16 hours. It has 14 known moons, the largest being Triton, which orbits the planet in a retrograde direction and may have been a captured dwarf planet. Neptune also has a faint ring system made of dust particles. Despite its great distance from Earth, Neptune continues to fascinate scientists with its dynamic weather and mysterious interior."
            )
        )

        listplanetRecyclerView.layoutManager = LinearLayoutManager(this)
        listplanetRecyclerView.setHasFixedSize(true)
        listplanetAdapter = MyAdapterActivity(listplanet)
        listplanetRecyclerView.adapter = listplanetAdapter

        listplanetAdapter.onItemClick = { item ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("itemDetail", item)
            startActivity(intent)
        }
    }
}