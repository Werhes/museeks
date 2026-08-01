package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٖٚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16321e {
    public static final C6441e Companion = new Object();
    public final String ad;
    public final String metrica;
    public final long vip;

    public /* synthetic */ C16321e(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C8858e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = j;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16321e)) {
            return false;
        }
        C16321e c16321e = (C16321e) obj;
        return AbstractC7890e.billing(this.ad, c16321e.ad) && this.vip == c16321e.vip && AbstractC7890e.billing(this.metrica, c16321e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return this.metrica.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Y25Playlist(title=");
        sb.append(this.ad);
        sb.append(", id=");
        sb.append(this.vip);
        return AbstractC8647e.ads(sb, ", photoUrl=", this.metrica, ")");
    }
}
