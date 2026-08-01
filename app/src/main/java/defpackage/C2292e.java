package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2292e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final int f5795e = View.generateViewId();

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        C3912e c3912e = (C3912e) interfaceC10283e;
        TextView textView = c3912e.f8737e;
        SharedPreferences sharedPreferences = AbstractC6181e.ad;
        EnumC7437e enumC7437e = EnumC7437e.f15212e;
        textView.setVisibility(AbstractC6181e.ad(enumC7437e) ? 8 : 0);
        c3912e.f8736e.setText(!AbstractC6181e.ad(enumC7437e) ? "Unknown block" : BuildConfig.FLAVOR);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C3912e.ad(layoutInflater, viewGroup);
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return f5795e;
    }
}
