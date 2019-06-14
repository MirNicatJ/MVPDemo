package com.jabbarli.mirnicat.mvpdemo.UI.Activities.ListActivity;

import android.content.Context;
import android.widget.ListAdapter;

import com.jabbarli.mirnicat.mvpdemo.CustomAdapter;
import com.jabbarli.mirnicat.mvpdemo.Interactors.PostInteractor;
import com.jabbarli.mirnicat.mvpdemo.POJO.Post;
import com.jabbarli.mirnicat.mvpdemo.R;
import com.jabbarli.mirnicat.mvpdemo.UI.Callbacks.Callback;

import java.util.List;

public class ListPresenter
implements ListContractor.Presenter{

    private ListContractor.View mView;
    private PostInteractor mPostInteractor;

    public ListPresenter(ListContractor.View view) {
        this.mView = view;
        mView.setPresenter(this);
        mPostInteractor = new PostInteractor();
        mPostInteractor.setPost(new ListCallback());
    }

    @Override
    public void setListAdapter(List<Post> postList) {
        CustomAdapter adapter = new CustomAdapter((Context)mView, R.layout.list_view_demo_item, postList);
        mView.getListView().setAdapter(adapter);
    }

    class ListCallback implements Callback<Post>{

        @Override
        public void sendDataToPresenter(List<Post> list) {
            setListAdapter(list);
        }
    }
}
