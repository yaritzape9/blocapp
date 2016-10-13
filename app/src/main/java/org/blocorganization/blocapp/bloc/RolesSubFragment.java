package org.blocorganization.blocapp.bloc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.blocorganization.blocapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RolesSubFragment extends Fragment {


    public RolesSubFragment() {
        // Required empty public constructor
    }

    public static RolesSubFragment newInstance() {

        Bundle args = new Bundle();

        RolesSubFragment fragment = new RolesSubFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.bloc_subfragment_roles, container, false);
    }

}
