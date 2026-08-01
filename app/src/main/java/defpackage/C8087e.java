package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8087e {
    public final int ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final int vip;

    public C8087e(int i, int i2, String str, String str2, String str3, String str4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = str;
        this.license = str2;
        this.appmetrica = str3;
        this.purchase = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8087e.class == obj.getClass()) {
            C8087e c8087e = (C8087e) obj;
            if (this.ad == c8087e.ad && this.vip == c8087e.vip && TextUtils.equals(this.metrica, c8087e.metrica) && TextUtils.equals(this.license, c8087e.license) && TextUtils.equals(this.appmetrica, c8087e.appmetrica) && TextUtils.equals(this.purchase, c8087e.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.ad * 31) + this.vip) * 31;
        String str = this.metrica;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.license;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appmetrica;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.purchase;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
