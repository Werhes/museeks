package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۤؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2966e {
    public static final float[] ad;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[EnergyProfile.EVCONNECTOR_TYPE_OTHER];
        ad = fArr;
        float[] fArr2 = new float[EnergyProfile.EVCONNECTOR_TYPE_OTHER];
        float f10 = 0.0f;
        int i = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f13 = i / 100;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f15 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f12;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                }
                if (f15 > f13) {
                    f14 = f;
                } else {
                    f10 = f;
                }
                f12 = f5;
            }
            float f16 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f17 = f5;
            while (true) {
                f6 = ((f17 - f11) / 2.0f) + f11;
                f7 = f5 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f18 = (((f7 * f16) + f6) * f8) + f9;
                float f19 = f17;
                if (Math.abs(f18 - f13) >= 1.0E-5d) {
                    if (f18 > f13) {
                        f17 = f6;
                    } else {
                        f11 = f6;
                        f17 = f19;
                    }
                    f16 = 0.5f;
                }
            }
            fArr2[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
            i++;
        }
    }

    public static C3827e ad(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float vip = AbstractC3062e.vip(f, 0.0f, 1.0f);
        float f4 = 100;
        int i = (int) (f4 * vip);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = ad;
            float f7 = fArr[i];
            float f8 = (fArr[i2] - f7) / (f6 - f5);
            float billing = AbstractC1634e.billing(vip, f5, f8, f7);
            f2 = f8;
            f3 = billing;
        }
        return new C3827e(f3, f2);
    }
}
