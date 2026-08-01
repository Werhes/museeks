package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۜۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2117e extends AbstractC11069e {
    public final /* synthetic */ int signatures = 0;
    public final AbstractC11069e tapsense;

    public C2117e(C14808e c14808e) {
        super(3, AbstractC3820e.ad.vip(double[].class), c14808e.appmetrica, new double[0], 32);
        this.tapsense = c14808e;
    }

    public C2117e(C14808e c14808e, byte b) {
        super(3, AbstractC3820e.ad.vip(float[].class), c14808e.appmetrica, new float[0], 32);
        this.tapsense = c14808e;
    }

    @Override // defpackage.AbstractC11069e
    public final void adcel(C17790e c17790e, int i, Object obj) {
        switch (this.signatures) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return;
                }
                super.adcel(c17790e, i, dArr);
                return;
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return;
                }
                super.adcel(c17790e, i, fArr);
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int advert(int i, Object obj) {
        switch (this.signatures) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.advert(i, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.advert(i, fArr);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        switch (this.signatures) {
            case 0:
                double[] dArr = (double[]) obj;
                int length = dArr.length;
                while (true) {
                    length--;
                    if (-1 >= length) {
                        return;
                    } else {
                        c17790e.m4428final(Double.doubleToLongBits(dArr[length]));
                    }
                }
            default:
                float[] fArr = (float[]) obj;
                int length2 = fArr.length;
                while (true) {
                    length2--;
                    if (-1 >= length2) {
                        return;
                    } else {
                        c17790e.m4425catch(Float.floatToIntBits(fArr[length2]));
                    }
                }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        switch (this.signatures) {
            case 0:
                return new double[]{Double.longBitsToDouble(c17546e.mopub())};
            default:
                return new float[]{Float.intBitsToFloat(c17546e.adcel())};
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        switch (this.signatures) {
            case 0:
                int i = 0;
                for (double d : (double[]) obj) {
                    ((C14808e) this.tapsense).mopub(Double.valueOf(d));
                    i += 8;
                }
                return i;
            default:
                int i2 = 0;
                for (float f : (float[]) obj) {
                    ((C14808e) this.tapsense).getClass();
                    i2 += 4;
                }
                return i2;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        switch (this.signatures) {
            case 0:
                for (double d : (double[]) obj) {
                    ((C14808e) this.tapsense).purchase(c0444e, Double.valueOf(d));
                }
                return;
            default:
                for (float f : (float[]) obj) {
                    ((C14808e) this.tapsense).purchase(c0444e, Float.valueOf(f));
                }
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void startapp(C0444e c0444e, int i, Object obj) {
        switch (this.signatures) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return;
                }
                super.startapp(c0444e, i, dArr);
                return;
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return;
                }
                super.startapp(c0444e, i, fArr);
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object vip(C17582e c17582e) {
        switch (this.signatures) {
            case 0:
                return new double[]{Double.longBitsToDouble(c17582e.adcel())};
            default:
                return new float[]{Float.intBitsToFloat(c17582e.startapp())};
        }
    }
}
