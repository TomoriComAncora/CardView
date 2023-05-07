package lucas.curso.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import lucas.curso.cardview.R;
import lucas.curso.cardview.model.Postagens;

public class AdapterPostagem extends RecyclerView.Adapter<AdapterPostagem.MyViewHolder> {

    private List<Postagens> listaPostagens;
    public AdapterPostagem(List<Postagens> p) {
        this.listaPostagens = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_postagem, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagens postagem = listaPostagens.get(position);
        holder.textNome.setText(postagem.getTituloPostagem());
        holder.textData.setText(postagem.getTempoPostagem());
        holder.textDescricao.setText(postagem.getDescricaoPostagem());
        holder.imageFoto.setImageResource(postagem.getImagemPostagem());

    }

    @Override
    public int getItemCount() {
        return listaPostagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textNome;
        private TextView textDescricao;
        private TextView textData;
        private ImageView imageFoto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textDescricao = itemView.findViewById(R.id.textDesccricao);
            textData = itemView.findViewById(R.id.textHora);
            imageFoto = itemView.findViewById(R.id.imageFoto);
        }
    }
}
