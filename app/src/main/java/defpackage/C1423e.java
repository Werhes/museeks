package defpackage;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423e extends C17256e {
    public C1423e(AbstractC10716e abstractC10716e, int i) {
        super(abstractC10716e, true, (i & 8) == 0, 96);
    }

    @Override // defpackage.C17256e, defpackage.InterfaceC11370e
    public final void ad(float f) {
        super.ad(f);
        C16866e c16866e = this.adcel;
        if (c16866e == null) {
            c16866e = null;
        }
        ActionMenuView cachedMenuView = c16866e.getCachedMenuView();
        if (cachedMenuView != null) {
            cachedMenuView.setAlpha(f);
        }
    }

    @Override // defpackage.C17256e, defpackage.AbstractC18491e
    public final void mopub() {
        super.mopub();
        C16866e c16866e = this.adcel;
        if (c16866e == null) {
            c16866e = null;
        }
        Menu menu = c16866e.getMenu();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                VKXApplication.Companion companion = VKXApplication.f36531e;
                icon.setTint(AbstractC15933e.ad(R.attr.reborn_title_color));
            }
        }
    }
}
