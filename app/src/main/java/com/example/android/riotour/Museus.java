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
        info.add(new Information(R.string.ccbb_name, R.string.ccbb_description, R.string.ccbb_telefone, R.string.ccbb_location, R.drawable.ccbbpanoramica));
        info.add(new Information(R.string.museu_do_amanha_name, R.string.museu_do_amanha_description, R.string.museu_do_amanha_telefone, R.string.museu_do_amanha_location, R.drawable.museudoamanha));
        info.add(new Information(R.string.biblioteca_nacional_name, R.string.biblioteca_nacional_description, R.string.biblioteca_nacional_telefone, R.string.biblioteca_nacional_location, R.drawable.bibliotecanacional));
        InformationAdapter adapter = new InformationAdapter(getActivity(), info);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
