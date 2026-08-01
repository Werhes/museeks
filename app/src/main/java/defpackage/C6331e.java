package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6331e {
    public final Size ad;
    public final Size appmetrica;
    public final LinkedHashMap billing;
    public final LinkedHashMap license;
    public final Size metrica;
    public final LinkedHashMap purchase;
    public final LinkedHashMap startapp;
    public final LinkedHashMap vip;
    public final LinkedHashMap yandex;

    public C6331e(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.ad = size;
        this.vip = linkedHashMap;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.metrica = size2;
        this.license = linkedHashMap2;
        this.appmetrica = size3;
        this.purchase = linkedHashMap3;
        this.billing = linkedHashMap4;
        this.yandex = linkedHashMap5;
        this.startapp = linkedHashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6331e)) {
            return false;
        }
        C6331e c6331e = (C6331e) obj;
        return this.ad.equals(c6331e.ad) && this.vip.equals(c6331e.vip) && this.metrica.equals(c6331e.metrica) && this.license.equals(c6331e.license) && this.appmetrica.equals(c6331e.appmetrica) && this.purchase.equals(c6331e.purchase) && this.billing.equals(c6331e.billing) && this.yandex.equals(c6331e.yandex) && this.startapp.equals(c6331e.startapp);
    }

    public final int hashCode() {
        return ((((((((((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica.hashCode()) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ this.billing.hashCode()) * 1000003) ^ this.yandex.hashCode()) * 1000003) ^ this.startapp.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.ad + ", s720pSizeMap=" + this.vip + ", previewSize=" + this.metrica + ", s1440pSizeMap=" + this.license + ", recordSize=" + this.appmetrica + ", maximumSizeMap=" + this.purchase + ", maximum4x3SizeMap=" + this.billing + ", maximum16x9SizeMap=" + this.yandex + ", ultraMaximumSizeMap=" + this.startapp + "}";
    }
}
