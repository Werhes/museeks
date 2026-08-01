package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17054e extends AbstractC3513e {
    public final byte[] license;
    public int purchase;
    public int yandex;
    public int startapp = Alert.DURATION_SHOW_INDEFINITELY;
    public int appmetrica = 0;
    public int billing = 0;

    public /* synthetic */ C17054e(byte[] bArr) {
        this.license = bArr;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: abstract */
    public final long mo621abstract() {
        return mo642return();
    }

    @Override // defpackage.AbstractC3513e
    public final void ads(int i) {
        this.startapp = i;
        int i2 = this.appmetrica + this.purchase;
        this.appmetrica = i2;
        if (i2 <= i) {
            this.purchase = 0;
            return;
        }
        int i3 = i2 - i;
        this.purchase = i3;
        this.appmetrica = i2 - i3;
    }

    @Override // defpackage.AbstractC3513e
    public final int applovin(int i) {
        if (i < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.billing;
        if (i2 < 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.startapp;
        if (i2 > i3) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.startapp = i2;
        int i4 = this.appmetrica + this.purchase;
        this.appmetrica = i4;
        if (i4 <= i2) {
            this.purchase = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.purchase = i5;
        this.appmetrica = i4 - i5;
        return i3;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: break */
    public final long mo622break() {
        return mo642return();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: case */
    public final int mo623case() {
        return m4239switch();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: catch */
    public final boolean mo624catch() {
        return mo642return() != 0;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: class */
    public final void mo625class(int i) {
        if (i >= 0) {
            int i2 = this.appmetrica;
            int i3 = this.billing;
            if (i <= i2 - i3) {
                this.billing = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: const, reason: not valid java name */
    public final int m4236const() {
        int i;
        int i2 = this.billing;
        int i3 = this.appmetrica;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.license;
            byte b = bArr[i2];
            if (b >= 0) {
                this.billing = i4;
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
                this.billing = i5;
                return i;
            }
        }
        return (int) m4237else();
    }

    @Override // defpackage.AbstractC3513e
    public final int crashlytics() {
        return this.billing;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: default */
    public final int mo628default() {
        return m4236const();
    }

    /* renamed from: else, reason: not valid java name */
    public final long m4237else() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.billing;
            if (i2 == this.appmetrica) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.billing = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.license[i2] & 128) == 0) {
                return j;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: extends */
    public final int mo630extends() {
        if (subs()) {
            this.yandex = 0;
            return 0;
        }
        int m4236const = m4236const();
        this.yandex = m4236const;
        if ((m4236const >>> 3) != 0) {
            return m4236const;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: final */
    public final String mo631final() {
        int m4236const = m4236const();
        if (m4236const > 0) {
            int i = this.appmetrica;
            int i2 = this.billing;
            if (m4236const <= i - i2) {
                String str = new String(this.license, i2, m4236const, StandardCharsets.UTF_8);
                this.billing += m4236const;
                return str;
            }
        }
        if (m4236const == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m4236const < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: finally, reason: not valid java name */
    public final byte[] m4238finally(int i) {
        if (i > 0) {
            int i2 = this.appmetrica;
            int i3 = this.billing;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.billing = i4;
                return Arrays.copyOfRange(this.license, i3, i4);
            }
        }
        if (i > 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            return AbstractC17904e.ad;
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.AbstractC3513e
    public final int firebase(int i, int i2, byte[] bArr) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.appmetrica - this.billing);
        if (min == 0) {
            return -1;
        }
        System.arraycopy(this.license, this.billing, bArr, i, min);
        this.billing += min;
        return min;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: implements */
    public final long mo634implements() {
        return m4240throws();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: import */
    public final long mo635import() {
        return m4240throws();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: instanceof */
    public final int mo636instanceof() {
        return AbstractC3513e.m1368this(m4236const());
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: new */
    public final C10553e mo637new() {
        int m4236const = m4236const();
        if (m4236const > 0) {
            int i = this.appmetrica;
            int i2 = this.billing;
            if (m4236const <= i - i2) {
                C10553e Signature = AbstractC7244e.Signature(i2, m4236const, this.license);
                this.billing += m4236const;
                return Signature;
            }
        }
        if (m4236const == 0) {
            return AbstractC7244e.f14800e;
        }
        byte[] m4238finally = m4238finally(m4236const);
        C10553e c10553e = AbstractC7244e.f14800e;
        return m4238finally.length == 0 ? AbstractC7244e.f14800e : new C10553e(m4238finally);
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: package */
    public final int mo638package() {
        return m4236const();
    }

    @Override // defpackage.AbstractC3513e
    public final int premium() {
        int i = this.startapp;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.billing;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: private */
    public final int mo639private() {
        return m4236const();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: protected */
    public final float mo640protected() {
        return Float.intBitsToFloat(m4239switch());
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: return */
    public final long mo642return() {
        long j;
        long j2;
        long j3;
        int i = this.billing;
        int i2 = this.appmetrica;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.license;
            byte b = bArr[i];
            if (b >= 0) {
                this.billing = i3;
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
                this.billing = i4;
                return j;
            }
        }
        return m4237else();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: static */
    public final long mo643static() {
        return AbstractC3513e.m1367native(mo642return());
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: strictfp */
    public final byte[] mo644strictfp() {
        return m4238finally(m4236const());
    }

    @Override // defpackage.AbstractC3513e
    public final boolean subs() {
        return this.billing == this.appmetrica;
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: super */
    public final String mo645super() {
        int m4236const = m4236const();
        if (m4236const > 0) {
            int i = this.appmetrica;
            int i2 = this.billing;
            if (m4236const <= i - i2) {
                String license = AbstractC2059e.license(i2, m4236const, this.license);
                this.billing += m4236const;
                return license;
            }
        }
        if (m4236const == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m4236const <= 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: switch, reason: not valid java name */
    public final int m4239switch() {
        int i = this.billing;
        if (this.appmetrica - i < 4) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.billing = i + 4;
        byte[] bArr = this.license;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: synchronized */
    public final int mo647synchronized() {
        return m4236const();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: throw */
    public final void mo648throw(int i) {
        if (this.yandex != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: throws, reason: not valid java name */
    public final long m4240throws() {
        int i = this.billing;
        if (this.appmetrica - i < 8) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.billing = i + 8;
        byte[] bArr = this.license;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: transient */
    public final int mo650transient() {
        return m4239switch();
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: try */
    public final double mo651try() {
        return Double.longBitsToDouble(m4240throws());
    }

    @Override // defpackage.AbstractC3513e
    /* renamed from: while */
    public final boolean mo653while(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                mo625class(8);
                return true;
            }
            if (i2 == 2) {
                mo625class(m4236const());
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
        int i4 = this.appmetrica - this.billing;
        byte[] bArr = this.license;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.billing;
                this.billing = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw new IOException("CodedInputStream encountered a malformed varint.");
        }
        while (i3 < 10) {
            int i6 = this.billing;
            if (i6 == this.appmetrica) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.billing = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
        return true;
    }
}
