package com.tekinarslan.material.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class SampleFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static SampleFragment newInstance(int position) {
        SampleFragment f = new SampleFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);
        View rootView = inflater.inflate(R.layout.page, container, false);

//        ProgressBarCircular progressBarCircular = (ProgressBarCircular) rootView.findViewById(R.id.progress);
//        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fabButton);
//        fab.setDrawableIcon(getResources().getDrawable(R.drawable.plus));

        WebView webView = (WebView) rootView.findViewById(R.id.theWebView);

        switch (position) {
            case 0:
//                fab.setBackgroundColor(getResources().getColor(R.color.red));
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.red));

                webView.loadUrl("http://dev.simppl.com");

                break;
            case 1:
//                fab.setBackgroundColor(getResources().getColor(R.color.red));
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.red));

                webView.loadUrl("http://dev.simppl.com");

                break;
            case 2:
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.red));
//                fab.setBackgroundColor(getResources().getColor(R.color.red));

                webView.loadUrl("http://dev.simppl.com");

                break;
            case 3:
//                fab.setBackgroundColor(getResources().getColor(R.color.red));
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.red));

                webView.loadUrl("http://dev.simppl.com");

                break;
        }

        return rootView;
    }
}