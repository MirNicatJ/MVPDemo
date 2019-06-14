package com.jabbarli.mirnicat.mvpdemo.UI.Activities.ListActivity;

import android.widget.ListView;

import com.jabbarli.mirnicat.mvpdemo.BaseView;
import com.jabbarli.mirnicat.mvpdemo.POJO.Post;

import java.util.List;

public interface ListContractor {

    interface View extends BaseView<ListPresenter>{
        void setMPostList(List<Post> mPostList);

        ListView getListView();
    }

    interface Presenter{

        void setListAdapter(List<Post> postList);

    }
}
