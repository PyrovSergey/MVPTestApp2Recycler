package com.example.pyrov.mvptestapp2recycler.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.pyrov.mvptestapp2recycler.Model.ModelItem;
import com.example.pyrov.mvptestapp2recycler.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private List<ModelItem> list;
    private ViewActivitySelection.Selection select;

    public RecyclerAdapter(ViewActivitySelection.Selection select) {
        this.select = select;
    }

    public void addAll(List<ModelItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder holder, final int position) {
        holder.bind(list.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select.ChoiceId(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image);
    }

    public void bind(ModelItem modelItem) {
        Picasso.get().load(modelItem.getImgId()).fit().into(imageView);
    }
}
