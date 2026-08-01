package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7076e {
    public static final C13935e ad = AbstractC8439e.ad(C3434e.mopub, new C10310e(4), new C8171e(8));
    public static final byte[] metrica;
    public static final long[] vip;

    static {
        long j;
        C11241e c11241e = new C11241e(0, 255, 1);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c11241e, 10));
        Iterator it = c11241e.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                break;
            }
            int nextInt = c3296e.nextInt();
            if (48 > nextInt || nextInt >= 58) {
                long j2 = nextInt;
                long j3 = 97;
                if (j2 < 97 || j2 > 102) {
                    j3 = 65;
                    if (j2 < 65 || j2 > 70) {
                        j = -1;
                    }
                }
                j = (j2 - j3) + 10;
            } else {
                j = nextInt - 48;
            }
            arrayList.add(Long.valueOf(j));
        }
        vip = AbstractC13480e.m3597public(arrayList);
        C11241e c11241e2 = new C11241e(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(c11241e2, 10));
        Iterator it2 = c11241e2.iterator();
        while (true) {
            C3296e c3296e2 = (C3296e) it2;
            if (!c3296e2.f7452e) {
                metrica = AbstractC13480e.m3585finally(arrayList2);
                return;
            } else {
                int nextInt2 = c3296e2.nextInt();
                arrayList2.add(Byte.valueOf((byte) (nextInt2 < 10 ? nextInt2 + 48 : (char) (((char) (nextInt2 + 97)) - '\n'))));
            }
        }
    }

    public static final boolean ad(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 - i != charSequence2.length()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            int charAt = charSequence.charAt(i3);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = charSequence2.charAt(i3 - i);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (defpackage.AbstractC12534e.billing(r9, r11, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object appmetrica(defpackage.InterfaceC1618e r9, int r10, defpackage.AbstractC10731e r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C15129e
            if (r0 == 0) goto L13
            r0 = r11
            eٔۨؗ r0 = (defpackage.C15129e) r0
            int r1 = r0.f29915e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29915e = r1
            goto L18
        L13:
            eٔۨؗ r0 = new eٔۨؗ
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f29918e
            int r1 = r0.f29915e
            r2 = 8
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L45
            if (r1 == r4) goto L31
            if (r1 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            int r9 = r0.f29916e
            int r10 = r0.f29919e
            int r1 = r0.f29920e
            byte[] r4 = r0.f29914e
            eًؓؗ r6 = r0.f29917e
            defpackage.AbstractC2003e.purchase(r11)
            r8 = r6
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r10
            r10 = r8
            goto L70
        L45:
            defpackage.AbstractC2003e.purchase(r11)
            if (r10 <= 0) goto L92
            r11 = 0
            r1 = r10
        L4c:
            int r6 = r11 + 1
            byte[] r7 = defpackage.AbstractC7076e.metrica
            if (r11 >= r2) goto L6f
            int r11 = r1 >>> 28
            int r1 = r1 << 4
            if (r11 == 0) goto L6d
            r11 = r7[r11]
            r0.f29917e = r9
            r0.f29914e = r7
            r0.f29920e = r10
            r0.f29919e = r1
            r0.f29916e = r6
            r0.f29915e = r4
            java.lang.Object r11 = defpackage.AbstractC12534e.billing(r9, r11, r0)
            if (r11 != r5) goto L6f
            goto L8c
        L6d:
            r11 = r6
            goto L4c
        L6f:
            r4 = r7
        L70:
            int r11 = r6 + 1
            if (r6 >= r2) goto L8f
            int r6 = r1 >>> 28
            int r1 = r1 << 4
            r6 = r4[r6]
            r0.f29917e = r9
            r0.f29914e = r4
            r0.f29920e = r10
            r0.f29919e = r1
            r0.f29916e = r11
            r0.f29915e = r3
            java.lang.Object r6 = defpackage.AbstractC12534e.billing(r9, r6, r0)
            if (r6 != r5) goto L8d
        L8c:
            return r5
        L8d:
            r6 = r11
            goto L70
        L8f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L92:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Does only work for positive numbers"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7076e.appmetrica(eًؓؗ, int, eُؑ۠):java.lang.Object");
    }

    public static final long license(CharSequence charSequence) {
        int length = charSequence.length();
        if (length > 19) {
            throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
        }
        int i = 0;
        if (length != 19) {
            long j = 0;
            while (i < length) {
                long charAt = charSequence.charAt(i) - 48;
                if (charAt < 0 || charAt > 9) {
                    metrica(charSequence, i);
                    throw null;
                }
                j = (j << 3) + (j << 1) + charAt;
                i++;
            }
            return j;
        }
        int length2 = charSequence.length();
        long j2 = 0;
        while (i < length2) {
            long charAt2 = charSequence.charAt(i) - 48;
            if (charAt2 < 0 || charAt2 > 9) {
                metrica(charSequence, i);
                throw null;
            }
            j2 = (j2 << 3) + (j2 << 1) + charAt2;
            if (j2 < 0) {
                throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
            }
            i++;
        }
        return j2;
    }

    public static final void metrica(CharSequence charSequence, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i) + " at position " + i);
    }

    public static final int vip(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        while (i < i2) {
            int charAt = charSequence.charAt(i);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i3 = (i3 * 31) + charAt;
            i++;
        }
        return i3;
    }
}
