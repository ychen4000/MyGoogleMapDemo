package com.example.administrator.apn_changer;

import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.telephony.TelephonyManager;
import android.net.Uri;
import android.util.Log;
import android.database.Cursor;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.widget.EditText;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button InternetName = null;
    Button InternetAPN = null;
    Button MMSName = null;
    Button MMSAPN = null;
    Button MMSMMSC = null;





    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_apn, container, false);
        InternetName =(Button)v.findViewById(R.id.button_internet_name);
        InternetAPN = (Button)v.findViewById(R.id.button_internet_apn);

        MMSName = (Button)v.findViewById(R.id.button_mmsname);
        MMSAPN = (Button)v.findViewById(R.id.button_mms_apn);
        MMSMMSC = (Button)v.findViewById(R.id.button_mmsc);


        InternetName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ClipboardManager cmb = (ClipboardManager) getActivity().getSystemService(getActivity().CLIPBOARD_SERVICE);
                cmb.setText("2degrees internet");

                Intent intent = new Intent("/");
                ComponentName cm = new ComponentName("com.android.settings","com.android.settings.ApnSettings");
                intent.setComponent(cm);
                intent.setAction("android.intent.action.VIEW");
                getActivity().startActivityForResult( intent, 0);


            }
        });

        InternetAPN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClipboardManager cmb = (ClipboardManager) getActivity().getSystemService(getActivity().CLIPBOARD_SERVICE);
                cmb.setText("internet");

                Intent intent = new Intent("/");
                ComponentName cm = new ComponentName("com.android.settings","com.android.settings.ApnSettings");
                intent.setComponent(cm);
                intent.setAction("android.intent.action.VIEW");
                getActivity().startActivityForResult( intent, 0);
            }
        });

        MMSName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClipboardManager cmb = (ClipboardManager) getActivity().getSystemService(getActivity().CLIPBOARD_SERVICE);
                cmb.setText("2degrees MMS");

                Intent intent = new Intent("/");
                ComponentName cm = new ComponentName("com.android.settings","com.android.settings.ApnSettings");
                intent.setComponent(cm);
                intent.setAction("android.intent.action.VIEW");
                getActivity().startActivityForResult( intent, 0);
            }
        });

        MMSAPN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClipboardManager cmb = (ClipboardManager) getActivity().getSystemService(getActivity().CLIPBOARD_SERVICE);
                cmb.setText("mms");

                Intent intent = new Intent("/");
                ComponentName cm = new ComponentName("com.android.settings","com.android.settings.ApnSettings");
                intent.setComponent(cm);
                intent.setAction("android.intent.action.VIEW");
                getActivity().startActivityForResult( intent, 0);
            }
        });

        MMSMMSC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClipboardManager cmb = (ClipboardManager) getActivity().getSystemService(getActivity().CLIPBOARD_SERVICE);
                cmb.setText("http://mms.2degreesmobile.net.nz:48090");

                Intent intent = new Intent("/");
                ComponentName cm = new ComponentName("com.android.settings","com.android.settings.ApnSettings");
                intent.setComponent(cm);
                intent.setAction("android.intent.action.VIEW");
                getActivity().startActivityForResult( intent, 0);
            }
        });



        return v;

    }


}
