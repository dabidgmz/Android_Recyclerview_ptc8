package adapater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ptc8.R;
import java.util.List;
import models.carro;
public class carroadapater extends RecyclerView.Adapter<carroadapater.viewHolder> {
    List<carro> Lista_carro;
    public carroadapater(List<carro> lista_carro){
        lista_carro=lista_carro;
    }

    @NonNull
    @Override
    public carroadapater.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly=LayoutInflater.from(parent.getContext());
        View v=ly.inflate(R.layout.itemcarro,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull carroadapater.viewHolder holder, int position) {
        carro c=Lista_carro.get(position);
        holder.setdata(c);

    }

    @Override
    public int getItemCount() {
        return Lista_carro.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            marcar = itemView.findViewById(R.id.marca);
            modelo=itemView.findViewById(R.id.txtmodelo);
        }

        public void setdata(carro c) {
            cp=c;
            marca=setText(cp.getmarca());
            modelo=setText(cp.getmodelo());
        }
    }

}
