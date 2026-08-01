package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11112e {
    public static final C11112e mopub;
    public final double ad;
    public final double adcel;
    public final double appmetrica;
    public final double[] billing;
    public final double license;
    public final double metrica;
    public final double purchase;
    public final double startapp;
    public final double vip;
    public final double yandex;

    static {
        double[] dArr = AbstractC8210e.vip;
        double d = 1172.567794885695d / 100.0f;
        double max = Math.max(0.1d, 50.0d);
        double[][] dArr2 = AbstractC17190e.ad;
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double ad = AbstractC3062e.ad((1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d, 0.0d, 1.0d);
        double[] dArr6 = {(((100.0d / d7) * ad) + 1.0d) - ad, (((100.0d / d8) * ad) + 1.0d) - ad, (((100.0d / d9) * ad) + 1.0d) - ad};
        double d10 = 5.0d * d;
        double d11 = 1.0d / (d10 + 1.0d);
        double d12 = d11 * d11 * d11 * d11;
        double d13 = 1.0d - d12;
        double cbrt = (Math.cbrt(d10) * 0.1d * d13 * d13) + (d12 * d);
        double d14 = (max + 16.0d) / 116.0d;
        double d15 = d14 * d14 * d14;
        if (d15 <= 0.008856451679035631d) {
            d15 = ((116 * d14) - 16) / 903.2962962962963d;
        }
        double d16 = (d15 * 100.0d) / dArr[1];
        double sqrt = Math.sqrt(d16) + 1.48d;
        double pow = 0.725d / Math.pow(d16, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d8) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d9) / 100.0d, 0.42d)};
        double d17 = dArr7[0];
        double d18 = (d17 * 400.0d) / (d17 + 27.13d);
        double d19 = dArr7[1];
        double d20 = (d19 * 400.0d) / (d19 + 27.13d);
        double d21 = dArr7[2];
        double[] dArr8 = {d18, d20, (400.0d * d21) / (d21 + 27.13d)};
        mopub = new C11112e(d16, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * pow, pow, pow, 0.69d, 1.0d, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public C11112e(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.ad = d;
        this.vip = d2;
        this.metrica = d3;
        this.license = d4;
        this.appmetrica = d5;
        this.purchase = d6;
        this.billing = dArr;
        this.yandex = d7;
        this.startapp = d8;
        this.adcel = d9;
    }
}
