package com.example.ejercicio_indiv_7_m_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_indiv_7_m_5.databinding.ActivityMainBinding
import com.example.ejercicio_indiv_7_m_5.presenter.PasswordSecurityPresenter
import com.example.ejercicio_indiv_7_m_5.presenter.InterViewPresenter

class MainActivity : AppCompatActivity(), InterViewPresenter.View {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: PasswordSecurityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = PasswordSecurityPresenter(this)

        binding.buttonCheckSecurity.setOnClickListener {
            val password = binding.editTextPassword.text.toString()
            presenter.checkPassword(password)
        }
    }

    override fun showPassword(level: String) {
        binding.textViewSecurity.text = "Nivel de seguridad: $level"

        // Aplicar colores según la fortaleza de la contraseña
        when (level) {
            "Débil" -> binding.textViewSecurity.setBackgroundColor(getColor(R.color.red))
            "Media" -> binding.textViewSecurity.setBackgroundColor(getColor(R.color.yellow))
            "Fuerte" -> binding.textViewSecurity.setBackgroundColor(getColor(R.color.green))

        }
    }
}
