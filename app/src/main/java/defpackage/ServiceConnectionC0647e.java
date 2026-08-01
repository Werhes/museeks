package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0647e implements ServiceConnection {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC17880e f2902e;

    public ServiceConnectionC0647e(AbstractC17880e abstractC17880e) {
        this.f2902e = abstractC17880e;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC17880e abstractC17880e = this.f2902e;
        abstractC17880e.metrica = true;
        InterfaceC16671e interfaceC16671e = abstractC17880e.vip;
        if (interfaceC16671e != null) {
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            AbstractC6232e.billing(interfaceC16671e, vKXApplication);
        }
        abstractC17880e.vip = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2902e.metrica = false;
    }
}
