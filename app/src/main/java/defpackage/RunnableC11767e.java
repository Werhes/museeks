package defpackage;

import android.os.RemoteException;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC11767e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C10640e f23642e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8019e f23643e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23644e;

    public RunnableC11767e(C10640e c10640e, C8019e c8019e) {
        this.f23644e = 4;
        this.f23643e = c8019e;
        Objects.requireNonNull(c10640e);
        this.f23642e = c10640e;
    }

    public /* synthetic */ RunnableC11767e(C10640e c10640e, C8019e c8019e, int i) {
        this.f23644e = i;
        this.f23643e = c8019e;
        this.f23642e = c10640e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23644e) {
            case 0:
                C10640e c10640e = this.f23642e;
                InterfaceC8227e interfaceC8227e = c10640e.f20961e;
                C6936e c6936e = (C6936e) c10640e.f36443e;
                if (interfaceC8227e == null) {
                    C13879e c13879e = c6936e.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.ad("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        interfaceC8227e.mo1657e(this.f23643e);
                    } catch (RemoteException e) {
                        C13879e c13879e2 = c6936e.f14227e;
                        C6936e.yandex(c13879e2);
                        c13879e2.f27502e.vip(e, "Failed to reset data on the service: remote exception");
                    }
                    c10640e.m2853e();
                    return;
                }
            case 1:
                C10640e c10640e2 = this.f23642e;
                InterfaceC8227e interfaceC8227e2 = c10640e2.f20961e;
                C6936e c6936e2 = (C6936e) c10640e2.f36443e;
                if (interfaceC8227e2 == null) {
                    C13879e c13879e3 = c6936e2.f14227e;
                    C6936e.yandex(c13879e3);
                    c13879e3.f27502e.ad("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    C8019e c8019e = this.f23643e;
                    C10476e c10476e = c6936e2.f14221e;
                    C6973e c6973e = AbstractC17254e.f33832e;
                    if (c10476e.m2822e(null, c6973e)) {
                        c10640e2.m2857e(interfaceC8227e2, null, c8019e);
                    }
                    interfaceC8227e2.mo1661final(c8019e);
                    c6936e2.adcel().m3532e();
                    c6936e2.f14221e.m2822e(null, c6973e);
                    c10640e2.m2857e(interfaceC8227e2, null, c8019e);
                    c10640e2.m2853e();
                    return;
                } catch (RemoteException e2) {
                    C13879e c13879e4 = c6936e2.f14227e;
                    C6936e.yandex(c13879e4);
                    c13879e4.f27502e.vip(e2, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                C10640e c10640e3 = this.f23642e;
                InterfaceC8227e interfaceC8227e3 = c10640e3.f20961e;
                C6936e c6936e3 = (C6936e) c10640e3.f36443e;
                if (interfaceC8227e3 == null) {
                    C13879e c13879e5 = c6936e3.f14227e;
                    C6936e.yandex(c13879e5);
                    c13879e5.f27495e.ad("Failed to send app backgrounded");
                    return;
                }
                try {
                    interfaceC8227e3.mo1650e(this.f23643e);
                    c10640e3.m2853e();
                    return;
                } catch (RemoteException e3) {
                    C13879e c13879e6 = c6936e3.f14227e;
                    C6936e.yandex(c13879e6);
                    c13879e6.f27502e.vip(e3, "Failed to send app backgrounded to the service");
                    return;
                }
            case 3:
                C10640e c10640e4 = this.f23642e;
                InterfaceC8227e interfaceC8227e4 = c10640e4.f20961e;
                C6936e c6936e4 = (C6936e) c10640e4.f36443e;
                if (interfaceC8227e4 == null) {
                    C13879e c13879e7 = c6936e4.f14227e;
                    C6936e.yandex(c13879e7);
                    c13879e7.f27502e.ad("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    interfaceC8227e4.mo1652e(this.f23643e);
                    c10640e4.m2853e();
                    return;
                } catch (RemoteException e4) {
                    C13879e c13879e8 = c6936e4.f14227e;
                    C6936e.yandex(c13879e8);
                    c13879e8.f27502e.vip(e4, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                C10640e c10640e5 = this.f23642e;
                InterfaceC8227e interfaceC8227e5 = c10640e5.f20961e;
                C6936e c6936e5 = (C6936e) c10640e5.f36443e;
                if (interfaceC8227e5 == null) {
                    C13879e c13879e9 = c6936e5.f14227e;
                    C6936e.yandex(c13879e9);
                    c13879e9.f27502e.ad("Failed to send consent settings to service");
                    return;
                }
                try {
                    interfaceC8227e5.mo1653e(this.f23643e);
                    c10640e5.m2853e();
                    return;
                } catch (RemoteException e5) {
                    C13879e c13879e10 = c6936e5.f14227e;
                    C6936e.yandex(c13879e10);
                    c13879e10.f27502e.vip(e5, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}
