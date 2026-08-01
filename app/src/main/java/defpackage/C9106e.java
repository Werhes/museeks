package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۥً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9106e {
    public final C14980e ad;
    public final boolean metrica;
    public final C14980e vip;

    public C9106e(C14980e c14980e, C14980e c14980e2, boolean z) {
        this.ad = c14980e;
        this.vip = c14980e2;
        this.metrica = z;
    }

    public static C9106e ad(C9106e c9106e, C14980e c14980e, C14980e c14980e2, boolean z, int i) {
        if ((i & 1) != 0) {
            c14980e = c9106e.ad;
        }
        if ((i & 2) != 0) {
            c14980e2 = c9106e.vip;
        }
        if ((i & 4) != 0) {
            z = c9106e.metrica;
        }
        c9106e.getClass();
        return new C9106e(c14980e, c14980e2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9106e)) {
            return false;
        }
        C9106e c9106e = (C9106e) obj;
        return AbstractC7890e.billing(this.ad, c9106e.ad) && AbstractC7890e.billing(this.vip, c9106e.vip) && this.metrica == c9106e.metrica;
    }

    public final int hashCode() {
        return ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + (this.metrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.ad);
        sb.append(", end=");
        sb.append(this.vip);
        sb.append(", handlesCrossed=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}
