package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4839e {
    public final String ad;
    public final String vip;

    public C4839e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4839e)) {
            return false;
        }
        C4839e c4839e = (C4839e) obj;
        return AbstractC6507e.loadAd(c4839e.ad, this.ad, true) && AbstractC6507e.loadAd(c4839e.vip, this.vip, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int hashCode = this.ad.toLowerCase(locale).hashCode();
        return this.vip.toLowerCase(locale).hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.ad);
        sb.append(", value=");
        return AbstractC1786e.signatures(sb, this.vip, ", escapeValue=false)");
    }
}
