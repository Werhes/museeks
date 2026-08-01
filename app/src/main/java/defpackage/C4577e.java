package defpackage;

/* renamed from: eٜؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4577e {
    public final String ad;
    public final int metrica;
    public final C16374e vip;
    public static final C4577e license = new C4577e("sha2-128f", new C16374e(16, 22, 6, 33, 66, 1), 0);
    public static final C4577e appmetrica = new C4577e("sha2-128s", new C16374e(16, 7, 12, 14, 63, 1), 0);
    public static final C4577e purchase = new C4577e("sha2-192f", new C16374e(24, 22, 8, 33, 66, 1), 0);
    public static final C4577e billing = new C4577e("sha2-192s", new C16374e(24, 7, 14, 17, 63, 1), 0);
    public static final C4577e yandex = new C4577e("sha2-256f", new C16374e(32, 17, 9, 35, 68, 1), 0);
    public static final C4577e startapp = new C4577e("sha2-256s", new C16374e(32, 8, 14, 22, 64, 1), 0);
    public static final C4577e adcel = new C4577e("shake-128f", new C16374e(16, 22, 6, 33, 66, 2), 0);
    public static final C4577e mopub = new C4577e("shake-128s", new C16374e(16, 7, 12, 14, 63, 2), 0);
    public static final C4577e advert = new C4577e("shake-192f", new C16374e(24, 22, 8, 33, 66, 2), 0);
    public static final C4577e smaato = new C4577e("shake-192s", new C16374e(24, 7, 14, 17, 63, 2), 0);
    public static final C4577e amazon = new C4577e("shake-256f", new C16374e(32, 17, 9, 35, 68, 2), 0);
    public static final C4577e loadAd = new C4577e("shake-256s", new C16374e(32, 8, 14, 22, 64, 2), 0);
    public static final C4577e Signature = new C4577e("sha2-128f-with-sha256", new C16374e(16, 22, 6, 33, 66, 1), 1);
    public static final C4577e admob = new C4577e("sha2-128s-with-sha256", new C16374e(16, 7, 12, 14, 63, 1), 1);
    public static final C4577e subscription = new C4577e("sha2-192f-with-sha512", new C16374e(24, 22, 8, 33, 66, 1), 2);
    public static final C4577e remoteconfig = new C4577e("sha2-192s-with-sha512", new C16374e(24, 7, 14, 17, 63, 1), 2);
    public static final C4577e pro = new C4577e("sha2-256f-with-sha512", new C16374e(32, 17, 9, 35, 68, 1), 2);
    public static final C4577e signatures = new C4577e("sha2-256s-with-sha512", new C16374e(32, 8, 14, 22, 64, 1), 2);
    public static final C4577e tapsense = new C4577e("shake-128f-with-shake128", new C16374e(16, 22, 6, 33, 66, 2), 3);
    public static final C4577e isVip = new C4577e("shake-128s-with-shake128", new C16374e(16, 7, 12, 14, 63, 2), 3);
    public static final C4577e inmobi = new C4577e("shake-192f-with-shake256", new C16374e(24, 22, 8, 33, 66, 2), 4);
    public static final C4577e isPro = new C4577e("shake-192s-with-shake256", new C16374e(24, 7, 14, 17, 63, 2), 4);
    public static final C4577e applovin = new C4577e("shake-256f-with-shake256", new C16374e(32, 17, 9, 35, 68, 2), 4);
    public static final C4577e ads = new C4577e("shake-256s-with-shake256", new C16374e(32, 8, 14, 22, 64, 2), 4);

    public C4577e(String str, C16374e c16374e, int i) {
        this.ad = str;
        this.vip = c16374e;
        this.metrica = i;
    }
}
