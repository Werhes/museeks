package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۦٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2233e {
    public final C4282e ad;
    public final C4282e license;
    public final C4282e metrica;
    public final C4282e vip;

    public C2233e(C4282e c4282e, C4282e c4282e2, C4282e c4282e3, C4282e c4282e4) {
        this.ad = c4282e;
        this.vip = c4282e2;
        this.metrica = c4282e3;
        this.license = c4282e4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2233e)) {
            return false;
        }
        C2233e c2233e = (C2233e) obj;
        return AbstractC7890e.billing(this.ad, c2233e.ad) && AbstractC7890e.billing(this.vip, c2233e.vip) && AbstractC7890e.billing(this.metrica, c2233e.metrica) && AbstractC7890e.billing(this.license, c2233e.license);
    }

    public final int hashCode() {
        C4282e c4282e = this.ad;
        int hashCode = (c4282e != null ? c4282e.hashCode() : 0) * 31;
        C4282e c4282e2 = this.vip;
        int hashCode2 = (hashCode + (c4282e2 != null ? c4282e2.hashCode() : 0)) * 31;
        C4282e c4282e3 = this.metrica;
        int hashCode3 = (hashCode2 + (c4282e3 != null ? c4282e3.hashCode() : 0)) * 31;
        C4282e c4282e4 = this.license;
        return hashCode3 + (c4282e4 != null ? c4282e4.hashCode() : 0);
    }
}
