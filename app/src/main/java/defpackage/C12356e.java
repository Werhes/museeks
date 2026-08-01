package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12356e implements InterfaceC2994e {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC18535e ad;

    public C12356e(DialogInterfaceOnCancelListenerC18535e dialogInterfaceOnCancelListenerC18535e) {
        this.ad = dialogInterfaceOnCancelListenerC18535e;
    }

    @Override // defpackage.InterfaceC2994e
    public final void ad(Object obj) {
        if (((InterfaceC16400e) obj) != null) {
            DialogInterfaceOnCancelListenerC18535e dialogInterfaceOnCancelListenerC18535e = this.ad;
            if (dialogInterfaceOnCancelListenerC18535e.f36339e) {
                View crashlytics = dialogInterfaceOnCancelListenerC18535e.crashlytics();
                if (crashlytics.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC18535e.f36330e != null) {
                    if (AbstractC15958e.m4045native(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC18535e.f36330e);
                    }
                    dialogInterfaceOnCancelListenerC18535e.f36330e.setContentView(crashlytics);
                }
            }
        }
    }
}
