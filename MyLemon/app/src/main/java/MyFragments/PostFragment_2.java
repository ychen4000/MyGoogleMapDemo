package MyFragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.mylemon.R;

/**
 * Created by Administrator on 2015/7/14.
 */
public class PostFragment_2 extends Fragment {

    Button PostMarker = null;
    Button TakePhoto = null;
    Button SelectPhoto = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View v = inflater.inflate(R.layout.fragment_post, container, false);

        PostMarker =(Button)v.findViewById(R.id.button_postmarker);
        TakePhoto = (Button)v.findViewById(R.id.button_takephoto);
        SelectPhoto = (Button)v.findViewById(R.id.button_selectphoto);

        PostMarker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Todo, 调用 GPS获得 当前位置信息
              // TODO  动态加入 Maker到 Map Fragment， 同时加入 到 后台 数据库
                // Todo 方案二，加入数据 到 后台，然后 从 后台 调用

            }
        });

        TakePhoto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO  camera API，Open camera，and take photo, save for later use.


            }
        });

        SelectPhoto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO  Open album, select a photo and load for later use.


            }
        });



        // Inflate the layout for this fragment
        return v;


    }
}
