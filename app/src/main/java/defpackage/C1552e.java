package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.startapp;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1552e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f4428e = R.layout.v7_playlist_header_buttonbar;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final startapp f4429e;

    public C1552e(startapp startappVar) {
        this.f4429e = startappVar;
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        RecyclerView recyclerView = ((C4337e) interfaceC10283e).f9470e;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setAdapter(this.f4429e);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c2_slider_freeform, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) AbstractC7779e.vip(inflate, R.id.recycler_view);
        if (recyclerView != null) {
            return new C4337e((LinearLayout) inflate, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.recycler_view)));
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return this.f4428e;
    }
}
