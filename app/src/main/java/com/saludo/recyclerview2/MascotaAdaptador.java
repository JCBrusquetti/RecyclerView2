package com.saludo.recyclerview2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    public MascotaAdaptador(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    ArrayList<Mascota> mascotas;

    @Override
    public MascotaViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder( MascotaViewHolder holder, int position) {
        Mascota mascota = mascotas.get(position);
        holder.imgHueso.setImageResource(mascota.getHueso());
        holder.imgFoto.setImageResource(mascota.getFoto());
        holder.nombre.setText(mascota.getNombre());
        holder.numFavo.setText(mascota.getNumFav());

        holder.imgHueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private  ImageView imgHueso;
        private ImageView imgFoto;
        private TextView nombre;
        private TextView numFavo;

        public MascotaViewHolder( View itemView) {
            super(itemView);
            imgHueso = (ImageView) itemView.findViewById(R.id.ivHueso);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            nombre = (TextView) itemView.findViewById(R.id.tvNombreCV);
            numFavo = (TextView) itemView.findViewById(R.id.tvFav);
        }
    }

}