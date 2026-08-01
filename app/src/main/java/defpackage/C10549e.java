package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۜۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10549e {
    public final InterfaceC16046e ad;
    public final C9265e vip;

    public C10549e(InterfaceC16046e interfaceC16046e, C9265e c9265e) {
        this.ad = interfaceC16046e;
        this.vip = c9265e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10549e)) {
            return false;
        }
        C10549e c10549e = (C10549e) obj;
        return AbstractC7890e.billing(c10549e.ad, this.ad) && AbstractC7890e.billing(c10549e.vip, this.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode();
        return this.vip.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.ad + ", typeAttr=" + this.vip + ')';
    }
}
