package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۨۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16685e extends AbstractC0815e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC17875e f32747e;

    public C16685e(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        this.f32747e = abstractComponentCallbacksC17875e;
    }

    @Override // defpackage.AbstractC0815e
    public final View amazon(int i) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.f32747e;
        View view = abstractComponentCallbacksC17875e.f35098e;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC17875e + " does not have a view");
    }

    @Override // defpackage.AbstractC0815e
    public final boolean loadAd() {
        return this.f32747e.f35098e != null;
    }
}
