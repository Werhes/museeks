package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2044e {
    public final C16975e ad;
    public final String metrica;
    public final String vip;

    public C2044e(C16975e c16975e, String str, String str2) {
        C11445e ad = c16975e.ad();
        ad.ad = null;
        ad.mopub = null;
        this.ad = new C16975e(ad);
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2044e)) {
            return false;
        }
        C2044e c2044e = (C2044e) obj;
        return Objects.equals(this.ad, c2044e.ad) && Objects.equals(this.vip, c2044e.vip) && Objects.equals(this.metrica, c2044e.metrica);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip, this.metrica);
    }
}
