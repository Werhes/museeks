package defpackage;

import java.math.BigInteger;

/* renamed from: e٘ؐٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17458e extends AbstractC2413e {
    public final /* synthetic */ AbstractC0362e appmetrica;
    public final /* synthetic */ byte[] license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ int vip;

    public C17458e(AbstractC0362e abstractC0362e, int i, int i2, byte[] bArr) {
        this.appmetrica = abstractC0362e;
        this.vip = i;
        this.metrica = i2;
        this.license = bArr;
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e billing(int i) {
        int i2 = this.metrica;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.vip; i4++) {
            int i5 = ((i4 ^ i) - 1) >> 31;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b = bArr[i6];
                byte[] bArr3 = this.license;
                bArr[i6] = (byte) (b ^ (bArr3[i3 + i6] & i5));
                bArr2[i6] = (byte) (bArr2[i6] ^ (bArr3[(i3 + i2) + i6] & i5));
            }
            i3 += i2 * 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        AbstractC0362e abstractC0362e = this.appmetrica;
        return abstractC0362e.appmetrica(abstractC0362e.adcel(bigInteger), abstractC0362e.adcel(new BigInteger(1, bArr2)));
    }

    @Override // defpackage.AbstractC2413e
    public final int license() {
        return this.vip;
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e yandex(int i) {
        int i2 = this.metrica;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[i2];
        int i3 = i * i2 * 2;
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.license;
            bArr[i4] = bArr3[i3 + i4];
            bArr2[i4] = bArr3[i3 + i2 + i4];
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        AbstractC0362e abstractC0362e = this.appmetrica;
        return abstractC0362e.appmetrica(abstractC0362e.adcel(bigInteger), abstractC0362e.adcel(new BigInteger(1, bArr2)));
    }
}
