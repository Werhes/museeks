package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC14881e extends ResultReceiver {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f29474e;

    public ResultReceiverC14881e(C8603e c8603e) {
        super(null);
        this.f29474e = new WeakReference(c8603e);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [eؕۘٝ, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InterfaceC16274e interfaceC16274e;
        C8603e c8603e = (C8603e) this.f29474e.get();
        if (c8603e == null || bundle == null) {
            return;
        }
        synchronized (c8603e.vip) {
            C13765e c13765e = c8603e.appmetrica;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = BinderC0188e.license;
            if (binder == null) {
                interfaceC16274e = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC16274e)) {
                    ?? obj = new Object();
                    obj.metrica = binder;
                    interfaceC16274e = obj;
                } else {
                    interfaceC16274e = (InterfaceC16274e) queryLocalInterface;
                }
            }
            c13765e.vip(interfaceC16274e);
            c8603e.appmetrica.metrica(AbstractC12534e.metrica(bundle));
            c8603e.vip();
        }
    }
}
