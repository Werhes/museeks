package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۢۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16589e implements InterfaceC10283e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final RecyclerView f32546e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final RecyclerView f32547e;

    public C16589e(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f32547e = recyclerView;
        this.f32546e = recyclerView2;
    }

    public static C16589e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c2_slider, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) inflate;
        return new C16589e(recyclerView, recyclerView);
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f32547e;
    }
}
