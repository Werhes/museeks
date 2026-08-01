package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4717e {
    public static final C14093e Signature;
    public static final float[] ad;
    public static final C14093e adcel;
    public static final C14093e admob;
    public static final C14093e advert;
    public static final C14093e amazon;
    public static final C14093e appmetrica;
    public static final C14093e billing;
    public static final C1817e inmobi;
    public static final AbstractC14213e[] isPro;
    public static final C14093e isVip;
    public static final C16498e license;
    public static final C14093e loadAd;
    public static final C16498e metrica;
    public static final C14093e mopub;
    public static final C10058e pro;
    public static final C14093e purchase;
    public static final C10058e remoteconfig;
    public static final C14093e signatures;
    public static final C14093e smaato;
    public static final C14093e startapp;
    public static final C14093e subscription;
    public static final C14093e tapsense;
    public static final float[] vip;
    public static final C14093e yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [eؓٔٚ, eٓۙۧ] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        ad = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        vip = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C16498e c16498e = new C16498e(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C16498e c16498e2 = new C16498e(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C16498e c16498e3 = new C16498e(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        metrica = c16498e3;
        C16498e c16498e4 = new C16498e(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        license = c16498e4;
        C4574e c4574e = AbstractC15365e.license;
        C14093e c14093e = new C14093e("sRGB IEC61966-2.1", fArr, c4574e, c16498e, 0);
        appmetrica = c14093e;
        C14093e c14093e2 = new C14093e("sRGB IEC61966-2.1 (Linear)", fArr, c4574e, 1.0d, 0.0f, 1.0f, 1);
        purchase = c14093e2;
        C14093e c14093e3 = new C14093e("scRGB-nl IEC 61966-2-2:2003", fArr, c4574e, null, new C8391e(14), new C8391e(15), -0.799f, 2.399f, c16498e, 2);
        billing = c14093e3;
        C14093e c14093e4 = new C14093e("scRGB IEC 61966-2-2:2003", fArr, c4574e, 1.0d, -0.5f, 7.499f, 3);
        yandex = c14093e4;
        C14093e c14093e5 = new C14093e("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c4574e, new C16498e(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        startapp = c14093e5;
        C14093e c14093e6 = new C14093e("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c4574e, new C16498e(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        adcel = c14093e6;
        C14093e c14093e7 = new C14093e("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C4574e(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        mopub = c14093e7;
        C14093e c14093e8 = new C14093e("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c4574e, c16498e, 7);
        advert = c14093e8;
        C14093e c14093e9 = new C14093e("NTSC (1953)", fArr2, AbstractC15365e.ad, new C16498e(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        smaato = c14093e9;
        C14093e c14093e10 = new C14093e("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c4574e, new C16498e(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        amazon = c14093e10;
        C14093e c14093e11 = new C14093e("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c4574e, 2.2d, 0.0f, 1.0f, 10);
        loadAd = c14093e11;
        C14093e c14093e12 = new C14093e("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC15365e.vip, new C16498e(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        Signature = c14093e12;
        C4574e c4574e2 = AbstractC15365e.metrica;
        C14093e c14093e13 = new C14093e("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c4574e2, 1.0d, -65504.0f, 65504.0f, 12);
        admob = c14093e13;
        C14093e c14093e14 = new C14093e("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c4574e2, 1.0d, -65504.0f, 65504.0f, 13);
        subscription = c14093e14;
        C10058e c10058e = new C10058e(14, 1, AbstractC16096e.vip, "Generic XYZ");
        remoteconfig = c10058e;
        long j = AbstractC16096e.metrica;
        C10058e c10058e2 = new C10058e(15, 0, j, "Generic L*a*b*");
        pro = c10058e2;
        C14093e c14093e15 = new C14093e("None", fArr, c4574e, c16498e2, 16);
        signatures = c14093e15;
        C14093e c14093e16 = new C14093e("Hybrid Log Gamma encoding", fArr3, c4574e, null, new C8391e(16), new C8391e(17), 0.0f, 1.0f, c16498e3, 17);
        tapsense = c14093e16;
        C14093e c14093e17 = new C14093e("Perceptual Quantizer encoding", fArr3, c4574e, null, new C8391e(18), new C8391e(19), 0.0f, 1.0f, c16498e4, 18);
        isVip = c14093e17;
        ?? abstractC14213e = new AbstractC14213e(j, 19, "Oklab");
        inmobi = abstractC14213e;
        isPro = new AbstractC14213e[]{c14093e, c14093e2, c14093e3, c14093e4, c14093e5, c14093e6, c14093e7, c14093e8, c14093e9, c14093e10, c14093e11, c14093e12, c14093e13, c14093e14, c10058e, c10058e2, c14093e15, c14093e16, c14093e17, abstractC14213e};
    }

    public static double ad(C16498e c16498e, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = c16498e.vip;
        double d5 = c16498e.metrica;
        double d6 = c16498e.license;
        double d7 = c16498e.appmetrica;
        double d8 = c16498e.purchase;
        double d9 = d4 * d3;
        return (c16498e.billing + 1.0d) * d2 * (d9 <= 1.0d ? Math.pow(d9, d5) : Math.exp((d3 - d8) * d6) + d7);
    }

    public static double license(C16498e c16498e, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = -c16498e.vip;
        double d5 = c16498e.appmetrica;
        double d6 = 1.0d / c16498e.billing;
        return Math.pow(Math.max((Math.pow(d3, d6) * d5) + d4, 0.0d) / ((Math.pow(d3, d6) * (-c16498e.purchase)) + c16498e.metrica), 1.0d / c16498e.license) * d2;
    }

    public static double metrica(C16498e c16498e, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = c16498e.vip;
        double d5 = c16498e.license;
        double pow = (Math.pow(d3, d5) * c16498e.metrica) + d4;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d3, d5) * c16498e.purchase) + c16498e.appmetrica), c16498e.billing) * d2;
    }

    public static double vip(C16498e c16498e, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = 1.0d / c16498e.vip;
        double d4 = 1.0d / c16498e.metrica;
        double d5 = 1.0d / c16498e.license;
        double d6 = c16498e.appmetrica;
        double d7 = c16498e.purchase;
        double d8 = (d * d2) / (c16498e.billing + 1.0d);
        return d2 * (d8 <= 1.0d ? Math.pow(d8, d4) * d3 : (Math.log(d8 - d6) * d5) + d7);
    }
}
