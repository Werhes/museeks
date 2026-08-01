package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍؚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7496e {
    public static final C5036e Companion = new Object();
    public final String ad;
    public final String metrica;
    public final int vip;

    public /* synthetic */ C7496e(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C13667e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = i2;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7496e)) {
            return false;
        }
        C7496e c7496e = (C7496e) obj;
        return AbstractC7890e.billing(this.ad, c7496e.ad) && this.vip == c7496e.vip && AbstractC7890e.billing(this.metrica, c7496e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad.hashCode() * 31) + this.vip) * 31);
    }

    public final String toString() {
        return AbstractC1786e.signatures(AbstractC10257e.smaato("AuthRefreshSilentTokenDto(token=", this.ad, ", expiresIn=", this.vip, ", uuid="), this.metrica, ")");
    }
}
