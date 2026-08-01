package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8728e extends DialogInterfaceOnCancelListenerC18535e {

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public AlertDialog f17621e;

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public Dialog f17622e;

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public DialogInterface.OnCancelListener f17623e;

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e
    /* renamed from: goto, reason: not valid java name */
    public final Dialog mo2472goto() {
        Dialog dialog = this.f17622e;
        if (dialog != null) {
            return dialog;
        }
        this.f36339e = false;
        if (this.f17621e == null) {
            Context startapp = startapp();
            AbstractC9528e.startapp(startapp);
            this.f17621e = new AlertDialog.Builder(startapp).create();
        }
        return this.f17621e;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f17623e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
