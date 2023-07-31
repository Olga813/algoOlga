package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {

    public static <T> Collection<T> filter(Collection<T> target, Predicate<T> predicate) {
        Collection<T> result = new ArrayList();
        for (T element : target) {
            if (predicate.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T,E> Collection<E> transformNewCol(Collection<T> target,
                                                                 Transformer<T,E> transformer) {
        Collection<E> result = new ArrayList();
        for (T element : target) {
            result.add(transformer.transform(element));
        }
        return result;
    }

    public static <T,E> void transformCurCol(Collection<T> target, Transformer<T,E> transformer) {
        for (T element : target){
            transformer.transform(element);
                    }
    }

    public static <T> Collection<T> forAllDo(Collection<T> target, Closures<T> closures) {
        Collection<T> result = new ArrayList();
        for (T element : target) {
            result.add(closures.execute(element));
        }
        return result;
    }

    public static <T> UnmodifiableCollection<? extends T> unmodifiableCollection(Collection<? extends T> target) {
        return new UnmodifiableCollection<>(target);
    }

}