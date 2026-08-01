package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۢٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16580e implements Collection, InterfaceC16555e, j$.util.Collection {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f32530e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32531e = 0;

    public C16580e() {
        int i = AbstractC13700e.ad;
        this.f32530e = new C5896e(6);
    }

    public C16580e(C0583e c0583e) {
        this.f32530e = c0583e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f32531e) {
            case 0:
                return ((C5896e) this.f32530e).ad(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f32531e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f32531e) {
            case 0:
                ((C5896e) this.f32530e).vip();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f32531e) {
            case 0:
                return ((C5896e) this.f32530e).metrica(obj);
            default:
                return ((C0583e) this.f32530e).license(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f32531e) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((C5896e) this.f32530e).metrica(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (!((C0583e) this.f32530e).license(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        int i = this.f32531e;
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f32531e) {
            case 0:
                return ((C5896e) this.f32530e).billing == 0;
            default:
                return ((C0583e) this.f32530e).startapp();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f32531e) {
            case 0:
                C5896e c5896e = (C5896e) this.f32530e;
                c5896e.getClass();
                return new C5143e(new C15243e(c5896e));
            default:
                return AbstractC16342e.license(new C17888e(this, null, 3));
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        switch (this.f32531e) {
            case 0:
                return Collection.CC.$default$parallelStream(this);
            default:
                return Collection.CC.$default$parallelStream(this);
        }
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        switch (this.f32531e) {
            case 0:
            default:
                return Stream.Wrapper.convert(parallelStream());
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f32531e) {
            case 0:
                return ((C5896e) this.f32530e).billing(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.f32531e) {
            case 0:
                return ((C5896e) this.f32530e).billing(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f32531e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.f32531e) {
            case 0:
                return ((C5896e) this.f32530e).startapp(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f32531e) {
            case 0:
                return ((C5896e) this.f32530e).billing;
            default:
                return ((C0583e) this.f32530e).appmetrica;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public /* synthetic */ Spliterator spliterator() {
        switch (this.f32531e) {
            case 0:
                return Spliterators.spliterator(this, 0);
            default:
                return Spliterators.spliterator(this, 0);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        switch (this.f32531e) {
            case 0:
            default:
                return Spliterator.Wrapper.convert(spliterator());
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        switch (this.f32531e) {
            case 0:
                return Collection.CC.$default$stream(this);
            default:
                return Collection.CC.$default$stream(this);
        }
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        switch (this.f32531e) {
            case 0:
            default:
                return Stream.Wrapper.convert(stream());
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f32531e) {
            case 0:
                return AbstractC4533e.adcel(this);
            default:
                return AbstractC4533e.adcel(this);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        int i = this.f32531e;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f32531e) {
            case 0:
                return AbstractC4533e.mopub(this, objArr);
            default:
                return AbstractC4533e.mopub(this, objArr);
        }
    }
}
