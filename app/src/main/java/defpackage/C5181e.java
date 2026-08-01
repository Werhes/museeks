package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘؗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5181e {
    public static final C13063e Companion = new Object();
    public final int ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C5181e(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C0441e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5181e)) {
            return false;
        }
        C5181e c5181e = (C5181e) obj;
        return this.ad == c5181e.ad && AbstractC7890e.billing(this.vip, c5181e.vip) && AbstractC7890e.billing(this.metrica, c5181e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1786e.advert(this.ad * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineAccent(id=");
        sb.append(this.ad);
        sb.append(", name=");
        sb.append(this.vip);
        sb.append(", hex=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
