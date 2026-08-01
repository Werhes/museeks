package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؒۢؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1398e {
    public static final C4539e Companion = new Object();
    public final String ad;
    public final String vip;

    public /* synthetic */ C1398e(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C14563e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1398e)) {
            return false;
        }
        C1398e c1398e = (C1398e) obj;
        return AbstractC7890e.billing(this.ad, c1398e.ad) && AbstractC7890e.billing(this.vip, c1398e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC17861e.subscription("AuthAgreementLinkDto(name=", this.ad, ", uri=", this.vip, ")");
    }
}
