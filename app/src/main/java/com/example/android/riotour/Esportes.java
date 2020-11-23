package com.example.android.riotour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Esportes extends Fragment {


    public Esportes() {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information(R.string.maracana_name, R.string.maracana_description, R.string.maracana_telefone, R.string.maracana_location, R.drawable.maracana_image));
        info.add(new Information(R.string.maracanazinho_name, R.string.maracanazinho_description, R.string.maracanazinho_telefone, R.string.maracanazinho_location, R.drawable.maracanazinho));
        info.add(new Information(R.string.delamare_name, R.string.delamare_description, R.string.delamare_telefone, R.string.delamare_location, R.drawable.juliodelamare));
        info.add(new Information(R.string.celio_de_barros_name, R.string.celio_de_barros_description, R.string.celio_de_barros_telefone, R.string.celio_de_barros_location, R.drawable.celio_barros_image_2));
        info.add(new Information(R.string.sao_januario_name, R.string.sao_januario_description, R.string.sao_januario_telefone, R.string.sao_januario_location, R.drawable.sao_januario_estadio_image2_best));
        info.add(new Information(R.string.engenhao_name, R.string.engenhao_description, R.string.engenhao_telefone, R.string.engenhao_location, R.drawable.engenhao_image));
        info.add(new Information(R.string.parque_olimpico_name, R.string.parque_olimpico_description, R.string.parque_olimpico_telefone, R.string.parque_olimpico_location, R.drawable.parque_olimpico_barra));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
