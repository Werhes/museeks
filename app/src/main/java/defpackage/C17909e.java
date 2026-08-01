package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٞۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17909e {
    public final long ad;
    public long appmetrica;
    public long billing;
    public long license = 0;
    public final long metrica;
    public long purchase;
    public final long vip;
    public long yandex;

    public C17909e(long j, long j2, long j3, long j4, long j5, long j6) {
        this.ad = j;
        this.vip = j2;
        this.appmetrica = j3;
        this.purchase = j4;
        this.billing = j5;
        this.metrica = j6;
        this.yandex = ad(j2, 0L, j3, j4, j5, j6);
    }

    public static long ad(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
        return AbstractC9413e.mopub(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
