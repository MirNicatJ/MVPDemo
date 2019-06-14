package com.jabbarli.mirnicat.mvpdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jabbarli.mirnicat.mvpdemo.POJO.Post;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Post> {

    Context context;
    int resource;
    List<Post> postList;


    public CustomAdapter(Context context, int resource, List<Post> postList) {
        super(context, resource, postList);
        this.context = context;
        this.resource = resource;
        this.postList = postList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(resource, null);
        }

        TextView id =     convertView.findViewById(R.id.text_view_id);
        TextView userId = convertView.findViewById(R.id.text_view_user_id);
        TextView title =  convertView.findViewById(R.id.text_view_title);
        TextView body =   convertView.findViewById(R.id.text_view_body);

        Post post = postList.get(position);

        id.setText(post.getmId());
        userId.setText(post.getmUserId());
        title.setText(post.getmTitle());
        body.setText(post.getmBody());

        return convertView;
    }
}
