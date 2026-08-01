package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11204e implements InterfaceC10283e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ComposeView f22468e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ComposeView f22469e;

    public C11204e(ComposeView composeView, ComposeView composeView2) {
        this.f22469e = composeView;
        this.f22468e = composeView2;
    }

    public static C11204e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_compose, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) inflate;
        return new C11204e(composeView, composeView);
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f22469e;
    }
}
