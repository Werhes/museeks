package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10426e {
    public final String ad;
    public final C13666e vip;

    public C10426e(String str, C13666e c13666e) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.ad = str;
        this.vip = c13666e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10426e)) {
            return false;
        }
        C10426e c10426e = (C10426e) obj;
        if (!AbstractC7890e.billing(this.ad, c10426e.ad)) {
            return false;
        }
        String str = Build.MODEL;
        if (!AbstractC7890e.billing(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return AbstractC7890e.billing(str2, str2) && this.vip.equals(c10426e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + ((EnumC1949e.LOG_ENVIRONMENT_PROD.hashCode() + AbstractC1786e.advert((((Build.MODEL.hashCode() + (this.ad.hashCode() * 31)) * 31) + 48517563) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.ad + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.4, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + EnumC1949e.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.vip + ')';
    }
}
