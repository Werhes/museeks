package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3984e {
    public static final C1379e Companion = new Object();
    public final String ad;
    public final int vip;

    public /* synthetic */ C3984e(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C8860e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3984e)) {
            return false;
        }
        C3984e c3984e = (C3984e) obj;
        return AbstractC7890e.billing(this.ad, c3984e.ad) && this.vip == c3984e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        return "AuthRefreshAccessTokenDto(token=" + this.ad + ", expiresIn=" + this.vip + ")";
    }
}
