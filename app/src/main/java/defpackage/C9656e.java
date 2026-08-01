package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍٟۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9656e {
    public static final C5946e Companion = new Object();
    public final int ad;
    public final String metrica;
    public final long vip;

    public /* synthetic */ C9656e(int i, int i2, C5655e c5655e, String str) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C9491e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = c5655e.ad;
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9656e)) {
            return false;
        }
        C9656e c9656e = (C9656e) obj;
        return this.ad == c9656e.ad && C5655e.ad(this.vip, c9656e.vip) && AbstractC7890e.billing(this.metrica, c9656e.metrica);
    }

    public final int hashCode() {
        int vip = (C5655e.vip(this.vip) + (this.ad * 31)) * 31;
        String str = this.metrica;
        return vip + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.vip);
        StringBuilder sb = new StringBuilder("AudioPlaylistOriginalFollowedDto(playlistId=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(valueOf);
        sb.append(", accessKey=");
        return AbstractC1786e.signatures(sb, this.metrica, ")");
    }
}
