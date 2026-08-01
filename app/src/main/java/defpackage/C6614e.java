package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6614e {
    public final String ad;
    public final String vip;

    public C6614e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6614e.class != obj.getClass()) {
            return false;
        }
        C6614e c6614e = (C6614e) obj;
        return AbstractC7890e.billing(this.ad, c6614e.ad) && AbstractC7890e.billing(this.vip, c6614e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        return AbstractC8703e.m2467class(1) + ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + 1237) * 31);
    }
}
