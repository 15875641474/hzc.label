package com.hzclabel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hzc.label.LabelView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    LabelView labelView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelView = (LabelView) findViewById(R.id.hzcLabelView);
        List<String> taglist = new ArrayList<>();
        taglist.add("今天");
        taglist.add("近7天");
        taglist.add("近30天");
        taglist.add("近3个月");
        LabelView.TagAdapter tagAdapter = labelView.new TagAdapter<String>(taglist) {
            @Override
            public String getText(String s) {
                return s;
            }

            @Override
            public void onClick(String s) {

            }

            @Override
            public void onDelete(String s) {

            }

            @Override
            public boolean enableDelete(String s) {
                if(s.length() == 2)
                    return true;
                return false;
            }
        };
        labelView.setEnableDelete(false);
        labelView.setAdapter(tagAdapter);
    }

}
