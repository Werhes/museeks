package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8785e extends AbstractViewOnTouchListenerC5850e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ int f17686e = 0;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ View f17687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8785e(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f17687e = actionMenuItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8785e(C2931e c2931e, C2931e c2931e2) {
        super(c2931e2);
        this.f17687e = c2931e;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC5850e
    public boolean license() {
        switch (this.f17686e) {
            case 1:
                C13631e c13631e = ((C2931e) this.f17687e).f6919e;
                if (c13631e.f27036e != null) {
                    return false;
                }
                c13631e.purchase();
                return true;
            default:
                return super.license();
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC5850e
    public final boolean metrica() {
        InterfaceC13836e vip;
        switch (this.f17686e) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f17687e;
                InterfaceC2669e interfaceC2669e = actionMenuItemView.f70e;
                return interfaceC2669e != null && interfaceC2669e.ad(actionMenuItemView.f69e) && (vip = vip()) != null && vip.ad();
            default:
                ((C2931e) this.f17687e).f6919e.advert();
                return true;
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC5850e
    public final InterfaceC13836e vip() {
        C9337e c9337e;
        switch (this.f17686e) {
            case 0:
                AbstractC3980e abstractC3980e = ((ActionMenuItemView) this.f17687e).f61e;
                if (abstractC3980e == null || (c9337e = ((C13816e) abstractC3980e).ad.f27053e) == null) {
                    return null;
                }
                return c9337e.ad();
            default:
                C9337e c9337e2 = ((C2931e) this.f17687e).f6919e.f27046e;
                if (c9337e2 == null) {
                    return null;
                }
                return c9337e2.ad();
        }
    }
}
