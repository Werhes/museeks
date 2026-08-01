package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8495e {
    public static final Object ad = new Object();
    public static boolean metrica;
    public static Method vip;

    public static final C9106e ad(InterfaceC17718e interfaceC17718e, InterfaceC16759e interfaceC16759e) {
        boolean z = interfaceC17718e.yandex() == 1;
        return new C9106e(appmetrica(interfaceC17718e.adcel(), z, true, interfaceC17718e.mopub(), interfaceC16759e), appmetrica(interfaceC17718e.billing(), z, false, interfaceC17718e.purchase(), interfaceC16759e), z);
    }

    public static final C11168e adcel(C11980e c11980e, InterfaceC16902e interfaceC16902e) {
        return new C11168e(c11980e, interfaceC16902e, false);
    }

    public static int advert(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static final C14980e appmetrica(C4395e c4395e, boolean z, boolean z2, int i, InterfaceC16759e interfaceC16759e) {
        long j;
        int i2 = z2 ? c4395e.metrica : c4395e.license;
        if (i != c4395e.vip) {
            return c4395e.ad(i2);
        }
        long yandex = interfaceC16759e.yandex(c4395e, i2);
        if (z ^ z2) {
            int i3 = C12347e.metrica;
            j = yandex >> 32;
        } else {
            int i4 = C12347e.metrica;
            j = 4294967295L & yandex;
        }
        return c4395e.ad((int) j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0016, code lost:
    
        if (r2.vip == r5.vip) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0056  */
    /* JADX WARN: Type inference failed for: r2v3, types: [eٍؚؔ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C9106e billing(defpackage.C9106e r8, defpackage.InterfaceC17718e r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8495e.billing(eٌۥً, eُْ٘):eٌۥً");
    }

    public static short[][] license(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return metrica(sArr, mopub(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public static short[][] metrica(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length) {
            short[] sArr3 = sArr[0];
            if (sArr3.length == sArr2[0].length) {
                short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr3.length);
                for (int i = 0; i < sArr.length; i++) {
                    for (int i2 = 0; i2 < sArr[0].length; i2++) {
                        short[] sArr5 = sArr4[i];
                        short s = sArr[i][i2];
                        short s2 = sArr2[i][i2];
                        byte[][] bArr = AbstractC4764e.ad;
                        sArr5[i2] = (short) (s ^ s2);
                    }
                }
                return sArr4;
            }
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public static short[][] mopub(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i2][i] = sArr[i][i2];
            }
        }
        return sArr2;
    }

    public static final C14980e purchase(C14980e c14980e, C4395e c4395e, int i) {
        return new C14980e(c4395e.purchase.ad(i), c14980e.metrica, i);
    }

    public static short[][][] startapp(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length && sArr2.length == sArr[0].length && sArr3.length == sArr.length) {
                short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                for (int i = 0; i < sArr2[0].length; i++) {
                    for (int i2 = 0; i2 < sArr2[0][0].length; i2++) {
                        for (int i3 = 0; i3 < sArr.length; i3++) {
                            for (int i4 = 0; i4 < sArr[0].length; i4++) {
                                short s = (short) (AbstractC4764e.ad[sArr[i3][i4]][sArr2[i4][i][i2]] & 255);
                                short[] sArr8 = sArr7[i3][i];
                                sArr8[i2] = (short) (s ^ sArr8[i2]);
                            }
                            short[] sArr9 = sArr7[i3][i];
                            short s2 = sArr3[i3][i][i2];
                            short s3 = sArr9[i2];
                            byte[][] bArr = AbstractC4764e.ad;
                            sArr9[i2] = (short) (s2 ^ s3);
                        }
                    }
                }
                return sArr7;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public static final C14980e vip(final InterfaceC17718e interfaceC17718e, final C4395e c4395e, C14980e c14980e) {
        final int i = interfaceC17718e.ad() ? c4395e.metrica : c4395e.license;
        int mopub = interfaceC17718e.ad() ? interfaceC17718e.mopub() : interfaceC17718e.purchase();
        int i2 = c4395e.vip;
        C12476e c12476e = c4395e.purchase;
        int i3 = c4395e.appmetrica;
        if (mopub != i2) {
            return c4395e.ad(i);
        }
        final InterfaceC3477e appmetrica = AbstractC18039e.appmetrica(3, new C8779e(c4395e, i, 7));
        final int i4 = interfaceC17718e.ad() ? c4395e.license : c4395e.metrica;
        InterfaceC3477e appmetrica2 = AbstractC18039e.appmetrica(3, new Function0() { // from class: eٜٔۨ
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eؕٛؓ] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int intValue = ((Number) appmetrica.getValue()).intValue();
                InterfaceC17718e interfaceC17718e2 = interfaceC17718e;
                boolean ad2 = interfaceC17718e2.ad();
                boolean z = interfaceC17718e2.yandex() == 1;
                C4395e c4395e2 = C4395e.this;
                C12476e c12476e2 = c4395e2.purchase;
                int i5 = i;
                long advert = c12476e2.advert(i5);
                C12476e c12476e3 = c4395e2.purchase;
                C12890e c12890e = c12476e3.vip;
                int i6 = C12347e.metrica;
                int i7 = (int) (advert >> 32);
                int license = c12890e.license(i7);
                int i8 = c12890e.purchase;
                if (license != intValue) {
                    i7 = intValue >= i8 ? c12476e3.startapp(i8 - 1) : c12476e3.startapp(intValue);
                }
                int i9 = (int) (advert & 4294967295L);
                if (c12890e.license(i9) != intValue) {
                    i9 = intValue >= i8 ? c12890e.metrica(i8 - 1, false) : c12890e.metrica(intValue, false);
                }
                int i10 = i4;
                if (i7 == i10) {
                    return c4395e2.ad(i9);
                }
                if (i9 == i10) {
                    return c4395e2.ad(i7);
                }
                if (!(ad2 ^ z) ? i5 >= i7 : i5 > i9) {
                    i7 = i9;
                }
                return c4395e2.ad(i7);
            }
        });
        if (c4395e.ad != c14980e.metrica) {
            return (C14980e) appmetrica2.getValue();
        }
        if (i == i3) {
            return c14980e;
        }
        if (((Number) appmetrica.getValue()).intValue() != c12476e.vip.license(i3)) {
            return (C14980e) appmetrica2.getValue();
        }
        int i5 = c14980e.vip;
        long advert = c12476e.advert(i5);
        boolean ad2 = interfaceC17718e.ad();
        if (i3 != -1) {
            if (i != i3) {
                if (!(ad2 ^ (c4395e.vip() == 1))) {
                }
            }
            return c4395e.ad(i);
        }
        int i6 = C12347e.metrica;
        return (i5 == ((int) (advert >> 32)) || i5 == ((int) (advert & 4294967295L))) ? (C14980e) appmetrica2.getValue() : c4395e.ad(i);
    }

    public static short[][] yandex(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short s = (short) (AbstractC4764e.ad[sArr[i][i2]][sArr2[i2][i3]] & 255);
                    short[] sArr4 = sArr3[i];
                    sArr4[i3] = (short) (s ^ sArr4[i3]);
                }
            }
        }
        return sArr3;
    }
}
