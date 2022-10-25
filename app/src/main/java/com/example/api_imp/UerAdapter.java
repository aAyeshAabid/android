package com.example.api_imp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UerAdapter extends RecyclerView.Adapter<UerAdapter.ViewHoldr> {

    private List<User> userlist;

    public UerAdapter(List<User> userlist) {
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public ViewHoldr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item,parent,false);
        return new ViewHoldr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoldr holder, int position) {

        holder.id.setText((int) userlist.get(position).getId());
        holder.name.setText(userlist.get(position).getName());
        holder.email.setText(userlist.get(position).getEmail());
        holder.gender.setText(userlist.get(position).getGender());
        holder.status.setText(userlist.get(position).getStatus());

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHoldr extends  RecyclerView.ViewHolder {

        TextView id,name,email,gender,status;
        public ViewHoldr(@NonNull View itemView) {
            super(itemView);

            id= itemView.findViewById(R.id.txt_id);
            name= itemView.findViewById(R.id.txt_name);
            email= itemView.findViewById(R.id.txt_email);
            gender= itemView.findViewById(R.id.txt_gender);
            status = itemView.findViewById(R.id.txt_status);
        }
    }
}
