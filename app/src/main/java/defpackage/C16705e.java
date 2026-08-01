package defpackage;

import java.security.interfaces.ECPrivateKey;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16705e implements InterfaceC7304e {
    public final ECPrivateKey ad;
    public final EnumC1901e appmetrica;
    public final byte[] billing;
    public final byte[] license;
    public final String metrica;
    public final InterfaceC18515e purchase;
    public final C16089e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٍؘٖ] */
    public C16705e(ECPrivateKey eCPrivateKey, byte[] bArr, String str, EnumC1901e enumC1901e, InterfaceC18515e interfaceC18515e, byte[] bArr2) {
        this.ad = eCPrivateKey;
        ?? obj = new Object();
        obj.f31681e = eCPrivateKey;
        this.vip = obj;
        this.license = bArr;
        this.metrica = str;
        this.appmetrica = enumC1901e;
        this.purchase = interfaceC18515e;
        this.billing = bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    @Override // defpackage.InterfaceC7304e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] ad(byte[] r9) {
        /*
            r8 = this;
            byte[] r0 = r8.billing
            boolean r1 = defpackage.AbstractC6336e.vip(r0, r9)
            if (r1 == 0) goto L83
            int r0 = r0.length
            java.security.interfaces.ECPrivateKey r1 = r8.ad
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            int r1 = defpackage.AbstractC16091e.mopub(r1)
            eؓٙۢ r2 = r8.appmetrica
            int r3 = r2.ordinal()
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L31
            if (r3 == r5) goto L2f
            if (r3 != r4) goto L27
            int r1 = r1 * r4
            goto L33
        L27:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown EC point format"
            r9.<init>(r0)
            throw r9
        L2f:
            int r1 = r1 + r5
            goto L33
        L31:
            int r1 = r1 * r4
            goto L2f
        L33:
            int r3 = r9.length
            int r1 = r1 + r0
            if (r3 < r1) goto L7b
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r0, r1)
            eۧٛ r3 = r8.purchase
            int r4 = r3.mopub()
            eٍؘٖ r5 = r8.vip
            java.lang.Object r5 = r5.f31681e
            java.security.interfaces.ECPrivateKey r5 = (java.security.interfaces.ECPrivateKey) r5
            java.security.spec.ECParameterSpec r6 = r5.getParams()
            java.security.spec.EllipticCurve r7 = r6.getCurve()
            java.security.spec.ECPoint r2 = defpackage.AbstractC16091e.inmobi(r7, r2, r0)
            java.security.spec.ECPublicKeySpec r7 = new java.security.spec.ECPublicKeySpec
            r7.<init>(r2, r6)
            eؚٕٕ r2 = defpackage.C7174e.purchase
            java.lang.String r6 = "EC"
            eّؓٝ r2 = r2.ad
            java.lang.Object r2 = r2.isPro(r6)
            java.security.KeyFactory r2 = (java.security.KeyFactory) r2
            java.security.PublicKey r2 = r2.generatePublic(r7)
            java.security.interfaces.ECPublicKey r2 = (java.security.interfaces.ECPublicKey) r2
            byte[] r2 = defpackage.AbstractC16091e.appmetrica(r5, r2)
            java.lang.String r5 = r8.metrica
            byte[] r6 = r8.license
            byte[] r0 = defpackage.AbstractC2301e.remoteconfig(r4, r5, r0, r2, r6)
            byte[] r9 = r3.advert(r0, r1, r9)
            return r9
        L7b:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r9.<init>(r0)
            throw r9
        L83:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Invalid ciphertext (output prefix mismatch)"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16705e.ad(byte[]):byte[]");
    }
}
