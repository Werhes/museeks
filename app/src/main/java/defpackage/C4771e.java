package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4771e extends AbstractC16754e {
    public final byte[] appmetrica;
    public int billing;
    public final int purchase;

    public C4771e(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.appmetrica = bArr;
        this.billing = 0;
        this.purchase = i;
    }

    @Override // defpackage.AbstractC16754e
    public final void Signature(int i, AbstractC4002e abstractC4002e) {
        isPro(i, 2);
        ads(abstractC4002e.size());
        C11507e c11507e = (C11507e) abstractC4002e;
        appmetrica(c11507e.adcel(), c11507e.size(), c11507e.f23125e);
    }

    @Override // defpackage.AbstractC16754e
    public final void admob(int i, int i2) {
        isPro(i, 5);
        subscription(i2);
    }

    @Override // defpackage.AbstractC16754e
    public final void ads(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.appmetrica;
            if (i2 == 0) {
                int i3 = this.billing;
                this.billing = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.billing;
                    this.billing = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
                }
            }
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC16754e
    public final void amazon(byte b) {
        try {
            byte[] bArr = this.appmetrica;
            int i = this.billing;
            this.billing = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC16754e
    public final void applovin(int i, int i2) {
        isPro(i, 0);
        ads(i2);
    }

    @Override // defpackage.AbstractC16275e
    public final void appmetrica(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.appmetrica, this.billing, i2);
            this.billing += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), Integer.valueOf(i2)), e, 1);
        }
    }

    public final int crashlytics() {
        return this.purchase - this.billing;
    }

    @Override // defpackage.AbstractC16754e
    public final void inmobi(int i, String str) {
        isPro(i, 2);
        int i2 = this.billing;
        try {
            int mopub = AbstractC16754e.mopub(str.length() * 3);
            int mopub2 = AbstractC16754e.mopub(str.length());
            byte[] bArr = this.appmetrica;
            if (mopub2 != mopub) {
                ads(AbstractC15375e.vip(str));
                this.billing = AbstractC15375e.ad.license(str, bArr, this.billing, crashlytics());
                return;
            }
            int i3 = i2 + mopub2;
            this.billing = i3;
            int license = AbstractC15375e.ad.license(str, bArr, i3, crashlytics());
            this.billing = i2;
            ads((license - i2) - mopub2);
            this.billing = license;
        } catch (C4035e e) {
            this.billing = i2;
            smaato(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C13593e(e2);
        }
    }

    @Override // defpackage.AbstractC16754e
    public final void isPro(int i, int i2) {
        ads((i << 3) | i2);
    }

    @Override // defpackage.AbstractC16754e
    public final void isVip(int i, AbstractC6866e abstractC6866e, InterfaceC3028e interfaceC3028e) {
        isPro(i, 2);
        ads(abstractC6866e.vip(interfaceC3028e));
        interfaceC3028e.purchase(abstractC6866e, this.vip);
    }

    @Override // defpackage.AbstractC16754e
    public final void loadAd(int i, boolean z) {
        isPro(i, 0);
        amazon(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.AbstractC16754e
    public final void premium(int i, long j) {
        isPro(i, 0);
        subs(j);
    }

    @Override // defpackage.AbstractC16754e
    public final void pro(long j) {
        try {
            byte[] bArr = this.appmetrica;
            int i = this.billing;
            int i2 = i + 1;
            this.billing = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.billing = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.billing = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.billing = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.billing = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.billing = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.billing = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.billing = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC16754e
    public final void remoteconfig(int i, long j) {
        isPro(i, 1);
        pro(j);
    }

    @Override // defpackage.AbstractC16754e
    public final void signatures(int i, int i2) {
        isPro(i, 0);
        tapsense(i2);
    }

    @Override // defpackage.AbstractC16754e
    public final void subs(long j) {
        boolean z = AbstractC16754e.license;
        byte[] bArr = this.appmetrica;
        if (z && crashlytics() >= 10) {
            while ((j & (-128)) != 0) {
                int i = this.billing;
                this.billing = i + 1;
                AbstractC14352e.mopub(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.billing;
            this.billing = i2 + 1;
            AbstractC14352e.mopub(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i3 = this.billing;
                this.billing = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
            }
        }
        int i4 = this.billing;
        this.billing = i4 + 1;
        bArr[i4] = (byte) j;
    }

    @Override // defpackage.AbstractC16754e
    public final void subscription(int i) {
        try {
            byte[] bArr = this.appmetrica;
            int i2 = this.billing;
            int i3 = i2 + 1;
            this.billing = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.billing = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.billing = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.billing = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC16754e
    public final void tapsense(int i) {
        if (i >= 0) {
            ads(i);
        } else {
            subs(i);
        }
    }
}
