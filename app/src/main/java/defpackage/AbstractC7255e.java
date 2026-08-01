package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7255e {
    public static final C2892e ad = new C2892e(-1681201316, false, new C7478e(12));
    public static final C2892e vip = new C2892e(143633524, false, new C10387e(7));
    public static final C2892e metrica = new C2892e(1104834349, false, new C7478e(18));
    public static final C2892e license = new C2892e(-556275898, false, new C10387e(8));
    public static final C2892e appmetrica = new C2892e(916002695, false, new C10387e(9));
    public static final C2892e purchase = new C2892e(-1906686008, false, new C10387e(2));
    public static final C2892e billing = new C2892e(-434407415, false, new C10387e(3));
    public static final C2892e yandex = new C2892e(1037871178, false, new C10387e(4));
    public static final C2892e startapp = new C2892e(-922141780, false, new C10387e(5));
    public static final C2892e adcel = new C2892e(935694204, false, new C7478e(13));
    public static final C2892e mopub = new C2892e(-621029413, false, new C10387e(6));
    public static final C2892e advert = new C2892e(2041596768, false, new C7478e(14));
    public static final C2892e smaato = new C2892e(-413959472, false, new C7478e(15));
    public static final C2892e amazon = new C2892e(70424061, false, new C7478e(16));
    public static final C2892e loadAd = new C2892e(-980133062, false, new C7478e(17));

    public static BigInteger ad(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(InterfaceC4563e.Signature);
        }
        return z ? shiftRight.negate() : shiftRight;
    }

    public static final float license(C12476e c12476e, int i) {
        if (i < 0) {
            return 0.0f;
        }
        C0676e c0676e = c12476e.ad;
        C12890e c12890e = c12476e.vip;
        if (c0676e.ad.f20850e.length() == 0) {
            return 0.0f;
        }
        int min = Math.min(c12890e.license(i), Math.min(c12890e.vip - 1, c12890e.purchase - 1));
        if (i > c12890e.metrica(min, false)) {
            return 0.0f;
        }
        c12890e.smaato(min);
        ArrayList arrayList = c12890e.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.adcel(min, arrayList));
        C6342e c6342e = c4864e.ad;
        int i2 = min - c4864e.license;
        C6458e c6458e = (C6458e) c6342e.f13185e;
        return c6458e.appmetrica(i2) - c6458e.billing(i2);
    }

    public abstract int metrica(C12136e c12136e);

    public abstract void vip(C12136e c12136e, Set set);
}
