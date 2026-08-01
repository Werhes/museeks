package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eٌَۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8888e extends AbstractC7629e {
    public final C16253e mopub;

    public C8888e(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5);
        this.mopub = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] ad(C13935e c13935e, byte[] bArr, byte[] bArr2) {
        int i = this.ad;
        byte[] bArr3 = new byte[i];
        int length = bArr.length;
        C16253e c16253e = this.mopub;
        c16253e.purchase(0, length, bArr);
        byte[] bArr4 = (byte[]) c13935e.f27641e;
        c16253e.purchase(0, bArr4.length, bArr4);
        c16253e.purchase(0, bArr2.length, bArr2);
        c16253e.metrica(0, i, bArr3);
        return bArr3;
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] appmetrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        C16253e c16253e = this.mopub;
        c16253e.purchase(0, length, bArr);
        c16253e.purchase(0, bArr2.length, bArr2);
        if (bArr3 != null) {
            c16253e.purchase(0, bArr3.length, bArr3);
        }
        c16253e.purchase(0, bArr4.length, bArr4);
        int i = this.ad;
        byte[] bArr5 = new byte[i];
        c16253e.metrica(0, i, bArr5);
        return bArr5;
    }

    @Override // defpackage.AbstractC7629e
    public final void billing(byte[] bArr) {
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] license(C13935e c13935e, byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C16253e c16253e = this.mopub;
        c16253e.purchase(0, length, bArr);
        byte[] bArr3 = (byte[]) c13935e.f27641e;
        c16253e.purchase(0, bArr3.length, bArr3);
        c16253e.purchase(0, bArr2.length, bArr2);
        int i = this.ad;
        byte[] bArr4 = new byte[i];
        c16253e.metrica(0, i, bArr4);
        return bArr4;
    }

    @Override // defpackage.AbstractC7629e
    public final C15475e metrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i = ((this.billing * this.yandex) + 7) / 8;
        int i2 = this.purchase;
        int i3 = this.startapp;
        int i4 = i3 / i2;
        int i5 = i3 - i4;
        int i6 = (i4 + 7) / 8;
        int i7 = (i5 + 7) / 8;
        int i8 = i + i6 + i7;
        byte[] bArr6 = new byte[i8];
        int length = bArr.length;
        C16253e c16253e = this.mopub;
        c16253e.purchase(0, length, bArr);
        c16253e.purchase(0, bArr2.length, bArr2);
        c16253e.purchase(0, bArr3.length, bArr3);
        if (bArr4 != null) {
            c16253e.purchase(0, bArr4.length, bArr4);
        }
        c16253e.purchase(0, bArr5.length, bArr5);
        c16253e.metrica(0, i8, bArr6);
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr6, i, bArr7, 8 - i7, i7);
        long license = AbstractC3628e.license(0, bArr7) & ((-1) >>> (64 - i5));
        byte[] bArr8 = new byte[4];
        System.arraycopy(bArr6, i7 + i, bArr8, 4 - i6, i6);
        return new C15475e(AbstractC3628e.metrica(0, bArr8) & ((-1) >>> (32 - i4)), license, AbstractC12442e.admob(0, i, bArr6));
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] purchase(C13935e c13935e, byte[] bArr, byte[] bArr2) {
        int i = this.ad;
        byte[] bArr3 = new byte[i];
        int length = bArr.length;
        C16253e c16253e = this.mopub;
        c16253e.purchase(0, length, bArr);
        byte[] bArr4 = (byte[]) c13935e.f27641e;
        c16253e.purchase(0, bArr4.length, bArr4);
        c16253e.purchase(0, bArr2.length, bArr2);
        c16253e.metrica(0, i, bArr3);
        return bArr3;
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] vip(C13935e c13935e, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = this.ad;
        byte[] bArr4 = new byte[i];
        int length = bArr.length;
        C16253e c16253e = this.mopub;
        c16253e.purchase(0, length, bArr);
        byte[] bArr5 = (byte[]) c13935e.f27641e;
        c16253e.purchase(0, bArr5.length, bArr5);
        c16253e.purchase(0, bArr2.length, bArr2);
        c16253e.purchase(0, bArr3.length, bArr3);
        c16253e.metrica(0, i, bArr4);
        return bArr4;
    }
}
