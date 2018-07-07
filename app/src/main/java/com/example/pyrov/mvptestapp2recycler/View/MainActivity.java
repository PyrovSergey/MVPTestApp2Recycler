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

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements Contract.View {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    private Toast toast;

    private Contract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new Presenter(this);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);
        RecyclerAdapter adapter = new RecyclerAdapter(presenter);
        recycler.setAdapter(adapter);
        adapter.addAll();
    }

    @Override
    public void showItem(String model) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(this, model, Toast.LENGTH_SHORT);
        toast.show();
    }
}
