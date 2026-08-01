package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7233e extends AbstractC15825e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f14761e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f14762e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f14763e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f14764e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f14765e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f14766e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14767e;

    public C7233e(byte[] bArr, int i, int i2, boolean z) {
        this.f14762e = bArr;
        this.f14764e = i2 + i;
        this.f14767e = i;
        this.f14766e = i;
    }

    @Override // defpackage.AbstractC15825e
    public final void Signature(int i) {
        this.f14765e = i;
        m2276implements();
    }

    /* renamed from: abstract, reason: not valid java name */
    public final long m2273abstract() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f14767e;
        int i2 = this.f14764e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f14762e;
            byte b = bArr[i];
            if (b >= 0) {
                this.f14767e = i3;
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
                this.f14767e = i4;
                return j;
            }
        }
        return m2275default();
    }

    @Override // defpackage.AbstractC15825e
    public final int ads() {
        return m2274break();
    }

    @Override // defpackage.AbstractC15825e
    public final float applovin() {
        return Float.intBitsToFloat(m2278try());
    }

    /* renamed from: break, reason: not valid java name */
    public final int m2274break() {
        int i;
        int i2 = this.f14767e;
        int i3 = this.f14764e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f14762e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f14767e = i4;
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
                this.f14767e = i5;
                return i;
            }
        }
        return (int) m2275default();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: class */
    public final long mo583class() {
        return AbstractC15825e.billing(m2273abstract());
    }

    @Override // defpackage.AbstractC15825e
    public final long crashlytics() {
        return m2277protected();
    }

    /* renamed from: default, reason: not valid java name */
    public final long m2275default() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f14767e;
            if (i2 == this.f14764e) {
                throw C8868e.billing();
            }
            this.f14767e = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f14762e[i2] & 128) == 0) {
                return j;
            }
        }
        throw C8868e.license();
    }

    @Override // defpackage.AbstractC15825e
    public final int firebase() {
        return AbstractC15825e.appmetrica(m2274break());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: goto */
    public final String mo586goto() {
        int m2274break = m2274break();
        if (m2274break > 0) {
            int i = this.f14764e;
            int i2 = this.f14767e;
            if (m2274break <= i - i2) {
                String billing = AbstractC18226e.ad.billing(i2, m2274break, this.f14762e);
                this.f14767e += m2274break;
                return billing;
            }
        }
        if (m2274break == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m2274break <= 0) {
            throw C8868e.appmetrica();
        }
        throw C8868e.billing();
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m2276implements() {
        int i = this.f14764e + this.f14761e;
        this.f14764e = i;
        int i2 = i - this.f14766e;
        int i3 = this.f14765e;
        if (i2 <= i3) {
            this.f14761e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f14761e = i4;
        this.f14764e = i - i4;
    }

    @Override // defpackage.AbstractC15825e
    public final int inmobi() {
        return m2278try();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: interface */
    public final String mo588interface() {
        int m2274break = m2274break();
        if (m2274break > 0) {
            int i = this.f14764e;
            int i2 = this.f14767e;
            if (m2274break <= i - i2) {
                String str = new String(this.f14762e, i2, m2274break, AbstractC10546e.ad);
                this.f14767e += m2274break;
                return str;
            }
        }
        if (m2274break == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m2274break < 0) {
            throw C8868e.appmetrica();
        }
        throw C8868e.billing();
    }

    @Override // defpackage.AbstractC15825e
    public final long isPro() {
        return m2277protected();
    }

    @Override // defpackage.AbstractC15825e
    public final int isVip() {
        return m2274break();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: native */
    public final int mo589native() {
        return m2274break();
    }

    @Override // defpackage.AbstractC15825e
    public final long premium() {
        return m2273abstract();
    }

    /* renamed from: protected, reason: not valid java name */
    public final long m2277protected() {
        int i = this.f14767e;
        if (this.f14764e - i < 8) {
            throw C8868e.billing();
        }
        this.f14767e = i + 8;
        byte[] bArr = this.f14762e;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.AbstractC15825e
    public final boolean remoteconfig() {
        return m2273abstract() != 0;
    }

    @Override // defpackage.AbstractC15825e
    public final C2096e signatures() {
        byte[] bArr;
        int m2274break = m2274break();
        byte[] bArr2 = this.f14762e;
        if (m2274break > 0) {
            int i = this.f14764e;
            int i2 = this.f14767e;
            if (m2274break <= i - i2) {
                C2096e yandex = AbstractC10498e.yandex(i2, m2274break, bArr2);
                this.f14767e += m2274break;
                return yandex;
            }
        }
        if (m2274break == 0) {
            return AbstractC10498e.f20717e;
        }
        if (m2274break > 0) {
            int i3 = this.f14764e;
            int i4 = this.f14767e;
            if (m2274break <= i3 - i4) {
                int i5 = m2274break + i4;
                this.f14767e = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                C2096e c2096e = AbstractC10498e.f20717e;
                return new C2096e(bArr);
            }
        }
        if (m2274break > 0) {
            throw C8868e.billing();
        }
        if (m2274break != 0) {
            throw C8868e.appmetrica();
        }
        bArr = AbstractC10546e.vip;
        C2096e c2096e2 = AbstractC10498e.f20717e;
        return new C2096e(bArr);
    }

    @Override // defpackage.AbstractC15825e
    public final boolean startapp() {
        return this.f14767e == this.f14764e;
    }

    @Override // defpackage.AbstractC15825e
    public final int subs() {
        return m2278try();
    }

    @Override // defpackage.AbstractC15825e
    public final int subscription(int i) {
        if (i < 0) {
            throw C8868e.appmetrica();
        }
        int yandex = yandex() + i;
        if (yandex < 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.f14765e;
        if (yandex > i2) {
            throw C8868e.billing();
        }
        this.f14765e = yandex;
        m2276implements();
        return i2;
    }

    @Override // defpackage.AbstractC15825e
    public final double tapsense() {
        return Double.longBitsToDouble(m2277protected());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: this */
    public final int mo594this() {
        if (startapp()) {
            this.f14763e = 0;
            return 0;
        }
        int m2274break = m2274break();
        this.f14763e = m2274break;
        if ((m2274break >>> 3) != 0) {
            return m2274break;
        }
        throw C8868e.ad();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: throw */
    public final long mo595throw() {
        return m2273abstract();
    }

    /* renamed from: try, reason: not valid java name */
    public final int m2278try() {
        int i = this.f14767e;
        if (this.f14764e - i < 4) {
            throw C8868e.billing();
        }
        this.f14767e = i + 4;
        byte[] bArr = this.f14762e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.AbstractC15825e
    public final void vip(int i) {
        if (this.f14763e != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15825e
    public final int yandex() {
        return this.f14767e - this.f14766e;
    }
}
