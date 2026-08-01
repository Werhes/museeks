package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10058e extends AbstractC14213e {
    public final /* synthetic */ int license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10058e(int i, int i2, long j, String str) {
        super(j, i, str);
        this.license = i2;
    }

    @Override // defpackage.AbstractC14213e
    public final float ad(int i) {
        switch (this.license) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // defpackage.AbstractC14213e
    public final float appmetrica(float f, float f2, float f3) {
        switch (this.license) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * AbstractC15365e.appmetrica[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // defpackage.AbstractC14213e
    public final long license(float f, float f2, float f3) {
        switch (this.license) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f4 = (f + 16.0f) / 116.0f;
                float f5 = (f2 * 0.002f) + f4;
                float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
                float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
                float f8 = f6 * AbstractC15365e.appmetrica[0];
                return (Float.floatToRawIntBits(f7 * r7[1]) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f) & 4294967295L);
        }
    }

    @Override // defpackage.AbstractC14213e
    public final long purchase(float f, float f2, float f3, float f4, AbstractC14213e abstractC14213e) {
        switch (this.license) {
            case 0:
                float[] fArr = AbstractC15365e.appmetrica;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float cbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float cbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float f8 = (116.0f * cbrt2) - 16.0f;
                float f9 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return AbstractC6532e.ad(f8, f9, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f4, abstractC14213e);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                return AbstractC6532e.ad(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, abstractC14213e);
        }
    }

    @Override // defpackage.AbstractC14213e
    public final float vip(int i) {
        switch (this.license) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }
}
