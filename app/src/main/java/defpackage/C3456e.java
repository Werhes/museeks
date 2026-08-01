package defpackage;

import java.security.SecureRandom;

/* renamed from: eؕٙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3456e {
    public final int ad;
    public final int metrica;
    public final String vip;
    public static final C3456e license = new C3456e("ml-dsa-44", 2, 0);
    public static final C3456e appmetrica = new C3456e("ml-dsa-65", 3, 0);
    public static final C3456e purchase = new C3456e("ml-dsa-87", 5, 0);
    public static final C3456e billing = new C3456e("ml-dsa-44-with-sha512", 2, 1);
    public static final C3456e yandex = new C3456e("ml-dsa-65-with-sha512", 3, 1);
    public static final C3456e startapp = new C3456e("ml-dsa-87-with-sha512", 5, 1);

    public C3456e(String str, int i, int i2) {
        this.vip = str;
        this.ad = i;
        this.metrica = i2;
    }

    public final C6831e ad(SecureRandom secureRandom) {
        return new C6831e(this.ad, secureRandom);
    }
}
