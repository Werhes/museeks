package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5160e extends AbstractC17112e {
    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        ((C3926e) interfaceC10283e).f8770e.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_separator, viewGroup, false);
        if (inflate != null) {
            return new C3926e(inflate);
        }
        throw new NullPointerException("rootView");
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.c3_separator;
    }
}
