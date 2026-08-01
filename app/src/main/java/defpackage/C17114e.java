package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٛؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17114e {
    public static final C17114e ad = new Object();

    public final void ad(View view, InterfaceC15690e interfaceC15690e) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC15690e instanceof C14298e ? PointerIcon.getSystemIcon(context, ((C14298e) interfaceC15690e).vip) : PointerIcon.getSystemIcon(context, 1000);
        if (AbstractC7890e.billing(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
