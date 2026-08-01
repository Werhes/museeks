package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3684e extends Activity implements InterfaceC16400e, InterfaceC3890e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4891e f8255e = new C4891e(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (AbstractC5960e.startapp(decorView, keyEvent)) {
            return true;
        }
        return AbstractC5960e.adcel(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (AbstractC5960e.startapp(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC17355e.f34058e;
        AbstractC17368e.vip(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C4891e c4891e = this.f8255e;
        c4891e.license("setCurrentState");
        c4891e.purchase(EnumC7785e.f15777e);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.InterfaceC3890e
    public final boolean purchase(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
