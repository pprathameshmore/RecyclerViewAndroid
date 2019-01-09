package com.prathameshmore.recyclerviewandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context context;
    private List<Product> allProducts;

    public ProductAdapter(Context context, List allProducts) {
        this.context = context;
        this.allProducts = allProducts;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.product_layout, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {

        Product product = allProducts.get(i);

        productViewHolder.textViewTitle.setText(product.getTitle());
        productViewHolder.textViewShortDesc.setText(product.getDescription());
        productViewHolder.textViewRating.setText(String.valueOf(product.getRating()));
        productViewHolder.textViewPrice.setText(String.valueOf(product.getPrice()));

        productViewHolder.imageView.setImageDrawable(context.getResources().getDrawable(product.getImageURL()));

    }

    @Override
    public int getItemCount() {
        return allProducts.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
