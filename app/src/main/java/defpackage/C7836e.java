package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7836e extends AbstractC5604e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final int f15856e = View.generateViewId();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C2892e f15857e;

    public C7836e(C2892e c2892e) {
        this.f15857e = c2892e;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        ComposeView composeView = ((C11204e) interfaceC10283e).f22468e;
        composeView.setViewCompositionStrategy(C6114e.f12843e);
        composeView.setContent(new C2892e(840351910, true, new C9638e(this, (InterfaceC15377e) obj, 0)));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return f15856e;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C11204e.ad(layoutInflater, viewGroup);
    }
}
