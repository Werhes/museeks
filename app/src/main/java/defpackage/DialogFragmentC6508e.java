package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class DialogFragmentC6508e extends DialogFragment {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public AlertDialog f13421e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public DialogInterface.OnCancelListener f13422e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Dialog f13423e;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13422e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13423e;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f13421e == null) {
            Activity activity = getActivity();
            AbstractC9528e.startapp(activity);
            this.f13421e = new AlertDialog.Builder(activity).create();
        }
        return this.f13421e;
    }
}
