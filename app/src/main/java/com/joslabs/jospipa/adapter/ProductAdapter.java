package com.joslabs.jospipa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joslabs.jospipa.R;
import com.joslabs.jospipa.model.ProductModelJava;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
List<ProductModelJava>serviceList;
Context context;

    public ProductAdapter(List<ProductModelJava> serviceList, Context context) {
        this.serviceList = serviceList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_java_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
    holder.serviceName.setText("Service : "+serviceList.get(position).getItemName());
    holder.txtQuantity.setText("Qty : "+serviceList.get(position).getQuantity());
    if (Integer.parseInt(serviceList.get(position).getItemId())%2 !=0){
        holder.txtStatus.setText("Deactivated");
        holder.txtStatus.setTextColor(context.getResources().getColor(R.color.red));
        holder.vwStatus.setBackgroundColor(context.getResources().getColor(R.color.red));
    }
    }

    @Override
    public int getItemCount() {
        return (serviceList != null ? serviceList.size() :0) ;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txt_status)
        TextView txtStatus;
        @BindView(R.id.txt_product_name)
        TextView serviceName;
        @BindView(R.id.txt_quantity)
        TextView txtQuantity;
        @BindView(R.id.vw_status)
        View vwStatus;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
