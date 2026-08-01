package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُۦۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11396e implements InterfaceC16805e {
    public static final C14860e Companion = new Object();
    public final int ad;
    public final long license;
    public final int metrica;
    public final String vip;

    public /* synthetic */ C11396e(int i, int i2, int i3, long j, String str) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C12793e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        this.metrica = i3;
        this.license = j;
    }

    public C11396e(int i, long j) {
        this.ad = 99167;
        this.vip = "8.12.1_pub";
        this.metrica = i;
        this.license = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11396e)) {
            return false;
        }
        C11396e c11396e = (C11396e) obj;
        return this.ad == c11396e.ad && AbstractC7890e.billing(this.vip, c11396e.vip) && this.metrica == c11396e.metrica && this.license == c11396e.license;
    }

    public final int hashCode() {
        int advert = (AbstractC1786e.advert(this.ad * 31, 31, this.vip) + this.metrica) * 31;
        long j = this.license;
        return advert + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Handshake(appVersionCode=");
        sb.append(this.ad);
        sb.append(", appVersionName=");
        sb.append(this.vip);
        sb.append(", fileCount=");
        sb.append(this.metrica);
        sb.append(", fileTotalSize=");
        return AbstractC10257e.mopub(sb, this.license, ')');
    }
}
