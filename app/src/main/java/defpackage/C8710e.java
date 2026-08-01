package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8710e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15587e f17578e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f17579e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f17580e;

    public C8710e(C15587e c15587e) {
        int i;
        this.f17578e = c15587e;
        i = ((AbstractList) c15587e).modCount;
        this.f17579e = i;
    }

    public final void ad() {
        int i;
        int i2;
        C15587e c15587e = this.f17578e;
        i = ((AbstractList) c15587e).modCount;
        int i3 = this.f17579e;
        if (i == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder("ModCount: ");
        i2 = ((AbstractList) c15587e).modCount;
        sb.append(i2);
        sb.append("; expected: ");
        sb.append(i3);
        throw new ConcurrentModificationException(sb.toString());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f17580e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17580e) {
            throw new NoSuchElementException();
        }
        this.f17580e = true;
        ad();
        return this.f17578e.f30751e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ad();
        this.f17578e.clear();
    }
}
