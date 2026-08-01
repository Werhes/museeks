package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1817e extends AbstractC14213e {
    public static final float[] appmetrica;
    public static final float[] billing;
    public static final float[] license;
    public static final float[] purchase;

    static {
        float[] billing2 = AbstractC16852e.billing(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC16852e.metrica(C9444e.metrica.vip, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        license = billing2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        appmetrica = fArr;
        purchase = AbstractC16852e.purchase(billing2);
        billing = AbstractC16852e.purchase(fArr);
    }

    @Override // defpackage.AbstractC14213e
    public final float ad(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.AbstractC14213e
    public final float appmetrica(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = billing;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = purchase;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // defpackage.AbstractC14213e
    public final long license(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = billing;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f6 * f6 * f6;
        float f9 = f7 * f7 * f7;
        float[] fArr2 = purchase;
        float f10 = (fArr2[6] * f9) + (fArr2[3] * f8) + (fArr2[0] * f5 * f5 * f5);
        return (Float.floatToRawIntBits((fArr2[7] * f9) + (fArr2[4] * f8) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    @Override // defpackage.AbstractC14213e
    public final long purchase(float f, float f2, float f3, float f4, AbstractC14213e abstractC14213e) {
        float[] fArr = license;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float yandex = AbstractC15842e.yandex(f5);
        float yandex2 = AbstractC15842e.yandex(f6);
        float yandex3 = AbstractC15842e.yandex(f7);
        float[] fArr2 = appmetrica;
        return AbstractC6532e.ad((fArr2[6] * yandex3) + (fArr2[3] * yandex2) + (fArr2[0] * yandex), (fArr2[7] * yandex3) + (fArr2[4] * yandex2) + (fArr2[1] * yandex), (fArr2[8] * yandex3) + (fArr2[5] * yandex2) + (fArr2[2] * yandex), f4, abstractC14213e);
    }

    @Override // defpackage.AbstractC14213e
    public final float vip(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }
}
