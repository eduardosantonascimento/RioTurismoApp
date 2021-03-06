package com.example.android.riotour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Museus extends Fragment {


    public Museus() {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information(R.string.ccbb_name, R.string.ccbb_description,
                R.string.ccbb_telefone, R.string.ccbb_location, R.drawable.ccbb_museu_image));
        info.add(new Information(R.string.museu_do_amanha_name, R.string.museu_do_amanha_description, R.string.museu_do_amanha_telefone,
                R.string.museu_do_amanha_location, R.drawable.museudoamanha));
        info.add(new Information(R.string.biblioteca_nacional_name, R.string.biblioteca_nacional_description,
                R.string.biblioteca_nacional_telefone, R.string.biblioteca_nacional_location, R.drawable.biblioteca_nacional_image1));
        info.add(new Information(R.string.museu_nacional_name, R.string.museu_nacional_description, R.string.museu_nacional_telefone,
                R.string.museu_nacional_location, R.drawable.museu_nacional_ufrj_image));
        info.add(new Information(R.string.museu_historico_nacional_name, R.string.museu_historico_nacional_description,
                R.string.museu_historico_nacional_telefone, R.string.museu_historico_nacional_location, R.drawable.museu_historico_nacional_image));
        info.add(new Information(R.string.museu_nacional_belas_artes_name, R.string.museu_nacional_belas_artes_description,
                R.string.museu_nacional_belas_artes_telefone, R.string.museu_nacional_belas_artes_location, R.drawable.museu_nacional_belas_artes_image3));
        info.add(new Information(R.string.museu_arte_moderma_name, R.string.museu_arte_moderma_description,
                R.string.museu_arte_moderma_telefone, R.string.museu_arte_moderma_location, R.drawable.museu_arte_moderna_mam_image));
        info.add(new Information(R.string.museu_arte_contemporanea_name, R.string.museu_arte_contemporanea_description,
                R.string.museu_arte_contemporanea_telefone, R.string.museu_arte_contemporanea_location, R.drawable.museu_arte_contemporanea_mac));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
