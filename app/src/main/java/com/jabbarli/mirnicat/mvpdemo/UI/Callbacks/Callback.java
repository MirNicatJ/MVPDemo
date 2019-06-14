package com.jabbarli.mirnicat.mvpdemo.UI.Callbacks;

import java.util.List;

public interface Callback<T> {

    void sendDataToPresenter(List<T> list);

}
