package defpackage;

import android.util.Rational;
import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1146e {
    public static final Rational ad = new Rational(4, 3);
    public static final Rational vip = new Rational(3, 4);
    public static final Rational metrica = new Rational(16, 9);
    public static final Rational license = new Rational(9, 16);

    public static boolean ad(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = AbstractC2084e.ad;
        if (size.getHeight() * size.getWidth() >= AbstractC2084e.ad(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (vip(Math.max(0, height - 16), width, rational) || vip(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i == 0) {
                    return vip(height, width, rational);
                }
                if (height % 16 == 0) {
                    return vip(width, height, rational2);
                }
            }
        }
        return false;
    }

    public static boolean vip(int i, int i2, Rational rational) {
        AbstractC4265e.metrica(i2 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
