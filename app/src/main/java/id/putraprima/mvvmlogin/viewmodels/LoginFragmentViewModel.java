package id.putraprima.mvvmlogin.viewmodels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.User;

public class LoginFragmentViewModel extends ViewModel {
    public MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();

    public LoginFragmentViewModel(User user) {
        this.userMutableLiveData.setValue(user);
    }

    public void login(){
        Log.d("Username: ", this.userMutableLiveData.getValue().getUsername());
        Log.d("Password: ", this.userMutableLiveData.getValue().getPassword());
    }
}
