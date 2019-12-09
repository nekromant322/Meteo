package rxExamples;

import com.example.meteo.model.weather.Sys;
import io.micrometer.core.instrument.util.JsonUtils;
import org.omg.PortableInterceptor.INACTIVE;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.subjects.PublishSubject;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws IOException {
        Observable<String> values = Observable.just(
                "first",
                "second",
                "third",
                "forth",
                "fifth",
                "sixth"
        );

        values.filter(x -> x.contains("d")).groupBy(word -> word.charAt(0))
                .subscribe(
                        group -> group.first()
                                .subscribe(v -> System.out.println(group.getKey() + ": " + v))
                );
    }
}
