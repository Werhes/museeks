package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٞؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16382e {
    public final C14679e ad;
    public final C1253e vip;

    public C16382e(C14679e c14679e, C1253e c1253e, InterfaceC8850e interfaceC8850e, C18447e c18447e) {
        this.ad = c14679e;
        this.vip = c1253e;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.4.");
        c14679e.ad();
        Context applicationContext = c14679e.ad.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(c18447e);
            AbstractC5336e.purchase(AbstractC9743e.ad(interfaceC8850e), null, 0, new C6626e(this, c18447e, null, 12), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
