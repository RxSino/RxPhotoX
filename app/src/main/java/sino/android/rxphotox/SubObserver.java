package sino.android.rxphotox;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class SubObserver<T> implements Observer<T> {

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
