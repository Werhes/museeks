package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13123e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f26085e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f26086e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C2246e f26087e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9492e f26088e;

    public /* synthetic */ C13123e(C2246e c2246e, C9492e c9492e, int i) {
        this.f26087e = c2246e;
        this.f26088e = c9492e;
        int i2 = i & 31;
        this.f26086e = i2;
        this.f26085e = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26086e >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f26086e;
        C2246e c2246e = this.f26087e;
        AbstractC9743e abstractC9743e = c2246e.vip;
        int adcel = abstractC9743e.adcel();
        Object cast = this.f26088e.vip.cast(i >= adcel ? c2246e.metrica.advert(i - adcel) : abstractC9743e.advert(i));
        int i2 = this.f26085e;
        if (i2 == 0) {
            this.f26086e = -1;
            return cast;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.f26085e >>>= numberOfTrailingZeros;
        this.f26086e += numberOfTrailingZeros;
        return cast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
