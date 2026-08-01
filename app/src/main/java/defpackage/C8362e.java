package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8362e implements InterfaceC1272e {
    public InterfaceC5483e appmetrica;
    public final C2125e license;
    public final C1292e metrica;
    public long purchase;
    public boolean startapp;
    public boolean yandex;
    public final C11637e ad = new C11637e(0, null, "audio/mp4a-latm", true);
    public final C1292e vip = new C1292e(2048);
    public long billing = -1;

    public C8362e(int i) {
        C1292e c1292e = new C1292e(10);
        this.metrica = c1292e;
        byte[] bArr = c1292e.ad;
        this.license = new C2125e(bArr.length, bArr);
    }

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
        this.yandex = false;
        this.ad.vip();
        this.purchase = j2;
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        int i = 0;
        while (true) {
            C1292e c1292e = this.metrica;
            interfaceC2283e.ad(0, 10, c1292e.ad);
            c1292e.m571try(0);
            if (c1292e.crashlytics() != 4801587) {
                break;
            }
            c1292e.m568protected(3);
            int applovin = c1292e.applovin();
            i += applovin + 10;
            interfaceC2283e.startapp(applovin);
        }
        interfaceC2283e.smaato();
        interfaceC2283e.startapp(i);
        if (this.billing == -1) {
            this.billing = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            C1292e c1292e2 = this.metrica;
            C14446e c14446e = (C14446e) interfaceC2283e;
            c14446e.billing(c1292e2.ad, 0, 2, false);
            c1292e2.m571try(0);
            if ((c1292e2.m565goto() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                c14446e.billing(c1292e2.ad, 0, 4, false);
                C2125e c2125e = this.license;
                c2125e.smaato(14);
                int billing = c2125e.billing(13);
                if (billing <= 6) {
                    i2++;
                    c14446e.f28561e = 0;
                    c14446e.mopub(i2, false);
                } else {
                    c14446e.mopub(billing - 6, false);
                    i4 += billing;
                }
            } else {
                i2++;
                c14446e.f28561e = 0;
                c14446e.mopub(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.appmetrica = interfaceC5483e;
        this.ad.appmetrica(interfaceC5483e, new C18316e(0, 1));
        interfaceC5483e.mopub();
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        this.appmetrica.getClass();
        interfaceC2283e.getLength();
        C1292e c1292e = this.vip;
        int read = interfaceC2283e.read(c1292e.ad, 0, 2048);
        boolean z = read == -1;
        if (!this.startapp) {
            this.appmetrica.pro(new C5990e(-9223372036854775807L));
            this.startapp = true;
        }
        if (z) {
            return -1;
        }
        c1292e.m571try(0);
        c1292e.m572while(read);
        boolean z2 = this.yandex;
        C11637e c11637e = this.ad;
        if (!z2) {
            c11637e.signatures = this.purchase;
            this.yandex = true;
        }
        c11637e.ad(c1292e);
        return 0;
    }
}
