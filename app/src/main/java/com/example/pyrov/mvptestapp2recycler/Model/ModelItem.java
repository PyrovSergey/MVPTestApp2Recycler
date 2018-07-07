package com.example.pyrov.mvptestapp2recycler.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelItem implements Parcelable {
    private String model;
    private int imgId;

    public ModelItem(String model, int imgId) {
        this.model = model;
        this.imgId = imgId;
    }

    public String getModel() {
        return model;
    }

    public int getImgId() {
        return imgId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.model);
        dest.writeInt(this.imgId);
    }

    protected ModelItem(Parcel in) {
        this.model = in.readString();
        this.imgId = in.readInt();
    }

    public static final Parcelable.Creator<ModelItem> CREATOR = new Parcelable.Creator<ModelItem>() {
        @Override
        public ModelItem createFromParcel(Parcel source) {
            return new ModelItem(source);
        }

        @Override
        public ModelItem[] newArray(int size) {
            return new ModelItem[size];
        }
    };
}
