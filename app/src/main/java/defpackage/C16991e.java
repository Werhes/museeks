package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٗٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16991e {
    public static final C8768e Companion = new Object();
    public final String ad;
    public final String vip;

    public /* synthetic */ C16991e(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C9448e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16991e)) {
            return false;
        }
        C16991e c16991e = (C16991e) obj;
        return AbstractC7890e.billing(this.ad, c16991e.ad) && AbstractC7890e.billing(this.vip, c16991e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC17861e.subscription("Y25ContentVideoType(type=", this.ad, ", url=", this.vip, ")");
    }
}
