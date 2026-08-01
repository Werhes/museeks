package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097e {
    public final InterfaceC12732e ad;
    public final C16401e metrica;
    public final C14542e vip;

    public C1097e(InterfaceC12732e interfaceC12732e, C14542e c14542e, C16401e c16401e) {
        this.ad = interfaceC12732e;
        this.vip = c14542e;
        this.metrica = c16401e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1097e)) {
            return false;
        }
        C1097e c1097e = (C1097e) obj;
        if (!AbstractC7890e.billing(this.ad, c1097e.ad)) {
            return false;
        }
        C16401e c16401e = c1097e.metrica;
        C16401e c16401e2 = this.metrica;
        return AbstractC7890e.billing(c16401e2, c16401e) && c16401e2.ad(this.vip, c1097e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C16401e c16401e = this.metrica;
        return c16401e.vip(this.vip) + ((c16401e.hashCode() + hashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.ad + ", request=" + this.vip + ", modelEqualityDelegate=" + this.metrica + ")";
    }
}
