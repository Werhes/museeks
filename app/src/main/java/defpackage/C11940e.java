package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11940e extends DialogInterfaceOnCancelListenerC18535e {

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public C0056e f23921e;

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public final boolean f23922e = false;

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public DialogC11829e f23923e;

    public C11940e() {
        this.f36341e = true;
        Dialog dialog = this.f36330e;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e
    /* renamed from: goto */
    public final Dialog mo2472goto() {
        if (this.f23922e) {
            DialogC6738e dialogC6738e = new DialogC6738e(startapp());
            this.f23923e = dialogC6738e;
            m3287this();
            dialogC6738e.mopub(this.f23921e);
        } else {
            DialogC6627e dialogC6627e = new DialogC6627e(startapp());
            this.f23923e = dialogC6627e;
            m3287this();
            dialogC6627e.advert(this.f23921e);
        }
        return this.f23923e;
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f35094e = true;
        DialogC11829e dialogC11829e = this.f23923e;
        if (dialogC11829e == null) {
            return;
        }
        if (!this.f23922e) {
            DialogC6627e dialogC6627e = (DialogC6627e) dialogC11829e;
            dialogC6627e.getWindow().setLayout(AbstractC12900e.vip(dialogC6627e.getContext()), -2);
        } else {
            DialogC6738e dialogC6738e = (DialogC6738e) dialogC11829e;
            Context context = dialogC6738e.f13934e;
            dialogC6738e.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : AbstractC12900e.vip(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m3287this() {
        if (this.f23921e == null) {
            Bundle bundle = this.f35111e;
            if (bundle != null) {
                this.f23921e = C0056e.vip(bundle.getBundle("selector"));
            }
            if (this.f23921e == null) {
                this.f23921e = C0056e.metrica;
            }
        }
    }
}
