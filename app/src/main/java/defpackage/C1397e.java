package defpackage;

import androidx.car.app.model.Alert;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۢؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1397e extends AbstractC15825e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f4186e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ByteArrayInputStream f4187e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f4188e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f4189e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f4190e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f4191e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f4192e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f4193e;

    public C1397e(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = AbstractC10546e.ad;
        this.f4187e = byteArrayInputStream;
        this.f4190e = new byte[4096];
        this.f4186e = 0;
        this.f4192e = 0;
        this.f4191e = 0;
    }

    @Override // defpackage.AbstractC15825e
    public final void Signature(int i) {
        this.f4188e = i;
        m585final();
    }

    /* renamed from: abstract, reason: not valid java name */
    public final int m579abstract() {
        int i = this.f4192e;
        if (this.f4186e - i < 4) {
            m593super(4);
            i = this.f4192e;
        }
        this.f4192e = i + 4;
        byte[] bArr = this.f4190e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.AbstractC15825e
    public final int ads() {
        return m587implements();
    }

    @Override // defpackage.AbstractC15825e
    public final float applovin() {
        return Float.intBitsToFloat(m579abstract());
    }

    /* renamed from: break, reason: not valid java name */
    public final ArrayList m580break(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f4187e.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw C8868e.billing();
                }
                this.f4191e += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: case, reason: not valid java name */
    public final long m581case() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f4192e;
        int i2 = this.f4186e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f4190e;
            byte b = bArr[i];
            if (b >= 0) {
                this.f4192e = i3;
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
                this.f4192e = i4;
                return j;
            }
        }
        return m582catch();
    }

    /* renamed from: catch, reason: not valid java name */
    public final long m582catch() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f4192e == this.f4186e) {
                m593super(1);
            }
            int i2 = this.f4192e;
            this.f4192e = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f4190e[i2] & 128) == 0) {
                return j;
            }
        }
        throw C8868e.license();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: class, reason: not valid java name */
    public final long mo583class() {
        return AbstractC15825e.billing(m581case());
    }

    @Override // defpackage.AbstractC15825e
    public final long crashlytics() {
        return m584default();
    }

    /* renamed from: default, reason: not valid java name */
    public final long m584default() {
        int i = this.f4192e;
        if (this.f4186e - i < 8) {
            m593super(8);
            i = this.f4192e;
        }
        this.f4192e = i + 8;
        byte[] bArr = this.f4190e;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: final, reason: not valid java name */
    public final void m585final() {
        int i = this.f4186e + this.f4193e;
        this.f4186e = i;
        int i2 = this.f4191e + i;
        int i3 = this.f4188e;
        if (i2 <= i3) {
            this.f4193e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f4193e = i4;
        this.f4186e = i - i4;
    }

    @Override // defpackage.AbstractC15825e
    public final int firebase() {
        return AbstractC15825e.appmetrica(m587implements());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: goto, reason: not valid java name */
    public final String mo586goto() {
        int m587implements = m587implements();
        int i = this.f4192e;
        int i2 = this.f4186e;
        int i3 = i2 - i;
        byte[] bArr = this.f4190e;
        if (m587implements <= i3 && m587implements > 0) {
            this.f4192e = i + m587implements;
        } else {
            if (m587implements == 0) {
                return BuildConfig.FLAVOR;
            }
            if (m587implements < 0) {
                throw C8868e.appmetrica();
            }
            i = 0;
            if (m587implements <= i2) {
                m593super(m587implements);
                this.f4192e = m587implements;
            } else {
                bArr = m596try(m587implements);
            }
        }
        return AbstractC18226e.ad.billing(i, m587implements, bArr);
    }

    /* renamed from: implements, reason: not valid java name */
    public final int m587implements() {
        int i;
        int i2 = this.f4192e;
        int i3 = this.f4186e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f4190e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f4192e = i4;
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
                this.f4192e = i5;
                return i;
            }
        }
        return (int) m582catch();
    }

    @Override // defpackage.AbstractC15825e
    public final int inmobi() {
        return m579abstract();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: interface, reason: not valid java name */
    public final String mo588interface() {
        int m587implements = m587implements();
        byte[] bArr = this.f4190e;
        if (m587implements > 0) {
            int i = this.f4186e;
            int i2 = this.f4192e;
            if (m587implements <= i - i2) {
                String str = new String(bArr, i2, m587implements, AbstractC10546e.ad);
                this.f4192e += m587implements;
                return str;
            }
        }
        if (m587implements == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m587implements < 0) {
            throw C8868e.appmetrica();
        }
        if (m587implements > this.f4186e) {
            return new String(m596try(m587implements), AbstractC10546e.ad);
        }
        m593super(m587implements);
        String str2 = new String(bArr, this.f4192e, m587implements, AbstractC10546e.ad);
        this.f4192e += m587implements;
        return str2;
    }

    @Override // defpackage.AbstractC15825e
    public final long isPro() {
        return m584default();
    }

    @Override // defpackage.AbstractC15825e
    public final int isVip() {
        return m587implements();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: native, reason: not valid java name */
    public final int mo589native() {
        return m587implements();
    }

    /* renamed from: new, reason: not valid java name */
    public final void m590new(int i) {
        int i2 = this.f4186e;
        int i3 = this.f4192e;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f4192e = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f4187e;
        if (i < 0) {
            throw C8868e.appmetrica();
        }
        int i5 = this.f4191e;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f4188e;
        if (i7 > i8) {
            m590new((i8 - i5) - i3);
            throw C8868e.billing();
        }
        this.f4191e = i6;
        this.f4186e = 0;
        this.f4192e = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = byteArrayInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (C8868e e) {
                    e.f17826e = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f4191e += i4;
                m585final();
                throw th;
            }
        }
        this.f4191e += i4;
        m585final();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f4186e;
        int i10 = i9 - this.f4192e;
        this.f4192e = i9;
        m593super(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f4186e;
            if (i11 <= i12) {
                this.f4192e = i11;
                return;
            } else {
                i10 += i12;
                this.f4192e = i12;
                m593super(1);
            }
        }
    }

    @Override // defpackage.AbstractC15825e
    public final long premium() {
        return m581case();
    }

    /* renamed from: protected, reason: not valid java name */
    public final byte[] m591protected(int i) {
        if (i == 0) {
            return AbstractC10546e.vip;
        }
        if (i < 0) {
            throw C8868e.appmetrica();
        }
        int i2 = this.f4191e;
        int i3 = this.f4192e;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.f4188e;
        if (i4 > i5) {
            m590new((i5 - i2) - i3);
            throw C8868e.billing();
        }
        int i6 = this.f4186e - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.f4187e;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (C8868e e) {
                e.f17826e = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4190e, this.f4192e, bArr, 0, i6);
        this.f4191e += this.f4186e;
        this.f4192e = 0;
        this.f4186e = 0;
        while (i6 < i) {
            try {
                int read = byteArrayInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw C8868e.billing();
                }
                this.f4191e += read;
                i6 += read;
            } catch (C8868e e2) {
                e2.f17826e = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.AbstractC15825e
    public final boolean remoteconfig() {
        return m581case() != 0;
    }

    @Override // defpackage.AbstractC15825e
    public final C2096e signatures() {
        int m587implements = m587implements();
        int i = this.f4186e;
        int i2 = this.f4192e;
        int i3 = i - i2;
        byte[] bArr = this.f4190e;
        if (m587implements <= i3 && m587implements > 0) {
            C2096e yandex = AbstractC10498e.yandex(i2, m587implements, bArr);
            this.f4192e += m587implements;
            return yandex;
        }
        if (m587implements == 0) {
            return AbstractC10498e.f20717e;
        }
        if (m587implements < 0) {
            throw C8868e.appmetrica();
        }
        byte[] m591protected = m591protected(m587implements);
        if (m591protected != null) {
            return AbstractC10498e.yandex(0, m591protected.length, m591protected);
        }
        int i4 = this.f4192e;
        int i5 = this.f4186e;
        int i6 = i5 - i4;
        this.f4191e += i5;
        this.f4192e = 0;
        this.f4186e = 0;
        ArrayList m580break = m580break(m587implements - i6);
        byte[] bArr2 = new byte[m587implements];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = m580break.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        C2096e c2096e = AbstractC10498e.f20717e;
        return new C2096e(bArr2);
    }

    @Override // defpackage.AbstractC15825e
    public final boolean startapp() {
        return this.f4192e == this.f4186e && !m592strictfp(1);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final boolean m592strictfp(int i) {
        ByteArrayInputStream byteArrayInputStream = this.f4187e;
        int i2 = this.f4192e;
        int i3 = i2 + i;
        int i4 = this.f4186e;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC1634e.smaato("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i5 = this.f4191e;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.f4188e) {
            byte[] bArr = this.f4190e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f4191e += i2;
                this.f4186e -= i2;
                this.f4192e = 0;
            }
            int i6 = this.f4186e;
            try {
                int read = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.f4191e) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f4186e += read;
                    m585final();
                    if (this.f4186e >= i || m592strictfp(i)) {
                        return true;
                    }
                }
            } catch (C8868e e) {
                e.f17826e = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC15825e
    public final int subs() {
        return m579abstract();
    }

    @Override // defpackage.AbstractC15825e
    public final int subscription(int i) {
        if (i < 0) {
            throw C8868e.appmetrica();
        }
        int i2 = this.f4191e + this.f4192e + i;
        if (i2 < 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.f4188e;
        if (i2 > i3) {
            throw C8868e.billing();
        }
        this.f4188e = i2;
        m585final();
        return i3;
    }

    /* renamed from: super, reason: not valid java name */
    public final void m593super(int i) {
        if (m592strictfp(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.f4191e) - this.f4192e) {
            throw C8868e.billing();
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    @Override // defpackage.AbstractC15825e
    public final double tapsense() {
        return Double.longBitsToDouble(m584default());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: this, reason: not valid java name */
    public final int mo594this() {
        if (startapp()) {
            this.f4189e = 0;
            return 0;
        }
        int m587implements = m587implements();
        this.f4189e = m587implements;
        if ((m587implements >>> 3) != 0) {
            return m587implements;
        }
        throw C8868e.ad();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: throw, reason: not valid java name */
    public final long mo595throw() {
        return m581case();
    }

    /* renamed from: try, reason: not valid java name */
    public final byte[] m596try(int i) {
        byte[] m591protected = m591protected(i);
        if (m591protected != null) {
            return m591protected;
        }
        int i2 = this.f4192e;
        int i3 = this.f4186e;
        int i4 = i3 - i2;
        this.f4191e += i3;
        this.f4192e = 0;
        this.f4186e = 0;
        ArrayList m580break = m580break(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4190e, i2, bArr, 0, i4);
        Iterator it = m580break.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.AbstractC15825e
    public final void vip(int i) {
        if (this.f4189e != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15825e
    public final int yandex() {
        return this.f4191e + this.f4192e;
    }
}
