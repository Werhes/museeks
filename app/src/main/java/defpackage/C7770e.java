package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* renamed from: eًؘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7770e extends AbstractC15047e implements InterfaceC3928e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f15743e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13719e f15744e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public volatile long f15745e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f15746e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public volatile C3607e f15747e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f15748e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f15749e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7770e(defpackage.C5214e r7) {
        /*
            r6 = this;
            eٟٓؒ r1 = r7.ad
            eٕؑ٘ r0 = r1.vip
            java.lang.String r2 = r0.appmetrica
            r3 = 1
            r6.<init>(r2, r3)
            r6.f15744e = r1
            int r0 = r0.purchase
            long r2 = r7.vip
            r6.f15745e = r2
            byte[] r5 = r7.license
            if (r5 == 0) goto L24
            int r2 = r5.length
            if (r2 != r0) goto L1c
            r6.f15746e = r5
            goto L28
        L1c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeySeed needs to be equal size of digest"
            r7.<init>(r0)
            throw r7
        L24:
            byte[] r2 = new byte[r0]
            r6.f15746e = r2
        L28:
            byte[] r2 = r7.appmetrica
            if (r2 == 0) goto L3a
            int r3 = r2.length
            if (r3 != r0) goto L32
            r6.f15743e = r2
            goto L3e
        L32:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeyPRF needs to be equal size of digest"
            r7.<init>(r0)
            throw r7
        L3a:
            byte[] r2 = new byte[r0]
            r6.f15743e = r2
        L3e:
            byte[] r4 = r7.purchase
            if (r4 == 0) goto L50
            int r2 = r4.length
            if (r2 != r0) goto L48
            r6.f15749e = r4
            goto L54
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of publicSeed needs to be equal size of digest"
            r7.<init>(r0)
            throw r7
        L50:
            byte[] r2 = new byte[r0]
            r6.f15749e = r2
        L54:
            byte[] r2 = r7.billing
            if (r2 == 0) goto L66
            int r3 = r2.length
            if (r3 != r0) goto L5e
            r6.f15748e = r2
            goto L6a
        L5e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of root needs to be equal size of digest"
            r7.<init>(r0)
            throw r7
        L66:
            byte[] r0 = new byte[r0]
            r6.f15748e = r0
        L6a:
            eؕۚؓ r0 = r7.yandex
            if (r0 == 0) goto L71
        L6e:
            r6.f15747e = r0
            goto L92
        L71:
            long r2 = r7.vip
            int r0 = r1.metrica
            boolean r0 = defpackage.AbstractC16947e.startapp(r0, r2)
            if (r0 == 0) goto L87
            if (r4 == 0) goto L87
            if (r5 == 0) goto L87
            eؕۚؓ r0 = new eؕۚؓ
            long r2 = r7.vip
            r0.<init>(r1, r2, r4, r5)
            goto L6e
        L87:
            eؕۚؓ r0 = new eؕۚؓ
            long r1 = r7.metrica
            r3 = 1
            long r1 = r1 + r3
            r0.<init>(r1)
            goto L6e
        L92:
            long r0 = r7.metrica
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto Lab
            eؕۚؓ r7 = r6.f15747e
            long r2 = r7.f8136e
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxIndex set but not reflected in state"
            r7.<init>(r0)
            throw r7
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7770e.<init>(eؗۡۨ):void");
    }

    public final byte[] ad() {
        byte[] adcel;
        synchronized (this) {
            try {
                C13719e c13719e = this.f15744e;
                int i = c13719e.vip.purchase;
                int i2 = (c13719e.metrica + 7) / 8;
                int i3 = i2 + i;
                int i4 = i3 + i;
                int i5 = i4 + i;
                byte[] bArr = new byte[i + i5];
                AbstractC16947e.purchase(bArr, 0, AbstractC16947e.advert(i2, this.f15745e));
                AbstractC16947e.purchase(bArr, i2, this.f15746e);
                AbstractC16947e.purchase(bArr, i3, this.f15743e);
                AbstractC16947e.purchase(bArr, i4, this.f15749e);
                AbstractC16947e.purchase(bArr, i5, this.f15748e);
                try {
                    C3607e c3607e = this.f15747e;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(c3607e);
                    objectOutputStream.flush();
                    adcel = AbstractC12442e.adcel(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return adcel;
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        byte[] ad;
        synchronized (this) {
            ad = ad();
        }
        return ad;
    }
}
