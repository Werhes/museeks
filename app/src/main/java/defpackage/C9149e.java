package defpackage;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۨٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9149e {
    public static final C18482e billing = new C18482e("SessionTransController", null);
    public final C12487e ad;
    public boolean appmetrica;
    public C14618e purchase;
    public final Set vip = DesugarCollections.synchronizedSet(new HashSet());
    public final HandlerC9134e metrica = new HandlerC9134e(Looper.getMainLooper(), 6);
    public final RunnableC17664e license = new RunnableC17664e(this, 1);

    public C9149e(C12487e c12487e) {
        this.ad = c12487e;
    }

    public final void ad() {
        HandlerC9134e handlerC9134e = this.metrica;
        AbstractC9528e.startapp(handlerC9134e);
        RunnableC17664e runnableC17664e = this.license;
        AbstractC9528e.startapp(runnableC17664e);
        handlerC9134e.removeCallbacks(runnableC17664e);
    }
}
