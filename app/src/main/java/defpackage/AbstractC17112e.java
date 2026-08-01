package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17112e extends startapp {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public LayoutInflater f33472e;

    public abstract void ads(int i, InterfaceC10283e interfaceC10283e);

    public abstract InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.startapp
    public final void remoteconfig(loadAd loadad, int i) {
        ads(i, ((C16159e) loadad).signatures);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final loadAd signatures(ViewGroup viewGroup, int i) {
        if (this.f33472e == null) {
            this.f33472e = LayoutInflater.from(viewGroup.getContext());
        }
        LayoutInflater layoutInflater = this.f33472e;
        if (layoutInflater == null) {
            layoutInflater = null;
        }
        return new C16159e(premium(layoutInflater, viewGroup));
    }

    @Override // androidx.recyclerview.widget.startapp
    public int startapp(int i) {
        return subs();
    }

    public abstract int subs();

    @Override // androidx.recyclerview.widget.startapp
    public final long yandex(int i) {
        return -1L;
    }
}
