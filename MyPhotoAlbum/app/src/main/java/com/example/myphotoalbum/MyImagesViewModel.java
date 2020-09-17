package com.example.myphotoalbum;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyImagesViewModel extends AndroidViewModel {

    private MyImagesRepository repository;
    private LiveData<List<MyImages>> imagesList;

    public MyImagesViewModel(@NonNull Application application) {
        super(application);

        repository = new MyImagesRepository(application);
        imagesList = repository.getAllImages();

    }

    public void insert(MyImages myImages)
    {
        repository.insert(myImages);
    }
    public void delete(MyImages myImages)
    {
        repository.delete(myImages);
    }
    public void update(MyImages myImages)
    {
        repository.update(myImages);
    }

    public LiveData<List<MyImages>> getAllImages()
    {
        return imagesList;
    }
}
