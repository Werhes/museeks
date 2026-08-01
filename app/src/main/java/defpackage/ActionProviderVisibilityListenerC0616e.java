package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0616e implements ActionProvider.VisibilityListener {
    public C16089e ad;
    public final ActionProvider vip;

    public ActionProviderVisibilityListenerC0616e(MenuItemC4494e menuItemC4494e, ActionProvider actionProvider) {
        this.vip = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C16089e c16089e = this.ad;
        if (c16089e != null) {
            MenuC8939e menuC8939e = ((C9995e) c16089e.f31681e).f19728e;
            menuC8939e.f17937e = true;
            menuC8939e.Signature(true);
        }
    }
}
