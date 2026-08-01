package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4983e {
    public final String ad;
    public final int metrica;
    public final int vip;
    public static final C4983e license = new C4983e("HTTP", 3, 0);
    public static final C4983e appmetrica = new C4983e("HTTP", 2, 0);
    public static final C4983e purchase = new C4983e("HTTP", 1, 1);
    public static final C4983e billing = new C4983e("HTTP", 1, 0);
    public static final C4983e yandex = new C4983e("SPDY", 3, 0);
    public static final C4983e startapp = new C4983e("QUIC", 1, 0);

    public C4983e(String str, int i, int i2) {
        this.ad = str;
        this.vip = i;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4983e)) {
            return false;
        }
        C4983e c4983e = (C4983e) obj;
        return AbstractC7890e.billing(this.ad, c4983e.ad) && this.vip == c4983e.vip && this.metrica == c4983e.metrica;
    }

    public final int hashCode() {
        return (((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        return this.ad + '/' + this.vip + '.' + this.metrica;
    }
}
