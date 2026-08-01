package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3328e implements InterfaceC1272e {
    public boolean metrica;
    public final C8958e ad = new C8958e("audio/ac3");
    public final C1292e vip = new C1292e(2786);

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
        this.metrica = false;
        this.ad.vip();
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C14446e c14446e;
        int billing;
        C1292e c1292e = new C1292e(10);
        int i = 0;
        while (true) {
            c14446e = (C14446e) interfaceC2283e;
            c14446e.billing(c1292e.ad, 0, 10, false);
            c1292e.m571try(0);
            if (c1292e.crashlytics() != 4801587) {
                break;
            }
            c1292e.m568protected(3);
            int applovin = c1292e.applovin();
            i += applovin + 10;
            c14446e.mopub(applovin, false);
        }
        c14446e.f28561e = 0;
        c14446e.mopub(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            c14446e.billing(c1292e.ad, 0, 6, false);
            c1292e.m571try(0);
            if (c1292e.m565goto() != 2935) {
                c14446e.f28561e = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                c14446e.mopub(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = c1292e.ad;
                if (bArr.length < 6) {
                    billing = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    billing = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    billing = AbstractC8461e.billing((b & 192) >> 6, b & 63);
                }
                if (billing == -1) {
                    break;
                }
                c14446e.mopub(billing - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.ad.appmetrica(interfaceC5483e, new C18316e(0, 1));
        interfaceC5483e.mopub();
        interfaceC5483e.pro(new C5990e(-9223372036854775807L));
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        C1292e c1292e = this.vip;
        int read = interfaceC2283e.read(c1292e.ad, 0, 2786);
        if (read == -1) {
            return -1;
        }
        c1292e.m571try(0);
        c1292e.m572while(read);
        boolean z = this.metrica;
        C8958e c8958e = this.ad;
        if (!z) {
            c8958e.loadAd = 0L;
            this.metrica = true;
        }
        c8958e.ad(c1292e);
        return 0;
    }
}
