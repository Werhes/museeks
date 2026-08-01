package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۘٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18328e extends AbstractC17112e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final int f35991e = View.generateViewId();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C2892e f35992e;

    public C18328e(C2892e c2892e) {
        this.f35992e = c2892e;
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        ComposeView composeView = ((C11204e) interfaceC10283e).f22468e;
        composeView.setViewCompositionStrategy(C6114e.f12843e);
        composeView.setContent(new C2892e(-772507298, true, new C7324e(this, 0)));
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C11204e.ad(layoutInflater, viewGroup);
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return f35991e;
    }
}
