package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16792e extends C16299e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16792e(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            eؚٖٙ r0 = new eؚٖٙ
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r2 = 61
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r1.<init>(r0, r2)
            int r2 = r3.length
            r3 = 64
            if (r2 != r3) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            defpackage.AbstractC2301e.billing(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16792e.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.C16299e
    public final void metrica(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        AbstractC2301e.Signature(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C16298e c16298e = this.ad;
            char[] cArr = c16298e.vip;
            char[] cArr2 = c16298e.vip;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            vip(sb, bArr, i2, i - i2);
        }
    }
}
