package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4861e {
    public final C0193e ad;
    public final int metrica;
    public final C0193e vip;
    public static final C0193e license = AbstractC5458e.appmetrica(":");
    public static final C0193e appmetrica = AbstractC5458e.appmetrica(":status");
    public static final C0193e purchase = AbstractC5458e.appmetrica(":method");
    public static final C0193e billing = AbstractC5458e.appmetrica(":path");
    public static final C0193e yandex = AbstractC5458e.appmetrica(":scheme");
    public static final C0193e startapp = AbstractC5458e.appmetrica(":authority");

    public C4861e(C0193e c0193e, C0193e c0193e2) {
        this.ad = c0193e;
        this.vip = c0193e2;
        this.metrica = c0193e2.license() + c0193e.license() + 32;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4861e(defpackage.C0193e r3, java.lang.String r4) {
        /*
            r2 = this;
            eًؑۤ r0 = new eًؑۤ
            java.nio.charset.Charset r1 = defpackage.AbstractC5508e.ad
            byte[] r1 = r4.getBytes(r1)
            r0.<init>(r1)
            r0.f1410e = r4
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4861e.<init>(eًؑۤ, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4861e(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            eًؑۤ r0 = new eًؑۤ
            java.nio.charset.Charset r1 = defpackage.AbstractC5508e.ad
            byte[] r2 = r4.getBytes(r1)
            r0.<init>(r2)
            r0.f1410e = r4
            eًؑۤ r4 = new eًؑۤ
            byte[] r1 = r5.getBytes(r1)
            r4.<init>(r1)
            r4.f1410e = r5
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4861e.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4861e)) {
            return false;
        }
        C4861e c4861e = (C4861e) obj;
        return AbstractC7890e.billing(this.ad, c4861e.ad) && AbstractC7890e.billing(this.vip, c4861e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return this.ad.remoteconfig() + ": " + this.vip.remoteconfig();
    }
}
