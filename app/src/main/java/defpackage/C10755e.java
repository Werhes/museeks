package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10755e {
    public int ad;
    public int appmetrica;
    public int license;
    public int metrica;
    public long vip;
    public final int[] purchase = new int[255];
    public final C1292e billing = new C1292e(255);

    public final boolean ad(InterfaceC2283e interfaceC2283e, boolean z) {
        boolean z2;
        boolean z3;
        this.ad = 0;
        this.vip = 0L;
        this.metrica = 0;
        this.license = 0;
        this.appmetrica = 0;
        C1292e c1292e = this.billing;
        c1292e.m564extends(27);
        try {
            z2 = interfaceC2283e.billing(c1292e.ad, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && c1292e.subs() == 1332176723) {
            if (c1292e.ads() == 0) {
                this.ad = c1292e.ads();
                this.vip = c1292e.Signature();
                c1292e.subscription();
                c1292e.subscription();
                c1292e.subscription();
                int ads = c1292e.ads();
                this.metrica = ads;
                this.license = ads + 27;
                c1292e.m564extends(ads);
                try {
                    z3 = interfaceC2283e.billing(c1292e.ad, 0, this.metrica, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.metrica; i++) {
                        int ads2 = c1292e.ads();
                        this.purchase[i] = ads2;
                        this.appmetrica += ads2;
                    }
                    return true;
                }
            } else if (!z) {
                throw C15125e.metrica("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean vip(InterfaceC2283e interfaceC2283e, long j) {
        boolean z;
        AbstractC2301e.billing(interfaceC2283e.getPosition() == interfaceC2283e.yandex());
        C1292e c1292e = this.billing;
        c1292e.m564extends(4);
        while (true) {
            if (j != -1 && interfaceC2283e.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = interfaceC2283e.billing(c1292e.ad, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            c1292e.m571try(0);
            if (c1292e.subs() == 1332176723) {
                interfaceC2283e.smaato();
                return true;
            }
            interfaceC2283e.amazon(1);
        }
        do {
            if (j != -1 && interfaceC2283e.getPosition() >= j) {
                break;
            }
        } while (interfaceC2283e.adcel(1) != -1);
        return false;
    }
}
