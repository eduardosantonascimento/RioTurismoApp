package com.example.android.riotour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {

    public InformationAdapter(Activity context, ArrayList<Information> information) {
        super(context, 0, information);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Information currentInformation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView tituloTextView = (TextView) listItemView.findViewById(R.id.titulo_text_view);
        // Get the Miwok translation from the currentInformation object and set this text on
        // the Miwok TextView.
        tituloTextView.setText(currentInformation.getmNome());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView descricaoTextView = (TextView) listItemView.findViewById(R.id.descricao_text_view);
        // Get the default translation from the currentInformation object and set this text on
        // the default TextView.
        descricaoTextView.setText(currentInformation.getmDescricao());

        TextView telefoneTextView = (TextView) listItemView.findViewById(R.id.telefone_text_view);
        // Get the default translation from the currentInformation object and set this text on
        // the default TextView.
        telefoneTextView.setText(currentInformation.getmTelefone());

        TextView enderecoTextView = (TextView) listItemView.findViewById(R.id.endereco_text_view);
        // Get the default translation from the currentInformation object and set this text on
        // the default TextView.
        enderecoTextView.setText(currentInformation.getmEndereco());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentInformation.getmImage());


        return listItemView;

    }
}
