package com.example.pyrov.mvptestapp2recycler.Presenter;

import com.example.pyrov.mvptestapp2recycler.Model.Data;
import com.example.pyrov.mvptestapp2recycler.Model.ModelItem;

import java.util.List;

public class Presenter implements Contract.Presenter {

    private Contract.ActivityView view;
    private Contract.Data data;

    public Presenter(Contract.ActivityView view) {
        this.view = view;
        data = Data.getInstance();
    }

    @Override
    public List<ModelItem> getDataModel() {
        return data.getDataList();
    }

    @Override
    public void selectedItem(int position) {
        String model = data.getModelItem(position).getModel();
        view.showItem(model);
    }
}
