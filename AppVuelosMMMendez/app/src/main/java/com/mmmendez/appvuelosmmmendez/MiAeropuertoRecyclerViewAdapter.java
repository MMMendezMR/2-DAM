package com.mmmendez.appvuelosmmmendez;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mmmendez on 15/02/2018.
 */

class MiAeropuertoRecyclerViewAdapter {
    private Context ctx;
    private final List<Aeropuerto> mValues;
    private IOnAeropuertoInteractionListener mListener;

    public MiAeropuertoRecyclerViewAdapter(Context context,
                                           List<Aeropuerto> items,
                                           IOnAeropuertoInteractionListener listener) {
        ctx = context;
        mValues = items;
        mListener = listener;
    }

    // Carga el template (layout) que utilizamos para dibujar un elemento de la lista
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_aeropuerto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        /**private String nombre;
         private int rate;
         private Long precio;
         private String fech_salida;
         private String salida;
         private String destino;
         private String companyia;
         private String url;*/

        holder.textViewNombre.setText(holder.mItem.getNombre());
        holder.ratingBarRate.setRating(holder.mItem.getRate());
        holder.text


        // Seteamos la imagen en el componente ImageView
        Picasso.with(ctx)
                .load(holder.mItem.getUrl())
                .resize(600,150)
                .centerCrop()
                .into(holder.imageViewPhoto);

        // Eventos
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onRestaurantClick(holder.mItem);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView imageViewPhoto;
        public TextView textViewNombre;
        public TextView textViewAddress;
        public final RatingBar ratingBarRate;
        public TextView textViewFechSalida;
        public TextView textViewPrecio;

        public Aeropuerto mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            imageViewPhoto = view.findViewById(R.id.imageViewPhoto);
            textViewNombre = view.findViewById(R.id.textViewNombre);
            textViewAddress = view.findViewById(R.id.textViewAddress);
            ratingBarRate = view.findViewById(R.id.ratingBarRate);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewNombre.getText() + "'";
        }
    }
}
