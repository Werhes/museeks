package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5635e {
    public final long ad;
    public final long vip;
    public long metrica = -9223372036854775807L;
    public long license = -9223372036854775807L;
    public long purchase = -9223372036854775807L;
    public long billing = -9223372036854775807L;
    public float adcel = 0.97f;
    public float startapp = 1.03f;
    public float mopub = 1.0f;
    public long advert = -9223372036854775807L;
    public long appmetrica = -9223372036854775807L;
    public long yandex = -9223372036854775807L;
    public long smaato = -9223372036854775807L;
    public long amazon = -9223372036854775807L;

    public C5635e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    public final void ad() {
        long j;
        long j2 = this.metrica;
        if (j2 != -9223372036854775807L) {
            j = this.license;
            if (j == -9223372036854775807L) {
                long j3 = this.purchase;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.billing;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.appmetrica == j) {
            return;
        }
        this.appmetrica = j;
        this.yandex = j;
        this.smaato = -9223372036854775807L;
        this.amazon = -9223372036854775807L;
        this.advert = -9223372036854775807L;
    }
}
