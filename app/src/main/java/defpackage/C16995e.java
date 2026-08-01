package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16995e {
    public final int ad;
    public final boolean appmetrica;
    public final long license;
    public final long metrica;
    public final int purchase;
    public final int vip;

    public C16995e(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.ad = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.vip = i2;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = z;
        this.purchase = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16995e)) {
            return false;
        }
        C16995e c16995e = (C16995e) obj;
        if (this.ad != c16995e.ad) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.vip != c16995e.vip || this.metrica != c16995e.metrica || this.license != c16995e.license || this.appmetrica != c16995e.appmetrica || this.purchase != c16995e.purchase) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int hashCode = (((((this.ad ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.vip) * 1000003;
        long j = this.metrica;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.license;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.appmetrica ? 1231 : 1237)) * 1000003) ^ this.purchase) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.ad);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.vip);
        sb.append(", totalRam=");
        sb.append(this.metrica);
        sb.append(", diskSpace=");
        sb.append(this.license);
        sb.append(", isEmulator=");
        sb.append(this.appmetrica);
        sb.append(", state=");
        sb.append(this.purchase);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return AbstractC1786e.signatures(sb, Build.PRODUCT, "}");
    }
}
