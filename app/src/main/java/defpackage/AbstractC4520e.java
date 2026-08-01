package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۧؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4520e {
    public static final StackTraceElement[] ad = new StackTraceElement[0];

    public static void ad(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c = ' ';
        int i4 = 0;
        long j = 4294967295L;
        long j2 = 0;
        if (i2 == 0) {
            long j3 = 0;
            while (i4 <= i3) {
                long j4 = iArr5[i4] & 4294967295L;
                long j5 = j3 + j4 + (iArr2[i4] & 4294967295L);
                int i5 = (int) j5;
                j3 = j5 >>> 32;
                iArr5[i4] = i5;
                long j6 = j2 + (iArr[i4] & 4294967295L) + j4 + (i5 & 4294967295L);
                iArr[i4] = (int) j6;
                j2 = j6 >>> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            long j7 = 0;
            long j8 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr5[i4];
                char c2 = c;
                int i10 = -i2;
                long j9 = j;
                long j10 = j7 + (iArr[i4] & j9) + (((i6 >>> i10) | (i9 << i2)) & j9);
                int i11 = iArr2[i4];
                long j11 = j8 + (i9 & j9) + (((i11 << i2) | (i7 >>> i10)) & j9);
                int i12 = (int) j11;
                j8 = j11 >>> c2;
                iArr5[i4] = i12;
                long j12 = j10 + (((i8 >>> i10) | (i12 << i2)) & j9);
                iArr[i4] = (int) j12;
                j7 = j12 >>> c2;
                i4++;
                i7 = i11;
                i8 = i12;
                i6 = i9;
                c = c2;
                j = j9;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i13 = i2 >>> 5;
        int i14 = i2 & 31;
        if (i14 == 0) {
            long j13 = 0;
            for (int i15 = i13; i15 <= i3; i15++) {
                int i16 = i15 - i13;
                long j14 = j13 + (iArr5[i15] & 4294967295L) + (iArr2[i16] & 4294967295L);
                iArr5[i15] = (int) j14;
                j13 = j14 >>> 32;
                long j15 = j2 + (iArr[i15] & 4294967295L) + (iArr4[i16] & 4294967295L) + (iArr5[i16] & 4294967295L);
                iArr[i15] = (int) j15;
                j2 = j15 >>> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j16 = 0;
        while (i17 <= i3) {
            int i20 = i17 - i13;
            int i21 = iArr4[i20];
            int i22 = -i14;
            long j17 = j2 + (iArr[i17] & 4294967295L) + (((i4 >>> i22) | (i21 << i14)) & 4294967295L);
            int i23 = iArr2[i20];
            long j18 = j16 + (iArr5[i17] & 4294967295L) + (((i23 << r21) | (i18 >>> i22)) & 4294967295L);
            iArr3[i17] = (int) j18;
            j16 = j18 >>> 32;
            int i24 = iArr3[i20];
            long j19 = j17 + (((i24 << r21) | (i19 >>> i22)) & 4294967295L);
            iArr[i17] = (int) j19;
            j2 = j19 >>> 32;
            i17++;
            i14 = i14;
            iArr5 = iArr3;
            i19 = i24;
            i18 = i23;
            i4 = i21;
            i3 = i;
        }
    }

    public static void adcel(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c = ' ';
        int i4 = 0;
        long j = 4294967295L;
        long j2 = 0;
        if (i2 == 0) {
            long j3 = 0;
            while (i4 <= i3) {
                long j4 = iArr5[i4] & 4294967295L;
                long j5 = (j3 + j4) - (iArr2[i4] & 4294967295L);
                int i5 = (int) j5;
                j3 = j5 >> 32;
                iArr5[i4] = i5;
                long j6 = ((j2 + (iArr[i4] & 4294967295L)) - j4) - (i5 & 4294967295L);
                iArr[i4] = (int) j6;
                j2 = j6 >> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            long j7 = 0;
            long j8 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr5[i4];
                char c2 = c;
                int i10 = -i2;
                long j9 = j;
                long j10 = (j7 + (iArr[i4] & j9)) - (((i6 >>> i10) | (i9 << i2)) & j9);
                int i11 = iArr2[i4];
                long j11 = (j8 + (i9 & j9)) - (((i11 << i2) | (i7 >>> i10)) & j9);
                int i12 = (int) j11;
                j8 = j11 >> c2;
                iArr5[i4] = i12;
                long j12 = j10 - (((i8 >>> i10) | (i12 << i2)) & j9);
                iArr[i4] = (int) j12;
                j7 = j12 >> c2;
                i4++;
                i7 = i11;
                i8 = i12;
                i6 = i9;
                c = c2;
                j = j9;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i13 = i2 >>> 5;
        int i14 = i2 & 31;
        if (i14 == 0) {
            long j13 = 0;
            for (int i15 = i13; i15 <= i3; i15++) {
                int i16 = i15 - i13;
                long j14 = (j13 + (iArr5[i15] & 4294967295L)) - (iArr2[i16] & 4294967295L);
                iArr5[i15] = (int) j14;
                j13 = j14 >> 32;
                long j15 = ((j2 + (iArr[i15] & 4294967295L)) - (iArr4[i16] & 4294967295L)) - (iArr5[i16] & 4294967295L);
                iArr[i15] = (int) j15;
                j2 = j15 >> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j16 = 0;
        while (i17 <= i3) {
            int i20 = i17 - i13;
            int i21 = iArr4[i20];
            int i22 = -i14;
            long j17 = (j2 + (iArr[i17] & 4294967295L)) - (((i4 >>> i22) | (i21 << i14)) & 4294967295L);
            int i23 = iArr2[i20];
            long j18 = (j16 + (iArr5[i17] & 4294967295L)) - (((i23 << r21) | (i18 >>> i22)) & 4294967295L);
            iArr3[i17] = (int) j18;
            j16 = j18 >> 32;
            int i24 = iArr3[i20];
            long j19 = j17 - (((i24 << r21) | (i19 >>> i22)) & 4294967295L);
            iArr[i17] = (int) j19;
            j2 = j19 >> 32;
            i17++;
            i14 = i14;
            iArr5 = iArr3;
            i19 = i24;
            i18 = i23;
            i4 = i21;
            i3 = i;
        }
    }

    public static int advert(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static InterfaceC2268e amazon(C5273e c5273e, C11467e c11467e, ArrayList arrayList, boolean z) {
        InterfaceC2268e interfaceC2268e;
        AbstractC8677e.advert(1, "reduce", arrayList);
        AbstractC8677e.smaato("reduce", 2, arrayList);
        InterfaceC2268e purchase = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) arrayList.get(0));
        if (!(purchase instanceof AbstractC10200e)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC2268e = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) arrayList.get(1));
            if (interfaceC2268e instanceof C8466e) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c5273e.Signature() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC2268e = null;
        }
        AbstractC10200e abstractC10200e = (AbstractC10200e) purchase;
        int Signature = c5273e.Signature();
        int i = z ? 0 : Signature - 1;
        int i2 = z ? Signature - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (interfaceC2268e == null) {
            interfaceC2268e = c5273e.admob(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (c5273e.inmobi(i)) {
                interfaceC2268e = abstractC10200e.ad(c11467e, Arrays.asList(interfaceC2268e, c5273e.admob(i), new C6020e(Double.valueOf(i)), c5273e));
                if (interfaceC2268e instanceof C8466e) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return interfaceC2268e;
    }

    public static int appmetrica(int[] iArr, int i) {
        while (i > 0 && iArr[i] == 0) {
            i--;
        }
        return ((i * 32) + 32) - Integer.numberOfLeadingZeros(iArr[i]);
    }

    public static int billing(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int license(int[] iArr, int i) {
        int i2 = iArr[i] >> 31;
        while (i > 0 && iArr[i] == i2) {
            i--;
        }
        return ((i * 32) + 32) - Integer.numberOfLeadingZeros(iArr[i] ^ i2);
    }

    public static C5273e loadAd(C5273e c5273e, C11467e c11467e, C1105e c1105e, Boolean bool, Boolean bool2) {
        C5273e c5273e2 = new C5273e();
        Iterator loadAd = c5273e.loadAd();
        while (loadAd.hasNext()) {
            int intValue = ((Integer) loadAd.next()).intValue();
            if (c5273e.inmobi(intValue)) {
                InterfaceC2268e ad2 = c1105e.ad(c11467e, Arrays.asList(c5273e.admob(intValue), new C6020e(Double.valueOf(intValue)), c5273e));
                if (ad2.yandex().equals(bool)) {
                    break;
                }
                if (bool2 == null || ad2.yandex().equals(bool2)) {
                    c5273e2.isVip(intValue, ad2);
                }
            }
        }
        return c5273e2;
    }

    public static Object metrica(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void mopub(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = 4294967295L;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j4 = (j2 + (iArr[i5] & 4294967295L)) - (iArr3[i6] & 4294967295L);
                long j5 = (j3 + (iArr2[i5] & 4294967295L)) - (iArr4[i6] & 4294967295L);
                iArr[i5] = (int) j4;
                j2 = j4 >> 32;
                iArr2[i5] = (int) j5;
                j3 = j5 >> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j6 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            long j7 = j;
            long j8 = j2 + (iArr[i7] & j7);
            long j9 = j8 - (((i8 >>> (-i4)) | (i11 << i4)) & j7);
            long j10 = (j6 + (iArr2[i7] & j7)) - (((i9 >>> r3) | (i12 << i4)) & j7);
            iArr[i7] = (int) j9;
            j2 = j9 >> c2;
            iArr2[i7] = (int) j10;
            j6 = j10 >> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j7;
        }
    }

    public static final boolean purchase(AbstractC1186e abstractC1186e) {
        AbstractC15728e subscription = abstractC1186e.subscription();
        if (subscription instanceof C3267e) {
            return true;
        }
        return (subscription instanceof AbstractC14773e) && (((AbstractC14773e) subscription).isPro() instanceof C3267e);
    }

    public static void smaato(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        smaato(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = billing(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int startapp(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = defpackage.AbstractC3192e.appmetrica(r9)
            r1 = r0 & r11
            int r2 = advert(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = defpackage.AbstractC13328e.metrica(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = defpackage.AbstractC13328e.metrica(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            smaato(r1, r9, r12)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = billing(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4520e.startapp(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void vip(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = 4294967295L;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j4 = j2 + (iArr[i5] & 4294967295L) + (iArr3[i6] & 4294967295L);
                long j5 = j3 + (iArr2[i5] & 4294967295L) + (iArr4[i6] & 4294967295L);
                iArr[i5] = (int) j4;
                j2 = j4 >>> 32;
                iArr2[i5] = (int) j5;
                j3 = j5 >>> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j6 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            long j7 = j;
            long j8 = j2 + (iArr[i7] & j7);
            long j9 = j8 + (((i8 >>> (-i4)) | (i11 << i4)) & j7);
            long j10 = j6 + (iArr2[i7] & j7) + (((i9 >>> r3) | (i12 << i4)) & j7);
            iArr[i7] = (int) j9;
            j2 = j9 >>> c2;
            iArr2[i7] = (int) j10;
            j6 = j10 >>> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j7;
        }
    }

    public static int yandex(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }
}
