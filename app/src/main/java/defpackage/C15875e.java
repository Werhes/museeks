package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15875e {
    public static final String adcel;
    public static final String advert;
    public static final String amazon;
    public static final String mopub;
    public static final String smaato;
    public static final String startapp;
    public static final String yandex;
    public final Uri ad;
    public final int appmetrica;
    public final String billing;
    public final int license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    static {
        String str = AbstractC9413e.ad;
        yandex = Integer.toString(0, 36);
        startapp = Integer.toString(1, 36);
        adcel = Integer.toString(2, 36);
        mopub = Integer.toString(3, 36);
        advert = Integer.toString(4, 36);
        smaato = Integer.toString(5, 36);
        amazon = Integer.toString(6, 36);
    }

    public C15875e(C9237e c9237e) {
        this.ad = (Uri) c9237e.license;
        this.vip = c9237e.ad;
        this.metrica = (String) c9237e.appmetrica;
        this.license = c9237e.vip;
        this.appmetrica = c9237e.metrica;
        this.purchase = (String) c9237e.purchase;
        this.billing = (String) c9237e.billing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15875e)) {
            return false;
        }
        C15875e c15875e = (C15875e) obj;
        return this.ad.equals(c15875e.ad) && Objects.equals(this.vip, c15875e.vip) && Objects.equals(this.metrica, c15875e.metrica) && this.license == c15875e.license && this.appmetrica == c15875e.appmetrica && Objects.equals(this.purchase, c15875e.purchase) && Objects.equals(this.billing, c15875e.billing);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metrica;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.license) * 31) + this.appmetrica) * 31;
        String str3 = this.purchase;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billing;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
