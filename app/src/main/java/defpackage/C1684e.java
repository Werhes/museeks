package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1684e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f4614e = 2;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f4615e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC5604e f4616e;

    public C1684e(AbstractC5604e abstractC5604e) {
        this.f4616e = abstractC5604e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f4615e = VKXApplication.Companion.ad(16.0f);
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        RecyclerView recyclerView = ((C16589e) interfaceC10283e).f32546e;
        recyclerView.getContext();
        AbstractC5604e abstractC5604e = this.f4616e;
        int billing = abstractC5604e.billing();
        if (billing != 1 && billing != 2) {
            billing = this.f4614e;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(billing, 1));
        recyclerView.setAdapter(abstractC5604e);
        if (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(new C5382e(this.f4615e));
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16589e.ad(layoutInflater, viewGroup);
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return this.f4616e.crashlytics() + R.id.slider;
    }
}
