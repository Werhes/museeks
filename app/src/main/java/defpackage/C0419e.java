package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419e {
    public final float ad;
    public final long appmetrica;
    public final int license;
    public final float metrica;
    public final float vip;

    public C0419e(C1558e c1558e) {
        float f = c1558e.metrica;
        float f2 = c1558e.license;
        float f3 = c1558e.vip;
        int i = c1558e.ad;
        long j = c1558e.appmetrica;
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = i;
        this.appmetrica = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.ad);
        sb.append(", touchY=");
        sb.append(this.vip);
        sb.append(", progress=");
        sb.append(this.metrica);
        sb.append(", swipeEdge=");
        sb.append(this.license);
        sb.append(", frameTimeMillis=");
        return AbstractC10257e.mopub(sb, this.appmetrica, ')');
    }
}
