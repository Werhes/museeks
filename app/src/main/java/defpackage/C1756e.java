package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756e {
    public final boolean ad;
    public int appmetrica;
    public final float[] billing;
    public final C7544e[] license;
    public final int metrica;
    public final float[] purchase;
    public final int vip;
    public final float[] yandex;

    public /* synthetic */ C1756e() {
        this(false, 1);
    }

    public C1756e(int i) {
        this(true, 2);
    }

    public C1756e(boolean z, int i) {
        int i2;
        this.ad = z;
        this.vip = i;
        if (z && AbstractC8703e.adcel(i, 1)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            i2 = 3;
        } else {
            if (m2467class != 1) {
                throw new C14803e(10);
            }
            i2 = 2;
        }
        this.metrica = i2;
        this.license = new C7544e[20];
        this.purchase = new float[20];
        this.billing = new float[20];
        this.yandex = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [eؚۢۡ, java.lang.Object] */
    public final void ad(float f, long j) {
        int i = (this.appmetrica + 1) % 20;
        this.appmetrica = i;
        C7544e[] c7544eArr = this.license;
        C7544e c7544e = c7544eArr[i];
        if (c7544e != 0) {
            c7544e.ad = j;
            c7544e.vip = f;
        } else {
            ?? obj = new Object();
            obj.ad = j;
            obj.vip = f;
            c7544eArr[i] = obj;
        }
    }

    public final float vip(float f) {
        int i;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        float f3;
        float f4 = f;
        float f5 = 0.0f;
        if (f4 <= 0.0f) {
            AbstractC14070e.metrica("maximumVelocity should be a positive value. You specified=" + f4);
        }
        int i2 = this.appmetrica;
        C7544e[] c7544eArr = this.license;
        C7544e c7544e = c7544eArr[i2];
        if (c7544e == null) {
            f2 = 0.0f;
        } else {
            int i3 = 0;
            C7544e c7544e2 = c7544e;
            while (true) {
                C7544e c7544e3 = c7544eArr[i2];
                boolean z2 = this.ad;
                i = this.vip;
                fArr = this.purchase;
                fArr2 = this.billing;
                if (c7544e3 != null) {
                    long j = c7544e.ad;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = c7544e3.ad;
                    float f6 = (float) (j - j2);
                    z = z2;
                    float abs = (float) Math.abs(j2 - c7544e2.ad);
                    c7544e2 = (i == 1 || z) ? c7544e3 : c7544e;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = c7544e3.vip;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    break;
                }
            }
            if (i3 >= this.metrica) {
                int m2467class = AbstractC8703e.m2467class(i);
                if (m2467class == 0) {
                    try {
                        float[] fArr3 = this.yandex;
                        AbstractC15710e.startapp(fArr2, fArr, i3, fArr3);
                        f3 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f3 = f2;
                    }
                } else {
                    if (m2467class != 1) {
                        throw new C14803e(10);
                    }
                    int i5 = i3 - 1;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f3 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2));
                }
                f5 = f3 * 1000;
            } else {
                f5 = f2;
            }
        }
        if (f5 == f2 || Float.isNaN(f5)) {
            return f2;
        }
        if (f5 <= f2) {
            f4 = -f4;
            if (f5 >= f4) {
                return f5;
            }
        } else if (f5 <= f4) {
            f4 = f5;
        }
        return f4;
    }
}
