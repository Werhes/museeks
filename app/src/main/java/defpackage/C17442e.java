package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17442e extends AbstractC3513e {
    public int adcel;
    public final byte[] appmetrica;
    public int billing;
    public final InputStream license;
    public int mopub = Alert.DURATION_SHOW_INDEFINITELY;
    public int purchase;
    public int startapp;
    public int yandex;

    public C17442e(InputStream inputStream) {
        AbstractC2930e.ad(inputStream, "input");
        this.license = inputStream;
        this.appmetrica = new byte[4096];
        this.purchase = 0;
        this.yandex = 0;
        this.adcel = 0;
    }

    @Override // defpackage.AbstractC3513e
    public final long Signature() {
        return m4329const();
    }

    @Override // defpackage.AbstractC3513e
    public final void ad(int i) {
        if (this.startapp != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC3513e
    public final int adcel() {
        return m4335finally();
    }

    @Override // defpackage.AbstractC3513e
    public final int admob() {
        int m4340volatile = m4340volatile();
        return (-(m4340volatile & 1)) ^ (m4340volatile >>> 1);
    }

    @Override // defpackage.AbstractC3513e
    public final float advert() {
        return Float.intBitsToFloat(m4335finally());
    }

    @Override // defpackage.AbstractC3513e
    public final long amazon() {
        return m4336for();
    }

    @Override // defpackage.AbstractC3513e
    public final int appmetrica(int i) {
        if (i < 0) {
            throw C11690e.license();
        }
        int i2 = this.adcel + this.yandex + i;
        if (i2 < 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.mopub;
        if (i2 > i3) {
            throw C11690e.appmetrica();
        }
        this.mopub = i2;
        m4337public();
        return i3;
    }

    @Override // defpackage.AbstractC3513e
    public final C6283e billing() {
        int m4340volatile = m4340volatile();
        int i = this.purchase;
        int i2 = this.yandex;
        int i3 = i - i2;
        byte[] bArr = this.appmetrica;
        if (m4340volatile <= i3 && m4340volatile > 0) {
            C6283e yandex = C6283e.yandex(i2, m4340volatile, bArr);
            this.yandex += m4340volatile;
            return yandex;
        }
        if (m4340volatile == 0) {
            return C6283e.f13092e;
        }
        if (m4340volatile < 0) {
            throw C11690e.license();
        }
        byte[] m4338switch = m4338switch(m4340volatile);
        if (m4338switch != null) {
            return C6283e.yandex(0, m4338switch.length, m4338switch);
        }
        int i4 = this.yandex;
        int i5 = this.purchase;
        int i6 = i5 - i4;
        this.adcel += i5;
        this.yandex = 0;
        this.purchase = 0;
        ArrayList m4339throws = m4339throws(m4340volatile - i6);
        byte[] bArr2 = new byte[m4340volatile];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = m4339throws.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        C6283e c6283e = C6283e.f13092e;
        return new C6283e(bArr2);
    }

    /* renamed from: const, reason: not valid java name */
    public final long m4329const() {
        int i = this.yandex;
        if (this.purchase - i < 8) {
            m4334e(8);
            i = this.yandex;
        }
        this.yandex = i + 8;
        byte[] bArr = this.appmetrica;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: continue, reason: not valid java name */
    public final long m4330continue() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.yandex == this.purchase) {
                m4334e(1);
            }
            int i2 = this.yandex;
            this.yandex = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.appmetrica[i2] & 128) == 0) {
                return j;
            }
        }
        throw C11690e.metrica();
    }

    /* renamed from: else, reason: not valid java name */
    public final byte[] m4331else(int i) {
        byte[] m4338switch = m4338switch(i);
        if (m4338switch != null) {
            return m4338switch;
        }
        int i2 = this.yandex;
        int i3 = this.purchase;
        int i4 = i3 - i2;
        this.adcel += i3;
        this.yandex = 0;
        this.purchase = 0;
        ArrayList m4339throws = m4339throws(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.appmetrica, i2, bArr, 0, i4);
        Iterator it = m4339throws.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final void m4332e(int i) {
        int i2 = this.purchase;
        int i3 = this.yandex;
        if (i <= i2 - i3 && i >= 0) {
            this.yandex = i3 + i;
            return;
        }
        InputStream inputStream = this.license;
        if (i < 0) {
            throw C11690e.license();
        }
        int i4 = this.adcel;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.mopub;
        if (i6 > i7) {
            m4332e((i7 - i4) - i3);
            throw C11690e.appmetrica();
        }
        this.adcel = i5;
        int i8 = i2 - i3;
        this.purchase = 0;
        this.yandex = 0;
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
                } catch (C11690e e) {
                    e.f23521e = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.adcel += i8;
                m4337public();
                throw th;
            }
        }
        this.adcel += i8;
        m4337public();
        if (i8 >= i) {
            return;
        }
        int i9 = this.purchase;
        int i10 = i9 - this.yandex;
        this.yandex = i9;
        m4334e(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.purchase;
            if (i11 <= i12) {
                this.yandex = i11;
                return;
            } else {
                i10 += i12;
                this.yandex = i12;
                m4334e(1);
            }
        }
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final boolean m4333e(int i) {
        InputStream inputStream = this.license;
        int i2 = this.yandex;
        int i3 = i2 + i;
        int i4 = this.purchase;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC1634e.smaato("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i5 = this.adcel;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.mopub) {
            byte[] bArr = this.appmetrica;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.adcel += i2;
                this.purchase -= i2;
                this.yandex = 0;
            }
            int i6 = this.purchase;
            try {
                int read = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.adcel) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.purchase += read;
                    m4337public();
                    if (this.purchase >= i || m4333e(i)) {
                        return true;
                    }
                }
            } catch (C11690e e) {
                e.f23521e = true;
                throw e;
            }
        }
        return false;
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final void m4334e(int i) {
        if (m4333e(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.adcel) - this.yandex) {
            throw C11690e.appmetrica();
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    /* renamed from: finally, reason: not valid java name */
    public final int m4335finally() {
        int i = this.yandex;
        if (this.purchase - i < 4) {
            m4334e(4);
            i = this.yandex;
        }
        this.yandex = i + 4;
        byte[] bArr = this.appmetrica;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: for, reason: not valid java name */
    public final long m4336for() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.yandex;
        int i2 = this.purchase;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.appmetrica;
            byte b = bArr[i];
            if (b >= 0) {
                this.yandex = i3;
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
                this.yandex = i4;
                return j;
            }
        }
        return m4330continue();
    }

    @Override // defpackage.AbstractC3513e
    public final boolean inmobi(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m4332e(8);
                return true;
            }
            if (i2 == 2) {
                m4332e(m4340volatile());
                return true;
            }
            if (i2 == 3) {
                isPro();
                ad(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.vip == 0) {
                    ad(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw C11690e.vip();
            }
            m4332e(4);
            return true;
        }
        int i4 = this.purchase - this.yandex;
        byte[] bArr = this.appmetrica;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.yandex;
                this.yandex = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw C11690e.metrica();
        }
        while (i3 < 10) {
            if (this.yandex == this.purchase) {
                m4334e(1);
            }
            int i6 = this.yandex;
            this.yandex = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw C11690e.metrica();
        return true;
    }

    @Override // defpackage.AbstractC3513e
    public final long isVip() {
        return m4336for();
    }

    @Override // defpackage.AbstractC3513e
    public final void license(int i) {
        this.mopub = i;
        m4337public();
    }

    @Override // defpackage.AbstractC3513e
    public final int loadAd() {
        return m4335finally();
    }

    @Override // defpackage.AbstractC3513e
    public final boolean metrica() {
        return this.yandex == this.purchase && !m4333e(1);
    }

    @Override // defpackage.AbstractC3513e
    public final long mopub() {
        return m4329const();
    }

    @Override // defpackage.AbstractC3513e
    public final String pro() {
        int m4340volatile = m4340volatile();
        int i = this.yandex;
        int i2 = this.purchase;
        int i3 = i2 - i;
        byte[] bArr = this.appmetrica;
        if (m4340volatile <= i3 && m4340volatile > 0) {
            this.yandex = i + m4340volatile;
        } else {
            if (m4340volatile == 0) {
                return BuildConfig.FLAVOR;
            }
            if (m4340volatile < 0) {
                throw C11690e.license();
            }
            i = 0;
            if (m4340volatile <= i2) {
                m4334e(m4340volatile);
                this.yandex = m4340volatile;
            } else {
                bArr = m4331else(m4340volatile);
            }
        }
        return AbstractC7097e.ad.vip(i, m4340volatile, bArr);
    }

    /* renamed from: public, reason: not valid java name */
    public final void m4337public() {
        int i = this.purchase + this.billing;
        this.purchase = i;
        int i2 = this.adcel + i;
        int i3 = this.mopub;
        if (i2 <= i3) {
            this.billing = 0;
            return;
        }
        int i4 = i2 - i3;
        this.billing = i4;
        this.purchase = i - i4;
    }

    @Override // defpackage.AbstractC3513e
    public final boolean purchase() {
        return m4336for() != 0;
    }

    @Override // defpackage.AbstractC3513e
    public final String remoteconfig() {
        int m4340volatile = m4340volatile();
        byte[] bArr = this.appmetrica;
        if (m4340volatile > 0) {
            int i = this.purchase;
            int i2 = this.yandex;
            if (m4340volatile <= i - i2) {
                String str = new String(bArr, i2, m4340volatile, AbstractC2930e.ad);
                this.yandex += m4340volatile;
                return str;
            }
        }
        if (m4340volatile == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m4340volatile < 0) {
            throw C11690e.license();
        }
        if (m4340volatile > this.purchase) {
            return new String(m4331else(m4340volatile), AbstractC2930e.ad);
        }
        m4334e(m4340volatile);
        String str2 = new String(bArr, this.yandex, m4340volatile, AbstractC2930e.ad);
        this.yandex += m4340volatile;
        return str2;
    }

    @Override // defpackage.AbstractC3513e
    public final int signatures() {
        if (metrica()) {
            this.startapp = 0;
            return 0;
        }
        int m4340volatile = m4340volatile();
        this.startapp = m4340volatile;
        if ((m4340volatile >>> 3) != 0) {
            return m4340volatile;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC3513e
    public final int smaato() {
        return m4340volatile();
    }

    @Override // defpackage.AbstractC3513e
    public final int startapp() {
        return m4340volatile();
    }

    @Override // defpackage.AbstractC3513e
    public final long subscription() {
        long m4336for = m4336for();
        return (-(m4336for & 1)) ^ (m4336for >>> 1);
    }

    /* renamed from: switch, reason: not valid java name */
    public final byte[] m4338switch(int i) {
        if (i == 0) {
            return AbstractC2930e.vip;
        }
        if (i < 0) {
            throw C11690e.license();
        }
        int i2 = this.adcel;
        int i3 = this.yandex;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.mopub;
        if (i4 > i5) {
            m4332e((i5 - i2) - i3);
            throw C11690e.appmetrica();
        }
        int i6 = this.purchase - i3;
        int i7 = i - i6;
        InputStream inputStream = this.license;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C11690e e) {
                e.f23521e = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.appmetrica, this.yandex, bArr, 0, i6);
        this.adcel += this.purchase;
        this.yandex = 0;
        this.purchase = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw C11690e.appmetrica();
                }
                this.adcel += read;
                i6 += read;
            } catch (C11690e e2) {
                e2.f23521e = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.AbstractC3513e
    public final int tapsense() {
        return m4340volatile();
    }

    /* renamed from: throws, reason: not valid java name */
    public final ArrayList m4339throws(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.license.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw C11690e.appmetrica();
                }
                this.adcel += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC3513e
    public final int vip() {
        return this.adcel + this.yandex;
    }

    /* renamed from: volatile, reason: not valid java name */
    public final int m4340volatile() {
        int i;
        int i2 = this.yandex;
        int i3 = this.purchase;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.appmetrica;
            byte b = bArr[i2];
            if (b >= 0) {
                this.yandex = i4;
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
                this.yandex = i5;
                return i;
            }
        }
        return (int) m4330continue();
    }

    @Override // defpackage.AbstractC3513e
    public final double yandex() {
        return Double.longBitsToDouble(m4329const());
    }
}
