package com.example.nflteams.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nflteams.MainActivity;
import com.example.nflteams.R;
import com.example.nflteams.model.Team;

import java.util.List;
/////////////////////////////////////RAJOUT DE PICASSO ET ESSAI DU CLICK POUR OUVRI LA DEUXIEME ACTIVITE
//////////////////////////////RAJOUTER LES URL DE SIMAGES API REST
////////////SUPPRIMER LES IMAGEURL DANS LA CLASSE TEAM
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private MainActivity activity;

    private List<Team> values;
    private AdapterView.OnItemClickListener listener;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Team> myDataset) {//, Context context
        values = myDataset;
        //this.context = context;
    }

    //private final Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader;
        public TextView txtFooter;
        public ImageView image;
        public View layout;


        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            image = v.findViewById(R.id.icon);
        }

       public void bind(ViewHolder holder, final int position) {
           Team team = values.get(position);
           final String name = team.getName();
           holder.txtHeader.setText(name);
           holder.txtHeader.setOnClickListener(new OnClickListener() {
               @Override
               public void onClick(View v) {
                   activity.startSecondActivity(v);
                  // toastMe();
                   //remove(position);
                   //listener.onItemClick(team);
               }
           });

           holder.txtFooter.setText("Footer: " + name);
            /*Context context = null;
            context = context.getApplicationContext();
            View v = new View(context);
            ViewHolder holder = new ViewHolder(v);
            Picasso.with(v.getContext()).load("C:/Users/mahob/Desktop/ESIEA/Programmation mobile").into(holder.image);
           /* v.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    ///////////METTRE LAPPEL DE LA DEUXIEME ACTIVITE
                }
            });*/
        }
    }

    public void add(int position, Team item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }






    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);

        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.bind(holder, position);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}