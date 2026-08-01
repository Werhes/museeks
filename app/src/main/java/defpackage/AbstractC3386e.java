package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3386e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f7579e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f7580e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7581e = -1;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC3529e f7582e;

    public AbstractC3386e(InterfaceC3529e interfaceC3529e) {
        this.f7582e = interfaceC3529e;
        this.f7580e = interfaceC3529e.startapp();
    }

    public final void ad() {
        if (this.f7582e.startapp() != this.f7580e) {
            throw new ConcurrentModificationException("The underlying RealmDictionary was modified while iterating over its entry set.");
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ad();
        return this.f7579e < this.f7582e.appmetrica();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ad();
        int i = this.f7579e;
        InterfaceC3529e interfaceC3529e = this.f7582e;
        if (i >= interfaceC3529e.appmetrica()) {
            throw new IndexOutOfBoundsException(AbstractC8647e.inmobi(i, interfaceC3529e.appmetrica(), "Cannot access index ", " when size is ", ". Remember to check hasNext() before using next()."));
        }
        Object vip = vip(i);
        this.f7581e = i;
        this.f7579e = i + 1;
        return vip;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ad();
        InterfaceC3529e interfaceC3529e = this.f7582e;
        if (interfaceC3529e.appmetrica() == 0) {
            throw new NoSuchElementException("Could not remove last element returned by the iterator: dictionary is empty.");
        }
        int i = this.f7581e;
        if (i < 0) {
            throw new IllegalStateException("Could not remove last element returned by the iterator: iterator never returned an element.");
        }
        Boolean bool = (Boolean) interfaceC3529e.admob(interfaceC3529e.Signature(i).f13544e).f13543e;
        bool.getClass();
        int i2 = this.f7581e;
        int i3 = this.f7579e;
        if (i2 < i3) {
            this.f7579e = i3 - 1;
        }
        this.f7581e = -1;
        boolean booleanValue = bool.booleanValue();
        this.f7580e = interfaceC3529e.startapp();
        if (!booleanValue) {
            throw new NoSuchElementException("Could not remove last element returned by the iterator: was there an element to remove?");
        }
    }

    public abstract Object vip(int i);
}
