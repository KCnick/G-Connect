package com.belinix.maritim.g_connect.Parcels.SentParcels;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.belinix.maritim.g_connect.R;

/**
 * Created by MARITIM on 3/21/2018.
 */

public class Sent_Fragment  extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sent, container, false);
    }
}
