package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194e {
    public final int ad;
    public final int appmetrica;
    public final int license;
    public final int metrica;
    public final int purchase;
    public final String vip;

    public C0194e(int i, int i2, int i3, int i4, int i5, String str) {
        this.ad = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.vip = str;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0194e) {
            C0194e c0194e = (C0194e) obj;
            if (this.ad == c0194e.ad && this.vip.equals(c0194e.vip) && this.metrica == c0194e.metrica && this.license == c0194e.license && this.appmetrica == c0194e.appmetrica && this.purchase == c0194e.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.ad ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica) * 1000003) ^ this.license) * 1000003) ^ this.appmetrica) * 1000003) ^ this.purchase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.ad);
        sb.append(", mediaType=");
        sb.append(this.vip);
        sb.append(", bitrate=");
        sb.append(this.metrica);
        sb.append(", sampleRate=");
        sb.append(this.license);
        sb.append(", channels=");
        sb.append(this.appmetrica);
        sb.append(", profile=");
        return AbstractC17861e.smaato(this.purchase, "}", sb);
    }
}
