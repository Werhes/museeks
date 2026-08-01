package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2749e extends AbstractC13874e {
    public final int appmetrica;
    public final byte[] license;
    public int purchase;

    public C2749e(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC1786e.Signature(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.license = bArr;
        this.purchase = 0;
        this.appmetrica = i;
    }

    @Override // defpackage.AbstractC6874e
    public final void admob(int i, int i2, byte[] bArr) {
        m1204while(i, i2, bArr);
    }

    @Override // defpackage.AbstractC13874e
    public final void ads(int i, String str) {
        mo1198goto((i << 3) | 2);
        mo1202throw(str);
    }

    @Override // defpackage.AbstractC13874e
    public final void applovin(int i, boolean z) {
        mo1198goto(i << 3);
        mo1196class(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: class, reason: not valid java name */
    public final void mo1196class(byte b) {
        int i = this.purchase;
        try {
            int i2 = i + 1;
            try {
                this.license[i] = b;
                this.purchase = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new C13593e(i, this.appmetrica, 1, e, 14);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.AbstractC13874e
    public final void crashlytics(int i, byte[] bArr) {
        mo1198goto(i);
        m1204while(0, i, bArr);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: extends, reason: not valid java name */
    public final void mo1197extends(long j) {
        int i = this.purchase;
        try {
            byte[] bArr = this.license;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.purchase = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(i, this.appmetrica, 8, e, 14);
        }
    }

    @Override // defpackage.AbstractC13874e
    public final void firebase(AbstractC17836e abstractC17836e) {
        AbstractC15319e abstractC15319e = (AbstractC15319e) abstractC17836e;
        mo1198goto(abstractC15319e.amazon());
        abstractC15319e.purchase(this);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: goto, reason: not valid java name */
    public final void mo1198goto(int i) {
        int i2;
        int i3 = this.purchase;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.license;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.purchase = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C13593e(i2, this.appmetrica, 1, e, 14);
                }
            }
            throw new C13593e(i2, this.appmetrica, 1, e, 14);
        }
    }

    @Override // defpackage.AbstractC13874e
    public final void inmobi(int i, long j) {
        mo1198goto(i << 3);
        mo1200native(j);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: interface, reason: not valid java name */
    public final void mo1199interface(int i) {
        if (i >= 0) {
            mo1198goto(i);
        } else {
            mo1200native(i);
        }
    }

    @Override // defpackage.AbstractC13874e
    public final void isPro(int i, long j) {
        mo1198goto((i << 3) | 1);
        mo1197extends(j);
    }

    @Override // defpackage.AbstractC13874e
    public final void isVip(int i, int i2) {
        mo1198goto((i << 3) | 5);
        mo1201this(i2);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: native, reason: not valid java name */
    public final void mo1200native(long j) {
        int i;
        int i2 = this.purchase;
        int i3 = this.appmetrica;
        byte[] bArr = this.license;
        if (!AbstractC13874e.metrica || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new C13593e(i, i3, 1, e, 14);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new C13593e(i, i3, 1, e, 14);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                AbstractC1929e.mopub(bArr, i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC1929e.mopub(bArr, i2, (byte) j3);
        }
        this.purchase = i;
    }

    @Override // defpackage.AbstractC13874e
    public final void premium(int i, AbstractC7244e abstractC7244e) {
        mo1198goto((i << 3) | 2);
        subs(abstractC7244e);
    }

    @Override // defpackage.AbstractC13874e
    public final void pro(int i, int i2) {
        mo1198goto((i << 3) | i2);
    }

    @Override // defpackage.AbstractC13874e
    public final void signatures(int i, int i2) {
        mo1198goto(i << 3);
        mo1199interface(i2);
    }

    @Override // defpackage.AbstractC13874e
    public final void subs(AbstractC7244e abstractC7244e) {
        mo1198goto(abstractC7244e.billing());
        abstractC7244e.adcel(this);
    }

    @Override // defpackage.AbstractC13874e
    public final void tapsense(int i, int i2) {
        mo1198goto(i << 3);
        mo1198goto(i2);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: this, reason: not valid java name */
    public final void mo1201this(int i) {
        int i2 = this.purchase;
        try {
            byte[] bArr = this.license;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.purchase = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(i2, this.appmetrica, 4, e, 14);
        }
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: throw, reason: not valid java name */
    public final void mo1202throw(String str) {
        int i = this.purchase;
        try {
            int subscription = AbstractC13874e.subscription(str.length() * 3);
            int subscription2 = AbstractC13874e.subscription(str.length());
            byte[] bArr = this.license;
            if (subscription2 != subscription) {
                mo1198goto(AbstractC2059e.vip(str));
                int i2 = this.purchase;
                this.purchase = AbstractC2059e.metrica(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + subscription2;
                this.purchase = i3;
                int metrica = AbstractC2059e.metrica(str, bArr, i3, bArr.length - i3);
                this.purchase = i;
                mo1198goto((metrica - i) - subscription2);
                this.purchase = metrica;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(e);
        }
    }

    /* renamed from: try, reason: not valid java name */
    public final int m1203try() {
        return this.appmetrica - this.purchase;
    }

    /* renamed from: while, reason: not valid java name */
    public final void m1204while(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.license, this.purchase, i2);
            this.purchase += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(this.purchase, this.appmetrica, i2, e, 14);
        }
    }
}
