package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13296e extends AbstractC15825e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f26368e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InputStream f26369e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f26370e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f26371e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f26372e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f26373e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f26374e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26375e;

    public C13296e(InputStream inputStream) {
        AbstractC0352e.ad(inputStream, "input");
        this.f26369e = inputStream;
        this.f26372e = new byte[4096];
        this.f26368e = 0;
        this.f26374e = 0;
        this.f26373e = 0;
    }

    @Override // defpackage.AbstractC15825e
    public final void Signature(int i) {
        this.f26370e = i;
        m3548final();
    }

    /* renamed from: abstract, reason: not valid java name */
    public final int m3543abstract() {
        int i = this.f26374e;
        if (this.f26368e - i < 4) {
            m3553super(4);
            i = this.f26374e;
        }
        this.f26374e = i + 4;
        byte[] bArr = this.f26372e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.AbstractC15825e
    public final int ads() {
        return m3549implements();
    }

    @Override // defpackage.AbstractC15825e
    public final float applovin() {
        return Float.intBitsToFloat(m3543abstract());
    }

    /* renamed from: break, reason: not valid java name */
    public final ArrayList m3544break(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f26369e.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw C11872e.billing();
                }
                this.f26373e += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: case, reason: not valid java name */
    public final long m3545case() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f26374e;
        int i2 = this.f26368e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f26372e;
            byte b = bArr[i];
            if (b >= 0) {
                this.f26374e = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f26374e = i4;
                return j;
            }
        }
        return m3546catch();
    }

    /* renamed from: catch, reason: not valid java name */
    public final long m3546catch() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f26374e == this.f26368e) {
                m3553super(1);
            }
            int i2 = this.f26374e;
            this.f26374e = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f26372e[i2] & 128) == 0) {
                return j;
            }
        }
        throw C11872e.license();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: class */
    public final long mo583class() {
        return AbstractC15825e.purchase(m3545case());
    }

    @Override // defpackage.AbstractC15825e
    public final long crashlytics() {
        return m3547default();
    }

    /* renamed from: default, reason: not valid java name */
    public final long m3547default() {
        int i = this.f26374e;
        if (this.f26368e - i < 8) {
            m3553super(8);
            i = this.f26374e;
        }
        this.f26374e = i + 8;
        byte[] bArr = this.f26372e;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: final, reason: not valid java name */
    public final void m3548final() {
        int i = this.f26368e + this.f26375e;
        this.f26368e = i;
        int i2 = this.f26373e + i;
        int i3 = this.f26370e;
        if (i2 <= i3) {
            this.f26375e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f26375e = i4;
        this.f26368e = i - i4;
    }

    @Override // defpackage.AbstractC15825e
    public final int firebase() {
        return AbstractC15825e.license(m3549implements());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: goto */
    public final String mo586goto() {
        int m3549implements = m3549implements();
        int i = this.f26374e;
        int i2 = this.f26368e;
        int i3 = i2 - i;
        byte[] bArr = this.f26372e;
        if (m3549implements <= i3 && m3549implements > 0) {
            this.f26374e = i + m3549implements;
        } else {
            if (m3549implements == 0) {
                return BuildConfig.FLAVOR;
            }
            if (m3549implements < 0) {
                throw C11872e.appmetrica();
            }
            i = 0;
            if (m3549implements <= i2) {
                m3553super(m3549implements);
                this.f26374e = m3549implements;
            } else {
                bArr = m3554try(m3549implements);
            }
        }
        return AbstractC15375e.ad.metrica(i, m3549implements, bArr);
    }

    /* renamed from: implements, reason: not valid java name */
    public final int m3549implements() {
        int i;
        int i2 = this.f26374e;
        int i3 = this.f26368e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f26372e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f26374e = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f26374e = i5;
                return i;
            }
        }
        return (int) m3546catch();
    }

    @Override // defpackage.AbstractC15825e
    public final int inmobi() {
        return m3543abstract();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: interface */
    public final String mo588interface() {
        int m3549implements = m3549implements();
        byte[] bArr = this.f26372e;
        if (m3549implements > 0) {
            int i = this.f26368e;
            int i2 = this.f26374e;
            if (m3549implements <= i - i2) {
                String str = new String(bArr, i2, m3549implements, AbstractC0352e.ad);
                this.f26374e += m3549implements;
                return str;
            }
        }
        if (m3549implements == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m3549implements < 0) {
            throw C11872e.appmetrica();
        }
        if (m3549implements > this.f26368e) {
            return new String(m3554try(m3549implements), AbstractC0352e.ad);
        }
        m3553super(m3549implements);
        String str2 = new String(bArr, this.f26374e, m3549implements, AbstractC0352e.ad);
        this.f26374e += m3549implements;
        return str2;
    }

    @Override // defpackage.AbstractC15825e
    public final long isPro() {
        return m3547default();
    }

    @Override // defpackage.AbstractC15825e
    public final int isVip() {
        return m3549implements();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: native */
    public final int mo589native() {
        return m3549implements();
    }

    /* renamed from: new, reason: not valid java name */
    public final void m3550new(int i) {
        int i2 = this.f26368e;
        int i3 = this.f26374e;
        if (i <= i2 - i3 && i >= 0) {
            this.f26374e = i3 + i;
            return;
        }
        InputStream inputStream = this.f26369e;
        if (i < 0) {
            throw C11872e.appmetrica();
        }
        int i4 = this.f26373e;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f26370e;
        if (i6 > i7) {
            m3550new((i7 - i4) - i3);
            throw C11872e.billing();
        }
        this.f26373e = i5;
        int i8 = i2 - i3;
        this.f26368e = 0;
        this.f26374e = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } catch (C11872e e) {
                    e.f23795e = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f26373e += i8;
                m3548final();
                throw th;
            }
        }
        this.f26373e += i8;
        m3548final();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f26368e;
        int i10 = i9 - this.f26374e;
        this.f26374e = i9;
        m3553super(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f26368e;
            if (i11 <= i12) {
                this.f26374e = i11;
                return;
            } else {
                i10 += i12;
                this.f26374e = i12;
                m3553super(1);
            }
        }
    }

    @Override // defpackage.AbstractC15825e
    public final long premium() {
        return m3545case();
    }

    @Override // defpackage.AbstractC15825e
    public final C11507e pro() {
        int m3549implements = m3549implements();
        int i = this.f26368e;
        int i2 = this.f26374e;
        int i3 = i - i2;
        byte[] bArr = this.f26372e;
        if (m3549implements <= i3 && m3549implements > 0) {
            C11507e yandex = AbstractC4002e.yandex(i2, m3549implements, bArr);
            this.f26374e += m3549implements;
            return yandex;
        }
        if (m3549implements == 0) {
            return AbstractC4002e.f8908e;
        }
        if (m3549implements < 0) {
            throw C11872e.appmetrica();
        }
        byte[] m3551protected = m3551protected(m3549implements);
        if (m3551protected != null) {
            return AbstractC4002e.yandex(0, m3551protected.length, m3551protected);
        }
        int i4 = this.f26374e;
        int i5 = this.f26368e;
        int i6 = i5 - i4;
        this.f26373e += i5;
        this.f26374e = 0;
        this.f26368e = 0;
        ArrayList m3544break = m3544break(m3549implements - i6);
        byte[] bArr2 = new byte[m3549implements];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = m3544break.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        C11507e c11507e = AbstractC4002e.f8908e;
        return new C11507e(bArr2);
    }

    /* renamed from: protected, reason: not valid java name */
    public final byte[] m3551protected(int i) {
        if (i == 0) {
            return AbstractC0352e.vip;
        }
        if (i < 0) {
            throw C11872e.appmetrica();
        }
        int i2 = this.f26373e;
        int i3 = this.f26374e;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f26370e;
        if (i4 > i5) {
            m3550new((i5 - i2) - i3);
            throw C11872e.billing();
        }
        int i6 = this.f26368e - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f26369e;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C11872e e) {
                e.f23795e = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f26372e, this.f26374e, bArr, 0, i6);
        this.f26373e += this.f26368e;
        this.f26374e = 0;
        this.f26368e = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw C11872e.billing();
                }
                this.f26373e += read;
                i6 += read;
            } catch (C11872e e2) {
                e2.f23795e = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.AbstractC15825e
    public final boolean remoteconfig() {
        return m3545case() != 0;
    }

    @Override // defpackage.AbstractC15825e
    public final boolean startapp() {
        return this.f26374e == this.f26368e && !m3552strictfp(1);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final boolean m3552strictfp(int i) {
        InputStream inputStream = this.f26369e;
        int i2 = this.f26374e;
        int i3 = i2 + i;
        int i4 = this.f26368e;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC1634e.smaato("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i5 = this.f26373e;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.f26370e) {
            byte[] bArr = this.f26372e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f26373e += i2;
                this.f26368e -= i2;
                this.f26374e = 0;
            }
            int i6 = this.f26368e;
            try {
                int read = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.f26373e) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f26368e += read;
                    m3548final();
                    if (this.f26368e >= i) {
                        return true;
                    }
                    return m3552strictfp(i);
                }
            } catch (C11872e e) {
                e.f23795e = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC15825e
    public final int subs() {
        return m3543abstract();
    }

    @Override // defpackage.AbstractC15825e
    public final int subscription(int i) {
        if (i < 0) {
            throw C11872e.appmetrica();
        }
        int i2 = this.f26373e + this.f26374e + i;
        if (i2 < 0) {
            throw C11872e.purchase();
        }
        int i3 = this.f26370e;
        if (i2 > i3) {
            throw C11872e.billing();
        }
        this.f26370e = i2;
        m3548final();
        return i3;
    }

    /* renamed from: super, reason: not valid java name */
    public final void m3553super(int i) {
        if (m3552strictfp(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.f26373e) - this.f26374e) {
            throw C11872e.billing();
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // defpackage.AbstractC15825e
    public final double tapsense() {
        return Double.longBitsToDouble(m3547default());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: this */
    public final int mo594this() {
        if (startapp()) {
            this.f26371e = 0;
            return 0;
        }
        int m3549implements = m3549implements();
        this.f26371e = m3549implements;
        if ((m3549implements >>> 3) != 0) {
            return m3549implements;
        }
        throw C11872e.ad();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: throw */
    public final long mo595throw() {
        return m3545case();
    }

    /* renamed from: try, reason: not valid java name */
    public final byte[] m3554try(int i) {
        byte[] m3551protected = m3551protected(i);
        if (m3551protected != null) {
            return m3551protected;
        }
        int i2 = this.f26374e;
        int i3 = this.f26368e;
        int i4 = i3 - i2;
        this.f26373e += i3;
        this.f26374e = 0;
        this.f26368e = 0;
        ArrayList m3544break = m3544break(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f26372e, i2, bArr, 0, i4);
        Iterator it = m3544break.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.AbstractC15825e
    public final void vip(int i) {
        if (this.f26371e != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15825e
    public final int yandex() {
        return this.f26373e + this.f26374e;
    }
}
