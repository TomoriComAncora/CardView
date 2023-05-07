package lucas.curso.cardview.actvity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lucas.curso.cardview.R;
import lucas.curso.cardview.adapter.AdapterPostagem;
import lucas.curso.cardview.model.Postagens;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagens> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        this.criandoPosts();
        AdapterPostagem adapter = new AdapterPostagem(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void criandoPosts(){
        Postagens p = new Postagens("Lucas Fernando", "ontem",
                "Avião foda bicho", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagens("MdTatuador", "Agora mesmo",
                "Ó as nuvens", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagens("Ninextt", "Há 30 min",
                "É o Cruzeiro!!!!", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagens("euteto", "ontem",
                "Energia sinistra", R.drawable.imagem4);
        this.postagens.add(p);

    }
}