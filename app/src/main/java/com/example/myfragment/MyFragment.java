package com.example.myfragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.i("msg","onCreateViewFragment");
        return inflater.inflate(R.layout.fragment_appearance,container,false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("msg","onAttachFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("msg","onStartFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("msg","onResumeFragment");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("msg","onSaveInstanceStateFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("msg","onPauseFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("msg","onStopFragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("msg","onDestroyViewFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("msg","onDestroyFragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("msg","onDetachFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("msg","onCreateFragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("msg","onActivityCreatedFragment");
    }
}
