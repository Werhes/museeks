package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16914e {
    public static final String Signature;
    public static final String adcel;
    public static final String admob;
    public static final String advert;
    public static final String amazon;
    public static final String loadAd;
    public static final String mopub;
    public static final String smaato;
    public final Uri ad;
    public final List appmetrica;
    public final AbstractC17475e billing;
    public final C10384e license;
    public final C8369e metrica;
    public final String purchase;
    public final long startapp;
    public final String vip;
    public final Object yandex;

    static {
        String str = AbstractC9413e.ad;
        adcel = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
        advert = Integer.toString(2, 36);
        smaato = Integer.toString(3, 36);
        amazon = Integer.toString(4, 36);
        loadAd = Integer.toString(5, 36);
        Signature = Integer.toString(6, 36);
        admob = Integer.toString(7, 36);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eٍؕٓ, java.lang.Object] */
    public C16914e(Uri uri, String str, C8369e c8369e, C10384e c10384e, List list, String str2, AbstractC17475e abstractC17475e, Object obj, long j) {
        this.ad = uri;
        this.vip = AbstractC8542e.amazon(str);
        this.metrica = c8369e;
        this.license = c10384e;
        this.appmetrica = list;
        this.purchase = str2;
        this.billing = abstractC17475e;
        C13304e Signature2 = AbstractC17475e.Signature();
        for (int i = 0; i < abstractC17475e.size(); i++) {
            C15875e c15875e = (C15875e) abstractC17475e.get(i);
            ?? obj2 = new Object();
            obj2.license = c15875e.ad;
            obj2.ad = c15875e.vip;
            obj2.appmetrica = c15875e.metrica;
            obj2.vip = c15875e.license;
            obj2.metrica = c15875e.appmetrica;
            obj2.purchase = c15875e.purchase;
            obj2.billing = c15875e.billing;
            Signature2.metrica(new C15875e(obj2));
        }
        Signature2.billing();
        this.yandex = obj;
        this.startapp = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16914e)) {
            return false;
        }
        C16914e c16914e = (C16914e) obj;
        return this.ad.equals(c16914e.ad) && Objects.equals(this.vip, c16914e.vip) && Objects.equals(this.metrica, c16914e.metrica) && Objects.equals(this.license, c16914e.license) && this.appmetrica.equals(c16914e.appmetrica) && Objects.equals(this.purchase, c16914e.purchase) && this.billing.equals(c16914e.billing) && Objects.equals(this.yandex, c16914e.yandex) && this.startapp == c16914e.startapp;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C8369e c8369e = this.metrica;
        int hashCode3 = (hashCode2 + (c8369e == null ? 0 : c8369e.hashCode())) * 31;
        C10384e c10384e = this.license;
        int hashCode4 = (this.appmetrica.hashCode() + ((hashCode3 + (c10384e == null ? 0 : c10384e.hashCode())) * 31)) * 31;
        String str2 = this.purchase;
        int hashCode5 = (this.billing.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        return (int) (((hashCode5 + (this.yandex != null ? r2.hashCode() : 0)) * 31) + this.startapp);
    }
}
