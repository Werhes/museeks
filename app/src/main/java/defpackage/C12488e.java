package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12488e implements InterfaceC18449e {
    public final String ad;
    public final int adcel;
    public final int appmetrica;
    public final int billing;
    public final Size license;
    public final EnumC14627e metrica;
    public final C7248e purchase;
    public final int startapp;
    public final int vip;
    public final int yandex;

    public C12488e(String str, int i, EnumC14627e enumC14627e, Size size, int i2, C7248e c7248e, int i3, int i4, int i5, int i6) {
        this.ad = str;
        this.vip = i;
        this.metrica = enumC14627e;
        this.license = size;
        this.appmetrica = i2;
        this.purchase = c7248e;
        this.billing = i3;
        this.yandex = i4;
        this.startapp = i5;
        this.adcel = i6;
    }

    public static C14742e license() {
        C14742e c14742e = new C14742e(2);
        c14742e.metrica = -1;
        c14742e.adcel = 1;
        c14742e.purchase = 2130708361;
        c14742e.billing = C7248e.license;
        return c14742e;
    }

    @Override // defpackage.InterfaceC18449e
    public final MediaFormat ad() {
        Size size = this.license;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.ad, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", this.appmetrica);
        createVideoFormat.setInteger("bitrate", this.adcel);
        int i = this.yandex;
        createVideoFormat.setInteger("frame-rate", i);
        int i2 = this.billing;
        if (i2 > i) {
            createVideoFormat.setInteger("capture-rate", i2);
            createVideoFormat.setInteger("operating-rate", i2);
            createVideoFormat.setInteger("priority", 0);
        }
        createVideoFormat.setInteger("i-frame-interval", this.startapp);
        int i3 = this.vip;
        if (i3 != -1) {
            createVideoFormat.setInteger("profile", i3);
        }
        C7248e c7248e = this.purchase;
        int i4 = c7248e.ad;
        if (i4 != 0) {
            createVideoFormat.setInteger("color-standard", i4);
        }
        int i5 = c7248e.vip;
        if (i5 != 0) {
            createVideoFormat.setInteger("color-transfer", i5);
        }
        int i6 = c7248e.metrica;
        if (i6 != 0) {
            createVideoFormat.setInteger("color-range", i6);
        }
        return createVideoFormat;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12488e) {
            C12488e c12488e = (C12488e) obj;
            if (this.ad.equals(c12488e.ad) && this.vip == c12488e.vip && this.metrica.equals(c12488e.metrica) && this.license.equals(c12488e.license) && this.appmetrica == c12488e.appmetrica && this.purchase.equals(c12488e.purchase) && this.billing == c12488e.billing && this.yandex == c12488e.yandex && this.startapp == c12488e.startapp && this.adcel == c12488e.adcel) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ this.billing) * 1000003) ^ this.yandex) * 1000003) ^ this.startapp) * 1000003) ^ this.adcel;
    }

    @Override // defpackage.InterfaceC18449e
    public final String metrica() {
        return this.ad;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.ad);
        sb.append(", profile=");
        sb.append(this.vip);
        sb.append(", inputTimebase=");
        sb.append(this.metrica);
        sb.append(", resolution=");
        sb.append(this.license);
        sb.append(", colorFormat=");
        sb.append(this.appmetrica);
        sb.append(", dataSpace=");
        sb.append(this.purchase);
        sb.append(", captureFrameRate=");
        sb.append(this.billing);
        sb.append(", encodeFrameRate=");
        sb.append(this.yandex);
        sb.append(", IFrameInterval=");
        sb.append(this.startapp);
        sb.append(", bitrate=");
        return AbstractC17861e.smaato(this.adcel, "}", sb);
    }

    @Override // defpackage.InterfaceC18449e
    public final EnumC14627e vip() {
        return this.metrica;
    }
}
