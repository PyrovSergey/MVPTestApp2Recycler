package com.example.pyrov.mvptestapp2recycler.Model;

import com.example.pyrov.mvptestapp2recycler.Presenter.Contract;
import com.example.pyrov.mvptestapp2recycler.R;

import java.util.ArrayList;
import java.util.List;

public class Data implements Contract.Data {
    private static Data data;
    private static List<ModelItem> itemsList;

    private Data() {
        initModelList();
    }

    public static Data getInstance() {
        if (data == null) {
            data = new Data();
        }
        return data;
    }

    @Override
    public List<ModelItem> getDataList() {
        return itemsList;
    }

    @Override
    public ModelItem getModelItem(int position) {
        return itemsList.get(position);
    }

    private void initModelList() {
        itemsList = new ArrayList<>();
        itemsList.add(new ModelItem("Suzuki", R.drawable.a));
        itemsList.add(new ModelItem("Triumph T100 Custom", R.drawable.b));
        itemsList.add(new ModelItem("BMV", R.drawable.c));
        itemsList.add(new ModelItem("Suzuki R6", R.drawable.d));
        itemsList.add(new ModelItem("Ducati", R.drawable.e));
        itemsList.add(new ModelItem("Custom Indian Scout", R.drawable.f));
        itemsList.add(new ModelItem("Honda Cafe Racer", R.drawable.j));
        itemsList.add(new ModelItem("Honda Cb550 Custom", R.drawable.h));
        itemsList.add(new ModelItem("Honda Custom", R.drawable.i));
        itemsList.add(new ModelItem("Yamaha R4", R.drawable.j));
        itemsList.add(new ModelItem("Yamaha R1", R.drawable.k));
        itemsList.add(new ModelItem("Triumph Custom", R.drawable.l));
        itemsList.add(new ModelItem("Triumph Cafe Racer", R.drawable.m));
        itemsList.add(new ModelItem("Suzuki Japan Custom", R.drawable.o));
        itemsList.add(new ModelItem("Honda Valkyrie", R.drawable.p));
    }
}
