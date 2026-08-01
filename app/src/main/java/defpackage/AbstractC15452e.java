package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15452e {
    public static final /* synthetic */ int ad = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean ad(double d) {
        if (AbstractC5209e.appmetrica(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC5209e.license(d)) <= Math.getExponent(d);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int metrica(double r6) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L12
            boolean r1 = defpackage.AbstractC5209e.appmetrica(r6)
            if (r1 == 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            java.lang.String r4 = "x must be positive and finite"
            defpackage.AbstractC2301e.yandex(r1, r4)
            int r1 = java.lang.Math.getExponent(r6)
            int r4 = java.lang.Math.getExponent(r6)
            r5 = -1022(0xfffffffffffffc02, float:NaN)
            if (r4 < r5) goto L73
            int[] r4 = defpackage.AbstractC4413e.ad
            int r0 = r0.ordinal()
            r0 = r4[r0]
            switch(r0) {
                case 1: goto L68;
                case 2: goto L6f;
                case 3: goto L61;
                case 4: goto L59;
                case 5: goto L4f;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L35;
                default: goto L2f;
            }
        L2f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L35:
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            r4 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r6 = r6 & r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r6 = r6 | r4
            double r6 = java.lang.Double.longBitsToDouble(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L6f
            r2 = r3
            goto L6f
        L4f:
            if (r1 < 0) goto L52
            r2 = r3
        L52:
            boolean r6 = vip(r6)
        L56:
            r6 = r6 ^ r3
            r2 = r2 & r6
            goto L6f
        L59:
            if (r1 >= 0) goto L5c
            r2 = r3
        L5c:
            boolean r6 = vip(r6)
            goto L56
        L61:
            boolean r6 = vip(r6)
            r2 = r6 ^ 1
            goto L6f
        L68:
            boolean r6 = vip(r6)
            defpackage.AbstractC5400e.vip(r6)
        L6f:
            if (r2 == 0) goto L72
            int r1 = r1 + r3
        L72:
            return r1
        L73:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = metrica(r6)
            int r6 = r6 + (-52)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15452e.metrica(double):int");
    }

    public static boolean vip(double d) {
        if (d > 0.0d && AbstractC5209e.appmetrica(d)) {
            long license = AbstractC5209e.license(d);
            if ((license & (license - 1)) == 0) {
                return true;
            }
        }
        return false;
    }
}
