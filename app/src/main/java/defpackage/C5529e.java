package defpackage;

/* renamed from: eٍؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5529e extends AbstractC15047e implements InterfaceC3928e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f11819e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13719e f11820e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f11821e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f11822e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5529e(defpackage.C11467e r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.f23072e
            eٟٓؒ r0 = (defpackage.C13719e) r0
            eٕؑ٘ r1 = r0.vip
            java.lang.String r2 = r1.appmetrica
            r3 = 0
            r5.<init>(r2, r3)
            r5.f11820e = r0
            int r1 = r1.purchase
            java.lang.Object r2 = r6.f23071e
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L4d
            int r6 = r2.length
            int r0 = r1 + r1
            if (r6 != r0) goto L2a
            r5.f11821e = r3
            byte[] r6 = defpackage.AbstractC16947e.yandex(r3, r1, r2)
            r5.f11819e = r6
            byte[] r6 = defpackage.AbstractC16947e.yandex(r1, r1, r2)
            r5.f11822e = r6
            return
        L2a:
            int r6 = r2.length
            int r0 = r1 + 4
            int r4 = r0 + r1
            if (r6 != r4) goto L45
            int r6 = defpackage.AbstractC3628e.metrica(r3, r2)
            r5.f11821e = r6
            r6 = 4
            byte[] r6 = defpackage.AbstractC16947e.yandex(r6, r1, r2)
            r5.f11819e = r6
            byte[] r6 = defpackage.AbstractC16947e.yandex(r0, r1, r2)
            r5.f11822e = r6
            return
        L45:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "public key has wrong size"
            r6.<init>(r0)
            throw r6
        L4d:
            eٔۜٞ r0 = r0.ad
            if (r0 == 0) goto L56
            int r0 = r0.ad
            r5.f11821e = r0
            goto L58
        L56:
            r5.f11821e = r3
        L58:
            java.lang.Object r0 = r6.f23070e
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L6c
            int r2 = r0.length
            if (r2 != r1) goto L64
            r5.f11819e = r0
            goto L70
        L64:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of root must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L6c:
            byte[] r0 = new byte[r1]
            r5.f11819e = r0
        L70:
            java.lang.Object r6 = r6.f23069e
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L84
            int r0 = r6.length
            if (r0 != r1) goto L7c
            r5.f11822e = r6
            return
        L7c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of publicSeed must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L84:
            byte[] r6 = new byte[r1]
            r5.f11822e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5529e.<init>(eِؒۜ):void");
    }

    public final byte[] ad() {
        byte[] bArr;
        int i = this.f11820e.vip.purchase;
        int i2 = 0;
        int i3 = this.f11821e;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            AbstractC3628e.billing(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        AbstractC16947e.purchase(bArr, i2, this.f11819e);
        AbstractC16947e.purchase(bArr, i2 + i, this.f11822e);
        return bArr;
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        return ad();
    }
}
