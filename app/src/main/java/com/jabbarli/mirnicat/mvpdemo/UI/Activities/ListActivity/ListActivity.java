package com.jabbarli.mirnicat.mvpdemo.UI.Activities.ListActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.jabbarli.mirnicat.mvpdemo.POJO.Post;
import com.jabbarli.mirnicat.mvpdemo.R;
import com.jabbarli.mirnicat.mvpdemo.UI.Callbacks.Callback;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity
implements ListContractor.View{

    @BindView(R.id.list_view)
    ListView listView;

    private ListContractor.Presenter mPresenter;
    List<Post> mPostList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        new ListPresenter(this);

    }

    @Override
    public void setPresenter(ListPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setMPostList(List<Post> mPostList) {
        mPostList = mPostList;
    }

    @Override
    public ListView getListView() {
        return listView;
    }
}
