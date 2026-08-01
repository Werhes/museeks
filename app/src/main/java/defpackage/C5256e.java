package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5256e {
    public final C0136e ad;
    public final InterfaceC16538e appmetrica;
    public final InterfaceC12646e license;
    public final InterfaceC11104e metrica;
    public final boolean purchase;
    public final InterfaceC11104e vip;

    public C5256e(C0136e c0136e, InterfaceC11104e interfaceC11104e, InterfaceC11104e interfaceC11104e2, InterfaceC12646e interfaceC12646e, InterfaceC16538e interfaceC16538e, boolean z) {
        this.ad = c0136e;
        this.vip = interfaceC11104e;
        this.metrica = interfaceC11104e2;
        this.license = interfaceC12646e;
        this.appmetrica = interfaceC16538e;
        this.purchase = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [eٖ۟ٝ] */
    /* JADX WARN: Type inference failed for: r8v8, types: [eُِٛ] */
    /* JADX WARN: Type inference failed for: r9v2, types: [eّّٟ] */
    public static C5256e ad(C5256e c5256e, C9770e c9770e, C17974e c17974e, C10328e c10328e, int i) {
        C0136e c0136e = c5256e.ad;
        C9770e c9770e2 = c9770e;
        if ((i & 2) != 0) {
            c9770e2 = c5256e.vip;
        }
        C9770e c9770e3 = c9770e2;
        InterfaceC11104e interfaceC11104e = c5256e.metrica;
        C17974e c17974e2 = c17974e;
        if ((i & 8) != 0) {
            c17974e2 = c5256e.license;
        }
        C17974e c17974e3 = c17974e2;
        C10328e c10328e2 = c10328e;
        if ((i & 16) != 0) {
            c10328e2 = c5256e.appmetrica;
        }
        C10328e c10328e3 = c10328e2;
        boolean z = (i & 32) != 0 ? c5256e.purchase : true;
        c5256e.getClass();
        return new C5256e(c0136e, c9770e3, interfaceC11104e, c17974e3, c10328e3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5256e.class != obj.getClass()) {
            return false;
        }
        C5256e c5256e = (C5256e) obj;
        return AbstractC7890e.billing(this.ad, c5256e.ad) && AbstractC7890e.billing(this.vip, c5256e.vip) && AbstractC7890e.billing(this.metrica, c5256e.metrica) && AbstractC7890e.billing(this.license, c5256e.license) && AbstractC7890e.billing(this.appmetrica, c5256e.appmetrica) && this.purchase == c5256e.purchase;
    }

    public final int hashCode() {
        return ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.purchase ? 1231 : 1237);
    }
}
