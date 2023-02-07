package com.example.demo1.viewModel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.demo1.model.User

class LoginViewModel : BaseObservable() {

    private val user = User("", "")

    private val successMessage = "Login was successful"
    private val errorMessage = "Email or Password not valid"

    @Bindable
    private var toastMessage: String? = null

    fun getToastMessage(): String? {
        return toastMessage
    }


    private fun setToastMessage(toastMessage: String) {
        this.toastMessage = toastMessage
        notifyPropertyChanged(BR.toastMessage)
    }

}