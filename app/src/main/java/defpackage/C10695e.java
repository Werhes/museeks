package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۨٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10695e extends AbstractC5781e {
    @Override // defpackage.AbstractC5781e
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC10283e interfaceC10283e) {
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_load_placeholder, viewGroup, false);
        if (inflate != null) {
            return new C9871e((ProgressBar) inflate);
        }
        throw new NullPointerException("rootView");
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.c3_load_placeholder;
    }
}
