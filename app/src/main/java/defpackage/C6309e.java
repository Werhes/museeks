package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6309e {
    public final boolean Signature;
    public final float ad;
    public final float[] adcel;
    public final float admob;
    public final float advert;
    public final float amazon;
    public final float appmetrica;
    public final float billing;
    public final float license;
    public final float loadAd;
    public final float metrica;
    public final float mopub;
    public final float purchase;
    public final float smaato;
    public float startapp;
    public final float subscription;
    public final float vip;
    public float yandex;

    public C6309e(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        float[] fArr;
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        this.appmetrica = f5;
        this.purchase = f6;
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f11 = z2 ? -1.0f : 1.0f;
        this.smaato = f11;
        float f12 = 1 / (f2 - f);
        this.mopub = f12;
        float[] fArr2 = new float[EnergyProfile.EVCONNECTOR_TYPE_OTHER];
        this.adcel = fArr2;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float hypot = (float) Math.hypot(f9, f8);
            this.billing = hypot;
            this.advert = hypot * f12;
            this.admob = f8 * f12;
            this.subscription = f9 * f12;
            this.amazon = Float.NaN;
            this.loadAd = Float.NaN;
            z = true;
        } else {
            this.amazon = f8 * f11;
            this.loadAd = f9 * (-f11);
            this.admob = z2 ? f5 : f3;
            this.subscription = z2 ? f4 : f6;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float f15 = 90;
            float f16 = f14;
            float f17 = 0.0f;
            float f18 = 0.0f;
            int i4 = 1;
            while (true) {
                i2 = i3;
                float f19 = f16;
                double d = (float) (((i4 * 90.0d) / 90) * 0.017453292519943295d);
                float sin = ((float) Math.sin(d)) * f13;
                float cos = ((float) Math.cos(d)) * f14;
                f7 = f10;
                f17 += (float) Math.hypot(sin - f18, cos - f19);
                fArr = AbstractC15389e.ad;
                fArr[i4] = f17;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f18 = sin;
                f10 = f7;
                f16 = cos;
                i3 = i2;
            }
            this.billing = f17;
            int i5 = i2;
            while (true) {
                fArr[i5] = fArr[i5] / f17;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            int length = fArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f20 = i6 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr, 0, 91, f20);
                if (binarySearch >= 0) {
                    fArr2[i6] = binarySearch / f15;
                } else if (binarySearch == -1) {
                    fArr2[i6] = f7;
                } else {
                    int i7 = -binarySearch;
                    int i8 = i7 - 2;
                    float f21 = i8;
                    float f22 = fArr[i8];
                    fArr2[i6] = (((f20 - f22) / (fArr[i7 - 1] - f22)) + f21) / f15;
                }
            }
            this.advert = this.billing * this.mopub;
            z = z3;
        }
        this.Signature = z;
    }

    public final float ad() {
        float f = this.amazon * this.startapp;
        return f * this.smaato * (this.advert / ((float) Math.hypot(f, (-this.loadAd) * this.yandex)));
    }

    public final void metrica(float f) {
        float f2 = (this.smaato == -1.0f ? this.vip - f : f - this.ad) * this.mopub;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100;
                int i = (int) f4;
                float[] fArr = this.adcel;
                float f5 = fArr[i];
                f3 = AbstractC1634e.billing(fArr[i + 1], f5, f4 - i, f5);
            }
        }
        double d = f3 * 1.5707964f;
        this.yandex = (float) Math.sin(d);
        this.startapp = (float) Math.cos(d);
    }

    public final float vip() {
        float f = this.amazon * this.startapp;
        float f2 = (-this.loadAd) * this.yandex;
        return f2 * this.smaato * (this.advert / ((float) Math.hypot(f, f2)));
    }
}
