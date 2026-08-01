package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16834e extends AbstractC15825e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f32977e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f32978e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f32979e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f32980e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f32981e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f32982e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32983e;

    public C16834e(byte[] bArr, int i, int i2, boolean z) {
        this.f32978e = bArr;
        this.f32980e = i2 + i;
        this.f32983e = i;
        this.f32982e = i;
    }

    @Override // defpackage.AbstractC15825e
    public final void Signature(int i) {
        this.f32981e = i;
        m4181implements();
    }

    /* renamed from: abstract, reason: not valid java name */
    public final long m4178abstract() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f32983e;
        int i2 = this.f32980e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f32978e;
            byte b = bArr[i];
            if (b >= 0) {
                this.f32983e = i3;
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
                this.f32983e = i4;
                return j;
            }
        }
        return m4180default();
    }

    @Override // defpackage.AbstractC15825e
    public final int ads() {
        return m4179break();
    }

    @Override // defpackage.AbstractC15825e
    public final float applovin() {
        return Float.intBitsToFloat(m4183try());
    }

    /* renamed from: break, reason: not valid java name */
    public final int m4179break() {
        int i;
        int i2 = this.f32983e;
        int i3 = this.f32980e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f32978e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f32983e = i4;
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
                this.f32983e = i5;
                return i;
            }
        }
        return (int) m4180default();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: class */
    public final long mo583class() {
        return AbstractC15825e.purchase(m4178abstract());
    }

    @Override // defpackage.AbstractC15825e
    public final long crashlytics() {
        return m4182protected();
    }

    /* renamed from: default, reason: not valid java name */
    public final long m4180default() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f32983e;
            if (i2 == this.f32980e) {
                throw C11872e.billing();
            }
            this.f32983e = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f32978e[i2] & 128) == 0) {
                return j;
            }
        }
        throw C11872e.license();
    }

    @Override // defpackage.AbstractC15825e
    public final int firebase() {
        return AbstractC15825e.license(m4179break());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: goto */
    public final String mo586goto() {
        int m4179break = m4179break();
        if (m4179break > 0) {
            int i = this.f32980e;
            int i2 = this.f32983e;
            if (m4179break <= i - i2) {
                String metrica = AbstractC15375e.ad.metrica(i2, m4179break, this.f32978e);
                this.f32983e += m4179break;
                return metrica;
            }
        }
        if (m4179break == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m4179break <= 0) {
            throw C11872e.appmetrica();
        }
        throw C11872e.billing();
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m4181implements() {
        int i = this.f32980e + this.f32977e;
        this.f32980e = i;
        int i2 = i - this.f32982e;
        int i3 = this.f32981e;
        if (i2 <= i3) {
            this.f32977e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f32977e = i4;
        this.f32980e = i - i4;
    }

    @Override // defpackage.AbstractC15825e
    public final int inmobi() {
        return m4183try();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: interface */
    public final String mo588interface() {
        int m4179break = m4179break();
        if (m4179break > 0) {
            int i = this.f32980e;
            int i2 = this.f32983e;
            if (m4179break <= i - i2) {
                String str = new String(this.f32978e, i2, m4179break, AbstractC0352e.ad);
                this.f32983e += m4179break;
                return str;
            }
        }
        if (m4179break == 0) {
            return BuildConfig.FLAVOR;
        }
        if (m4179break < 0) {
            throw C11872e.appmetrica();
        }
        throw C11872e.billing();
    }

    @Override // defpackage.AbstractC15825e
    public final long isPro() {
        return m4182protected();
    }

    @Override // defpackage.AbstractC15825e
    public final int isVip() {
        return m4179break();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: native */
    public final int mo589native() {
        return m4179break();
    }

    @Override // defpackage.AbstractC15825e
    public final long premium() {
        return m4178abstract();
    }

    @Override // defpackage.AbstractC15825e
    public final C11507e pro() {
        byte[] bArr;
        int m4179break = m4179break();
        byte[] bArr2 = this.f32978e;
        if (m4179break > 0) {
            int i = this.f32980e;
            int i2 = this.f32983e;
            if (m4179break <= i - i2) {
                C11507e yandex = AbstractC4002e.yandex(i2, m4179break, bArr2);
                this.f32983e += m4179break;
                return yandex;
            }
        }
        if (m4179break == 0) {
            return AbstractC4002e.f8908e;
        }
        if (m4179break > 0) {
            int i3 = this.f32980e;
            int i4 = this.f32983e;
            if (m4179break <= i3 - i4) {
                int i5 = m4179break + i4;
                this.f32983e = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                C11507e c11507e = AbstractC4002e.f8908e;
                return new C11507e(bArr);
            }
        }
        if (m4179break > 0) {
            throw C11872e.billing();
        }
        if (m4179break != 0) {
            throw C11872e.appmetrica();
        }
        bArr = AbstractC0352e.vip;
        C11507e c11507e2 = AbstractC4002e.f8908e;
        return new C11507e(bArr);
    }

    /* renamed from: protected, reason: not valid java name */
    public final long m4182protected() {
        int i = this.f32983e;
        if (this.f32980e - i < 8) {
            throw C11872e.billing();
        }
        this.f32983e = i + 8;
        byte[] bArr = this.f32978e;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.AbstractC15825e
    public final boolean remoteconfig() {
        return m4178abstract() != 0;
    }

    @Override // defpackage.AbstractC15825e
    public final boolean startapp() {
        return this.f32983e == this.f32980e;
    }

    @Override // defpackage.AbstractC15825e
    public final int subs() {
        return m4183try();
    }

    @Override // defpackage.AbstractC15825e
    public final int subscription(int i) {
        if (i < 0) {
            throw C11872e.appmetrica();
        }
        int yandex = yandex() + i;
        if (yandex < 0) {
            throw C11872e.purchase();
        }
        int i2 = this.f32981e;
        if (yandex > i2) {
            throw C11872e.billing();
        }
        this.f32981e = yandex;
        m4181implements();
        return i2;
    }

    @Override // defpackage.AbstractC15825e
    public final double tapsense() {
        return Double.longBitsToDouble(m4182protected());
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: this */
    public final int mo594this() {
        if (startapp()) {
            this.f32979e = 0;
            return 0;
        }
        int m4179break = m4179break();
        this.f32979e = m4179break;
        if ((m4179break >>> 3) != 0) {
            return m4179break;
        }
        throw C11872e.ad();
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: throw */
    public final long mo595throw() {
        return m4178abstract();
    }

    /* renamed from: try, reason: not valid java name */
    public final int m4183try() {
        int i = this.f32983e;
        if (this.f32980e - i < 4) {
            throw C11872e.billing();
        }
        this.f32983e = i + 4;
        byte[] bArr = this.f32978e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.AbstractC15825e
    public final void vip(int i) {
        if (this.f32979e != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15825e
    public final int yandex() {
        return this.f32983e - this.f32982e;
    }
}
