package MyFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.mylemon.R;

/**
 * Created by Administrator on 2015/7/14.
 */
public class MainUI_BottomButtons extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_ui_bottom_buttons, container, false);
    }
}
