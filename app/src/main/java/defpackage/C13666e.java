package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13666e {
    public final String ad;
    public final ArrayList appmetrica;
    public final C2039e license;
    public final String metrica;
    public final String vip;

    public C13666e(String str, String str2, String str3, C2039e c2039e, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = c2039e;
        this.appmetrica = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13666e)) {
            return false;
        }
        C13666e c13666e = (C13666e) obj;
        if (!AbstractC7890e.billing(this.ad, c13666e.ad) || !AbstractC7890e.billing(this.vip, c13666e.vip) || !AbstractC7890e.billing(this.metrica, c13666e.metrica)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return AbstractC7890e.billing(str, str) && this.license.equals(c13666e.license) && this.appmetrica.equals(c13666e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + ((this.license.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.ad + ", versionName=" + this.vip + ", appBuildVersion=" + this.metrica + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.license + ", appProcessDetails=" + this.appmetrica + ')';
    }
}
