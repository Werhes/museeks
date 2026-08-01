package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3296e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f7452e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f7453e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7454e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f7455e;

    public C3296e(int i, int i2, int i3) {
        this.f7455e = i3;
        this.f7453e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f7452e = z;
        this.f7454e = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7452e;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f7454e;
        if (i != this.f7453e) {
            this.f7454e = this.f7455e + i;
            return i;
        }
        if (!this.f7452e) {
            throw new NoSuchElementException();
        }
        this.f7452e = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
