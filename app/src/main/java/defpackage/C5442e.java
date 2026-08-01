package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5442e {
    public static final C13103e Companion = new Object();
    public final int ad;
    public final C18236e appmetrica;
    public final String license;
    public final long metrica;
    public final String vip;

    public /* synthetic */ C5442e(int i, int i2, String str, C5655e c5655e, String str2, C18236e c18236e) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C5012e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        this.metrica = c5655e.ad;
        this.license = str2;
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = c18236e;
        }
    }

    public C5442e(int i, String str, long j, String str2, C18236e c18236e) {
        this.ad = i;
        this.vip = str;
        this.metrica = j;
        this.license = str2;
        this.appmetrica = c18236e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5442e)) {
            return false;
        }
        C5442e c5442e = (C5442e) obj;
        return this.ad == c5442e.ad && AbstractC7890e.billing(this.vip, c5442e.vip) && C5655e.ad(this.metrica, c5442e.metrica) && AbstractC7890e.billing(this.license, c5442e.license) && AbstractC7890e.billing(this.appmetrica, c5442e.appmetrica);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert((C5655e.vip(this.metrica) + AbstractC1786e.advert(this.ad * 31, 31, this.vip)) * 31, 31, this.license);
        C18236e c18236e = this.appmetrica;
        return advert + (c18236e == null ? 0 : c18236e.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.metrica);
        StringBuilder sb = new StringBuilder("AudioAudioAlbumDto(id=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", ownerId=");
        AbstractC13501e.Signature(sb, valueOf, ", accessKey=", this.license, ", thumb=");
        sb.append(this.appmetrica);
        sb.append(")");
        return sb.toString();
    }
}
