package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17798e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f34885e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f34886e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C11313e f34887e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f34888e;

    public C17798e(C11313e c11313e) {
        this.f34887e = c11313e;
        this.f34888e = c11313e.f22700e;
        this.f34886e = c11313e.isEmpty() ? -1 : 0;
        this.f34885e = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34886e >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C11313e c11313e = this.f34887e;
        if (c11313e.f22700e != this.f34888e) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f34886e;
        this.f34885e = i;
        Object obj = c11313e.startapp()[i];
        int i2 = this.f34886e + 1;
        if (i2 >= c11313e.f22697e) {
            i2 = -1;
        }
        this.f34886e = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C11313e c11313e = this.f34887e;
        if (c11313e.f22700e != this.f34888e) {
            throw new ConcurrentModificationException();
        }
        AbstractC2301e.admob("no calls to next() since the last call to remove()", this.f34885e >= 0);
        this.f34888e += 32;
        c11313e.remove(c11313e.startapp()[this.f34885e]);
        this.f34886e--;
        this.f34885e = -1;
    }
}
