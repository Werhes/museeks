package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6904e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC5372e f14149e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15105e f14150e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC0232e f14151e;

    public C6904e(AbstractC0232e abstractC0232e, C15105e c15105e, InterfaceC5372e interfaceC5372e) {
        this.f14151e = abstractC0232e;
        this.f14150e = c15105e;
        this.f14149e = interfaceC5372e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14150e.isVip() != 10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC5372e interfaceC5372e = this.f14149e;
        return new C1243e(this.f14151e, EnumC6813e.f14026e, this.f14150e, interfaceC5372e.appmetrica(), null).billing(interfaceC5372e);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
