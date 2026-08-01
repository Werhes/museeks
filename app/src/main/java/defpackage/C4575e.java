package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4575e extends AbstractC13359e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f9863e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9864e;

    public /* synthetic */ C4575e(int i, Object obj) {
        this.f9864e = i;
        this.f9863e = obj;
    }

    @Override // defpackage.InterfaceC18180e
    public final void metrica() {
        int i = this.f9864e;
        Object obj = this.f9863e;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = ((RunnableC17898e) obj).f35142e;
                layoutInflaterFactory2C8158e.f16589e.setAlpha(1.0f);
                layoutInflaterFactory2C8158e.f16588e.license(null);
                layoutInflaterFactory2C8158e.f16588e = null;
                return;
            case 1:
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e2 = (LayoutInflaterFactory2C8158e) obj;
                layoutInflaterFactory2C8158e2.f16589e.setAlpha(1.0f);
                layoutInflaterFactory2C8158e2.f16588e.license(null);
                layoutInflaterFactory2C8158e2.f16588e = null;
                return;
            default:
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e3 = (LayoutInflaterFactory2C8158e) ((C18540e) obj).f36382e;
                layoutInflaterFactory2C8158e3.f16589e.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C8158e3.f16599e;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C8158e3.f16589e.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C8158e3.f16589e.getParent();
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C8158e3.f16589e.appmetrica();
                layoutInflaterFactory2C8158e3.f16588e.license(null);
                layoutInflaterFactory2C8158e3.f16588e = null;
                ViewGroup viewGroup = layoutInflaterFactory2C8158e3.f16585e;
                WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                viewGroup.requestApplyInsets();
                return;
        }
    }

    @Override // defpackage.AbstractC13359e, defpackage.InterfaceC18180e
    public void vip() {
        int i = this.f9864e;
        Object obj = this.f9863e;
        switch (i) {
            case 0:
                ((RunnableC17898e) obj).f35142e.f16589e.setVisibility(0);
                return;
            case 1:
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) obj;
                layoutInflaterFactory2C8158e.f16589e.setVisibility(0);
                if (layoutInflaterFactory2C8158e.f16589e.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C8158e.f16589e.getParent();
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    view.requestApplyInsets();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
