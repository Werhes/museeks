package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12027e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f24048e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f24049e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f24050e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f24051e;

    public C12027e(long j, long j2, long j3) {
        this.f24051e = j3;
        this.f24049e = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f24048e = z;
        this.f24050e = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24048e;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public final long nextLong() {
        long j = this.f24050e;
        if (j != this.f24049e) {
            this.f24050e = this.f24051e + j;
            return j;
        }
        if (!this.f24048e) {
            throw new NoSuchElementException();
        }
        this.f24048e = false;
        return j;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
