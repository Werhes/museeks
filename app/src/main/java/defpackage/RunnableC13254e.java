package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC13254e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C12916e f26296e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f26297e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f26298e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f26299e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C9770e f26300e;

    public RunnableC13254e(C12916e c12916e, C9770e c9770e, int i, String str, int i2, Bundle bundle) {
        this.f26296e = c12916e;
        this.f26300e = c9770e;
        this.f26298e = i;
        this.f26297e = str;
        this.f26299e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C17684e c17684e;
        C9770e c9770e = this.f26300e;
        IBinder binder = ((Messenger) c9770e.f19315e).getBinder();
        C12916e c12916e = this.f26296e;
        ((ServiceC13230e) c12916e.f25784e).f26248e.remove(binder);
        ServiceC13230e serviceC13230e = (ServiceC13230e) c12916e.f25784e;
        Iterator it = serviceC13230e.f26255e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C17684e c17684e2 = (C17684e) it.next();
            if (c17684e2.metrica == this.f26298e) {
                c17684e = (TextUtils.isEmpty(this.f26297e) || this.f26299e <= 0) ? new C17684e(serviceC13230e, c17684e2.ad, c17684e2.vip, c17684e2.metrica, c9770e) : null;
                it.remove();
            }
        }
        if (c17684e == null) {
            c17684e = new C17684e(serviceC13230e, this.f26297e, this.f26299e, this.f26298e, c9770e);
        }
        serviceC13230e.f26248e.put(binder, c17684e);
        try {
            binder.linkToDeath(c17684e, 0);
        } catch (RemoteException unused) {
            AbstractC2803e.smaato("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
