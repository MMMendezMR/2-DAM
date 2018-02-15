package com.mmmendez.appvuelosmmmendez;

import android.content.Context;
import android.net.Uri;
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




public class AeropuertoFragment extends Fragment {

    //TODO Mis parámetros
    List<Aeropuerto> aeropuertosList;
    private int mColumnCount = 1;
    MiAeropuertoRecyclerViewAdapter adapter;


    private OnFragmentInteractionListener mListener;

    public AeropuertoFragment() {

    }

    /
    // TODO: Rename and change types and number of parameters
    public static AeropuertoFragment newInstance(String param1, String param2) {
        AeropuertoFragment fragment = new AeropuertoFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_aeropuerto, container,false);

        aeropuertosList = new ArrayList<>();

        aeropuertosList.add(new Aeropuerto("Aeropuerto Sevilla",4, (long) 25,"15/02/2018","Sevilla"
        ,"Mayorca","Iberia","https://www.viajejet.com/wp-content/viajes/Aeronave-de-la-compa%C3%B1%C3%ADa-a%C3%A9rea-Iberia.jpg"));
        aeropuertosList.add(new Aeropuerto("Aeropuerto Sevilla",4, (long) 25,"17/02/2018","Sevilla"
                ,"Madrid","Ryanair","https://estaticos.elperiodico.com/resources/jpg/4/3/1515934056034.jpg"));
        aeropuertosList.add(new Aeropuerto("Aeropuerto Sevilla",4, (long) 25,"20/02/2018","Sevilla"
                ,"Galicia","Iberia","https://www.viajejet.com/wp-content/viajes/Aeronave-de-la-compa%C3%B1%C3%ADa-a%C3%A9rea-Iberia.jpg"));
        aeropuertosList.add(new Aeropuerto("Aeropuerto Sevilla",4, (long) 25,"16/02/2018","Sevilla"
                ,"Palma de Gran Canaria","Ryanair","https://estaticos.elperiodico.com/resources/jpg/4/3/1515934056034.jpg"));


        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            adapter = new MyRestaurantRecyclerViewAdapter(getActivity(), restaurantList, mListener);
            recyclerView.setAdapter(adapter);
        }


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
