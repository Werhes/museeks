package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3189e {
    public final long ad;
    public final float appmetrica;
    public final long billing;
    public final boolean license;
    public final long metrica;
    public final long purchase;
    public boolean startapp;
    public final long vip;
    public final boolean yandex;

    public C3189e(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = z;
        this.appmetrica = f;
        this.purchase = j4;
        this.billing = j5;
        this.yandex = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) AbstractC17751e.license(this.ad));
        sb.append(", uptimeMillis=");
        sb.append(this.vip);
        sb.append(", position=");
        sb.append((Object) C2152e.mopub(this.metrica));
        sb.append(", pressed=");
        sb.append(this.license);
        sb.append(", pressure=");
        sb.append(this.appmetrica);
        sb.append(", previousUptimeMillis=");
        sb.append(this.purchase);
        sb.append(", previousPosition=");
        sb.append((Object) C2152e.mopub(this.billing));
        sb.append(", previousPressed=");
        sb.append(this.yandex);
        sb.append(", isConsumed=");
        return AbstractC1786e.isVip(sb, this.startapp, ')');
    }
}
