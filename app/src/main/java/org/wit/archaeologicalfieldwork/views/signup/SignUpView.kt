package org.wit.archaeologicalfieldwork.views.signup

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class SignUpView : BaseView(), AnkoLogger {

    lateinit var presenter : SignUpPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        info("Login Activity Started...")
        presenter = initPresenter(SignUpPresenter(this)) as SignUpPresenter

        btnRegester.setOnClickListener() {
            var email = newEmail.text.toString()
            var password = newPassword.text.toString()
            presenter.doRegisterUser(email, password)
        }

        btnBackSignIn.setOnClickListener() {
            presenter.view?.navigateTo(VIEW.LOGIN)
        }
    }
}
