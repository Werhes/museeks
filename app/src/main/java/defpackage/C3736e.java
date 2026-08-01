package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3736e extends AbstractC0815e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC18535e f8318e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C16685e f8319e;

    public C3736e(DialogInterfaceOnCancelListenerC18535e dialogInterfaceOnCancelListenerC18535e, C16685e c16685e) {
        this.f8318e = dialogInterfaceOnCancelListenerC18535e;
        this.f8319e = c16685e;
    }

    @Override // defpackage.AbstractC0815e
    public final View amazon(int i) {
        C16685e c16685e = this.f8319e;
        if (c16685e.loadAd()) {
            return c16685e.amazon(i);
        }
        Dialog dialog = this.f8318e.f36330e;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.AbstractC0815e
    public final boolean loadAd() {
        return this.f8319e.loadAd() || this.f8318e.f36336e;
    }
}
