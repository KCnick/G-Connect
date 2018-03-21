package com.belinix.maritim.g_connect.Parcels;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.belinix.maritim.g_connect.Parcels.ReceivedParcels.Received_fragment;
import com.belinix.maritim.g_connect.Parcels.SentParcels.Sent_Fragment;

/**
 * Created by MARITIM on 3/21/2018.
 */

public class ParcelsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public ParcelsAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Sent_Fragment tab1 = new Sent_Fragment();
                return tab1;
            case 1:
                Received_fragment tab2 = new Received_fragment();
                return tab2;
            case 2:
                Chat_Fragment tab3 = new Chat_Fragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}