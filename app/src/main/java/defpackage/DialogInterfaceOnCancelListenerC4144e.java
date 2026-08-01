package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC4144e implements DialogInterface.OnCancelListener {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC18535e f9137e;

    public DialogInterfaceOnCancelListenerC4144e(DialogInterfaceOnCancelListenerC18535e dialogInterfaceOnCancelListenerC18535e) {
        this.f9137e = dialogInterfaceOnCancelListenerC18535e;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC18535e dialogInterfaceOnCancelListenerC18535e = this.f9137e;
        Dialog dialog = dialogInterfaceOnCancelListenerC18535e.f36330e;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC18535e.onCancel(dialog);
        }
    }
}
