package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2106e implements List, InterfaceC16555e, j$.util.List {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12328e f5433e = new C12328e(16);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2805e f5432e = new C2805e(16);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f5431e = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long appmetrica() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = defpackage.AbstractC9528e.ad(r0, r1, r1)
            int r2 = r7.f5431e
            int r2 = r2 + 1
            int r3 = defpackage.AbstractC6874e.billing(r7)
            if (r2 > r3) goto L44
        L11:
            eؔۘٚ r4 = r7.f5432e
            if (r2 < 0) goto L3a
            int r5 = r4.vip
            if (r2 >= r5) goto L3d
            long[] r4 = r4.ad
            r5 = r4[r2]
            int r4 = defpackage.AbstractC1574e.metrica(r5, r0)
            if (r4 >= 0) goto L24
            r0 = r5
        L24:
            float r4 = defpackage.AbstractC1574e.license(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = defpackage.AbstractC1574e.purchase(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r0 = "Index must be between 0 and size"
            defpackage.AbstractC14783e.yandex(r0)
            r0 = 0
            throw r0
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2106e.appmetrica():long");
    }

    public final void billing(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.f5433e.amazon(i, i2);
        C2805e c2805e = this.f5432e;
        if (i >= 0) {
            int i3 = c2805e.vip;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    AbstractC14783e.billing("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = c2805e.ad;
                        AbstractC1660e.adcel(i, i2, i3, jArr, jArr);
                    }
                    c2805e.vip -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            c2805e.getClass();
        }
        AbstractC14783e.yandex("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f5431e = -1;
        this.f5433e.purchase();
        this.f5432e.vip = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC13616e) && indexOf((AbstractC13616e) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC13616e) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (AbstractC13616e) this.f5433e.yandex(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC13616e)) {
            return -1;
        }
        AbstractC13616e abstractC13616e = (AbstractC13616e) obj;
        int billing = AbstractC6874e.billing(this);
        if (billing >= 0) {
            int i = 0;
            while (!AbstractC7890e.billing(this.f5433e.yandex(i), abstractC13616e)) {
                if (i != billing) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5433e.adcel();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C11045e(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC13616e)) {
            return -1;
        }
        AbstractC13616e abstractC13616e = (AbstractC13616e) obj;
        for (int billing = AbstractC6874e.billing(this); -1 < billing; billing--) {
            if (AbstractC7890e.billing(this.f5433e.yandex(billing), abstractC13616e)) {
                return billing;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C11045e(this, 0, 7);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C11045e(this, i, 6);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5433e.vip;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C16441e(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }
}
