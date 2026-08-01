package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: eِٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16247e extends AbstractC11471e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int[] f31921e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C8954e f31922e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f31923e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f31924e;

    public C16247e(int i, int[] iArr, C8954e c8954e) {
        super(3);
        this.f31923e = i;
        this.f31924e = iArr.length == 1 ? 2 : 3;
        this.f31921e = iArr;
        this.f31922e = c8954e;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int i;
        C8954e c8954e = this.f31922e;
        int purchase = c8954e.purchase();
        if (purchase == 0) {
            throw new IllegalStateException();
        }
        int i2 = this.f31923e;
        int[] iArr = this.f31921e;
        int i3 = 1;
        if (purchase != 1) {
            C8954e c8954e2 = (C8954e) c8954e.clone();
            int i4 = (i2 + 63) >>> 6;
            C8954e c8954e3 = new C8954e(i4);
            long[] jArr = c8954e3.f17972e;
            C8954e.yandex(jArr, i2);
            int length = iArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                C8954e.yandex(jArr, iArr[length]);
            }
            int i5 = 0;
            C8954e.yandex(jArr, 0);
            C8954e c8954e4 = new C8954e(i4);
            c8954e4.f17972e[0] = 1;
            C8954e c8954e5 = new C8954e(i4);
            int[] iArr2 = new int[2];
            iArr2[0] = purchase;
            iArr2[1] = i2 + 1;
            C8954e[] c8954eArr = {c8954e2, c8954e3};
            int[] iArr3 = new int[2];
            iArr3[0] = 1;
            iArr3[1] = 0;
            C8954e[] c8954eArr2 = {c8954e4, c8954e5};
            int i6 = iArr2[1];
            int i7 = i6 - iArr2[0];
            while (true) {
                if (i7 < 0) {
                    i7 = -i7;
                    iArr2[i3] = i6;
                    iArr3[i3] = i5;
                    i3 = 1 - i3;
                    i6 = iArr2[i3];
                    i5 = iArr3[i3];
                }
                i = 1 - i3;
                c8954eArr[i3].vip(c8954eArr[i], iArr2[i], i7);
                int billing = c8954eArr[i3].billing(i6);
                if (billing == 0) {
                    break;
                }
                int i8 = iArr3[i];
                c8954eArr2[i3].vip(c8954eArr2[i], i8, i7);
                int i9 = i8 + i7;
                if (i9 > i5) {
                    i5 = i9;
                } else if (i9 == i5) {
                    i5 = c8954eArr2[i3].billing(i5);
                }
                i7 += billing - i6;
                i6 = billing;
            }
            c8954e = c8954eArr2[i];
        }
        return new C16247e(i2, iArr, c8954e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        C8954e c8954e = (C8954e) this.f31922e.clone();
        c8954e.metrica(((C16247e) abstractC7861e).f31922e);
        return new C16247e(this.f31923e, this.f31921e, c8954e);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return this.f31922e.amazon();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        C8954e c8954e;
        C8954e c8954e2 = ((C16247e) abstractC7861e).f31922e;
        C8954e c8954e3 = ((C16247e) abstractC7861e2).f31922e;
        C8954e c8954e4 = this.f31922e;
        int mopub = c8954e4.mopub();
        if (mopub == 0) {
            c8954e = c8954e4;
        } else {
            int i = mopub << 1;
            long[] jArr = new long[i];
            int i2 = 0;
            while (i2 < i) {
                long j = c8954e4.f17972e[i2 >>> 1];
                int i3 = i2 + 1;
                jArr[i2] = C8954e.smaato((int) j);
                i2 += 2;
                jArr[i3] = C8954e.smaato((int) (j >>> 32));
            }
            c8954e = new C8954e(jArr, i);
        }
        C8954e loadAd = c8954e2.loadAd(c8954e3);
        if (c8954e == c8954e4) {
            c8954e = (C8954e) c8954e.clone();
        }
        c8954e.metrica(loadAd);
        long[] jArr2 = c8954e.f17972e;
        int length = jArr2.length;
        int i4 = this.f31923e;
        int[] iArr = this.f31921e;
        int admob = C8954e.admob(jArr2, length, i4, iArr);
        if (admob < jArr2.length) {
            long[] jArr3 = new long[admob];
            c8954e.f17972e = jArr3;
            System.arraycopy(jArr2, 0, jArr3, 0, admob);
        }
        return new C16247e(i4, iArr, c8954e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        C8954e c8954e = this.f31922e;
        int mopub = c8954e.mopub();
        int i = this.f31923e;
        int[] iArr = this.f31921e;
        if (mopub != 0) {
            int i2 = mopub << 1;
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                long j = c8954e.f17972e[i3 >>> 1];
                int i4 = i3 + 1;
                jArr[i3] = C8954e.smaato((int) j);
                i3 += 2;
                jArr[i4] = C8954e.smaato((int) (j >>> 32));
            }
            c8954e = new C8954e(jArr, C8954e.admob(jArr, i2, i, iArr));
        }
        return new C16247e(i, iArr, c8954e);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        long[] jArr = this.f31922e.f17972e;
        return jArr.length > 0 && (1 & jArr[0]) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16247e)) {
            return false;
        }
        C16247e c16247e = (C16247e) obj;
        return this.f31923e == c16247e.f31923e && this.f31924e == c16247e.f31924e && Arrays.equals(this.f31921e, c16247e.f31921e) && this.f31922e.equals(c16247e.f31922e);
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        C8954e c8954e = this.f31922e;
        int mopub = c8954e.mopub();
        if (mopub == 0) {
            return InterfaceC4563e.loadAd;
        }
        int i = mopub - 1;
        long j = c8954e.f17972e[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = mopub - 2; i5 >= 0; i5--) {
            long j2 = c8954e.f17972e[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    public final int hashCode() {
        int hashCode = this.f31922e.hashCode() ^ this.f31923e;
        int[] iArr = this.f31921e;
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return hashCode ^ i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        C8954e c8954e = this.f31922e;
        long[] jArr = c8954e.f17972e;
        int i = 0;
        while (true) {
            if (i >= jArr.length) {
                break;
            }
            if (jArr[i] == 0) {
                i++;
            } else if (!c8954e.amazon()) {
                return premium(this.f31923e - 1);
            }
        }
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return this.f31923e;
    }

    @Override // defpackage.AbstractC7861e
    public final int metrica() {
        return this.f31922e.purchase();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        C8954e c8954e = this.f31922e;
        int mopub = c8954e.mopub();
        int i2 = this.f31923e;
        int[] iArr = this.f31921e;
        if (mopub != 0) {
            int i3 = ((i2 + 63) >>> 6) << 1;
            long[] jArr = new long[i3];
            System.arraycopy(c8954e.f17972e, 0, jArr, 0, mopub);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i4 = mopub << 1;
                while (true) {
                    mopub--;
                    if (mopub >= 0) {
                        long j = jArr[mopub];
                        jArr[i4 - 1] = C8954e.smaato((int) (j >>> 32));
                        i4 -= 2;
                        jArr[i4] = C8954e.smaato((int) j);
                    }
                }
                mopub = C8954e.admob(jArr, i3, i2, iArr);
            }
            c8954e = new C8954e(jArr, mopub);
        }
        return new C16247e(i2, iArr, c8954e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int i;
        C8954e c8954e;
        long[] jArr;
        int i2;
        C8954e c8954e2 = ((C16247e) abstractC7861e).f31922e;
        C8954e c8954e3 = this.f31922e;
        int purchase = c8954e3.purchase();
        int i3 = this.f31923e;
        int[] iArr = this.f31921e;
        if (purchase == 0) {
            c8954e = c8954e3;
        } else {
            int purchase2 = c8954e2.purchase();
            if (purchase2 != 0) {
                if (purchase > purchase2) {
                    c8954e3 = c8954e2;
                    c8954e2 = c8954e3;
                    purchase2 = purchase;
                    purchase = purchase2;
                }
                int i4 = (purchase + 63) >>> 6;
                int i5 = (purchase2 + 63) >>> 6;
                int i6 = ((purchase + purchase2) + 62) >>> 6;
                if (i4 != 1) {
                    int i7 = (purchase2 + 70) >>> 6;
                    int[] iArr2 = new int[16];
                    int i8 = i7 << 4;
                    long[] jArr2 = new long[i8];
                    iArr2[1] = i7;
                    System.arraycopy(c8954e2.f17972e, 0, jArr2, i7, i5);
                    int i9 = 2;
                    int i10 = i7;
                    while (i9 < 16) {
                        int i11 = i10 + i7;
                        iArr2[i9] = i11;
                        if ((i9 & 1) == 0) {
                            C8954e.subscription(jArr2, i11 >>> 1, jArr2, i11, i7, 1);
                        } else {
                            int i12 = i11 - i7;
                            for (int i13 = 0; i13 < i7; i13++) {
                                jArr2[i11 + i13] = jArr2[i7 + i13] ^ jArr2[i12 + i13];
                            }
                        }
                        i9++;
                        i10 = i11;
                    }
                    long[] jArr3 = new long[i8];
                    C8954e.subscription(jArr2, 0, jArr3, 0, i8, 4);
                    long[] jArr4 = c8954e3.f17972e;
                    int i14 = i6 << 3;
                    long[] jArr5 = new long[i14];
                    int i15 = 0;
                    while (i15 < i4) {
                        int i16 = i3;
                        int i17 = i15;
                        long j = jArr4[i15];
                        while (true) {
                            jArr = jArr4;
                            i2 = i14;
                            int i18 = iArr2[((int) j) & 15];
                            int i19 = iArr2[((int) (j >>> 4)) & 15];
                            for (int i20 = 0; i20 < i7; i20++) {
                                int i21 = i17 + i20;
                                jArr5[i21] = jArr5[i21] ^ (jArr2[i18 + i20] ^ jArr3[i19 + i20]);
                            }
                            j >>>= 8;
                            if (j == 0) {
                                break;
                            }
                            i17 += i6;
                            jArr4 = jArr;
                            i14 = i2;
                        }
                        i15++;
                        i3 = i16;
                        jArr4 = jArr;
                        i14 = i2;
                    }
                    int i22 = i3;
                    while (true) {
                        int i23 = i14 - i6;
                        if (i23 == 0) {
                            break;
                        }
                        C8954e.license(jArr5, i23 - i6, jArr5, i23, i6, 8);
                        i14 = i23;
                    }
                    i = i22;
                    c8954e = new C8954e(jArr5, C8954e.admob(jArr5, i6, i, iArr));
                    return new C16247e(i, iArr, c8954e);
                }
                long j2 = c8954e3.f17972e[0];
                if (j2 != 1) {
                    long[] jArr6 = new long[i6];
                    C8954e.Signature(j2, c8954e2.f17972e, i5, jArr6);
                    c8954e = new C8954e(jArr6, C8954e.admob(jArr6, i6, i3, iArr));
                }
            }
            c8954e = c8954e2;
        }
        i = i3;
        return new C16247e(i, iArr, c8954e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        C8954e c8954e = ((C16247e) abstractC7861e).f31922e;
        C8954e c8954e2 = ((C16247e) abstractC7861e2).f31922e;
        C8954e c8954e3 = ((C16247e) abstractC7861e3).f31922e;
        C8954e c8954e4 = this.f31922e;
        C8954e loadAd = c8954e4.loadAd(c8954e);
        C8954e loadAd2 = c8954e2.loadAd(c8954e3);
        if (loadAd == c8954e4 || loadAd == c8954e) {
            loadAd = (C8954e) loadAd.clone();
        }
        loadAd.metrica(loadAd2);
        long[] jArr = loadAd.f17972e;
        int length = jArr.length;
        int i = this.f31923e;
        int[] iArr = this.f31921e;
        int admob = C8954e.admob(jArr, length, i, iArr);
        if (admob < jArr.length) {
            long[] jArr2 = new long[admob];
            loadAd.f17972e = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, admob);
        }
        return new C16247e(i, iArr, loadAd);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        for (long j : this.f31922e.f17972e) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        C8954e c8954e;
        C8954e c8954e2 = this.f31922e;
        if (c8954e2.f17972e.length == 0) {
            c8954e = new C8954e(new long[]{1});
        } else {
            int max = Math.max(1, c8954e2.mopub());
            long[] jArr = new long[max];
            long[] jArr2 = c8954e2.f17972e;
            System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, max));
            jArr[0] = jArr[0] ^ 1;
            c8954e = new C8954e(jArr);
        }
        return new C16247e(this.f31923e, this.f31921e, c8954e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
