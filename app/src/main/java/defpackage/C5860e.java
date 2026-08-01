package defpackage;

import java.math.BigInteger;

/* renamed from: eؘۘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5860e implements InterfaceC6610e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final BigInteger f12401e = BigInteger.valueOf(1);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C6593e f12402e;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigInteger ad(int r11, java.math.BigInteger r12, java.math.BigInteger r13) {
        /*
            r10 = this;
            r0 = 0
        L1:
            int r1 = r11 * 5
            if (r0 == r1) goto La1
            eؙٜۗ r1 = r10.f12402e
            java.lang.Object r1 = r1.f26878e
            java.security.SecureRandom r1 = (java.security.SecureRandom) r1
            r2 = 1
            java.math.BigInteger r1 = defpackage.AbstractC5907e.appmetrica(r11, r2, r1)
            java.math.BigInteger r2 = r1.mod(r12)
            java.math.BigInteger r3 = defpackage.C5860e.f12401e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1e
            goto L9d
        L1e:
            java.math.BigInteger r2 = r1.multiply(r1)
            int r2 = r2.compareTo(r13)
            if (r2 >= 0) goto L2a
            goto L9d
        L2a:
            int r2 = r1.bitLength()
            eؙٜۗ r4 = r10.f12402e
            int r4 = r4.f13604e
            r5 = 1536(0x600, float:2.152E-42)
            r6 = 4
            r7 = 100
            r8 = 2
            if (r2 < r5) goto L4a
            if (r4 > r7) goto L3e
            r6 = 3
            goto L7b
        L3e:
            r2 = 128(0x80, float:1.794E-43)
            if (r4 > r2) goto L43
            goto L7b
        L43:
            r2 = 127(0x7f, float:1.78E-43)
        L45:
            int r6 = defpackage.AbstractC8703e.smaato(r4, r2, r8, r6)
            goto L7b
        L4a:
            r5 = 1024(0x400, float:1.435E-42)
            r9 = 5
            if (r2 < r5) goto L5f
            if (r4 > r7) goto L52
            goto L7b
        L52:
            r2 = 112(0x70, float:1.57E-43)
            if (r4 > r2) goto L58
        L56:
            r6 = r9
            goto L7b
        L58:
            r2 = 111(0x6f, float:1.56E-43)
            int r6 = defpackage.AbstractC8703e.smaato(r4, r2, r8, r9)
            goto L7b
        L5f:
            r5 = 512(0x200, float:7.175E-43)
            r6 = 80
            if (r2 < r5) goto L6f
            if (r4 > r6) goto L68
            goto L56
        L68:
            r6 = 7
            if (r4 > r7) goto L6c
            goto L7b
        L6c:
            r2 = 99
            goto L45
        L6f:
            r2 = 40
            if (r4 > r6) goto L75
            r6 = r2
            goto L7b
        L75:
            r5 = 79
            int r6 = defpackage.AbstractC8703e.smaato(r4, r5, r8, r2)
        L7b:
            boolean r2 = defpackage.AbstractC2001e.vip(r1)
            if (r2 != 0) goto L9d
            eؙٜۗ r2 = r10.f12402e
            java.lang.Object r2 = r2.f26878e
            java.security.SecureRandom r2 = (java.security.SecureRandom) r2
            boolean r2 = defpackage.AbstractC2001e.metrica(r1, r2, r6)
            if (r2 == 0) goto L9d
            java.math.BigInteger r2 = r1.subtract(r3)
            java.math.BigInteger r2 = r12.gcd(r2)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto L9d
        L9c:
            return r1
        L9d:
            int r0 = r0 + 1
            goto L1
        La1:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "unable to generate prime number for RSA key"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5860e.ad(int, java.math.BigInteger, java.math.BigInteger):java.math.BigInteger");
    }

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        BigInteger ad;
        int i;
        BigInteger multiply;
        C5860e c5860e = this;
        int i2 = c5860e.f12402e.f26879e;
        int i3 = (i2 + 1) / 2;
        int i4 = i2 - i3;
        int i5 = i2 / 2;
        int i6 = i5 - 100;
        int i7 = i2 / 3;
        if (i6 < i7) {
            i6 = i7;
        }
        int i8 = i2 >> 2;
        BigInteger pow = BigInteger.valueOf(2L).pow(i5);
        BigInteger bigInteger = f12401e;
        BigInteger shiftLeft = bigInteger.shiftLeft(i2 - 1);
        BigInteger shiftLeft2 = bigInteger.shiftLeft(i6);
        C17424e c17424e = null;
        boolean z = false;
        while (!z) {
            BigInteger bigInteger2 = c5860e.f12402e.f13605e;
            BigInteger ad2 = c5860e.ad(i3, bigInteger2, shiftLeft);
            while (true) {
                ad = c5860e.ad(i4, bigInteger2, shiftLeft);
                BigInteger abs = ad.subtract(ad2).abs();
                i = i4;
                if (abs.bitLength() < i6 || abs.compareTo(shiftLeft2) <= 0) {
                    c5860e = this;
                    bigInteger2 = bigInteger2;
                    i4 = i;
                    i2 = i2;
                } else {
                    multiply = ad2.multiply(ad);
                    if (multiply.bitLength() == i2) {
                        if (AbstractC0903e.appmetrica(multiply) >= i8) {
                            break;
                        }
                        ad2 = c5860e.ad(i3, bigInteger2, shiftLeft);
                    } else {
                        ad2 = ad2.max(ad);
                    }
                    i4 = i;
                }
            }
            if (ad2.compareTo(ad) < 0) {
                ad = ad2;
                ad2 = ad;
            }
            BigInteger subtract = ad2.subtract(bigInteger);
            BigInteger subtract2 = ad.subtract(bigInteger);
            int i9 = i2;
            BigInteger modInverse = bigInteger2.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) > 0) {
                z = true;
                c17424e = new C17424e(new C7362e(false, multiply, bigInteger2, true), new C16043e(multiply, bigInteger2, modInverse, ad2, ad, modInverse.remainder(subtract), modInverse.remainder(subtract2), AbstractC5907e.startapp(ad2, ad), true), false, 5);
            }
            c5860e = this;
            i4 = i;
            i2 = i9;
        }
        return c17424e;
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        this.f12402e = (C6593e) c13572e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
