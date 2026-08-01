package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7313e implements InterfaceC5372e {
    public final InterfaceC5372e ad;
    public final C0899e vip;

    public C7313e(InterfaceC5372e interfaceC5372e) {
        this.ad = interfaceC5372e;
        this.vip = new C0899e(interfaceC5372e.appmetrica());
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        if (obj == null) {
            interfaceC5757e.license();
        } else {
            interfaceC5757e.smaato();
            interfaceC5757e.appmetrica(this.ad, obj);
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return this.vip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7313e.class == obj.getClass() && AbstractC7890e.billing(this.ad, ((C7313e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        if (interfaceC11754e.isVip()) {
            return interfaceC11754e.billing(this.ad);
        }
        interfaceC11754e.Signature();
        return null;
    }
}
