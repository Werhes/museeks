package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13087e implements InterfaceC12765e, InterfaceC6395e, InterfaceC14599e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Object f26023e;

    public /* synthetic */ C13087e(Object obj) {
        this.f26023e = obj;
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        ((ScheduledFuture) this.f26023e).cancel(false);
    }

    @Override // defpackage.InterfaceC14599e
    public void metrica(InterfaceC8668e interfaceC8668e) {
        C17300e c17300e = (C17300e) this.f26023e;
        try {
            InterfaceC12385e metrica = interfaceC8668e.metrica();
            if (metrica != null) {
                c17300e.metrica.m3338case(metrica);
            }
        } catch (IllegalStateException unused) {
            if (AbstractC9464e.amazon()) {
                Log.e("CXCP", "Failed to acquire latest image");
            }
        }
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        C11106e c11106e = (C11106e) this.f26023e;
        Iterator it = ((Iterable) ((C2417e) ((InterfaceC8685e) c11106e.f22007e)).purchase(new C11180e(5))).iterator();
        while (it.hasNext()) {
            ((C12894e) c11106e.f22009e).premium((C7869e) it.next(), 1, false);
        }
        return null;
    }
}
