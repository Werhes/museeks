package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import androidx.mediarouter.app.license;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۘۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15678e extends DialogInterfaceOnCancelListenerC18535e {

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public C0056e f30889e;

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public final boolean f30890e = false;

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public DialogC11829e f30891e;

    public C15678e() {
        this.f36341e = true;
        Dialog dialog = this.f36330e;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, defpackage.AbstractComponentCallbacksC17875e
    public final void applovin() {
        super.applovin();
        DialogC11829e dialogC11829e = this.f30891e;
        if (dialogC11829e == null || this.f30890e) {
            return;
        }
        ((license) dialogC11829e).smaato(false);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e
    /* renamed from: goto */
    public final Dialog mo2472goto() {
        if (this.f30890e) {
            DialogC1747e dialogC1747e = new DialogC1747e(startapp());
            this.f30891e = dialogC1747e;
            dialogC1747e.smaato(this.f30889e);
        } else {
            this.f30891e = new license(startapp());
        }
        return this.f30891e;
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f35094e = true;
        DialogC11829e dialogC11829e = this.f30891e;
        if (dialogC11829e != null) {
            if (this.f30890e) {
                ((DialogC1747e) dialogC11829e).amazon();
            } else {
                ((license) dialogC11829e).tapsense();
            }
        }
    }
}
