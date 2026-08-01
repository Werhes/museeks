package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17595e {
    public static final byte[] ad = {0, 0, 0, 1};
    public static final float[] vip = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object metrica = new Object();
    public static int[] license = new int[10];

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C9195e Signature(int r30, int r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17595e.Signature(int, int, byte[]):eٍؒٞ");
    }

    public static final float ad(AbstractC3698e abstractC3698e, boolean z, C9340e[] c9340eArr, float f) {
        float f2 = Float.NaN;
        for (C9340e c9340e : c9340eArr) {
            float metrica2 = abstractC3698e.metrica(c9340e);
            if (!Float.isNaN(f2)) {
                int i = z != (metrica2 > f2) ? i + 1 : 0;
            }
            f2 = metrica2;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static int adcel(C16975e c16975e) {
        String billing = billing(c16975e);
        if (Objects.equals(billing, "video/avc")) {
            return 1;
        }
        return (Objects.equals(billing, "video/hevc") || Objects.equals(billing, "video/vvc")) ? 2 : 0;
    }

    public static void admob(C18437e c18437e) {
        int purchase = c18437e.purchase() + 1;
        c18437e.adcel(8);
        for (int i = 0; i < purchase; i++) {
            c18437e.purchase();
            c18437e.purchase();
            c18437e.startapp();
        }
        c18437e.adcel(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17049e advert(defpackage.C18437e r19, boolean r20, int r21, defpackage.C17049e r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.appmetrica(r5)
            boolean r8 = r0.license()
            r9 = 5
            int r9 = r0.appmetrica(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.license()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.appmetrica(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.ad
            boolean r8 = r2.vip
            int r9 = r2.metrica
            int r11 = r2.license
            int[] r4 = r2.appmetrica
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.appmetrica(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.license()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.license()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.adcel(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.adcel(r6)
        L7b:
            eٖۣٗ r12 = new eٖۣٗ
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17595e.advert(eۢؑ, boolean, int, eٖۣٗ):eٖۣٗ");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C11996e amazon(byte[] r32, int r33, int r34, defpackage.C11467e r35) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17595e.amazon(byte[], int, int, eِؒۜ):eِۛۨ");
    }

    public static int appmetrica(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        AbstractC2301e.subscription(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            license(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            license(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            license(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    license(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static String billing(C16975e c16975e) {
        String str = c16975e.loadAd;
        String str2 = c16975e.mopub;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return c16975e.loadAd;
    }

    public static void license(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C11467e loadAd(int r38, int r39, byte[] r40) {
        /*
            Method dump skipped, instructions count: 2067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17595e.loadAd(int, int, byte[]):eِؒۜ");
    }

    public static void metrica(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static C3900e mopub(C18437e c18437e) {
        c18437e.startapp();
        return new C3900e(c18437e.appmetrica(6), c18437e.appmetrica(6), c18437e.appmetrica(3) - 1, 6);
    }

    public static InterfaceC0293e purchase(Ctry ctry) {
        if (ctry.isVip(InterfaceC0760e.ad)) {
            return new C7952e();
        }
        if (ctry.isVip(InterfaceC0760e.metrica)) {
            return new C15708e();
        }
        if (ctry.isVip(InterfaceC0760e.mopub)) {
            return new C16253e(128);
        }
        if (ctry.isVip(InterfaceC0760e.advert)) {
            return new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        throw new IllegalArgumentException(AbstractC4653e.inmobi("unrecognized digest OID: ", ctry));
    }

    public static String remoteconfig(C11133e c11133e) {
        StringBuilder sb = new StringBuilder(c11133e.yandex());
        for (int i = 0; i < c11133e.yandex(); i++) {
            byte appmetrica = c11133e.appmetrica(i);
            if (appmetrica == 34) {
                sb.append("\\\"");
            } else if (appmetrica == 39) {
                sb.append("\\'");
            } else if (appmetrica != 92) {
                switch (appmetrica) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (appmetrica < 32 || appmetrica > 126) {
                            sb.append('\\');
                            sb.append((char) (((appmetrica >>> 6) & 3) + 48));
                            sb.append((char) (((appmetrica >>> 3) & 7) + 48));
                            sb.append((char) ((appmetrica & 7) + 48));
                            break;
                        } else {
                            sb.append((char) appmetrica);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static C5401e smaato(int i, int i2, byte[] bArr) {
        byte b;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        C18437e c18437e = new C18437e(bArr, i3, i2 + 1);
        while (c18437e.vip(16)) {
            int appmetrica = c18437e.appmetrica(8);
            int i4 = 0;
            while (appmetrica == 255) {
                i4 += 255;
                appmetrica = c18437e.appmetrica(8);
            }
            int i5 = i4 + appmetrica;
            int appmetrica2 = c18437e.appmetrica(8);
            int i6 = 0;
            while (appmetrica2 == 255) {
                i6 += 255;
                appmetrica2 = c18437e.appmetrica(8);
            }
            int i7 = i6 + appmetrica2;
            if (i7 == 0 || !c18437e.vip(i7)) {
                return null;
            }
            if (i5 == 176) {
                int purchase = c18437e.purchase();
                boolean license2 = c18437e.license();
                int purchase2 = license2 ? c18437e.purchase() : 0;
                int purchase3 = c18437e.purchase();
                int i8 = -1;
                for (int i9 = 0; i9 <= purchase3; i9++) {
                    i8 = c18437e.purchase();
                    c18437e.purchase();
                    int appmetrica3 = c18437e.appmetrica(6);
                    if (appmetrica3 == 63) {
                        return null;
                    }
                    c18437e.appmetrica(appmetrica3 == 0 ? Math.max(0, purchase - 30) : Math.max(0, (appmetrica3 + purchase) - 31));
                    if (license2) {
                        int appmetrica4 = c18437e.appmetrica(6);
                        if (appmetrica4 == 63) {
                            return null;
                        }
                        c18437e.appmetrica(appmetrica4 == 0 ? Math.max(0, purchase2 - 30) : Math.max(0, (appmetrica4 + purchase2) - 31));
                    }
                    if (c18437e.license()) {
                        c18437e.adcel(10);
                    }
                }
                return new C5401e(i8, 9, (byte) 0);
            }
            c18437e.adcel(i7 * 8);
        }
        return null;
    }

    public static byte[] startapp(C16527e c16527e, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        subs subsVar = c16527e.f32407e;
        Ctry ctry = c16527e.f32408e;
        if (InterfaceC16631e.f32621e.isVip(ctry)) {
            C1725e c1725e = new C1725e(purchase(C16527e.loadAd(subsVar).f32408e));
            c1725e.init(new C0369e(bArr, bArr2));
            c1725e.generateBytes(bArr3, 0, 32);
            return bArr3;
        }
        if (InterfaceC16631e.f32623e.isVip(ctry)) {
            C9556e c9556e = new C9556e(purchase(C16527e.loadAd(subsVar).f32408e));
            c9556e.init(new C0369e(bArr, bArr2));
            c9556e.generateBytes(bArr3, 0, 32);
            return bArr3;
        }
        if (InterfaceC5051e.f10786e.isVip(ctry)) {
            if (subsVar != null) {
                throw new IllegalStateException("HDKF parameter support not added");
            }
            C5637e c5637e = new C5637e(new C7952e());
            c5637e.init(new C3678e(bArr, null, bArr2));
            c5637e.generateBytes(bArr3, 0, 32);
            return bArr3;
        }
        if (InterfaceC5051e.f10802e.isVip(ctry)) {
            if (subsVar != null) {
                throw new IllegalStateException("HDKF parameter support not added");
            }
            C5637e c5637e2 = new C5637e(new C9071e());
            c5637e2.init(new C3678e(bArr, null, bArr2));
            c5637e2.generateBytes(bArr3, 0, 32);
            return bArr3;
        }
        if (InterfaceC5051e.f10813e.isVip(ctry)) {
            if (subsVar != null) {
                throw new IllegalStateException("HDKF parameter support not added");
            }
            C5637e c5637e3 = new C5637e(new C15708e());
            c5637e3.init(new C3678e(bArr, null, bArr2));
            c5637e3.generateBytes(bArr3, 0, 32);
            return bArr3;
        }
        if (InterfaceC0760e.pro.isVip(ctry)) {
            byte[] bArr4 = new byte[0];
            if (subsVar != null) {
                bArr4 = Cprotected.subs(subsVar).f36449e;
            }
            C1470e c1470e = new C1470e(128, bArr4);
            int length = bArr.length;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr, 0, bArr5, 0, length);
            byte[] license2 = AbstractC12442e.license(bArr5);
            c1470e.f4313e = license2;
            if (license2.length > 255) {
                throw new IllegalArgumentException("key length must be between 0 and 2040 bits");
            }
            c1470e.f4310e = true;
            c1470e.reset();
            c1470e.update(bArr2, 0, bArr2.length);
            c1470e.metrica(0, 32, bArr3);
            return bArr3;
        }
        if (!InterfaceC0760e.signatures.isVip(ctry)) {
            if (!InterfaceC0760e.advert.isVip(ctry)) {
                throw new IllegalArgumentException(AbstractC4653e.inmobi("Unrecognized KDF: ", ctry));
            }
            C16253e c16253e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            c16253e.purchase(0, bArr.length, bArr);
            c16253e.purchase(0, bArr2.length, bArr2);
            c16253e.metrica(0, 32, bArr3);
            return bArr3;
        }
        byte[] bArr6 = new byte[0];
        if (subsVar != null) {
            bArr6 = Cprotected.subs(subsVar).f36449e;
        }
        C1470e c1470e2 = new C1470e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr6);
        int length2 = bArr.length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr, 0, bArr7, 0, length2);
        byte[] license3 = AbstractC12442e.license(bArr7);
        c1470e2.f4313e = license3;
        if (license3.length > 255) {
            throw new IllegalArgumentException("key length must be between 0 and 2040 bits");
        }
        c1470e2.f4310e = true;
        c1470e2.reset();
        c1470e2.update(bArr2, 0, bArr2.length);
        c1470e2.metrica(0, 32, bArr3);
        return bArr3;
    }

    public static int subscription(int i, byte[] bArr) {
        int i2;
        synchronized (metrica) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = license;
                    if (iArr.length <= i4) {
                        license = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    license[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = license[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static void vip(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(AbstractC1634e.advert(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static boolean yandex(byte[] bArr, int i, C16975e c16975e) {
        int i2;
        if (Objects.equals(c16975e.loadAd, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i2 = b & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(c16975e.loadAd, "video/hevc")) {
            C3900e mopub = mopub(new C18437e(bArr, 4, i + 4));
            int i3 = mopub.vip;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && mopub.license == c16975e.f33279class - 1) {
                return false;
            }
        }
        return true;
    }
}
