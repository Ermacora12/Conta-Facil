package br.com.street.jorge.contafacil01.ui.categorias;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CategoriasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CategoriasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is categoria fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
