package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896e {
    public static final C1188e appmetrica;
    public static final C1188e billing;
    public static final C1188e purchase;
    public static final C1188e yandex;
    public final long ad;
    public final long license;
    public final long metrica;
    public final long vip;

    static {
        C1188e c1188e = new C1188e();
        float[] fArr = c1188e.metrica;
        fArr[2] = 1.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        c1188e.license = false;
        appmetrica = c1188e;
        C1188e c1188e2 = new C1188e();
        float[] fArr2 = c1188e2.vip;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.26f;
        fArr2[2] = 0.5f;
        float[] fArr3 = c1188e2.ad;
        fArr3[0] = 0.1f;
        fArr3[1] = 0.6f;
        fArr3[2] = 1.0f;
        float[] fArr4 = c1188e2.metrica;
        fArr4[2] = 0.18f;
        fArr4[0] = 0.22f;
        fArr4[1] = 0.6f;
        c1188e2.license = false;
        purchase = c1188e2;
        C1188e c1188e3 = new C1188e();
        float[] fArr5 = c1188e3.vip;
        fArr5[0] = 0.5f;
        fArr5[1] = 0.74f;
        fArr5[2] = 1.0f;
        float[] fArr6 = c1188e3.ad;
        fArr6[0] = 0.1f;
        fArr6[1] = 0.7f;
        fArr6[2] = 1.0f;
        float[] fArr7 = c1188e3.metrica;
        fArr7[2] = 0.18f;
        fArr7[0] = 0.22f;
        fArr7[1] = 0.6f;
        c1188e3.license = false;
        billing = c1188e3;
        C1188e c1188e4 = new C1188e();
        float[] fArr8 = c1188e4.vip;
        fArr8[0] = 0.2f;
        fArr8[1] = 0.5f;
        fArr8[2] = 0.8f;
        float[] fArr9 = c1188e4.ad;
        fArr9[0] = 0.1f;
        fArr9[1] = 0.6f;
        fArr9[2] = 1.0f;
        float[] fArr10 = c1188e4.metrica;
        fArr10[2] = 0.18f;
        fArr10[0] = 0.22f;
        fArr10[1] = 0.6f;
        c1188e4.license = false;
        yandex = c1188e4;
    }

    public C0896e(long j, long j2) {
        j = j2 != 16 ? AbstractC6532e.billing(C3618e.vip(0.35f, j2), j) : j;
        this.ad = j;
        this.vip = C3618e.vip(0.75f, j);
        this.metrica = C3618e.vip(0.5f, j);
        this.license = C3618e.vip(0.25f, j);
    }
}
