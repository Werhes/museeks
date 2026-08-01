package defpackage;

import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1900e {
    public final int ad;
    public final int adcel;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final int metrica;
    public final int purchase;
    public final int startapp;
    public final String vip;
    public final int yandex;

    public C1900e(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.ad = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.vip = str;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = i5;
        this.billing = i6;
        this.yandex = i7;
        this.startapp = i8;
        this.adcel = i9;
    }

    public final Size ad() {
        return new Size(this.appmetrica, this.purchase);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1900e) {
            C1900e c1900e = (C1900e) obj;
            if (this.ad == c1900e.ad && this.vip.equals(c1900e.vip) && this.metrica == c1900e.metrica && this.license == c1900e.license && this.appmetrica == c1900e.appmetrica && this.purchase == c1900e.purchase && this.billing == c1900e.billing && this.yandex == c1900e.yandex && this.startapp == c1900e.startapp && this.adcel == c1900e.adcel) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.ad ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica) * 1000003) ^ this.license) * 1000003) ^ this.appmetrica) * 1000003) ^ this.purchase) * 1000003) ^ this.billing) * 1000003) ^ this.yandex) * 1000003) ^ this.startapp) * 1000003) ^ this.adcel;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.ad);
        sb.append(", mediaType=");
        sb.append(this.vip);
        sb.append(", bitrate=");
        sb.append(this.metrica);
        sb.append(", frameRate=");
        sb.append(this.license);
        sb.append(", width=");
        sb.append(this.appmetrica);
        sb.append(", height=");
        sb.append(this.purchase);
        sb.append(", profile=");
        sb.append(this.billing);
        sb.append(", bitDepth=");
        sb.append(this.yandex);
        sb.append(", chromaSubsampling=");
        sb.append(this.startapp);
        sb.append(", hdrFormat=");
        return AbstractC17861e.smaato(this.adcel, "}", sb);
    }
}
