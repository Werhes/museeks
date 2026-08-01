package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11309e {
    public static final C2892e ad = new C2892e(-961100858, false, new C16015e(6));
    public static final char[] vip = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, eؕٛؓ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.InterfaceC9739e ad(defpackage.AbstractC5978e r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11309e.ad(eؘۡۧ, boolean):eٍۚۖ");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eِٖۢ, java.lang.Object] */
    public static String adcel(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                ?? obj = new Object();
                obj.m4133public(i, i5, str);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            obj.m4128final(32);
                            i5++;
                        }
                        obj.m4127e(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int advert = AbstractC10220e.advert(str.charAt(i5 + 1));
                        int advert2 = AbstractC10220e.advert(str.charAt(i4));
                        if (advert != -1 && advert2 != -1) {
                            obj.m4128final((advert << 4) + advert2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        obj.m4127e(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return obj.m4132protected();
            }
            i5++;
        }
        return str.substring(i, i2);
    }

    public static final boolean appmetrica(AbstractC5978e abstractC5978e) {
        return !AbstractC11957e.appmetrica(abstractC5978e.mo1336class().isPro().ad());
    }

    public static final boolean billing(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (defpackage.C13814e.license(((defpackage.C11580e) r0).f23257e) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (defpackage.AbstractC14300e.advert(r1, 5) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.AbstractC4003e license(defpackage.AbstractC5978e r4, boolean r5, java.lang.reflect.Field r6) {
        /*
            eۣؗۚ r0 = r4.mo1336class()
            eۣؓۗ r0 = r0.isPro()
            eِٕٖ r1 = r0.mo1351switch()
            boolean r2 = defpackage.AbstractC14300e.mopub(r1)
            r3 = 1
            if (r2 != 0) goto L14
            goto L35
        L14:
            eِٕٖ r1 = r1.mo1351switch()
            r2 = 2
            boolean r2 = defpackage.AbstractC14300e.advert(r1, r2)
            if (r2 != 0) goto L26
            r2 = 5
            boolean r1 = defpackage.AbstractC14300e.advert(r1, r2)
            if (r1 == 0) goto L3f
        L26:
            boolean r1 = r0 instanceof defpackage.C11580e
            if (r1 == 0) goto L35
            eؙِ۟ r0 = (defpackage.C11580e) r0
            e٘ؒ r0 = r0.f23257e
            boolean r0 = defpackage.C13814e.license(r0)
            if (r0 == 0) goto L35
            goto L3f
        L35:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L77
        L3f:
            if (r5 == 0) goto L58
            boolean r5 = defpackage.AbstractC13467e.vip(r4)
            if (r5 == 0) goto L51
            eٕؗؖ r5 = new eٕؗؖ
            java.lang.Object r4 = purchase(r4)
            r5.<init>(r6, r4)
            return r5
        L51:
            eٍۨۥ r4 = new eٍۨۥ
            r5 = 0
            r4.<init>(r6, r3, r5)
            return r4
        L58:
            boolean r5 = defpackage.AbstractC13467e.vip(r4)
            if (r5 == 0) goto L6c
            eٜؒٛ r5 = new eٜؒٛ
            boolean r0 = appmetrica(r4)
            java.lang.Object r4 = purchase(r4)
            r5.<init>(r6, r0, r4)
            return r5
        L6c:
            eؙٚ r5 = new eؙٚ
            boolean r4 = appmetrica(r4)
            r0 = 0
            r5.<init>(r6, r4, r3, r0)
            return r5
        L77:
            eۣؗۚ r0 = r4.mo1336class()
            eۣؓۗ r0 = r0.isPro()
            eٌؔٚ r0 = r0.getAnnotations()
            eّۡۜ r1 = defpackage.AbstractC5965e.ad
            boolean r0 = r0.amazon(r1)
            r1 = 0
            if (r0 == 0) goto Lbc
            if (r5 == 0) goto La1
            boolean r4 = defpackage.AbstractC13467e.vip(r4)
            if (r4 == 0) goto L9a
            eٕٕۖ r4 = new eٕٕۖ
            r4.<init>(r6, r1)
            return r4
        L9a:
            eٍۨۥ r4 = new eٍۨۥ
            r5 = 1
            r4.<init>(r6, r3, r5)
            return r4
        La1:
            boolean r5 = defpackage.AbstractC13467e.vip(r4)
            if (r5 == 0) goto Lb1
            eؙؕ۠ r5 = new eؙؕ۠
            boolean r4 = appmetrica(r4)
            r5.<init>(r6, r4, r1)
            return r5
        Lb1:
            eؙٚ r5 = new eؙٚ
            boolean r4 = appmetrica(r4)
            r0 = 1
            r5.<init>(r6, r4, r3, r0)
            return r5
        Lbc:
            if (r5 == 0) goto Lc5
            eٍۨۥ r4 = new eٍۨۥ
            r5 = 2
            r4.<init>(r6, r1, r5)
            return r4
        Lc5:
            eؙٚ r5 = new eؙٚ
            boolean r4 = appmetrica(r4)
            r0 = 2
            r5.<init>(r6, r4, r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11309e.license(eؘۡۧ, boolean, java.lang.reflect.Field):eٌؖۨ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [eِٖۢ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [eِٖۢ, java.lang.Object] */
    public static String metrica(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        char c;
        int i4 = 0;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) != 0 ? false : z4;
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z7) || AbstractC5304e.isPro(str2, (char) codePointAt) || ((codePointAt == 37 && (!z5 || (z6 && !yandex(i6, length, str)))) || (codePointAt == 43 && z3)))) {
                ?? obj = new Object();
                obj.m4133public(i5, i6, str);
                ?? r2 = 0;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (z5 && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            obj.m4133public(i4, 1, "+");
                        } else if (codePointAt2 == 43 && z3) {
                            String str3 = z5 ? "+" : "%2B";
                            obj.m4133public(i4, str3.length(), str3);
                        } else {
                            if (codePointAt2 >= 32 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z7) && !AbstractC5304e.isPro(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z5 && (!z6 || yandex(i6, length, str))))) {
                                    obj.m4127e(codePointAt2);
                                }
                            }
                            if (r2 == 0) {
                                r2 = new Object();
                            }
                            r2.m4127e(codePointAt2);
                            while (!r2.yandex()) {
                                byte readByte = r2.readByte();
                                obj.m4128final(37);
                                char[] cArr = vip;
                                obj.m4128final(cArr[((readByte & 255) >> 4) & 15]);
                                obj.m4128final(cArr[readByte & 15]);
                            }
                            c = '%';
                            Unit unit2 = Unit.INSTANCE;
                            i6 += Character.charCount(codePointAt2);
                            i4 = 0;
                            r2 = r2;
                        }
                    }
                    c = '%';
                    i6 += Character.charCount(codePointAt2);
                    i4 = 0;
                    r2 = r2;
                }
                return obj.m4132protected();
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static final Object purchase(AbstractC5978e abstractC5978e) {
        AbstractC5148e mo1336class = abstractC5978e.mo1336class();
        return AbstractC2251e.ad(mo1336class.f11030e, mo1336class.isPro());
    }

    public static final boolean startapp(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null || !AbstractC5304e.inmobi(message, "No space left on device", false)) {
            return startapp(th.getCause());
        }
        return true;
    }

    public static String vip(int i, int i2, int i3, String str, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return metrica(str, i4, i2, str2, (i3 & 8) == 0, (i3 & 16) == 0, (i3 & 32) == 0, (i3 & 64) == 0, 128);
    }

    public static final boolean yandex(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC10220e.advert(str.charAt(i + 1)) != -1 && AbstractC10220e.advert(str.charAt(i3)) != -1;
    }
}
