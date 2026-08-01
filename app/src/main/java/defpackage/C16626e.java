package defpackage;

/* renamed from: eٖۥٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16626e extends C13203e {
    public final int loadAd;

    public C16626e(InterfaceC2227e interfaceC2227e) {
        if (interfaceC2227e instanceof AbstractC17551e) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.mopub = interfaceC2227e;
        int isPro = interfaceC2227e.isPro();
        this.loadAd = isPro;
        this.yandex = new byte[isPro * 2];
        this.startapp = 0;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int ad(byte[] bArr, int i) {
        if (this.startapp + i > bArr.length) {
            throw new RuntimeException("output buffer to small in doFinal");
        }
        int isPro = this.mopub.isPro();
        int i2 = this.startapp;
        int i3 = i2 - isPro;
        byte[] bArr2 = new byte[isPro];
        if (this.adcel) {
            if (i2 < isPro) {
                throw new RuntimeException("need at least one block of input for CTS");
            }
            this.mopub.tapsense(0, 0, this.yandex, bArr2);
            int i4 = this.startapp;
            if (i4 > isPro) {
                while (true) {
                    byte[] bArr3 = this.yandex;
                    if (i4 == bArr3.length) {
                        break;
                    }
                    bArr3[i4] = bArr2[i4 - isPro];
                    i4++;
                }
                for (int i5 = isPro; i5 != this.startapp; i5++) {
                    byte[] bArr4 = this.yandex;
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr2[i5 - isPro]);
                }
                InterfaceC2227e interfaceC2227e = this.mopub;
                if (interfaceC2227e instanceof C8011e) {
                    ((C8011e) interfaceC2227e).f16252e.tapsense(isPro, i, this.yandex, bArr);
                } else {
                    interfaceC2227e.tapsense(isPro, i, this.yandex, bArr);
                }
                System.arraycopy(bArr2, 0, bArr, i + isPro, i3);
            }
            System.arraycopy(bArr2, 0, bArr, i, isPro);
        } else {
            if (i2 < isPro) {
                throw new RuntimeException("need at least one block of input for CTS");
            }
            byte[] bArr5 = new byte[isPro];
            if (i2 > isPro) {
                InterfaceC2227e interfaceC2227e2 = this.mopub;
                if (interfaceC2227e2 instanceof C8011e) {
                    ((C8011e) interfaceC2227e2).f16252e.tapsense(0, 0, this.yandex, bArr2);
                } else {
                    interfaceC2227e2.tapsense(0, 0, this.yandex, bArr2);
                }
                for (int i6 = isPro; i6 != this.startapp; i6++) {
                    int i7 = i6 - isPro;
                    bArr5[i7] = (byte) (bArr2[i7] ^ this.yandex[i6]);
                }
                System.arraycopy(this.yandex, isPro, bArr2, 0, i3);
                this.mopub.tapsense(0, i, bArr2, bArr);
                System.arraycopy(bArr5, 0, bArr, i + isPro, i3);
            } else {
                this.mopub.tapsense(0, 0, this.yandex, bArr2);
                System.arraycopy(bArr2, 0, bArr, i, isPro);
            }
        }
        int i8 = this.startapp;
        adcel();
        return i8;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int appmetrica(int i) {
        int i2 = i + this.startapp;
        byte[] bArr = this.yandex;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int metrica(int i) {
        return i + this.startapp;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int startapp(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int isPro = this.mopub.isPro();
        int appmetrica = appmetrica(i2);
        if (appmetrica > 0 && i3 + appmetrica > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        byte[] bArr3 = this.yandex;
        int length = bArr3.length;
        int i4 = this.startapp;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            i += i5;
            i2 -= i5;
            if (bArr == bArr2 && AbstractC12442e.m3347class(i, i2, i3, appmetrica)) {
                bArr = new byte[i2];
                System.arraycopy(bArr2, i, bArr, 0, i2);
                i = 0;
            }
            int tapsense = this.mopub.tapsense(0, i3, this.yandex, bArr2);
            byte[] bArr4 = this.yandex;
            System.arraycopy(bArr4, isPro, bArr4, 0, isPro);
            this.startapp = isPro;
            while (i2 > isPro) {
                System.arraycopy(bArr, i, this.yandex, this.startapp, isPro);
                tapsense += this.mopub.tapsense(0, i3 + tapsense, this.yandex, bArr2);
                byte[] bArr5 = this.yandex;
                System.arraycopy(bArr5, isPro, bArr5, 0, isPro);
                i2 -= isPro;
                i += isPro;
            }
            i6 = tapsense;
        }
        System.arraycopy(bArr, i, this.yandex, this.startapp, i2);
        this.startapp += i2;
        return i6;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int yandex(byte b, byte[] bArr, int i) {
        int i2 = this.startapp;
        byte[] bArr2 = this.yandex;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int tapsense = this.mopub.tapsense(0, i, bArr2, bArr);
            byte[] bArr3 = this.yandex;
            int i4 = this.loadAd;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            this.startapp = i4;
            i3 = tapsense;
        }
        byte[] bArr4 = this.yandex;
        int i5 = this.startapp;
        this.startapp = i5 + 1;
        bArr4[i5] = b;
        return i3;
    }
}
