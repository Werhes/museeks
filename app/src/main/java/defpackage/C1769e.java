package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٌّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769e {
    public static final C11850e Companion = new Object();
    public final C5767e ad;
    public final C5767e license;
    public final C5767e metrica;
    public final C5767e vip;

    public /* synthetic */ C1769e(int i, C5767e c5767e, C5767e c5767e2, C5767e c5767e3, C5767e c5767e4) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C5773e.ad.appmetrica());
            throw null;
        }
        this.ad = c5767e;
        this.vip = c5767e2;
        this.metrica = c5767e3;
        this.license = c5767e4;
    }

    public C1769e(C5767e c5767e, C5767e c5767e2, C5767e c5767e3, C5767e c5767e4) {
        this.ad = c5767e;
        this.vip = c5767e2;
        this.metrica = c5767e3;
        this.license = c5767e4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769e)) {
            return false;
        }
        C1769e c1769e = (C1769e) obj;
        return AbstractC7890e.billing(this.ad, c1769e.ad) && AbstractC7890e.billing(this.vip, c1769e.vip) && AbstractC7890e.billing(this.metrica, c1769e.metrica) && AbstractC7890e.billing(this.license, c1769e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Y25Background(desktop=" + this.ad + ", mobile=" + this.vip + ", story=" + this.metrica + ", post=" + this.license + ")";
    }
}
