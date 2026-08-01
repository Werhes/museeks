package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16298e {
    public final String ad;
    public final int appmetrica;
    public final byte[] billing;
    public final int license;
    public final int metrica;
    public final int purchase;
    public final char[] vip;
    public final boolean yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16298e(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r10.length
            if (r4 >= r5) goto L4e
            char r5 = r10[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            if (r7 == 0) goto L3a
            r7 = r1[r5]
            if (r7 != r2) goto L1d
            r7 = r6
            goto L1e
        L1d:
            r7 = r3
        L1e:
            if (r7 == 0) goto L26
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L26:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r10
            java.lang.String r10 = "Duplicate character: %s"
            java.lang.String r10 = defpackage.AbstractC12992e.adcel(r10, r0)
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r10
            java.lang.String r10 = "Non-ASCII character: %s"
            java.lang.String r10 = defpackage.AbstractC12992e.adcel(r10, r0)
            r9.<init>(r10)
            throw r9
        L4e:
            r8.<init>(r9, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16298e.<init>(java.lang.String, char[]):void");
    }

    public C16298e(String str, char[] cArr, byte[] bArr, boolean z) {
        str.getClass();
        this.ad = str;
        cArr.getClass();
        this.vip = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int yandex = AbstractC17673e.yandex(length);
            this.license = yandex;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(yandex);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.appmetrica = i;
            this.purchase = yandex >> numberOfTrailingZeros;
            this.metrica = cArr.length - 1;
            this.billing = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.purchase; i2++) {
                int i3 = this.license;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[AbstractC17673e.purchase(i2 * 8, i3)] = true;
            }
            this.yandex = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16298e)) {
            return false;
        }
        C16298e c16298e = (C16298e) obj;
        return this.yandex == c16298e.yandex && Arrays.equals(this.vip, c16298e.vip);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.vip) + (this.yandex ? 1231 : 1237);
    }

    public final String toString() {
        return this.ad;
    }
}
