package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17582e {
    public final byte[] ad;
    public C18158e adcel;
    public int license;
    public int metrica;
    public int yandex;
    public int vip = 0;
    public int appmetrica = 2;
    public int purchase = -1;
    public int billing = -1;
    public final ArrayList startapp = new ArrayList();

    public C17582e(int i, byte[] bArr) {
        this.ad = bArr;
        this.metrica = i;
    }

    public final void Signature(int i) {
        while (this.vip < this.metrica) {
            int appmetrica = appmetrica();
            if (appmetrica == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = appmetrica >> 3;
            int i3 = appmetrica & 7;
            if (i3 == 0) {
                this.appmetrica = 0;
                amazon();
            } else if (i3 == 1) {
                this.appmetrica = 1;
                adcel();
            } else if (i3 == 2) {
                int appmetrica2 = this.vip + appmetrica();
                if (appmetrica2 > this.metrica) {
                    throw new EOFException();
                }
                this.vip = appmetrica2;
            } else {
                if (i3 == 3) {
                    int i4 = this.license + 1;
                    this.license = i4;
                    if (i4 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        Signature(i2);
                    } finally {
                    }
                    this.license--;
                }
                if (i3 == 4) {
                    if (i2 != i) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i3 != 5) {
                        throw new ProtocolException(AbstractC1786e.admob(i3, "Unexpected field encoding: "));
                    }
                    this.appmetrica = 5;
                    startapp();
                }
            }
        }
        throw new EOFException();
    }

    public final void ad(int i) {
        if (this.appmetrica == i) {
            this.appmetrica = 6;
            return;
        }
        int i2 = this.vip;
        int i3 = this.metrica;
        if (i2 > i3) {
            throw new IOException("Expected to end at " + this.metrica + " but was " + this.vip);
        }
        if (i2 != i3) {
            this.appmetrica = 7;
            return;
        }
        this.metrica = this.billing;
        this.billing = -1;
        this.appmetrica = 6;
    }

    public final long adcel() {
        int i = this.appmetrica;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.appmetrica);
        }
        int i2 = this.vip;
        int i3 = i2 + 8;
        if (i3 > this.metrica) {
            throw new EOFException();
        }
        this.vip = i2 + 1;
        byte[] bArr = this.ad;
        this.vip = i2 + 2;
        long j = (bArr[i2] & 255) | ((bArr[r3] & 255) << 8);
        this.vip = i2 + 3;
        long j2 = j | ((bArr[r9] & 255) << 16);
        this.vip = i2 + 4;
        long j3 = j2 | ((bArr[r3] & 255) << 24);
        this.vip = i2 + 5;
        long j4 = j3 | ((bArr[r9] & 255) << 32);
        this.vip = i2 + 6;
        this.vip = i2 + 7;
        this.vip = i3;
        long j5 = ((bArr[r0] & 255) << 56) | j4 | ((bArr[r3] & 255) << 40) | ((bArr[r9] & 255) << 48);
        ad(1);
        return j5;
    }

    public final void advert(int i) {
        int i2 = this.yandex;
        AbstractC4653e.yandex(i2).startapp(new C0444e((InterfaceC11855e) this.startapp.get(this.license - 1)), i, AbstractC4653e.yandex(i2).vip(this));
    }

    public final long amazon() {
        int i = this.appmetrica;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.appmetrica);
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r4 & Byte.MAX_VALUE) << i2;
            if ((billing() & 128) == 0) {
                ad(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final int appmetrica() {
        int i;
        byte billing = billing();
        if (billing >= 0) {
            return billing;
        }
        int i2 = billing & Byte.MAX_VALUE;
        byte billing2 = billing();
        if (billing2 >= 0) {
            i = billing2 << 7;
        } else {
            i2 |= (billing2 & Byte.MAX_VALUE) << 7;
            byte billing3 = billing();
            if (billing3 >= 0) {
                i = billing3 << 14;
            } else {
                i2 |= (billing3 & Byte.MAX_VALUE) << 14;
                byte billing4 = billing();
                if (billing4 < 0) {
                    int i3 = i2 | ((billing4 & Byte.MAX_VALUE) << 21);
                    byte billing5 = billing();
                    int i4 = i3 | (billing5 << 28);
                    if (billing5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (billing() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i4;
                }
                i = billing4 << 21;
            }
        }
        return i2 | i;
    }

    public final byte billing() {
        int i = this.vip;
        if (i == this.metrica) {
            throw new EOFException();
        }
        this.vip = i + 1;
        return this.ad[i];
    }

    public final C0193e license(int i) {
        if (this.appmetrica != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i2 = this.license - 1;
        this.license = i2;
        if (i2 < 0 || this.billing != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.vip == this.metrica || i2 == 0) {
            this.metrica = i;
            C16151e c16151e = (C16151e) this.startapp.get(i2);
            long j = c16151e.f31731e;
            return j > 0 ? c16151e.isPro(j) : C0193e.f1409e;
        }
        throw new IOException("Expected to end at " + this.metrica + " but was " + this.vip);
    }

    public final void loadAd() {
        int i = this.appmetrica;
        if (i == 0) {
            amazon();
            return;
        }
        if (i == 1) {
            adcel();
            return;
        }
        if (i != 2) {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            startapp();
        } else {
            int vip = this.vip + vip();
            if (vip > this.metrica) {
                throw new EOFException();
            }
            this.vip = vip;
        }
    }

    public final int metrica() {
        if (this.appmetrica != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.license + 1;
        this.license = i;
        if (i > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.startapp;
        if (i > arrayList.size()) {
            arrayList.add(new Object());
        }
        int i2 = this.billing;
        this.billing = -1;
        this.appmetrica = 6;
        return i2;
    }

    public final String mopub() {
        int vip = vip();
        int i = this.vip;
        int i2 = vip + i;
        if (i2 > this.metrica) {
            throw new EOFException();
        }
        String advert = AbstractC6507e.advert(i, i2, 4, this.ad);
        this.vip = i2;
        return advert;
    }

    public final int purchase() {
        int i = this.appmetrica;
        if (i == 7) {
            this.appmetrica = 2;
            return this.purchase;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.vip < this.metrica) {
            int appmetrica = appmetrica();
            if (appmetrica == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = appmetrica >> 3;
            this.purchase = i2;
            int i3 = appmetrica & 7;
            if (i3 == 0) {
                this.yandex = 1;
                this.appmetrica = 0;
                return i2;
            }
            if (i3 == 1) {
                this.yandex = 2;
                this.appmetrica = 1;
                return i2;
            }
            if (i3 == 2) {
                this.yandex = 3;
                this.appmetrica = 2;
                int appmetrica2 = appmetrica();
                if (appmetrica2 < 0) {
                    throw new ProtocolException(AbstractC1786e.admob(appmetrica2, "Negative length: "));
                }
                if (this.billing != -1) {
                    throw new IllegalStateException();
                }
                int i4 = this.metrica;
                this.billing = i4;
                int i5 = this.vip + appmetrica2;
                this.metrica = i5;
                if (i5 <= i4) {
                    return this.purchase;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 != 5) {
                    throw new ProtocolException(AbstractC1786e.admob(i3, "Unexpected field encoding: "));
                }
                this.yandex = 4;
                this.appmetrica = 5;
                return i2;
            }
            Signature(i2);
        }
        return -1;
    }

    public final int smaato() {
        int i = this.appmetrica;
        if (i == 0 || i == 2) {
            int appmetrica = appmetrica();
            ad(0);
            return appmetrica;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.appmetrica);
    }

    public final int startapp() {
        int i = this.appmetrica;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.appmetrica);
        }
        int i2 = this.vip;
        int i3 = i2 + 4;
        if (i3 > this.metrica) {
            throw new EOFException();
        }
        int i4 = i2 + 1;
        this.vip = i4;
        byte[] bArr = this.ad;
        int i5 = bArr[i2] & 255;
        int i6 = i2 + 2;
        this.vip = i6;
        int i7 = ((bArr[i4] & 255) << 8) | i5;
        int i8 = i2 + 3;
        this.vip = i8;
        int i9 = i7 | ((bArr[i6] & 255) << 16);
        this.vip = i3;
        int i10 = ((bArr[i8] & 255) << 24) | i9;
        ad(5);
        return i10;
    }

    public final int vip() {
        if (this.appmetrica != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.appmetrica);
        }
        int i = this.metrica - this.vip;
        this.appmetrica = 6;
        this.metrica = this.billing;
        this.billing = -1;
        return i;
    }

    public final C0193e yandex() {
        int vip = vip();
        int i = this.vip;
        int i2 = i + vip;
        if (i2 > this.metrica) {
            throw new EOFException();
        }
        byte[] bArr = this.ad;
        AbstractC7844e.startapp(bArr.length, i, vip);
        C0193e c0193e = new C0193e(AbstractC1660e.remoteconfig(i, i2, bArr));
        this.vip = i2;
        return c0193e;
    }
}
