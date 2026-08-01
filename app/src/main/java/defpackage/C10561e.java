package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10561e extends AbstractC3513e {
    public int adcel = Alert.DURATION_SHOW_INDEFINITELY;
    public int appmetrica;
    public int billing;
    public final byte[] license;
    public int purchase;
    public int startapp;
    public final int yandex;

    public C10561e(byte[] bArr, int i, int i2, boolean z) {
        this.license = bArr;
        this.appmetrica = i2 + i;
        this.billing = i;
        this.yandex = i;
    }

    @Override // defpackage.AbstractC3513e
    public final long Signature() {
        return m2844switch();
    }

    @Override // defpackage.AbstractC3513e
    public final void ad(int i) {
        if (this.startapp != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC3513e
    public final int adcel() {
        return m2841else();
    }

    @Override // defpackage.AbstractC3513e
    public final int admob() {
        int m2845throws = m2845throws();
        return (-(m2845throws & 1)) ^ (m2845throws >>> 1);
    }

    @Override // defpackage.AbstractC3513e
    public final float advert() {
        return Float.intBitsToFloat(m2841else());
    }

    @Override // defpackage.AbstractC3513e
    public final long amazon() {
        return m2842finally();
    }

    @Override // defpackage.AbstractC3513e
    public final int appmetrica(int i) {
        if (i < 0) {
            throw C11690e.license();
        }
        int vip = vip() + i;
        if (vip < 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.adcel;
        if (vip > i2) {
            throw C11690e.appmetrica();
        }
        this.adcel = vip;
        m2846volatile();
        return i2;
    }

    @Override // defpackage.AbstractC3513e
    public final C6283e billing() {
        byte[] bArr;
        int m2845throws = m2845throws();
        byte[] bArr2 = this.license;
        if (m2845throws > 0) {
            int i = this.appmetrica;
            int i2 = this.billing;
            if (m2845throws <= i - i2) {
                C6283e yandex = C6283e.yandex(i2, m2845throws, bArr2);
                this.billing += m2845throws;
                return yandex;
            }
        }
        if (m2845throws == 0) {
            return C6283e.f13092e;
        }
        if (m2845throws > 0) {
            int i3 = this.appmetrica;
            int i4 = this.billing;
            if (m2845throws <= i3 - i4) {
                int i5 = m2845throws + i4;
                this.billing = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                C6283e c6283e = C6283e.f13092e;
                return new C6283e(bArr);
            }
        }
        if (m2845throws > 0) {
            throw C11690e.appmetrica();
        }
        if (m2845throws != 0) {
            throw C11690e.license();
        }
        bArr = AbstractC2930e.vip;
        C6283e c6283e2 = C6283e.f13092e;
        return new C6283e(bArr);
    }

    /* renamed from: const, reason: not valid java name */
    public final long m2840const() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.billing;
            if (i2 == this.appmetrica) {
                throw C11690e.appmetrica();
            }
            this.billing = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.license[i2] & 128) == 0) {
                return j;
            }
        }
        throw C11690e.metrica();
    }

    /* renamed from: else, reason: not valid java name */
    public final int m2841else() {
        int i = this.billing;
        if (this.appmetrica - i < 4) {
            throw C11690e.appmetrica();
        }
        this.billing = i + 4;
        byte[] bArr = this.license;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: finally, reason: not valid java name */
    public final long m2842finally() {
        long j;
        long j2;
        long j3;
        long j4;
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
                this.billing = i4;
                return j;
            }
        }
        return m2840const();
    }

    /* renamed from: for, reason: not valid java name */
    public final void m2843for(int i) {
        if (i >= 0) {
            int i2 = this.appmetrica;
            int i3 = this.billing;
            if (i <= i2 - i3) {
                this.billing = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C11690e.appmetrica();
        }
        throw C11690e.license();
    }

    @Override // defpackage.AbstractC3513e
    public final boolean inmobi(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m2843for(8);
                return true;
            }
            if (i2 == 2) {
                m2843for(m2845throws());
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
            m2843for(4);
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
            throw C11690e.metrica();
        }
        while (i3 < 10) {
            int i6 = this.billing;
            if (i6 == this.appmetrica) {
                throw C11690e.appmetrica();
            }
            this.billing = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw C11690e.metrica();
        return true;
    }

    @Override // defpackage.AbstractC3513e
    public final long isVip() {
        return m2842finally();
    }

    @Override // defpackage.AbstractC3513e
    public final void license(int i) {
        this.adcel = i;
        m2846volatile();
    }

    @Override // defpackage.AbstractC3513e
    public final int loadAd() {
        return m2841else();
    }

    @Override // defpackage.AbstractC3513e
    public final boolean metrica() {
        return this.billing == this.appmetrica;
    }

    @Override // defpackage.AbstractC3513e
    public final long mopub() {
        return m2844switch();
    }

    @Override // defpackage.AbstractC3513e
    public final String pro() {
        int m2845throws = m2845throws();
        if (m2845throws > 0) {
            int i = this.appmetrica;
            int i2 = this.billing;
            if (m2845throws <= i - i2) {
                String vip = AbstractC7097e.ad.vip(i2, m2845throws, this.license);
                this.billing += m2845throws;
                return vip;
            }
        }
        if (m2845throws == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m2845throws <= 0) {
            throw C11690e.license();
        }
        throw C11690e.appmetrica();
    }

    @Override // defpackage.AbstractC3513e
    public final boolean purchase() {
        return m2842finally() != 0;
    }

    @Override // defpackage.AbstractC3513e
    public final String remoteconfig() {
        int m2845throws = m2845throws();
        if (m2845throws > 0) {
            int i = this.appmetrica;
            int i2 = this.billing;
            if (m2845throws <= i - i2) {
                String str = new String(this.license, i2, m2845throws, AbstractC2930e.ad);
                this.billing += m2845throws;
                return str;
            }
        }
        if (m2845throws == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m2845throws < 0) {
            throw C11690e.license();
        }
        throw C11690e.appmetrica();
    }

    @Override // defpackage.AbstractC3513e
    public final int signatures() {
        if (metrica()) {
            this.startapp = 0;
            return 0;
        }
        int m2845throws = m2845throws();
        this.startapp = m2845throws;
        if ((m2845throws >>> 3) != 0) {
            return m2845throws;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC3513e
    public final int smaato() {
        return m2845throws();
    }

    @Override // defpackage.AbstractC3513e
    public final int startapp() {
        return m2845throws();
    }

    @Override // defpackage.AbstractC3513e
    public final long subscription() {
        long m2842finally = m2842finally();
        return (-(m2842finally & 1)) ^ (m2842finally >>> 1);
    }

    /* renamed from: switch, reason: not valid java name */
    public final long m2844switch() {
        int i = this.billing;
        if (this.appmetrica - i < 8) {
            throw C11690e.appmetrica();
        }
        this.billing = i + 8;
        byte[] bArr = this.license;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.AbstractC3513e
    public final int tapsense() {
        return m2845throws();
    }

    /* renamed from: throws, reason: not valid java name */
    public final int m2845throws() {
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
        return (int) m2840const();
    }

    @Override // defpackage.AbstractC3513e
    public final int vip() {
        return this.billing - this.yandex;
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m2846volatile() {
        int i = this.appmetrica + this.purchase;
        this.appmetrica = i;
        int i2 = i - this.yandex;
        int i3 = this.adcel;
        if (i2 <= i3) {
            this.purchase = 0;
            return;
        }
        int i4 = i2 - i3;
        this.purchase = i4;
        this.appmetrica = i - i4;
    }

    @Override // defpackage.AbstractC3513e
    public final double yandex() {
        return Double.longBitsToDouble(m2844switch());
    }
}
