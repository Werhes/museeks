package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1588e extends AbstractC3513e {
    public int adcel;
    public final byte[] appmetrica;
    public int billing;
    public final InputStream license;
    public int mopub = Alert.DURATION_SHOW_INDEFINITELY;
    public int purchase;
    public int startapp;
    public int yandex;

    public /* synthetic */ C1588e(InputStream inputStream, int i) {
        this.license = inputStream;
        this.appmetrica = new byte[i < 8 ? 8 : i];
        this.purchase = 0;
        this.yandex = 0;
        this.adcel = 0;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: abstract, reason: not valid java name */
    public final long mo621abstract() {
        return mo642return();
    }

    @Override // defpackage.AbstractC3513e
    public final void ads(int i) {
        this.mopub = i;
        m629else();
    }

    @Override // defpackage.AbstractC3513e
    public final int applovin(int i) {
        if (i < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.adcel + this.yandex + i;
        if (i2 < 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.mopub;
        if (i2 > i3) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.mopub = i2;
        m629else();
        return i3;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: break, reason: not valid java name */
    public final long mo622break() {
        return mo642return();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: case, reason: not valid java name */
    public final int mo623case() {
        return m627continue();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: catch, reason: not valid java name */
    public final boolean mo624catch() {
        return mo642return() != 0;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: class, reason: not valid java name */
    public final void mo625class(int i) {
        InputStream inputStream = this.license;
        int i2 = this.purchase;
        int i3 = this.yandex;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.yandex = i3 + i;
            return;
        }
        if (i < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.adcel;
        int i6 = i5 + i3;
        int i7 = this.mopub;
        if (i6 + i > i7) {
            mo625class((i7 - i5) - i3);
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.adcel = i6;
        this.purchase = 0;
        this.yandex = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (C10895e e) {
                    e.f21565e = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.adcel += i4;
                m629else();
                throw th;
            }
        }
        this.adcel += i4;
        m629else();
        if (i4 >= i) {
            return;
        }
        int i8 = this.purchase;
        int i9 = i8 - this.yandex;
        this.yandex = i8;
        m646switch(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.purchase;
            if (i10 <= i11) {
                this.yandex = i10;
                return;
            } else {
                i9 += i11;
                this.yandex = i11;
                m646switch(1);
            }
        }
    }

    /* renamed from: const, reason: not valid java name */
    public final byte[] m626const(int i) {
        if (i == 0) {
            return AbstractC17904e.ad;
        }
        int i2 = this.adcel;
        int i3 = this.yandex;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.mopub;
        if (i4 > i5) {
            mo625class((i5 - i2) - i3);
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.purchase - i3;
        int i7 = i - i6;
        InputStream inputStream = this.license;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C10895e e) {
                e.f21565e = true;
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
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.adcel += read;
                i6 += read;
            } catch (C10895e e2) {
                e2.f21565e = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* renamed from: continue, reason: not valid java name */
    public final int m627continue() {
        int i = this.yandex;
        if (this.purchase - i < 4) {
            m646switch(4);
            i = this.yandex;
        }
        this.yandex = i + 4;
        byte[] bArr = this.appmetrica;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.AbstractC3513e
    public final int crashlytics() {
        return this.adcel + this.yandex;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: default, reason: not valid java name */
    public final int mo628default() {
        return mo647synchronized();
    }

    /* renamed from: else, reason: not valid java name */
    public final void m629else() {
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
    /* renamed from: extends, reason: not valid java name */
    public final int mo630extends() {
        if (subs()) {
            this.startapp = 0;
            return 0;
        }
        int mo647synchronized = mo647synchronized();
        this.startapp = mo647synchronized;
        if ((mo647synchronized >>> 3) != 0) {
            return mo647synchronized;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: final, reason: not valid java name */
    public final String mo631final() {
        int mo647synchronized = mo647synchronized();
        byte[] bArr = this.appmetrica;
        if (mo647synchronized > 0) {
            int i = this.purchase;
            int i2 = this.yandex;
            if (mo647synchronized <= i - i2) {
                String str = new String(bArr, i2, mo647synchronized, StandardCharsets.UTF_8);
                this.yandex += mo647synchronized;
                return str;
            }
        }
        if (mo647synchronized == 0) {
            return BuildConfig.FLAVOR;
        }
        if (mo647synchronized < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (mo647synchronized > this.purchase) {
            return new String(m632finally(mo647synchronized), StandardCharsets.UTF_8);
        }
        m646switch(mo647synchronized);
        String str2 = new String(bArr, this.yandex, mo647synchronized, StandardCharsets.UTF_8);
        this.yandex += mo647synchronized;
        return str2;
    }

    /* renamed from: finally, reason: not valid java name */
    public final byte[] m632finally(int i) {
        byte[] m626const = m626const(i);
        if (m626const != null) {
            return m626const;
        }
        int i2 = this.yandex;
        int i3 = this.purchase;
        int i4 = i3 - i2;
        this.adcel += i3;
        this.yandex = 0;
        this.purchase = 0;
        ArrayList m652volatile = m652volatile(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.appmetrica, i2, bArr, 0, i4);
        Iterator it = m652volatile.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.AbstractC3513e
    public final int firebase(int i, int i2, byte[] bArr) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.purchase;
        int i4 = this.yandex;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int min = Math.min(i2, i5);
            System.arraycopy(this.appmetrica, this.yandex, bArr, i, min);
            this.yandex += min;
            return min;
        }
        int min2 = Math.min(i2, (this.mopub - this.adcel) - i4);
        if (min2 <= 0) {
            return -1;
        }
        try {
            int read = this.license.read(bArr, i, min2);
            if (read != -1) {
                this.adcel += read;
            }
            return read;
        } catch (C10895e e) {
            e.f21565e = true;
            throw e;
        }
    }

    /* renamed from: for, reason: not valid java name */
    public final long m633for() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.yandex == this.purchase) {
                m646switch(1);
            }
            int i2 = this.yandex;
            this.yandex = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.appmetrica[i2] & 128) == 0) {
                return j;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: implements, reason: not valid java name */
    public final long mo634implements() {
        return m641public();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: import, reason: not valid java name */
    public final long mo635import() {
        return m641public();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: instanceof, reason: not valid java name */
    public final int mo636instanceof() {
        return AbstractC3513e.m1368this(mo647synchronized());
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: new, reason: not valid java name */
    public final C10553e mo637new() {
        int mo647synchronized = mo647synchronized();
        int i = this.purchase;
        int i2 = this.yandex;
        int i3 = i - i2;
        byte[] bArr = this.appmetrica;
        if (mo647synchronized <= i3 && mo647synchronized > 0) {
            C10553e Signature = AbstractC7244e.Signature(i2, mo647synchronized, bArr);
            this.yandex += mo647synchronized;
            return Signature;
        }
        if (mo647synchronized == 0) {
            return AbstractC7244e.f14800e;
        }
        if (mo647synchronized < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] m626const = m626const(mo647synchronized);
        if (m626const != null) {
            return AbstractC7244e.Signature(0, m626const.length, m626const);
        }
        int i4 = this.yandex;
        int i5 = this.purchase;
        int i6 = i5 - i4;
        this.adcel += i5;
        this.yandex = 0;
        this.purchase = 0;
        ArrayList m652volatile = m652volatile(mo647synchronized - i6);
        byte[] bArr2 = new byte[mo647synchronized];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = m652volatile.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            C10553e c10553e = AbstractC7244e.f14800e;
            return mo647synchronized == 0 ? AbstractC7244e.f14800e : new C10553e(bArr2);
        } catch (C10895e e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: package, reason: not valid java name */
    public final int mo638package() {
        return mo647synchronized();
    }

    @Override // defpackage.AbstractC3513e
    public final int premium() {
        int i = this.mopub;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.adcel + this.yandex);
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: private, reason: not valid java name */
    public final int mo639private() {
        return mo647synchronized();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: protected, reason: not valid java name */
    public final float mo640protected() {
        return Float.intBitsToFloat(m627continue());
    }

    /* renamed from: public, reason: not valid java name */
    public final long m641public() {
        int i = this.yandex;
        if (this.purchase - i < 8) {
            m646switch(8);
            i = this.yandex;
        }
        this.yandex = i + 8;
        byte[] bArr = this.appmetrica;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: return, reason: not valid java name */
    public final long mo642return() {
        long j;
        long j2;
        long j3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = i9 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i6] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i6] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (bArr[i10] << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (bArr[i6] << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.yandex = i4;
                return j;
            }
        }
        return m633for();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: static, reason: not valid java name */
    public final long mo643static() {
        return AbstractC3513e.m1367native(mo642return());
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: strictfp, reason: not valid java name */
    public final byte[] mo644strictfp() {
        int mo647synchronized = mo647synchronized();
        int i = this.purchase;
        int i2 = this.yandex;
        if (mo647synchronized > i - i2 || mo647synchronized <= 0) {
            if (mo647synchronized >= 0) {
                return m632finally(mo647synchronized);
            }
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.appmetrica, i2, i2 + mo647synchronized);
        this.yandex += mo647synchronized;
        return copyOfRange;
    }

    @Override // defpackage.AbstractC3513e
    public final boolean subs() {
        return this.yandex == this.purchase && !m649throws(1);
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: super, reason: not valid java name */
    public final String mo645super() {
        int mo647synchronized = mo647synchronized();
        int i = this.yandex;
        int i2 = this.purchase;
        int i3 = i2 - i;
        byte[] bArr = this.appmetrica;
        if (mo647synchronized <= i3 && mo647synchronized > 0) {
            this.yandex = i + mo647synchronized;
        } else {
            if (mo647synchronized == 0) {
                return BuildConfig.FLAVOR;
            }
            if (mo647synchronized < 0) {
                throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (mo647synchronized <= i2) {
                m646switch(mo647synchronized);
                this.yandex = mo647synchronized;
            } else {
                bArr = m632finally(mo647synchronized);
            }
        }
        return AbstractC2059e.license(i, mo647synchronized, bArr);
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m646switch(int i) {
        if (m649throws(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.adcel) - this.yandex) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: synchronized, reason: not valid java name */
    public final int mo647synchronized() {
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
        return (int) m633for();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: throw, reason: not valid java name */
    public final void mo648throw(int i) {
        if (this.startapp != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: throws, reason: not valid java name */
    public final boolean m649throws(int i) {
        InputStream inputStream = this.license;
        int i2 = this.yandex;
        int i3 = i2 + i;
        int i4 = this.purchase;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.adcel;
        if (i > (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 || i5 + i2 + i > this.mopub) {
            return false;
        }
        byte[] bArr = this.appmetrica;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.adcel + i2;
            this.adcel = i5;
            i4 = this.purchase - i2;
            this.purchase = i4;
            this.yandex = 0;
        }
        try {
            int read = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Alert.DURATION_SHOW_INDEFINITELY - i5) - i4));
            if (read != 0 && read >= -1 && read <= bArr.length) {
                if (read <= 0) {
                    return false;
                }
                this.purchase += read;
                m629else();
                return this.purchase >= i || m649throws(i);
            }
            String valueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
            sb2.append(valueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(read);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (C10895e e) {
            e.f21565e = true;
            throw e;
        }
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: transient, reason: not valid java name */
    public final int mo650transient() {
        return m627continue();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: try, reason: not valid java name */
    public final double mo651try() {
        return Double.longBitsToDouble(m641public());
    }

    /* renamed from: volatile, reason: not valid java name */
    public final ArrayList m652volatile(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                try {
                    int read = this.license.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.adcel += read;
                    i2 += read;
                } catch (C10895e e) {
                    e.f21565e = true;
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: while, reason: not valid java name */
    public final boolean mo653while(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                mo625class(8);
                return true;
            }
            if (i2 == 2) {
                mo625class(mo647synchronized());
                return true;
            }
            if (i2 == 3) {
                m1369goto();
                mo648throw(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.vip == 0) {
                    mo648throw(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw new C15259e();
            }
            mo625class(4);
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
            throw new IOException("CodedInputStream encountered a malformed varint.");
        }
        while (i3 < 10) {
            if (this.yandex == this.purchase) {
                m646switch(1);
            }
            int i6 = this.yandex;
            this.yandex = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
        return true;
    }
}
