package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5692e extends AbstractC5604e implements InterfaceC18435e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final int f12084e = View.generateViewId();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f12085e = AbstractC9743e.vip();

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        ComposeView composeView = ((C11204e) interfaceC10283e).f22468e;
        composeView.setViewCompositionStrategy(C6114e.f12843e);
        composeView.setContent(new C2892e(-706473264, true, new C1309e((CustomCatalogBlockItem) obj, 2)));
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f12085e.f29359e;
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return f12084e;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C11204e.ad(layoutInflater, viewGroup);
    }
}
