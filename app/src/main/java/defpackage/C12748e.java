package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12748e extends AbstractC12811e {
    @Override // defpackage.InterfaceC6459e
    public final /* bridge */ /* synthetic */ Object admob() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.AbstractC12811e
    /* renamed from: eؒٚۨ */
    public final void mo462e(InterfaceC15690e interfaceC15690e) {
        InterfaceC15058e interfaceC15058e = (InterfaceC15058e) AbstractC10432e.vip(this, AbstractC11473e.tapsense);
        if (interfaceC15058e != null) {
            C2313e c2313e = (C2313e) interfaceC15058e;
            if (interfaceC15690e == null) {
                InterfaceC15690e.ad.getClass();
                interfaceC15690e = AbstractC16653e.ad;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                C17114e.ad.ad(c2313e.vip, interfaceC15690e);
            }
        }
    }

    @Override // defpackage.AbstractC12811e
    /* renamed from: eٖٔۧ */
    public final boolean mo463e(int i) {
        return (i == 3 || i == 4) ? false : true;
    }
}
