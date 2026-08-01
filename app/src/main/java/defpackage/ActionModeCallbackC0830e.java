package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionModeCallbackC0830e extends ActionMode.Callback2 implements ActionMode.Callback {
    public final C16263e ad;

    public ActionModeCallbackC0830e(C16263e c16263e) {
        this.ad = c16263e;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.ad.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.ad.ad(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.ad.ad.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C0763e c0763e = (C0763e) this.ad.metrica.invoke();
        rect.set(Math.round(c0763e.ad), Math.round(c0763e.vip), Math.round(c0763e.metrica), Math.round(c0763e.license));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.ad.ad(menu);
    }
}
