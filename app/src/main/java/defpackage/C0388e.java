package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388e {
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public C0388e(String str, String str2, String str3, String str4, String str5) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0388e) && AbstractC7890e.billing(((C0388e) obj).ad, this.ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad;
    }
}
