package com.example.pyrov.mvptestapp2recycler.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.pyrov.mvptestapp2recycler.Presenter.Contract;
import com.example.pyrov.mvptestapp2recycler.Presenter.Presenter;
import com.example.pyrov.mvptestapp2recycler.R;


public class MainActivity extends AppCompatActivity implements Contract.ActivityView, ViewActivitySelection.Selection {
    private RecyclerView recycler;
    private Toast toast;
    private Contract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void showItem(String model) {
        showToast(model);
    }

    @Override
    public void ChoiceId(int id) {
        presenter.selectedItem(id);
    }

    private void showToast(String model) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(this, model, Toast.LENGTH_SHORT);
        toast.show();
    }

    private void init() {
        presenter = new Presenter(this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(manager);
        RecyclerAdapter adapter = new RecyclerAdapter(this);
        recycler.setAdapter(adapter);
        adapter.addAll(presenter.getDataModel());
    }
}
