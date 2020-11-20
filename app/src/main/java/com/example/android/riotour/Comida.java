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
        info.add(new Information(R.string.didas_bar_name, R.string.didas_bar_description, R.string.didas_bar_telefone, R.string.didas_bar_location, R.drawable.dida_bar_image));
        info.add(new Information(R.string.raizes_bar_name, R.string.raizes_bar_description, R.string.raizes_bar_telefone, R.string.raizes_bar_location, R.drawable.raizes_bar_restaurante_image));
        info.add(new Information(R.string.mirante_rocinha_name, R.string.mirante_rocinha_description, R.string.mirante_rocinha_telefone, R.string.mirante_rocinha_location, R.drawable.mirante_rocinha_image_semnome));
        info.add(new Information(R.string.cachaca_social_name, R.string.cachaca_social_description, R.string.cachaca_social_telefone, R.string.cachaca_social_location, R.drawable.cacha_social_club_image_poit));
        info.add(new Information(R.string.arabe_do_leme_name, R.string.arabe_do_leme_description, R.string.arabe_do_leme_telefone, R.string.arabe_do_leme_location, R.drawable.arabe_do_leme_image));
        info.add(new Information(R.string.arabe_do_leme_name, R.string.olympe_description, R.string.olympe_telefone, R.string.olympe_location, R.drawable.olympe));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
