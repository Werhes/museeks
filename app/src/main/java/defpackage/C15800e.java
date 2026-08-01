package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۢٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15800e extends AbstractC3053e {
    public C15800e(InterfaceC1108e interfaceC1108e, InterfaceC8850e interfaceC8850e, int i, int i2, int i3) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? C2693e.f6576e : interfaceC8850e, interfaceC1108e);
    }

    @Override // defpackage.AbstractC3053e
    public final Object adcel(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        Object ad = this.f7111e.ad(interfaceC6034e, interfaceC5083e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC9910e
    public final AbstractC9910e billing(InterfaceC8850e interfaceC8850e, int i, int i2) {
        return new AbstractC3053e(i, i2, interfaceC8850e, this.f7111e);
    }

    @Override // defpackage.AbstractC9910e
    public final InterfaceC1108e yandex() {
        return this.f7111e;
    }
}
