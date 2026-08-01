package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC17178e implements InterfaceC15202e, DialogInterface.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public CharSequence f33672e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16670e f33673e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C16972e f33674e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public DialogInterfaceC15370e f33675e;

    public DialogInterfaceOnClickListenerC17178e(C16972e c16972e) {
        this.f33674e = c16972e;
    }

    @Override // defpackage.InterfaceC15202e
    public final void Signature(ListAdapter listAdapter) {
        this.f33673e = (C16670e) listAdapter;
    }

    @Override // defpackage.InterfaceC15202e
    public final boolean ad() {
        DialogInterfaceC15370e dialogInterfaceC15370e = this.f33675e;
        if (dialogInterfaceC15370e != null) {
            return dialogInterfaceC15370e.isShowing();
        }
        return false;
    }

    @Override // defpackage.InterfaceC15202e
    public final void advert(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC15202e
    public final void amazon(int i, int i2) {
        if (this.f33673e == null) {
            return;
        }
        C16972e c16972e = this.f33674e;
        C13572e c13572e = new C13572e(c16972e.getPopupContext());
        C11486e c11486e = (C11486e) c13572e.f26878e;
        CharSequence charSequence = this.f33672e;
        if (charSequence != null) {
            c11486e.license = charSequence;
        }
        C16670e c16670e = this.f33673e;
        int selectedItemPosition = c16972e.getSelectedItemPosition();
        c11486e.amazon = c16670e;
        c11486e.loadAd = this;
        c11486e.subscription = selectedItemPosition;
        c11486e.admob = true;
        DialogInterfaceC15370e amazon = c13572e.amazon();
        this.f33675e = amazon;
        AlertController$RecycleListView alertController$RecycleListView = amazon.f30302e.purchase;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f33675e.show();
    }

    @Override // defpackage.InterfaceC15202e
    public final CharSequence appmetrica() {
        return this.f33672e;
    }

    @Override // defpackage.InterfaceC15202e
    public final Drawable billing() {
        return null;
    }

    @Override // defpackage.InterfaceC15202e
    public final void dismiss() {
        DialogInterfaceC15370e dialogInterfaceC15370e = this.f33675e;
        if (dialogInterfaceC15370e != null) {
            dialogInterfaceC15370e.dismiss();
            this.f33675e = null;
        }
    }

    @Override // defpackage.InterfaceC15202e
    public final int loadAd() {
        return 0;
    }

    @Override // defpackage.InterfaceC15202e
    public final void metrica(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C16972e c16972e = this.f33674e;
        c16972e.setSelection(i);
        if (c16972e.getOnItemClickListener() != null) {
            c16972e.performItemClick(null, i, this.f33673e.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.InterfaceC15202e
    public final void smaato(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC15202e
    public final void startapp(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC15202e
    public final int vip() {
        return 0;
    }

    @Override // defpackage.InterfaceC15202e
    public final void yandex(CharSequence charSequence) {
        this.f33672e = charSequence;
    }
}
