package com.example.ejercicio_indiv_7_m_5.presenter


import com.example.ejercicio_indiv_7_m_5.model.PasswordSecurityModel

class PasswordSecurityPresenter(private val view: InterViewPresenter.View) :
    InterViewPresenter.Presenter {

    override fun checkPassword(password: String) {
        val security = PasswordSecurityModel.checkLevelPassword(password)
        view.showPassword(security)
    }
}
