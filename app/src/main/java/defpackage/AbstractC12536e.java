package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12536e {
    public static final C5015e ad = new C5015e(new C0568e(20));

    public static InterfaceC15119e ad(C13770e c13770e) {
        InterfaceC15119e interfaceC15119e = (InterfaceC15119e) c13770e.adcel(ad);
        Object obj = null;
        if (interfaceC15119e == null) {
            c13770e.m3676strictfp(1208426157);
            View view = (View) c13770e.adcel(AbstractC2676e.purchase);
            while (true) {
                if (view == null) {
                    interfaceC15119e = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                InterfaceC15119e interfaceC15119e2 = tag instanceof InterfaceC15119e ? (InterfaceC15119e) tag : null;
                if (interfaceC15119e2 != null) {
                    interfaceC15119e = interfaceC15119e2;
                    break;
                }
                Object appmetrica = AbstractC9110e.appmetrica(view);
                view = appmetrica instanceof View ? (View) appmetrica : null;
            }
        } else {
            c13770e.m3676strictfp(1208423708);
        }
        c13770e.Signature(false);
        if (interfaceC15119e != null) {
            c13770e.m3676strictfp(1208423789);
            c13770e.Signature(false);
            return interfaceC15119e;
        }
        c13770e.m3676strictfp(1208428160);
        Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof InterfaceC15119e) {
                obj = context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        InterfaceC15119e interfaceC15119e3 = (InterfaceC15119e) obj;
        c13770e.Signature(false);
        return interfaceC15119e3;
    }
}
