package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8460e extends AbstractC13258e {
    public final byte[] adcel;
    public int advert;
    public final int mopub;

    public C8460e(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC1786e.Signature(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.adcel = bArr;
        this.advert = 0;
        this.mopub = i;
    }

    @Override // defpackage.AbstractC13258e
    public final void Signature(int i, int i2) {
        isVip(i, 5);
        admob(i2);
    }

    @Override // defpackage.AbstractC13258e
    public final void admob(int i) {
        int i2 = this.advert;
        try {
            byte[] bArr = this.adcel;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.advert = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(i2, this.mopub, 4, e);
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void ads(long j) {
        int i;
        int i2 = this.advert;
        boolean z = AbstractC13258e.startapp;
        byte[] bArr = this.adcel;
        if (!z || premium() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C13593e(i, this.mopub, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                AbstractC5314e.mopub(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC5314e.mopub(bArr, i2, (byte) j);
        }
        this.advert = i;
    }

    @Override // defpackage.AbstractC13258e
    public final void amazon(int i, boolean z) {
        isVip(i, 0);
        smaato(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.AbstractC13258e
    public final void applovin(int i, long j) {
        isVip(i, 0);
        ads(j);
    }

    @Override // defpackage.AbstractC13258e
    public final void inmobi(int i, int i2) {
        isVip(i, 0);
        isPro(i2);
    }

    @Override // defpackage.AbstractC13258e
    public final void isPro(int i) {
        int i2;
        int i3 = this.advert;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.adcel;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.advert = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C13593e(i2, this.mopub, 1, e);
                }
            }
            throw new C13593e(i2, this.mopub, 1, e);
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void isVip(int i, int i2) {
        isPro((i << 3) | i2);
    }

    @Override // defpackage.AbstractC16082e
    public final void license(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.adcel, this.advert, i2);
            this.advert += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(this.advert, this.mopub, i2, e);
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void loadAd(int i, AbstractC10498e abstractC10498e) {
        isVip(i, 2);
        isPro(abstractC10498e.size());
        C2096e c2096e = (C2096e) abstractC10498e;
        license(c2096e.advert(), c2096e.size(), c2096e.f5426e);
    }

    public final int premium() {
        return this.mopub - this.advert;
    }

    @Override // defpackage.AbstractC13258e
    public final void pro(int i, int i2) {
        isVip(i, 0);
        signatures(i2);
    }

    @Override // defpackage.AbstractC13258e
    public final void remoteconfig(long j) {
        int i = this.advert;
        try {
            byte[] bArr = this.adcel;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.advert = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(i, this.mopub, 8, e);
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void signatures(int i) {
        if (i >= 0) {
            isPro(i);
        } else {
            ads(i);
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void smaato(byte b) {
        int i = this.advert;
        try {
            int i2 = i + 1;
            try {
                this.adcel[i] = b;
                this.advert = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new C13593e(i, this.mopub, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void subscription(int i, long j) {
        isVip(i, 1);
        remoteconfig(j);
    }

    @Override // defpackage.AbstractC13258e
    public final void tapsense(int i, String str) {
        isVip(i, 2);
        int i2 = this.advert;
        try {
            int adcel = AbstractC13258e.adcel(str.length() * 3);
            int adcel2 = AbstractC13258e.adcel(str.length());
            byte[] bArr = this.adcel;
            if (adcel2 != adcel) {
                isPro(AbstractC18226e.vip(str));
                this.advert = AbstractC18226e.ad.adcel(str, bArr, this.advert, premium());
                return;
            }
            int i3 = i2 + adcel2;
            this.advert = i3;
            int adcel3 = AbstractC18226e.ad.adcel(str, bArr, i3, premium());
            this.advert = i2;
            isPro((adcel3 - i2) - adcel2);
            this.advert = adcel3;
        } catch (C8300e e) {
            this.advert = i2;
            advert(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C13593e(e2);
        }
    }
}
