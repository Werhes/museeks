package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٚۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16320e {
    public static final C16320e metrica;
    public final InterfaceC10650e ad;
    public final InterfaceC10650e vip;

    static {
        C11657e c11657e = C11657e.ad;
        metrica = new C16320e(c11657e, c11657e);
    }

    public C16320e(InterfaceC10650e interfaceC10650e, InterfaceC10650e interfaceC10650e2) {
        this.ad = interfaceC10650e;
        this.vip = interfaceC10650e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16320e)) {
            return false;
        }
        C16320e c16320e = (C16320e) obj;
        return AbstractC7890e.billing(this.ad, c16320e.ad) && AbstractC7890e.billing(this.vip, c16320e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.ad + ", height=" + this.vip + ")";
    }
}
