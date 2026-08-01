package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۛٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10528e implements Iterator {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f20783e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20784e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C3311e f20785e = null;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C17406e f20786e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C3311e f20787e;

    public C10528e(C17406e c17406e, int i) {
        this.f20783e = i;
        this.f20786e = c17406e;
        this.f20787e = c17406e.f34119e.f7474e;
        this.f20784e = c17406e.f34118e;
    }

    public final Object ad() {
        return vip();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20787e != this.f20786e.f34119e;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f20783e) {
            case 1:
                return vip().f7478e;
            default:
                return ad();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3311e c3311e = this.f20785e;
        if (c3311e == null) {
            throw new IllegalStateException();
        }
        C17406e c17406e = this.f20786e;
        c17406e.metrica(c3311e, true);
        this.f20785e = null;
        this.f20784e = c17406e.f34118e;
    }

    public final C3311e vip() {
        C3311e c3311e = this.f20787e;
        C17406e c17406e = this.f20786e;
        if (c3311e == c17406e.f34119e) {
            throw new NoSuchElementException();
        }
        if (c17406e.f34118e != this.f20784e) {
            throw new ConcurrentModificationException();
        }
        this.f20787e = c3311e.f7474e;
        this.f20785e = c3311e;
        return c3311e;
    }
}
