package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13736e<S> extends AbstractC11238e {

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public int f27224e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public C8649e f27225e;

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void inmobi(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f27224e);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27225e);
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final View pro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(startapp(), this.f27224e));
        throw null;
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void remoteconfig(Bundle bundle) {
        super.remoteconfig(bundle);
        if (bundle == null) {
            bundle = this.f35111e;
        }
        this.f27224e = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f27225e = (C8649e) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
