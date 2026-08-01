package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3885e {
    public static final C15595e Companion = new Object();
    public final int ad;
    public final String metrica;
    public final int vip;

    public /* synthetic */ C3885e(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C0494e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = i3;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3885e)) {
            return false;
        }
        C3885e c3885e = (C3885e) obj;
        return this.ad == c3885e.ad && this.vip == c3885e.vip && AbstractC7890e.billing(this.metrica, c3885e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad * 31) + this.vip) * 31);
    }

    public final String toString() {
        return AbstractC1786e.signatures(AbstractC17861e.pro(this.ad, this.vip, "AuthRefreshTokenErrorDto(index=", ", code=", ", description="), this.metrica, ")");
    }
}
