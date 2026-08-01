package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٝٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10405e {
    public final long ad;
    public final long metrica;
    public final long vip;

    public C10405e(long j, long j2, long j3) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10405e.class != obj.getClass()) {
            return false;
        }
        C10405e c10405e = (C10405e) obj;
        return C3618e.metrica(this.ad, c10405e.ad) && C3618e.metrica(this.vip, c10405e.vip) && C3618e.metrica(this.metrica, c10405e.metrica);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.metrica) + AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardContainerContentColor(contentColor=");
        AbstractC5087e.m1754try(this.ad, ", focusedContentColor=", sb);
        AbstractC5087e.m1754try(this.vip, ", pressedContentColor=", sb);
        sb.append((Object) C3618e.startapp(this.metrica));
        sb.append(')');
        return sb.toString();
    }
}
