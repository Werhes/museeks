package defpackage;

import android.os.Looper;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8881e implements InterfaceC1360e, InterfaceC15046e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C5298e f17839e;

    public /* synthetic */ C8881e(C5298e c5298e) {
        this.f17839e = c5298e;
    }

    @Override // defpackage.InterfaceC15046e
    public void appmetrica(InterfaceC10645e interfaceC10645e, int i) {
        interfaceC10645e.startapp(i, this.f17839e);
    }

    @Override // defpackage.InterfaceC1360e
    public void vip(C4275e c4275e) {
        boolean z;
        boolean z2;
        C12318e c12318e = c4275e.ad;
        if (c4275e.mo1580e()) {
            C5298e c5298e = c4275e.isPro;
            C5298e c5298e2 = this.f17839e;
            if (Objects.equals(c5298e, c5298e2)) {
                return;
            }
            c4275e.isPro = c5298e2;
            C5298e c5298e3 = c4275e.applovin;
            C5298e metrica = c4275e.metrica(c4275e.inmobi, c5298e2);
            c4275e.applovin = metrica;
            if (metrica.equals(c5298e3)) {
                z = false;
                z2 = false;
            } else {
                C1410e c1410e = c4275e.signatures;
                C1410e c1410e2 = c4275e.tapsense;
                C1410e m1517e = C4275e.m1517e(c4275e.pro, c4275e.remoteconfig, c4275e.isVip, c4275e.applovin, c4275e.f9371this);
                c4275e.signatures = m1517e;
                c4275e.tapsense = C4275e.m1518e(m1517e, c4275e.remoteconfig, c4275e.f9371this, c4275e.isVip, c4275e.applovin, c4275e.tapsense());
                z = !c4275e.signatures.equals(c1410e);
                z2 = !c4275e.tapsense.equals(c1410e2);
                c4275e.startapp.billing(13, new C6225e(c4275e, 1));
            }
            if (z2) {
                c12318e.getClass();
                AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                c12318e.f24703e.getClass();
            }
            if (z) {
                c12318e.getClass();
                AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                c12318e.f24703e.applovin();
            }
        }
    }
}
