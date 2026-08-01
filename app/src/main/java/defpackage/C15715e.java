package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15715e {
    public final long ad;
    public final long appmetrica;
    public final long license;
    public final float metrica;
    public final long vip;

    public C15715e(long j, long j2, float f, long j3, long j4) {
        this.ad = j;
        this.vip = j2;
        this.metrica = f;
        this.license = j3;
        this.appmetrica = j4;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.ad + ", position=" + ((Object) C2152e.mopub(this.vip)) + ", scaleFactor=" + this.metrica + ", panOffset=" + ((Object) C2152e.mopub(this.license)) + ')';
    }
}
