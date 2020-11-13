package com.example.android.riotour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Comida extends Fragment {


    public Comida() {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information(R.string.tradicoes_nordestinas_name, R.string.tradicoes_nordestinas_description, R.string.tradicoes_nordestinas_telefone, R.string.tradicoes_nordestinas_location, R.drawable.feirasaocristovao));
        info.add(new Information(R.string.confeitaria_colombo_name, R.string.confeitaria_colombo_description, R.string.confeitaria_colombo_telefone, R.string.confeitaria_colombo_location, R.drawable.confeitariacolombo));
        info.add(new Information(R.string.olympe_name, R.string.olympe_description, R.string.olympe_telefone, R.string.olympe_location, R.drawable.olympe));
        info.add(new Information(R.string.olympe_name, R.string.olympe_description, R.string.olympe_telefone, R.string.olympe_location, R.drawable.olympe));
        info.add(new Information(R.string.olympe_name, R.string.olympe_description, R.string.olympe_telefone, R.string.olympe_location, R.drawable.olympe));
        info.add(new Information(R.string.olympe_name, R.string.olympe_description, R.string.olympe_telefone, R.string.olympe_location, R.drawable.olympe));
        info.add(new Information(R.string.olympe_name, R.string.olympe_description, R.string.olympe_telefone, R.string.olympe_location, R.drawable.olympe));
        info.add(new Information(R.string.olympe_name, R.string.olympe_description, R.string.olympe_telefone, R.string.olympe_location, R.drawable.olympe));
        info.add(new Information(R.string.delamare_name, R.string.delamare_description, R.string.delamare_telefone, R.string.delamare_location, R.drawable.juliodelamare));
        info.add(new Information(R.string.delamare_name, R.string.delamare_description, R.string.delamare_telefone, R.string.delamare_location, R.drawable.juliodelamare));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
