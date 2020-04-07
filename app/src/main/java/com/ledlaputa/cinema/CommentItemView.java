package com.ledlaputa.cinema;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CommentItemView extends LinearLayout {

    ImageView imageView; //아이콘 이미지
    TextView textView1; //유저 아이디
    TextView textView2; //시간
    TextView textView3; //내용


    public CommentItemView(Context context) {
        super(context);
        init(context);
    }

    public CommentItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.comment_item, this, true);

        //comment_item.xml에 있는 데이터 참조
        imageView = (ImageView) findViewById(R.id.commentUserId);
        textView1 = (TextView) findViewById(R.id.commentUserName);
        textView2 = (TextView) findViewById(R.id.commentTime);
        textView3 = (TextView) findViewById(R.id.commentText);

    }

    public void setUserId(int userId){
        imageView.setImageResource(userId);
    }

    public void setUserName(String userName){
        textView1.setText(userName);
    }

    public void setTime(String time){
        textView2.setText(time);
    }

    public void setCommentText(String commentText){
        textView3.setText(commentText);
    }

}
