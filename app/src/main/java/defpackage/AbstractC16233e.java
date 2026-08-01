package defpackage;

import android.view.View;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16233e {
    public static final C5015e ad = new C5015e(new C0568e(19));

    public static InterfaceC12760e ad(C13770e c13770e) {
        InterfaceC12760e interfaceC12760e;
        InterfaceC12760e interfaceC12760e2 = (InterfaceC12760e) c13770e.adcel(ad);
        if (interfaceC12760e2 != null) {
            c13770e.m3676strictfp(950834231);
            c13770e.Signature(false);
            return interfaceC12760e2;
        }
        c13770e.m3676strictfp(950836184);
        View view = (View) c13770e.adcel(AbstractC2676e.purchase);
        while (true) {
            interfaceC12760e = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            InterfaceC12760e interfaceC12760e3 = tag instanceof InterfaceC12760e ? (InterfaceC12760e) tag : null;
            if (interfaceC12760e3 != null) {
                interfaceC12760e = interfaceC12760e3;
                break;
            }
            Object appmetrica = AbstractC9110e.appmetrica(view);
            view = appmetrica instanceof View ? (View) appmetrica : null;
        }
        c13770e.Signature(false);
        return interfaceC12760e;
    }
}
