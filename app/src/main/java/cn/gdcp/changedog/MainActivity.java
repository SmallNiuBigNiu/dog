package cn.gdcp.changedog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button nextBtn;
    private ImageView nextIma;
    private int[] imaArr={R.drawable.dog1,R.drawable.dog2,R.drawable.dog3,R.drawable.dog4,R.drawable.dog5};
    private int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得按钮的id
        nextBtn=(Button)findViewById(R.id.nextPic);
        //获得图片的id
        nextIma=(ImageView)findViewById(R.id.imaDog);
        //给按钮加一个监听器
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               index=(index+1)%imaArr.length;
                nextIma.setImageResource(imaArr[index]);
            }
        });
    }
}
