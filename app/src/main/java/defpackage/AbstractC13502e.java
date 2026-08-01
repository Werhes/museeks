package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13502e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f26778e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f26779e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f26780e = C9709e.appmetrica.license;

    public final void ad(int i, int i2, Object[] objArr) {
        this.f26780e = objArr;
        this.f26779e = i;
        this.f26778e = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26778e < this.f26779e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
