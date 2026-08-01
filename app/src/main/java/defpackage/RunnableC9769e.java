package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9769e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10640e f19312e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19313e;

    public /* synthetic */ RunnableC9769e(C10640e c10640e, int i) {
        this.f19313e = i;
        this.f19312e = c10640e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19313e) {
            case 0:
                this.f19312e.m2848e();
                return;
            case 1:
                C10640e c10640e = this.f19312e;
                C6936e c6936e = (C6936e) c10640e.f36443e;
                InterfaceC8227e interfaceC8227e = c10640e.f20961e;
                if (interfaceC8227e == null) {
                    C13879e c13879e = c6936e.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.ad("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    interfaceC8227e.mo1651e(c10640e.m2858e(false));
                    c10640e.m2853e();
                    return;
                } catch (RemoteException e) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.vip(e, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                C10640e c10640e2 = this.f19312e;
                C6936e c6936e2 = (C6936e) c10640e2.f36443e;
                InterfaceC8227e interfaceC8227e2 = c10640e2.f20961e;
                if (interfaceC8227e2 == null) {
                    C13879e c13879e3 = c6936e2.f14227e;
                    C6936e.yandex(c13879e3);
                    c13879e3.f27502e.ad("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    interfaceC8227e2.mo1668volatile(c10640e2.m2858e(false));
                    c10640e2.m2853e();
                    return;
                } catch (RemoteException e2) {
                    C13879e c13879e4 = c6936e2.f14227e;
                    C6936e.yandex(c13879e4);
                    c13879e4.f27502e.vip(e2, "Failed to send storage consent settings to the service");
                    return;
                }
        }
    }
}
