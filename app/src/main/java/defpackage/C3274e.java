package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3274e {
    public final String ad;
    public final C10985e appmetrica;
    public final C10985e license;
    public final Integer metrica;
    public final Function0 purchase;
    public final String vip;

    public C3274e(String str, String str2, Integer num, C10985e c10985e, C10985e c10985e2, Function0 function0) {
        this.ad = str;
        this.vip = str2;
        this.metrica = num;
        this.license = c10985e;
        this.appmetrica = c10985e2;
        this.purchase = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3274e)) {
            return false;
        }
        C3274e c3274e = (C3274e) obj;
        return AbstractC7890e.billing(this.ad, c3274e.ad) && AbstractC7890e.billing(this.vip, c3274e.vip) && AbstractC7890e.billing(this.metrica, c3274e.metrica) && AbstractC7890e.billing(this.license, c3274e.license) && AbstractC7890e.billing(this.appmetrica, c3274e.appmetrica) && AbstractC7890e.billing(this.purchase, c3274e.purchase);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.metrica;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C10985e c10985e = this.license;
        int hashCode4 = (hashCode3 + (c10985e == null ? 0 : c10985e.hashCode())) * 31;
        C10985e c10985e2 = this.appmetrica;
        int hashCode5 = (hashCode4 + (c10985e2 == null ? 0 : c10985e2.hashCode())) * 31;
        Function0 function0 = this.purchase;
        return hashCode5 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        return "Notification(title=" + this.ad + ", text=" + this.vip + ", iconRes=" + this.metrica + ", primaryButton=" + this.license + ", secondaryButton=" + this.appmetrica + ", actionOnTimeout=" + this.purchase + ')';
    }
}
