package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13797e {
    public final int ad;
    public final double license;
    public final double metrica;
    public final double vip;

    public C13797e(int i) {
        double d;
        int i2;
        this.ad = i;
        C11112e c11112e = C11112e.mopub;
        int i3 = i & 255;
        double purchase = AbstractC8210e.purchase((16711680 & i) >> 16);
        double purchase2 = AbstractC8210e.purchase((65280 & i) >> 8);
        double purchase3 = AbstractC8210e.purchase(i3);
        double d2 = (0.18051042d * purchase3) + (0.35762064d * purchase2) + (0.41233895d * purchase);
        double d3 = (0.0722d * purchase3) + (0.7152d * purchase2) + (0.2126d * purchase);
        double d4 = (purchase3 * 0.95034478d) + (purchase2 * 0.11916382d) + (purchase * 0.01932141d);
        double d5 = c11112e.startapp;
        double d6 = c11112e.appmetrica;
        double d7 = c11112e.vip;
        double[][] dArr = AbstractC17190e.ad;
        double[] dArr2 = dArr[0];
        double d8 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d9 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        double d10 = (d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]);
        double[] dArr5 = c11112e.billing;
        double d11 = dArr5[0] * d8;
        double d12 = dArr5[1] * d9;
        double d13 = dArr5[2] * d10;
        double d14 = c11112e.yandex;
        double pow = Math.pow((Math.abs(d11) * d14) / 100.0d, 0.42d);
        double pow2 = Math.pow((Math.abs(d12) * d14) / 100.0d, 0.42d);
        double pow3 = Math.pow((Math.abs(d13) * d14) / 100.0d, 0.42d);
        double d15 = (((d11 < 0.0d ? -1 : d11 == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
        if (d12 < 0.0d) {
            d = 0.0d;
            i2 = -1;
        } else if (d12 == 0.0d) {
            d = 0.0d;
            i2 = 0;
        } else {
            d = 0.0d;
            i2 = 1;
        }
        double d16 = ((i2 * 400.0d) * pow2) / (pow2 + 27.13d);
        double d17 = (((d13 >= d ? d13 == d ? 0 : 1 : -1) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d18 = ((((-12.0d) * d16) + (d15 * 11.0d)) + d17) / 11.0d;
        double d19 = ((d15 + d16) - (d17 * 2.0d)) / 9.0d;
        double d20 = d16 * 20.0d;
        double d21 = ((21.0d * d17) + ((d15 * 20.0d) + d20)) / 20.0d;
        double d22 = (((d15 * 40.0d) + d20) + d17) / 20.0d;
        double atan2 = (Math.atan2(d19, d18) * 57.29577951308232d) % 360.0d;
        atan2 = atan2 < d ? atan2 + 360.0d : atan2;
        double d23 = atan2 * 0.017453292519943295d;
        double pow4 = (Math.pow((d22 * c11112e.metrica) / d7, c11112e.adcel * d6) * 100.0d) / 100.0d;
        Math.sqrt(pow4);
        double d24 = d7 + 4.0d;
        double pow5 = Math.pow((Math.hypot(d18, d19) * (((((Math.cos(((atan2 < 20.14d ? 360 + atan2 : atan2) * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * c11112e.purchase) * c11112e.license)) / (d21 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, c11112e.ad), 0.73d);
        double sqrt = Math.sqrt(pow4) * pow5;
        Math.sqrt((pow5 * d6) / d24);
        Math.log1p(sqrt * d5 * 0.0228d);
        Math.cos(d23);
        Math.sin(d23);
        this.vip = atan2;
        this.metrica = sqrt;
        this.license = (AbstractC8210e.appmetrica(AbstractC5851e.appmetrica(new double[]{AbstractC8210e.purchase((i >> 16) & 255), AbstractC8210e.purchase((i >> 8) & 255), AbstractC8210e.purchase(i3)}, AbstractC8210e.ad)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public final boolean ad() {
        double d = this.vip;
        return d >= 170.0d && d < 207.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13797e) && this.ad == ((C13797e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1634e.smaato("Hct(argb=", this.ad, ")");
    }

    public final boolean vip() {
        double d = this.vip;
        return d >= 105.0d && d < 125.0d;
    }
}
