package defpackage;

import android.util.SparseArray;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3484e implements InterfaceC1272e {
    public InterfaceC5483e adcel;
    public boolean appmetrica;
    public boolean billing;
    public boolean mopub;
    public boolean purchase;
    public C11016e startapp;
    public long yandex;
    public final C8010e ad = new C8010e(0);
    public final C1292e metrica = new C1292e(4096);
    public final SparseArray vip = new SparseArray();
    public final C11737e license = new C11737e(0);

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        C8010e c8010e = this.ad;
        boolean z = c8010e.appmetrica() == -9223372036854775807L;
        if (!z) {
            long license = c8010e.license();
            z = (license == -9223372036854775807L || license == 0 || license == j2) ? false : true;
        }
        if (z) {
            c8010e.billing(j2);
        }
        C11016e c11016e = this.startapp;
        if (c11016e != null) {
            c11016e.ads(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.vip;
            if (i >= sparseArray.size()) {
                return;
            }
            C6918e c6918e = (C6918e) sparseArray.valueAt(i);
            c6918e.purchase = false;
            c6918e.ad.vip();
            i++;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        byte[] bArr = new byte[14];
        C14446e c14446e = (C14446e) interfaceC2283e;
        c14446e.billing(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c14446e.mopub(bArr[13] & 7, false);
            c14446e.billing(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.adcel = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [eُٕٚ, eٌٕۗ] */
    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        int i;
        int i2;
        long j;
        InterfaceC13397e interfaceC13397e;
        long j2;
        this.adcel.getClass();
        long length = interfaceC2283e.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = -9223372036854775807L;
        C11737e c11737e = this.license;
        if (i3 != 0 && !c11737e.license) {
            C8010e c8010e = c11737e.vip;
            C1292e c1292e = c11737e.metrica;
            if (!c11737e.purchase) {
                long length2 = interfaceC2283e.getLength();
                int min = (int) Math.min(20000L, length2);
                long j4 = length2 - min;
                if (interfaceC2283e.getPosition() != j4) {
                    c14829e.f29362e = j4;
                    return 1;
                }
                c1292e.m564extends(min);
                interfaceC2283e.smaato();
                interfaceC2283e.ad(0, min, c1292e.ad);
                int i4 = c1292e.vip;
                int i5 = c1292e.metrica - 4;
                while (true) {
                    if (i5 < i4) {
                        break;
                    }
                    if (C11737e.vip(i5, c1292e.ad) == 442) {
                        c1292e.m571try(i5 + 4);
                        long metrica = C11737e.metrica(c1292e);
                        if (metrica != -9223372036854775807L) {
                            j3 = metrica;
                            break;
                        }
                    }
                    i5--;
                }
                c11737e.yandex = j3;
                c11737e.purchase = true;
                return 0;
            }
            if (c11737e.yandex == -9223372036854775807L) {
                c11737e.ad(interfaceC2283e);
                return 0;
            }
            if (c11737e.appmetrica) {
                long j5 = c11737e.billing;
                if (j5 == -9223372036854775807L) {
                    c11737e.ad(interfaceC2283e);
                    return 0;
                }
                c11737e.startapp = c8010e.metrica(c11737e.yandex) - c8010e.vip(j5);
                c11737e.ad(interfaceC2283e);
                return 0;
            }
            int min2 = (int) Math.min(20000L, interfaceC2283e.getLength());
            long j6 = 0;
            if (interfaceC2283e.getPosition() != j6) {
                c14829e.f29362e = j6;
                return 1;
            }
            c1292e.m564extends(min2);
            interfaceC2283e.smaato();
            interfaceC2283e.ad(0, min2, c1292e.ad);
            int i6 = c1292e.vip;
            int i7 = c1292e.metrica;
            while (true) {
                if (i6 >= i7 - 3) {
                    j2 = -9223372036854775807L;
                    break;
                }
                if (C11737e.vip(i6, c1292e.ad) == 442) {
                    c1292e.m571try(i6 + 4);
                    long metrica2 = C11737e.metrica(c1292e);
                    if (metrica2 != -9223372036854775807L) {
                        j2 = metrica2;
                        break;
                    }
                }
                i6++;
            }
            c11737e.billing = j2;
            c11737e.appmetrica = true;
            return 0;
        }
        if (this.mopub) {
            i = i3;
            i2 = 4;
        } else {
            this.mopub = true;
            long j7 = c11737e.startapp;
            if (j7 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                ?? abstractC8712e = new AbstractC8712e(new C5438e(24), new C5891e(c11737e.vip), j7, j7 + 1, 0L, length, 188L, 1000);
                this.startapp = abstractC8712e;
                this.adcel.pro((C2769e) abstractC8712e.metrica);
            } else {
                i = i3;
                i2 = 4;
                this.adcel.pro(new C5990e(j7));
            }
        }
        C11016e c11016e = this.startapp;
        if (c11016e != null && ((C17909e) c11016e.appmetrica) != null) {
            return c11016e.pro(interfaceC2283e, c14829e);
        }
        interfaceC2283e.smaato();
        long yandex = i != 0 ? length - interfaceC2283e.yandex() : -1L;
        if (yandex != -1 && yandex < 4) {
            return -1;
        }
        C1292e c1292e2 = this.metrica;
        if (!interfaceC2283e.billing(c1292e2.ad, 0, i2, true)) {
            return -1;
        }
        c1292e2.m571try(0);
        int smaato = c1292e2.smaato();
        if (smaato == 441) {
            return -1;
        }
        if (smaato == 442) {
            interfaceC2283e.ad(0, 10, c1292e2.ad);
            c1292e2.m571try(9);
            interfaceC2283e.amazon((c1292e2.ads() & 7) + 14);
            return 0;
        }
        if (smaato == 443) {
            interfaceC2283e.ad(0, 2, c1292e2.ad);
            c1292e2.m571try(0);
            interfaceC2283e.amazon(c1292e2.m565goto() + 6);
            return 0;
        }
        if (((smaato & (-256)) >> 8) != 1) {
            interfaceC2283e.amazon(1);
            return 0;
        }
        int i8 = smaato & 255;
        SparseArray sparseArray = this.vip;
        C6918e c6918e = (C6918e) sparseArray.get(i8);
        if (!this.appmetrica) {
            if (c6918e == null) {
                if (i8 == 189) {
                    interfaceC13397e = new C8958e("video/mp2p");
                    this.purchase = true;
                    this.yandex = interfaceC2283e.getPosition();
                } else if ((smaato & 224) == 192) {
                    interfaceC13397e = new C4585e(null, 0, "video/mp2p");
                    this.purchase = true;
                    this.yandex = interfaceC2283e.getPosition();
                } else if ((smaato & 240) == 224) {
                    interfaceC13397e = new C9090e(null, "video/mp2p");
                    this.billing = true;
                    this.yandex = interfaceC2283e.getPosition();
                } else {
                    interfaceC13397e = null;
                }
                if (interfaceC13397e != null) {
                    interfaceC13397e.appmetrica(this.adcel, new C18316e(i8, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                    c6918e = new C6918e(interfaceC13397e, this.ad);
                    sparseArray.put(i8, c6918e);
                }
            }
            if (interfaceC2283e.getPosition() > ((this.purchase && this.billing) ? this.yandex + 8192 : 1048576L)) {
                this.appmetrica = true;
                this.adcel.mopub();
            }
        }
        interfaceC2283e.ad(0, 2, c1292e2.ad);
        c1292e2.m571try(0);
        int m565goto = c1292e2.m565goto() + 6;
        if (c6918e == null) {
            interfaceC2283e.amazon(m565goto);
            return 0;
        }
        c1292e2.m564extends(m565goto);
        interfaceC2283e.readFully(c1292e2.ad, 0, m565goto);
        c1292e2.m571try(6);
        InterfaceC13397e interfaceC13397e2 = c6918e.ad;
        C2125e c2125e = c6918e.metrica;
        c1292e2.mopub(0, 3, c2125e.vip);
        c2125e.smaato(0);
        c2125e.loadAd(8);
        c6918e.license = c2125e.purchase();
        c6918e.appmetrica = c2125e.purchase();
        c2125e.loadAd(6);
        c1292e2.mopub(0, c2125e.billing(8), c2125e.vip);
        c2125e.smaato(0);
        C8010e c8010e2 = c6918e.vip;
        c6918e.billing = 0L;
        if (c6918e.license) {
            c2125e.loadAd(4);
            c2125e.loadAd(1);
            c2125e.loadAd(1);
            long billing = (c2125e.billing(3) << 30) | (c2125e.billing(15) << 15) | c2125e.billing(15);
            c2125e.loadAd(1);
            if (c6918e.purchase || !c6918e.appmetrica) {
                j = billing;
            } else {
                c2125e.loadAd(4);
                c2125e.loadAd(1);
                c2125e.loadAd(1);
                c2125e.loadAd(1);
                c8010e2.vip((c2125e.billing(15) << 15) | (c2125e.billing(3) << 30) | c2125e.billing(15));
                c6918e.purchase = true;
                j = billing;
            }
            c6918e.billing = c8010e2.vip(j);
        }
        interfaceC13397e2.license(4, c6918e.billing);
        interfaceC13397e2.ad(c1292e2);
        interfaceC13397e2.metrica(false);
        c1292e2.m572while(c1292e2.ad.length);
        return 0;
    }
}
