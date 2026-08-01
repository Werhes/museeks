package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٕؖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4431e {
    public static final C17283e Companion = new Object();
    public final String ad;
    public final long appmetrica;
    public final long license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C4431e(int i, String str, String str2, String str3, long j, long j2) {
        if (31 != (i & 31)) {
            AbstractC5756e.billing(i, 31, C4121e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = j;
        this.appmetrica = j2;
    }

    public C4431e(long j, long j2, String str, String str2, String str3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = j;
        this.appmetrica = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4431e)) {
            return false;
        }
        C4431e c4431e = (C4431e) obj;
        return AbstractC7890e.billing(this.ad, c4431e.ad) && AbstractC7890e.billing(this.vip, c4431e.vip) && AbstractC7890e.billing(this.metrica, c4431e.metrica) && this.license == c4431e.license && this.appmetrica == c4431e.appmetrica;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
        long j = this.license;
        long j2 = this.appmetrica;
        return ((advert + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastTrackInformation(id=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", artist=");
        sb.append(this.metrica);
        sb.append(", progressCurrent=");
        sb.append(this.license);
        sb.append(", progressTotal=");
        return AbstractC10257e.mopub(sb, this.appmetrica, ')');
    }
}
