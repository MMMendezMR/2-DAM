package com.miguelcr.a07_restaurantlistfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CatFragment extends Fragment {

    // TODO: Customize parameters
    private int mColumnCount = 1;
    List<Cats> catsList;
    MyCatRecyclerViewAdapter adapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public CatFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_list, container, false);

        catsList = new ArrayList<>();
        catsList.add(new Cats("Siamés","https://t2.uc.ltmcdn.com/images/3/2/5/img_como_cuidar_a_un_gato_siames_34523_orig.jpg",5));
        catsList.add(new Cats("Ashera","https://i.pinimg.com/originals/40/ef/d4/40efd4079ea92808c18fd33c9b979760.jpg", 4));
        catsList.add(new Cats("Angora Turco","https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Cat_Eyes.jpg/1024px-Cat_Eyes.jpg",4));

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            adapter = new MyCatRecyclerViewAdapter(getActivity(), catsList);
            recyclerView.setAdapter(adapter);
        }
        return view;
    }

}
