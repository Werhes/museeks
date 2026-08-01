package defpackage;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٝؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12609e implements OnBackInvokedCallback {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C12609e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public final void onBackInvoked() {
        switch (this.ad) {
            case 0:
                Function0 function0 = (Function0) this.vip;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 1:
                ((LayoutInflaterFactory2C8158e) this.vip).m2381interface();
                return;
            case 2:
                ((AbstractC15931e) this.vip).ad();
                return;
            default:
                ((Runnable) this.vip).run();
                return;
        }
    }
}
