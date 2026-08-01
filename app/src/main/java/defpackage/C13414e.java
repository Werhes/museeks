package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13414e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f26667e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC5372e f26668e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15105e f26669e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f26670e = true;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC0232e f26671e;

    public C13414e(AbstractC0232e abstractC0232e, C15105e c15105e, InterfaceC5372e interfaceC5372e) {
        this.f26671e = abstractC0232e;
        this.f26669e = c15105e;
        this.f26668e = interfaceC5372e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f26667e) {
            return false;
        }
        C15105e c15105e = this.f26669e;
        if (c15105e.isVip() == 9) {
            this.f26667e = true;
            c15105e.billing((byte) 9);
            if (c15105e.isVip() == 10) {
                return false;
            }
            if (c15105e.isVip() != 8) {
                c15105e.loadAd();
                return false;
            }
            AbstractC8712e.admob(c15105e, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
            throw null;
        }
        if (c15105e.isVip() != 10 || this.f26667e) {
            return true;
        }
        String appmetrica = AbstractC7700e.appmetrica((byte) 9);
        int i = c15105e.vip;
        int i2 = i - 1;
        C4647e c4647e = c15105e.startapp;
        AbstractC8712e.admob(c15105e, AbstractC17861e.subscription("Expected ", appmetrica, ", but had '", (i == c4647e.f9978e || i2 < 0) ? "EOF" : String.valueOf(c4647e.f9979e[i2]), "' instead"), i2, null, 4);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        boolean z = this.f26670e;
        C15105e c15105e = this.f26669e;
        if (z) {
            this.f26670e = false;
        } else {
            c15105e.yandex(',');
        }
        InterfaceC5372e interfaceC5372e = this.f26668e;
        return new C1243e(this.f26671e, EnumC6813e.f14026e, c15105e, interfaceC5372e.appmetrica(), null).billing(interfaceC5372e);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
