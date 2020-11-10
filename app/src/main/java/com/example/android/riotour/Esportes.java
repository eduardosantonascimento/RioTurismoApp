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
        info.add(new Information(R.string.maracana_name, R.string.maracana_description, R.string.maracana_telefone, R.string.maracana_location, R.drawable.maracana2014));
        info.add(new Information(R.string.maracanazinho_name, R.string.maracanazinho_description, R.string.maracanazinho_telefone, R.string.maracanazinho_location, R.drawable.maracanazinho));
        info.add(new Information(R.string.delamare_name, R.string.delamare_description, R.string.delamare_telefone, R.string.delamare_location, R.drawable.juliodelamare));
        InformationAdapter adapter = new InformationAdapter(getActivity(), info);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
