package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.adcel;
import defpackage.C17281e;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12952e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f25809e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f25810e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC5604e f25811e;

    public C12952e(int i, AbstractC5604e abstractC5604e) {
        this.f25809e = i;
        this.f25811e = abstractC5604e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f25810e = VKXApplication.Companion.ad(16.0f);
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        adcel linearLayoutManager;
        C9737e c9737e;
        RecyclerView recyclerView = ((C16589e) interfaceC10283e).f32546e;
        int i2 = this.f25809e;
        int m2467class = AbstractC8703e.m2467class(i2);
        AbstractC5604e abstractC5604e = this.f25811e;
        if (m2467class == 0) {
            recyclerView.getContext();
            linearLayoutManager = new LinearLayoutManager(0);
        } else if (m2467class == 1) {
            recyclerView.getContext();
            int billing = abstractC5604e.billing();
            if (billing != 1 && billing != 2) {
                billing = 3;
            }
            linearLayoutManager = new GridLayoutManager(billing, 0);
        } else {
            if (m2467class != 2) {
                throw new C14803e(10);
            }
            recyclerView.getContext();
            linearLayoutManager = new LinearLayoutManager() { // from class: bruhcollective.itaysonlab.libcatalog.blocks.adapters.SliderAdapter$SliderLayoutManager
                public final C17281e firebase = new C17281e(0);

                @Override // androidx.recyclerview.widget.adcel
                /* renamed from: final */
                public final void mo159final(RecyclerView recyclerView2) {
                    this.firebase.ad(recyclerView2);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.adcel
                /* renamed from: super */
                public final void mo110super(RecyclerView recyclerView2) {
                    this.firebase.ad(null);
                }
            };
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(abstractC5604e);
        if (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        if (AbstractC3073e.ad[AbstractC8703e.m2467class(i2)] == 1) {
            c9737e = new C9737e(this.f25810e, !(abstractC5604e instanceof C12678e));
        } else {
            c9737e = null;
        }
        if (c9737e != null) {
            recyclerView.addItemDecoration(c9737e);
        }
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
        return this.f25811e.crashlytics() + R.id.slider;
    }
}
