package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٞۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11154e {
    public final C4541e ad;
    public final int license;
    public final boolean metrica;
    public final C2697e vip;

    public C11154e(C4541e c4541e, C2697e c2697e, boolean z, int i) {
        this.ad = c4541e;
        this.vip = c2697e;
        this.metrica = z;
        this.license = i;
    }

    public final boolean ad() {
        return this.ad != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11154e)) {
            return false;
        }
        C11154e c11154e = (C11154e) obj;
        return Objects.equals(this.ad, c11154e.ad) && Objects.equals(this.vip, c11154e.vip) && this.metrica == c11154e.metrica && this.license == c11154e.license;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.license), Boolean.valueOf(this.metrica), this.ad, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(Playlist mMasterPlaylist=");
        sb.append(this.ad);
        sb.append(" mMediaPlaylist=");
        sb.append(this.vip);
        sb.append(" mIsExtended=");
        sb.append(this.metrica);
        sb.append(" mCompatibilityVersion=");
        return AbstractC17861e.smaato(this.license, ")", sb);
    }
}
