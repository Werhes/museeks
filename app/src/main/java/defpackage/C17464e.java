package defpackage;

/* renamed from: e٘ؐۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17464e extends AbstractC15047e implements InterfaceC3928e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f34203e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0368e f34204e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f34205e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f34206e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17464e(defpackage.C11106e r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.f22008e
            eٕؑ٘ r0 = (defpackage.C0368e) r0
            java.lang.String r1 = r0.appmetrica
            r2 = 0
            r5.<init>(r1, r2)
            r5.f34204e = r0
            int r1 = r0.purchase
            java.lang.Object r3 = r6.f22006e
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L4b
            int r6 = r3.length
            int r0 = r1 + r1
            if (r6 != r0) goto L28
            r5.f34205e = r2
            byte[] r6 = defpackage.AbstractC16947e.yandex(r2, r1, r3)
            r5.f34203e = r6
            byte[] r6 = defpackage.AbstractC16947e.yandex(r1, r1, r3)
            r5.f34206e = r6
            return
        L28:
            int r6 = r3.length
            int r0 = r1 + 4
            int r4 = r0 + r1
            if (r6 != r4) goto L43
            int r6 = defpackage.AbstractC3628e.metrica(r2, r3)
            r5.f34205e = r6
            r6 = 4
            byte[] r6 = defpackage.AbstractC16947e.yandex(r6, r1, r3)
            r5.f34203e = r6
            byte[] r6 = defpackage.AbstractC16947e.yandex(r0, r1, r3)
            r5.f34206e = r6
            return
        L43:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "public key has wrong size"
            r6.<init>(r0)
            throw r6
        L4b:
            eْٕٚ r0 = r0.ad
            if (r0 == 0) goto L54
            int r0 = r0.ad
            r5.f34205e = r0
            goto L56
        L54:
            r5.f34205e = r2
        L56:
            java.lang.Object r0 = r6.f22007e
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L6a
            int r2 = r0.length
            if (r2 != r1) goto L62
            r5.f34203e = r0
            goto L6e
        L62:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of root must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L6a:
            byte[] r0 = new byte[r1]
            r5.f34203e = r0
        L6e:
            java.lang.Object r6 = r6.f22009e
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L82
            int r0 = r6.length
            if (r0 != r1) goto L7a
            r5.f34206e = r6
            return
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of publicSeed must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L82:
            byte[] r6 = new byte[r1]
            r5.f34206e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17464e.<init>(eُٕٛ):void");
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        byte[] bArr;
        int i = this.f34204e.purchase;
        int i2 = 0;
        int i3 = this.f34205e;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            AbstractC3628e.billing(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        AbstractC16947e.purchase(bArr, i2, this.f34203e);
        AbstractC16947e.purchase(bArr, i2 + i, this.f34206e);
        return bArr;
    }
}
