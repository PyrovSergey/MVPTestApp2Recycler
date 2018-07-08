package com.example.pyrov.mvptestapp2recycler.Presenter;

import com.example.pyrov.mvptestapp2recycler.Model.ModelItem;

import java.util.List;

public interface Contract {
    interface Data {
        List<ModelItem> getDataList();

        ModelItem getModelItem(int position);
    }

    interface Presenter {
        List<ModelItem> getDataModel();

        void selectedItem(int selectId);
    }

    interface ActivityView {
        void showItem(String string);
    }
}
