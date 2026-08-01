package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۥُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18483e {
    public final String ad;
    public final String adcel;
    public final String appmetrica;
    public final boolean billing;
    public final String license;
    public final long metrica;
    public final boolean purchase;
    public final boolean startapp;
    public final String vip;
    public final boolean yandex;
    public static final Pattern mopub = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern advert = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern smaato = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern amazon = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C18483e(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
        this.license = str3;
        this.appmetrica = str4;
        this.purchase = z;
        this.billing = z2;
        this.yandex = z3;
        this.startapp = z4;
        this.adcel = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18483e)) {
            return false;
        }
        C18483e c18483e = (C18483e) obj;
        return AbstractC7890e.billing(c18483e.ad, this.ad) && AbstractC7890e.billing(c18483e.vip, this.vip) && c18483e.metrica == this.metrica && AbstractC7890e.billing(c18483e.license, this.license) && AbstractC7890e.billing(c18483e.appmetrica, this.appmetrica) && c18483e.purchase == this.purchase && c18483e.billing == this.billing && c18483e.yandex == this.yandex && c18483e.startapp == this.startapp && AbstractC7890e.billing(c18483e.adcel, this.adcel);
    }

    public final int hashCode() {
        int advert2 = AbstractC1786e.advert(AbstractC1786e.advert(527, 31, this.ad), 31, this.vip);
        long j = this.metrica;
        int advert3 = (((((((AbstractC1786e.advert(AbstractC1786e.advert((advert2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.license), 31, this.appmetrica) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.yandex ? 1231 : 1237)) * 31) + (this.startapp ? 1231 : 1237)) * 31;
        String str = this.adcel;
        return advert3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append('=');
        sb.append(this.vip);
        if (this.yandex) {
            long j = this.metrica;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) AbstractC8057e.ad.get()).format(new Date(j)));
            }
        }
        if (!this.startapp) {
            sb.append("; domain=");
            sb.append(this.license);
        }
        sb.append("; path=");
        sb.append(this.appmetrica);
        if (this.purchase) {
            sb.append("; secure");
        }
        if (this.billing) {
            sb.append("; httponly");
        }
        String str = this.adcel;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }
}
