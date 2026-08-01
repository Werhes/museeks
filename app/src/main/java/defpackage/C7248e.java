package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7248e {
    public final int ad;
    public final int metrica;
    public final int vip;
    public static final C7248e license = new C7248e(0, 0, 0);
    public static final C7248e appmetrica = new C7248e(1, 3, 2);
    public static final C7248e purchase = new C7248e(1, 3, 1);
    public static final C7248e billing = new C7248e(6, 7, 1);
    public static final C7248e yandex = new C7248e(6, 6, 1);

    public C7248e(int i, int i2, int i3) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7248e)) {
            return false;
        }
        C7248e c7248e = (C7248e) obj;
        return this.ad == c7248e.ad && this.vip == c7248e.vip && this.metrica == c7248e.metrica;
    }

    public final int hashCode() {
        return ((((this.ad ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.ad);
        sb.append(", transfer=");
        sb.append(this.vip);
        sb.append(", range=");
        return AbstractC17861e.smaato(this.metrica, "}", sb);
    }
}
