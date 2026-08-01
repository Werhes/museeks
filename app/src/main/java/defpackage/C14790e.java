package defpackage;

/* renamed from: eٔٙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14790e extends C13203e {
    public final InterfaceC14454e loadAd;

    public C14790e(InterfaceC2227e interfaceC2227e) {
        this(interfaceC2227e, new C16728e(6));
    }

    public C14790e(InterfaceC2227e interfaceC2227e, InterfaceC14454e interfaceC14454e) {
        this.mopub = interfaceC2227e;
        this.loadAd = interfaceC14454e;
        this.yandex = new byte[interfaceC2227e.isPro()];
        this.startapp = 0;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int ad(byte[] bArr, int i) {
        int i2;
        int isPro = this.mopub.isPro();
        boolean z = this.adcel;
        InterfaceC14454e interfaceC14454e = this.loadAd;
        if (z) {
            if (this.startapp != isPro) {
                i2 = 0;
            } else {
                if ((isPro * 2) + i > bArr.length) {
                    adcel();
                    throw new RuntimeException("output buffer too short");
                }
                i2 = this.mopub.tapsense(0, i, this.yandex, bArr);
                this.startapp = 0;
            }
            interfaceC14454e.loadAd(this.startapp, this.yandex);
            return this.mopub.tapsense(0, i + i2, this.yandex, bArr) + i2;
        }
        if (this.startapp != isPro) {
            adcel();
            throw new RuntimeException("last block incomplete in decryption");
        }
        InterfaceC2227e interfaceC2227e = this.mopub;
        byte[] bArr2 = this.yandex;
        int tapsense = interfaceC2227e.tapsense(0, 0, bArr2, bArr2);
        this.startapp = 0;
        try {
            int admob = tapsense - interfaceC14454e.admob(this.yandex);
            System.arraycopy(this.yandex, 0, bArr, i, admob);
            return admob;
        } finally {
            adcel();
        }
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int appmetrica(int i) {
        int i2 = i + this.startapp;
        byte[] bArr = this.yandex;
        int length = i2 % bArr.length;
        return length == 0 ? Math.max(0, i2 - bArr.length) : i2 - length;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final int metrica(int i) {
        int i2 = i + this.startapp;
        byte[] bArr = this.yandex;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!this.adcel) {
            return i2;
        }
        return i2 + bArr.length;
    }

    @Override // defpackage.C13203e, defpackage.C15612e
    public final void purchase(boolean z, InterfaceC3894e interfaceC3894e) {
        InterfaceC2227e interfaceC2227e;
        this.adcel = z;
        adcel();
        boolean z2 = interfaceC3894e instanceof C12219e;
        InterfaceC14454e interfaceC14454e = this.loadAd;
        if (z2) {
            C12219e c12219e = (C12219e) interfaceC3894e;
            interfaceC14454e.isPro(c12219e.f24538e);
            interfaceC2227e = this.mopub;
            interfaceC3894e = c12219e.f24537e;
        } else {
            interfaceC14454e.isPro(null);
            interfaceC2227e = this.mopub;
        }
        interfaceC2227e.init(z, interfaceC3894e);
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
            this.startapp = 0;
            i6 = tapsense;
            while (i2 > this.yandex.length) {
                i6 += this.mopub.tapsense(i, i3 + i6, bArr, bArr2);
                i2 -= isPro;
                i += isPro;
            }
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
            this.startapp = 0;
            i3 = tapsense;
        }
        byte[] bArr3 = this.yandex;
        int i4 = this.startapp;
        this.startapp = i4 + 1;
        bArr3[i4] = b;
        return i3;
    }
}
