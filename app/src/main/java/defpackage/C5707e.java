package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘٙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5707e {
    public static final C4222e Companion = new Object();
    public final String ad;
    public final long license;
    public final int metrica;
    public final String vip;

    public /* synthetic */ C5707e(int i, int i2, long j, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C15848e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = i2;
        this.license = j;
    }

    public C5707e(int i, long j, String str, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = i;
        this.license = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5707e)) {
            return false;
        }
        C5707e c5707e = (C5707e) obj;
        return AbstractC7890e.billing(this.ad, c5707e.ad) && AbstractC7890e.billing(this.vip, c5707e.vip) && this.metrica == c5707e.metrica && this.license == c5707e.license;
    }

    public final int hashCode() {
        int advert = (AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + this.metrica) * 31;
        long j = this.license;
        return advert + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.ad);
        sb.append(", firstSessionId=");
        sb.append(this.vip);
        sb.append(", sessionIndex=");
        sb.append(this.metrica);
        sb.append(", sessionStartTimestampUs=");
        return AbstractC10257e.mopub(sb, this.license, ')');
    }
}
