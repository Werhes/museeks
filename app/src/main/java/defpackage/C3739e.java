package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3739e extends AbstractC5604e implements InterfaceC18435e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int f8325e = View.generateViewId();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Catalog2Block f8326e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC8370e f8327e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f8328e = AbstractC9743e.vip();

    public C3739e(InterfaceC8370e interfaceC8370e, Catalog2Block catalog2Block) {
        this.f8327e = interfaceC8370e;
        this.f8326e = catalog2Block;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        C11204e c11204e = (C11204e) interfaceC10283e;
        ComposeView composeView = c11204e.f22468e;
        composeView.setViewCompositionStrategy(C6114e.f12843e);
        composeView.setContent(new C2892e(2075101845, true, new C8543e((AudioFollowingsUpdateInfo) obj, this, c11204e, 0)));
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f8328e.f29359e;
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return f8325e;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C11204e.ad(layoutInflater, viewGroup);
    }
}
