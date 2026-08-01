package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۠ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16560e implements InterfaceC17242e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ InterfaceC17242e appmetrica;
    public final /* synthetic */ int license;
    public final /* synthetic */ C10014e metrica;
    public final /* synthetic */ InterfaceC17242e vip;

    public /* synthetic */ C16560e(InterfaceC17242e interfaceC17242e, C10014e c10014e, int i, InterfaceC17242e interfaceC17242e2, int i2) {
        this.ad = i2;
        this.metrica = c10014e;
        this.license = i;
        this.appmetrica = interfaceC17242e2;
        this.vip = interfaceC17242e;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        switch (this.ad) {
            case 0:
                return this.vip.ad();
            default:
                return this.vip.ad();
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        switch (this.ad) {
            case 0:
                return this.vip.getWidth();
            default:
                return this.vip.getWidth();
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        switch (this.ad) {
            case 0:
                return this.vip.license();
            default:
                return this.vip.license();
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        int i;
        switch (this.ad) {
            case 0:
                int i2 = this.license;
                C10014e c10014e = this.metrica;
                c10014e.f19768e = i2;
                this.appmetrica.metrica();
                C12431e c12431e = c10014e.f19769e;
                C0583e c0583e = c10014e.f19770e;
                long[] jArr = c0583e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = c0583e.vip[i7];
                                    InterfaceC16638e interfaceC16638e = (InterfaceC16638e) c0583e.metrica[i7];
                                    int advert = c12431e.advert(obj);
                                    i = i4;
                                    if (advert < 0 || advert >= c10014e.f19768e) {
                                        if (advert >= 0) {
                                            Object[] objArr = c12431e.f24870e;
                                            Object obj2 = objArr[advert];
                                            objArr[advert] = AbstractC9464e.vip;
                                        }
                                        if (c10014e.f19772e.vip(obj)) {
                                            interfaceC16638e.ad();
                                        }
                                        c0583e.smaato(i7);
                                    }
                                } else {
                                    i = i4;
                                }
                                j >>= i;
                                i6++;
                                i4 = i;
                            }
                            if (i5 != i4) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                c10014e.billing(c10014e.f19779e);
                return;
            default:
                int i8 = this.license;
                C10014e c10014e2 = this.metrica;
                c10014e2.f19779e = i8;
                this.appmetrica.metrica();
                if (c10014e2.f19781e.f27587e == null) {
                    c10014e2.billing(c10014e2.f19779e);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        switch (this.ad) {
            case 0:
                return this.vip.vip();
            default:
                return this.vip.vip();
        }
    }
}
