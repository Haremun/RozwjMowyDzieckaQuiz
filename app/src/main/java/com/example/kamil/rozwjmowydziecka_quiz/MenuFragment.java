package com.example.kamil.rozwjmowydziecka_quiz;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    private Unbinder unbinder;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btnAbout)
    public void clickAbout(){
        AboutFragment aboutFragment = new AboutFragment();
        FragmentTransaction transaction = Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, aboutFragment);
        transaction.commit();
    }

    @OnClick(R.id.btnStart)
    public void clickStart(){
        SubMenuFragment subMenuFragment = new SubMenuFragment();
        FragmentTransaction transaction = Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, subMenuFragment);
        transaction.commit();
    }

    @OnClick(R.id.btnEnd)
    public void clickEnd(){
        Objects.requireNonNull(getActivity()).finish();
        System.exit(0);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
