package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4268e {
    public final String ad;
    public final int appmetrica;
    public final int license;
    public final C16975e metrica;
    public final C16975e vip;

    public C4268e(String str, C16975e c16975e, C16975e c16975e2, int i, int i2) {
        AbstractC2301e.billing(i == 0 || i2 == 0);
        AbstractC2301e.billing(true ^ TextUtils.isEmpty(str));
        this.ad = str;
        c16975e.getClass();
        this.vip = c16975e;
        c16975e2.getClass();
        this.metrica = c16975e2;
        this.license = i;
        this.appmetrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4268e.class == obj.getClass()) {
            C4268e c4268e = (C4268e) obj;
            if (this.license == c4268e.license && this.appmetrica == c4268e.appmetrica && this.ad.equals(c4268e.ad) && this.vip.equals(c4268e.vip) && this.metrica.equals(c4268e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + AbstractC1786e.advert((((527 + this.license) * 31) + this.appmetrica) * 31, 31, this.ad)) * 31);
    }
}
