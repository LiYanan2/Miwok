package com.example.android.miwok;

/**
 * Created by liyanan on 2018/3/25.
 */
import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();
    }
}
