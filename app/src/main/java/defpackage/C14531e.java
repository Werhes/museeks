package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14531e {
    public final long ad;
    public final long appmetrica;
    public final float billing;
    public final long license;
    public final long metrica;
    public final float purchase;
    public long startapp;
    public final long vip;
    public final float yandex;

    public C14531e(long j, long j2, long j3, C17307e c17307e) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        long tapsense = AbstractC11613e.tapsense(j, j2);
        long tapsense2 = AbstractC11613e.tapsense(j3, j2);
        float mopub = AbstractC11613e.mopub(tapsense);
        float mopub2 = AbstractC11613e.mopub(tapsense2);
        if (mopub <= 0.0f || mopub2 <= 0.0f) {
            this.license = C9268e.ad(0.0f, 0.0f);
            this.appmetrica = C9268e.ad(0.0f, 0.0f);
            this.purchase = 0.0f;
            this.billing = 0.0f;
            this.yandex = 0.0f;
        } else {
            long startapp = AbstractC11613e.startapp(mopub, tapsense);
            this.license = startapp;
            long startapp2 = AbstractC11613e.startapp(mopub2, tapsense2);
            this.appmetrica = startapp2;
            float f = c17307e.ad;
            this.purchase = f;
            this.billing = 0.0f;
            float adcel = AbstractC11613e.adcel(startapp, startapp2);
            float f2 = 1;
            float f3 = AbstractC4424e.vip;
            float sqrt = (float) Math.sqrt(f2 - (adcel * adcel));
            this.yandex = ((double) sqrt) > 0.001d ? ((adcel + f2) * f) / sqrt : 0.0f;
        }
        this.startapp = C9268e.ad(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C4211e vip(float r16, float r17, long r18, long r20, long r22, long r24, long r26, float r28) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14531e.vip(float, float, long, long, long, long, long, float):eؖٛ");
    }

    public final float ad(float f) {
        float metrica = metrica();
        float f2 = this.billing;
        if (f > metrica) {
            return f2;
        }
        float f3 = this.yandex;
        if (f > f3) {
            return ((f - f3) * f2) / (metrica() - f3);
        }
        return 0.0f;
    }

    public final float metrica() {
        return (1 + this.billing) * this.yandex;
    }
}
