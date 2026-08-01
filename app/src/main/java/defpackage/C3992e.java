package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3992e {
    public final boolean ad;
    public final boolean adcel;
    public final String appmetrica;
    public final List billing;
    public final String license;
    public final AbstractC7244e metrica;
    public final C8398e mopub;
    public final List purchase;
    public final boolean startapp;
    public final List vip;
    public final boolean yandex;

    public C3992e(boolean z, AbstractC17475e abstractC17475e, AbstractC7244e abstractC7244e, String str, String str2, AbstractC17475e abstractC17475e2, AbstractC17475e abstractC17475e3, boolean z2, boolean z3, boolean z4, C8398e c8398e) {
        this.ad = z;
        this.vip = abstractC17475e;
        this.metrica = abstractC7244e;
        this.license = str;
        this.appmetrica = str2;
        this.purchase = abstractC17475e2;
        this.billing = abstractC17475e3;
        this.yandex = z2;
        this.startapp = z3;
        this.adcel = z4;
        this.mopub = c8398e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3992e)) {
            return false;
        }
        C3992e c3992e = (C3992e) obj;
        return this.ad == c3992e.ad && AbstractC7890e.billing(this.vip, c3992e.vip) && AbstractC7890e.billing(this.metrica, c3992e.metrica) && AbstractC7890e.billing(this.license, c3992e.license) && AbstractC7890e.billing(this.appmetrica, c3992e.appmetrica) && AbstractC7890e.billing(this.purchase, c3992e.purchase) && AbstractC7890e.billing(this.billing, c3992e.billing) && this.yandex == c3992e.yandex && this.startapp == c3992e.startapp && this.adcel == c3992e.adcel && AbstractC7890e.billing(this.mopub, c3992e.mopub);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.ad), this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, Boolean.valueOf(this.yandex), Boolean.valueOf(this.startapp), Boolean.valueOf(this.adcel));
    }

    public final String toString() {
        boolean z = this.ad;
        int length = String.valueOf(z).length();
        List list = this.vip;
        int length2 = String.valueOf(list).length();
        AbstractC7244e abstractC7244e = this.metrica;
        int length3 = String.valueOf(abstractC7244e).length();
        String str = this.license;
        int length4 = String.valueOf(str).length();
        String str2 = this.appmetrica;
        int length5 = String.valueOf(str2).length();
        List list2 = this.purchase;
        int length6 = String.valueOf(list2).length();
        List list3 = this.billing;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.yandex;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.startapp;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.adcel;
        int length10 = String.valueOf(z4).length();
        C8398e c8398e = this.mopub;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(c8398e).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(abstractC7244e);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(c8398e);
        sb.append(")");
        return sb.toString();
    }
}
