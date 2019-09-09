package mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foto1.setOnClickListener {
            val intent: Intent =
                Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto1::class.java)
            startActivity(intent)
        }

        foto2.setOnClickListener {
            val intent: Intent =
                Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto2::class.java)
            startActivity(intent)
        }

        foto3.setOnClickListener {
            val intent: Intent =
                Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto3::class.java)
            startActivity(intent)
        }

        foto4.setOnClickListener {
            val intent: Intent =
                Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto4::class.java)
            startActivity(intent)
        }

       foto5.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto5::class.java)
            startActivity(intent)
        }

        foto6.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto6::class.java)
            startActivity(intent)
        }

        foto7.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto7::class.java)
            startActivity(intent)
        }

        foto8.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto8::class.java)
            startActivity(intent)
        }

        foto9.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto9::class.java)
            startActivity(intent)
        }

        foto10.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto10::class.java)
            startActivity(intent)
        }

        foto11.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto11::class.java)
            startActivity(intent)
        }

        foto12.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto12::class.java)
            startActivity(intent)
        }

        foto13.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto13::class.java)
            startActivity(intent)
        }

        foto14.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto14::class.java)
            startActivity(intent)
        }

        foto15.setOnClickListener {
            val intent: Intent = Intent(this, mx.edu.ittepic.tpdm_u1_practica1b_danielgonzalez.foto15::class.java)
            startActivity(intent)
        }
    }
}

