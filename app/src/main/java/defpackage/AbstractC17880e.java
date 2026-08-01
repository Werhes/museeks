package defpackage;

import android.content.Intent;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17880e {
    public final Class ad;
    public final ServiceConnectionC0647e license = new ServiceConnectionC0647e(this);
    public boolean metrica;
    public InterfaceC16671e vip;

    public AbstractC17880e(Class cls) {
        this.ad = cls;
    }

    public final void ad(InterfaceC16671e interfaceC16671e, boolean z) {
        C5363e c5363e = C0353e.startapp;
        if (!AbstractC15792e.billing().vip.tapsense()) {
            C18046e c18046e = VKXApplication.f36532e;
            if (c18046e == null) {
                c18046e = null;
            }
            if (!((Boolean) ((C14688e) c18046e.purchase.yandex).f29092e.getValue()).booleanValue()) {
                return;
            }
        }
        if (this.metrica || !z) {
            VKXApplication vKXApplication = VKXApplication.f36528e;
            AbstractC6232e.billing(interfaceC16671e, vKXApplication != null ? vKXApplication : null);
            return;
        }
        this.vip = interfaceC16671e;
        try {
            VKXApplication vKXApplication2 = VKXApplication.f36528e;
            if (vKXApplication2 == null) {
                vKXApplication2 = null;
            }
            Intent intent = new Intent(vKXApplication2, (Class<?>) this.ad);
            VKXApplication vKXApplication3 = VKXApplication.f36528e;
            if (vKXApplication3 == null) {
                vKXApplication3 = null;
            }
            vKXApplication3.getApplicationContext().startService(intent);
            VKXApplication vKXApplication4 = VKXApplication.f36528e;
            (vKXApplication4 != null ? vKXApplication4 : null).getApplicationContext().bindService(intent, this.license, 1);
        } catch (Throwable unused) {
        }
    }
}
