package com.fragmentlifecycle;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    private void logd(String msg) {
        Log.d("Bill", "BlankFragment " + msg);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        logd("onConfigurationChanged");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        logd("onAttach:" + context);
        if (context instanceof BlankFragment.OnFragmentInteractionListener) {
            logd("context");
        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logd("onCreate:" + savedInstanceState);
        if(savedInstanceState != null){
            int key = savedInstanceState.getInt("key");
            logd("onCreate key:" + key);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        logd("onCreateView");
        if(savedInstanceState != null){
            int key = savedInstanceState.getInt("key");
            logd("onCreateView key:" + key);
        }
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        logd("onActivityCreated");
        if(savedInstanceState != null){
            int key = savedInstanceState.getInt("key");
            logd("onActivityCreated key:" + key);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        logd("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        logd("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        logd("onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        logd("onSaveInstanceState");
        outState.putInt("key", 1);
    }

    @Override
    public void onStop() {
        super.onStop();
        logd("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        logd("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logd("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        logd("onDetach");
    }
}
