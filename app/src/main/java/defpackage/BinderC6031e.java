package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC6031e extends Binder {
    public final C6594e metrica;

    public BinderC6031e(C6594e c6594e) {
        this.metrica = c6594e;
    }

    public final void ad(C17296e c17296e) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c17296e.ad;
        AbstractServiceC13175e abstractServiceC13175e = (AbstractServiceC13175e) this.metrica.f13613e;
        C8988e c8988e = new C8988e();
        abstractServiceC13175e.f26166e.execute(new RunnableC4904e(21, abstractServiceC13175e, intent, c8988e));
        c8988e.ad.vip(new ExecutorC14279e(2), new C2007e(29, c17296e));
    }
}
