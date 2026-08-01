package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11001e extends AbstractC5604e implements InterfaceC18435e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final int f21789e = View.generateViewId();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f21790e = AbstractC9743e.vip();

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
        C11204e c11204e = (C11204e) interfaceC10283e;
        ComposeView composeView = c11204e.f22468e;
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        composeView.setLayoutParams(layoutParams);
        composeView.setViewCompositionStrategy(C6114e.f12843e);
        composeView.setContent(new C2892e(-1485928958, true, new C10176e(audioPlaylist, this, c11204e, 0)));
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f21790e.f29359e;
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return f21789e;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C11204e.ad(layoutInflater, viewGroup);
    }
}
