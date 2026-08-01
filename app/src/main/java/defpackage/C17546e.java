package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17546e {
    public final InterfaceC4895e ad;
    public int license;
    public long vip;
    public int yandex;
    public long metrica = Long.MAX_VALUE;
    public int appmetrica = 2;
    public int purchase = -1;
    public long billing = -1;
    public final ArrayList startapp = new ArrayList();

    public C17546e(InterfaceC4895e interfaceC4895e) {
        this.ad = interfaceC4895e;
    }

    public void Signature() {
        int i = this.appmetrica;
        if (i == 0) {
            loadAd();
            return;
        }
        if (i == 1) {
            mopub();
            return;
        }
        if (i == 2) {
            this.ad.skip(metrica());
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            adcel();
        }
    }

    public void ad(int i, int i2, Object obj) {
        AbstractC4653e.yandex(i2).startapp(new C0444e((InterfaceC11855e) this.startapp.get(this.license - 1)), i, obj);
    }

    public int adcel() {
        int i = this.appmetrica;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.appmetrica);
        }
        InterfaceC4895e interfaceC4895e = this.ad;
        interfaceC4895e.admob(4L);
        this.vip += 4;
        int mo1684finally = interfaceC4895e.mo1684finally();
        vip(5);
        return mo1684finally;
    }

    public final void admob(int i) {
        while (this.vip < this.metrica) {
            InterfaceC4895e interfaceC4895e = this.ad;
            if (interfaceC4895e.yandex()) {
                break;
            }
            int purchase = purchase();
            if (purchase == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = purchase >> 3;
            int i3 = purchase & 7;
            if (i3 == 0) {
                this.appmetrica = 0;
                loadAd();
            } else if (i3 == 1) {
                this.appmetrica = 1;
                mopub();
            } else if (i3 == 2) {
                long purchase2 = purchase();
                this.vip += purchase2;
                interfaceC4895e.skip(purchase2);
            } else {
                if (i3 == 3) {
                    int i4 = this.license + 1;
                    this.license = i4;
                    if (i4 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        admob(i2);
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
                    adcel();
                }
            }
        }
        throw new EOFException();
    }

    public String advert() {
        long metrica = metrica();
        InterfaceC4895e interfaceC4895e = this.ad;
        interfaceC4895e.admob(metrica);
        return interfaceC4895e.pro(metrica);
    }

    public int amazon() {
        int i = this.appmetrica;
        if (i == 0 || i == 2) {
            int purchase = purchase();
            vip(0);
            return purchase;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.appmetrica);
    }

    public C0193e appmetrica(long j) {
        if (this.appmetrica != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.license - 1;
        this.license = i;
        if (i < 0 || this.billing != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.vip == this.metrica || i == 0) {
            this.metrica = j;
            C16151e c16151e = (C16151e) this.startapp.get(i);
            long j2 = c16151e.f31731e;
            return j2 > 0 ? c16151e.isPro(j2) : C0193e.f1409e;
        }
        throw new IOException("Expected to end at " + this.metrica + " but was " + this.vip);
    }

    public int billing() {
        int i = this.appmetrica;
        if (i == 7) {
            this.appmetrica = 2;
            return this.purchase;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.vip < this.metrica && !this.ad.yandex()) {
            int purchase = purchase();
            if (purchase == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = purchase >> 3;
            this.purchase = i2;
            int i3 = purchase & 7;
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
                int purchase2 = purchase();
                if (purchase2 < 0) {
                    throw new ProtocolException(AbstractC1786e.admob(purchase2, "Negative length: "));
                }
                if (this.billing != -1) {
                    throw new IllegalStateException();
                }
                long j = this.metrica;
                this.billing = j;
                long j2 = this.vip + purchase2;
                this.metrica = j2;
                if (j2 <= j) {
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
            admob(i2);
        }
        return -1;
    }

    public long license() {
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
        long j = this.billing;
        this.billing = -1L;
        this.appmetrica = 6;
        return j;
    }

    public long loadAd() {
        int i = this.appmetrica;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.appmetrica);
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            InterfaceC4895e interfaceC4895e = this.ad;
            interfaceC4895e.admob(1L);
            this.vip++;
            j |= (r4 & Byte.MAX_VALUE) << i2;
            if ((interfaceC4895e.readByte() & 128) == 0) {
                vip(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final long metrica() {
        if (this.appmetrica != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.appmetrica);
        }
        long j = this.metrica - this.vip;
        this.ad.admob(j);
        this.appmetrica = 6;
        this.vip = this.metrica;
        this.metrica = this.billing;
        this.billing = -1L;
        return j;
    }

    public long mopub() {
        int i = this.appmetrica;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.appmetrica);
        }
        InterfaceC4895e interfaceC4895e = this.ad;
        interfaceC4895e.admob(8L);
        this.vip += 8;
        long mo1679e = interfaceC4895e.mo1679e();
        vip(1);
        return mo1679e;
    }

    public final int purchase() {
        int i;
        InterfaceC4895e interfaceC4895e = this.ad;
        interfaceC4895e.admob(1L);
        this.vip++;
        byte readByte = interfaceC4895e.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        interfaceC4895e.admob(1L);
        this.vip++;
        byte readByte2 = interfaceC4895e.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            interfaceC4895e.admob(1L);
            this.vip++;
            byte readByte3 = interfaceC4895e.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                interfaceC4895e.admob(1L);
                this.vip++;
                byte readByte4 = interfaceC4895e.readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    interfaceC4895e.admob(1L);
                    this.vip++;
                    byte readByte5 = interfaceC4895e.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            interfaceC4895e.admob(1L);
                            this.vip++;
                            if (interfaceC4895e.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i4;
                }
                i = readByte4 << 21;
            }
        }
        return i | i2;
    }

    public void smaato(int i) {
        int yandex = yandex();
        ad(i, yandex, AbstractC4653e.yandex(yandex).metrica(this));
    }

    public C0193e startapp() {
        long metrica = metrica();
        InterfaceC4895e interfaceC4895e = this.ad;
        interfaceC4895e.admob(metrica);
        return interfaceC4895e.isPro(metrica);
    }

    public final void vip(int i) {
        if (this.appmetrica == i) {
            this.appmetrica = 6;
            return;
        }
        long j = this.vip;
        long j2 = this.metrica;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.metrica + " but was " + this.vip);
        }
        if (j != j2) {
            this.appmetrica = 7;
            return;
        }
        this.metrica = this.billing;
        this.billing = -1L;
        this.appmetrica = 6;
    }

    public int yandex() {
        return this.yandex;
    }
}
