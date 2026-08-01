package defpackage;

import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15722e {
    public static final C9440e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {AbstractC18039e.appmetrica(2, new C8462e(19)), null, null, null};
    public final Map ad;
    public final String license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C15722e(int i, String str, String str2, String str3, Map map) {
        this.ad = (i & 1) == 0 ? C9139e.f18290e : map;
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = BuildConfig.FLAVOR;
        } else {
            this.metrica = str2;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15722e)) {
            return false;
        }
        C15722e c15722e = (C15722e) obj;
        return AbstractC7890e.billing(this.ad, c15722e.ad) && AbstractC7890e.billing(this.vip, c15722e.vip) && AbstractC7890e.billing(this.metrica, c15722e.metrica) && AbstractC7890e.billing(this.license, c15722e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleConfigStruct(entries=");
        sb.append(this.ad);
        sb.append(", appName=");
        sb.append(this.vip);
        sb.append(", state=");
        sb.append(this.metrica);
        sb.append(", templateVersion=");
        return AbstractC4653e.applovin(sb, this.license, ')');
    }
}
