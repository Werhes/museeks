package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC16291e implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC17386e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C17757e f31977e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public DialogInterfaceC15370e f31978e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public SubMenuC1355e f31979e;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC1355e subMenuC1355e = this.f31979e;
        C17757e c17757e = this.f31977e;
        if (c17757e.f34829e == null) {
            c17757e.f34829e = new C18402e(c17757e);
        }
        subMenuC1355e.admob(c17757e.f34829e.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f31977e.vip(this.f31979e, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1355e subMenuC1355e = this.f31979e;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f31978e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f31978e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1355e.metrica(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1355e.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.InterfaceC17386e
    public final boolean smaato(MenuC8939e menuC8939e) {
        return false;
    }

    @Override // defpackage.InterfaceC17386e
    public final void vip(MenuC8939e menuC8939e, boolean z) {
        DialogInterfaceC15370e dialogInterfaceC15370e;
        if ((z || menuC8939e == this.f31979e) && (dialogInterfaceC15370e = this.f31978e) != null) {
            dialogInterfaceC15370e.dismiss();
        }
    }
}
