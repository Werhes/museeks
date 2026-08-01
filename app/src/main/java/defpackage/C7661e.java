package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7661e {
    public final String ad;
    public final String license;
    public final double metrica;
    public final int vip;

    public C7661e(String str, double d) {
        this.ad = str;
        this.vip = 2;
        this.metrica = d;
        this.license = null;
    }

    public C7661e(String str, int i, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        AbstractC2301e.subscription(z);
        this.ad = str;
        this.vip = i;
        this.license = str2;
        this.metrica = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7661e)) {
            return false;
        }
        C7661e c7661e = (C7661e) obj;
        return this.vip == c7661e.vip && Double.compare(this.metrica, c7661e.metrica) == 0 && Objects.equals(this.ad, c7661e.ad) && Objects.equals(this.license, c7661e.license);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, Integer.valueOf(this.vip), Double.valueOf(this.metrica), this.license);
    }
}
