package com.example.ejercicio_indiv_7_m_5.presenter

interface InterViewPresenter {
    interface View {
        fun showPassword(strength: String)
    }

    interface Presenter {
        fun checkPassword(password: String)
    }
}