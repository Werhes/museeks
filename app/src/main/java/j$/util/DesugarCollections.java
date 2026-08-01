package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class DesugarCollections {
    public static <T> java.util.Collection<T> bridge_synchronizedCollection(java.util.Collection<T> collection, Object obj) {
        return new g(collection, obj);
    }

    public static <T> java.util.Set<T> bridge_synchronizedSet(java.util.Set<T> set, Object obj) {
        return (java.util.Set<T>) new g(set, obj);
    }

    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        return list instanceof RandomAccess ? new h(list) : new h(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new i(map);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return (java.util.Set<T>) new g(set);
    }

    public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> collection) {
        return new m(collection);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        return list instanceof RandomAccess ? new o(list) : new o(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new s(map);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return (java.util.Set<T>) new m(set);
    }
}
