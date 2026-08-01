package defpackage;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: eٌۖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8890e extends ECParameterSpec {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f17853e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8890e(java.lang.String r9, defpackage.AbstractC0362e r10, defpackage.AbstractC9932e r11, java.math.BigInteger r12, java.math.BigInteger r13, byte[] r14) {
        /*
            r8 = this;
            eْْۗ r0 = r10.ad
            boolean r1 = defpackage.AbstractC0853e.appmetrica(r0)
            if (r1 == 0) goto L12
            java.security.spec.ECFieldFp r1 = new java.security.spec.ECFieldFp
            java.math.BigInteger r0 = r0.vip()
            r1.<init>(r0)
            goto L41
        L12:
            eؘّْ r0 = (defpackage.C12301e) r0
            eٜؔؖ r0 = r0.vip
            int[] r0 = r0.ad
            int[] r1 = defpackage.AbstractC12442e.appmetrica(r0)
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            int[] r1 = defpackage.AbstractC12442e.subscription(r3, r2, r1)
            int r2 = r1.length
            int r2 = r2 - r3
            r4 = 0
        L26:
            if (r4 >= r2) goto L37
            r5 = r1[r4]
            r6 = r1[r2]
            int r7 = r4 + 1
            r1[r4] = r6
            int r4 = r2 + (-1)
            r1[r2] = r5
            r2 = r4
            r4 = r7
            goto L26
        L37:
            java.security.spec.ECFieldF2m r2 = new java.security.spec.ECFieldF2m
            int r4 = r0.length
            int r4 = r4 - r3
            r0 = r0[r4]
            r2.<init>(r0, r1)
            r1 = r2
        L41:
            eًُ٘ r0 = r10.vip
            java.math.BigInteger r0 = r0.firebase()
            eًُ٘ r10 = r10.metrica
            java.math.BigInteger r10 = r10.firebase()
            java.security.spec.EllipticCurve r2 = new java.security.spec.EllipticCurve
            r2.<init>(r1, r0, r10, r14)
            java.security.spec.ECPoint r10 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r11)
            int r11 = r13.intValue()
            r8.<init>(r2, r10, r12, r11)
            r8.f17853e = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8890e.<init>(java.lang.String, eؑ٘ؑ, eٍۨؔ, java.math.BigInteger, java.math.BigInteger, byte[]):void");
    }

    public C8890e(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f17853e = str;
    }
}
