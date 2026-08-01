package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٜؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3503e {
    public static final C5328e Companion = new Object();
    public final String ad;
    public final int vip;

    public /* synthetic */ C3503e(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C15882e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3503e)) {
            return false;
        }
        C3503e c3503e = (C3503e) obj;
        return AbstractC7890e.billing(this.ad, c3503e.ad) && this.vip == c3503e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        return "AuthRefreshWebviewRefreshTokenDto(token=" + this.ad + ", expiresIn=" + this.vip + ")";
    }
}
