package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10054e extends AbstractCollection implements Serializable, Collection {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19857e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Object[] f19855e = new Object[0];

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Object[] f19854e = new Object[0];

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Object[] f19856e = new Object[0];

    public /* synthetic */ AbstractC10054e(int i) {
        this.f19857e = i;
    }

    public int adcel() {
        switch (this.f19857e) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f19857e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.f19857e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] advert() {
        return null;
    }

    public abstract int appmetrica(Object[] objArr);

    public int billing() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f19857e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        int i = this.f19857e;
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        switch (this.f19857e) {
            case 0:
                return Collection.CC.$default$parallelStream(this);
            case 1:
                return Collection.CC.$default$parallelStream(this);
            default:
                return Collection.CC.$default$parallelStream(this);
        }
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        switch (this.f19857e) {
            case 0:
            case 1:
            default:
                return Stream.Wrapper.convert(parallelStream());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f19857e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.f19857e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        int i = this.f19857e;
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.f19857e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int smaato(Object[] objArr);

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final Spliterator spliterator() {
        switch (this.f19857e) {
            case 0:
                return Spliterators.spliterator(this, 1296);
            case 1:
                return Spliterators.spliterator(this, 1296);
            default:
                return Spliterators.spliterator(this, 1296);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        switch (this.f19857e) {
            case 0:
            case 1:
            default:
                return Spliterator.Wrapper.convert(spliterator());
        }
    }

    public int startapp() {
        switch (this.f19857e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        switch (this.f19857e) {
            case 0:
                return Collection.CC.$default$stream(this);
            case 1:
                return Collection.CC.$default$stream(this);
            default:
                return Collection.CC.$default$stream(this);
        }
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        switch (this.f19857e) {
            case 0:
            case 1:
            default:
                return Stream.Wrapper.convert(stream());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.f19857e) {
            case 0:
                return toArray(f19855e);
            case 1:
                return toArray(f19854e);
            default:
                return toArray(f19856e);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        int i = this.f19857e;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f19857e) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] advert = advert();
                    if (advert != null) {
                        return Arrays.copyOfRange(advert, startapp(), billing(), objArr.getClass());
                    }
                    if (length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size);
                } else if (length > size) {
                    objArr[size] = null;
                }
                appmetrica(objArr);
                return objArr;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] yandex = yandex();
                    if (yandex != null) {
                        return Arrays.copyOfRange(yandex, startapp(), adcel(), objArr.getClass());
                    }
                    if (length2 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size2);
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                smaato(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] yandex2 = yandex();
                    if (yandex2 != null) {
                        return Arrays.copyOfRange(yandex2, startapp(), adcel(), objArr.getClass());
                    }
                    if (length3 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size3);
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                smaato(objArr);
                return objArr;
        }
    }

    public Object[] yandex() {
        switch (this.f19857e) {
            case 1:
                return null;
            default:
                return null;
        }
    }
}
