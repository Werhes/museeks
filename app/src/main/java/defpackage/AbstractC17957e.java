package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17957e {
    public static final C2892e ad = new C2892e(587943213, false, new C15480e(19));
    public static final C2892e vip = new C2892e(-1225493456, false, new C9375e(13));

    public static final void ad(InterfaceC12864e interfaceC12864e, InterfaceC8079e interfaceC8079e, C2892e c2892e, C13770e c13770e, int i, int i2) {
        int i3;
        c13770e.m3671package(380139498);
        if ((i & 6) == 0) {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c13770e.purchase(interfaceC8079e) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i & 3072) == 0) {
            i5 |= c13770e.yandex(c2892e) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                interfaceC8079e = C5438e.f11676e;
            }
            InterfaceC2747e license = AbstractC17074e.license(interfaceC8079e, false);
            boolean purchase = c13770e.purchase(license) | ((i5 & 7168) == 2048);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C6949e(license, c2892e, 24);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC9464e.metrica(interfaceC12864e, (Function2) m3681throw, c13770e, i5 & 14, 0);
        } else {
            c13770e.m3659default();
        }
        InterfaceC8079e interfaceC8079e2 = interfaceC8079e;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4880e(interfaceC12864e, interfaceC8079e2, c2892e, i, i2);
        }
    }

    public static final boolean appmetrica(C2401e c2401e) {
        return c2401e.yandex && !c2401e.license;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int billing(int r5) {
        /*
            r0 = -1
            if (r5 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L15
            switch(r5) {
                case 21: goto L14;
                case 22: goto L12;
                case 23: goto L14;
                case 24: goto L12;
                case 25: goto L10;
                case 26: goto L14;
                case 27: goto L12;
                default: goto Lf;
            }
        Lf:
            goto L15
        L10:
            r5 = r4
            goto L15
        L12:
            r5 = 4
            goto L15
        L14:
            r5 = r3
        L15:
            r2 = 30
            if (r1 >= r2) goto L2e
            r2 = 12
            if (r5 == r2) goto L2c
            r2 = 13
            if (r5 == r2) goto L2f
            r2 = 16
            if (r5 == r2) goto L2c
            r2 = 17
            if (r5 == r2) goto L2a
            goto L2e
        L2a:
            r3 = r4
            goto L2f
        L2c:
            r3 = 1
            goto L2f
        L2e:
            r3 = r5
        L2f:
            r5 = 27
            if (r1 >= r5) goto L40
            r5 = 7
            if (r3 == r5) goto L3f
            r5 = 8
            if (r3 == r5) goto L3f
            r5 = 9
            if (r3 == r5) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17957e.billing(int):int");
    }

    public static final boolean license(C2401e c2401e) {
        return (c2401e.vip() || !c2401e.yandex || c2401e.license) ? false : true;
    }

    public static final boolean metrica(C2401e c2401e) {
        return !c2401e.yandex && c2401e.license;
    }

    public static final float purchase(long j, EnumC17426e enumC17426e) {
        int ordinal = enumC17426e.ordinal();
        if (ordinal == 0) {
            return C2152e.purchase(j);
        }
        if (ordinal == 1) {
            return C2152e.appmetrica(j);
        }
        throw new C14803e(10);
    }

    public static final long startapp(C2401e c2401e, boolean z) {
        long yandex = C2152e.yandex(c2401e.metrica, c2401e.billing);
        if (z || !c2401e.vip()) {
            return yandex;
        }
        return 0L;
    }

    public static final boolean vip(C2401e c2401e) {
        return (c2401e.vip() || c2401e.yandex || !c2401e.license) ? false : true;
    }

    public static final boolean yandex(C2401e c2401e, long j, long j2) {
        int i = c2401e.startapp == 1 ? 1 : 0;
        long j3 = c2401e.metrica;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }
}
