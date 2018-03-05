package com.wolfsoft.teammeetingschedule.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wolfsoft.teammeetingschedule.R;

/**
 * Created by Dell on 22/02/2018.
 */

public class AdapterContacts extends RecyclerView.Adapter<AdapterContacts.ViewHolder>  {
    @Override
    public AdapterContacts.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AdapterContacts.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacts, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
