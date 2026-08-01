package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16263e {
    public final C14118e ad;
    public final View license;
    public final C10680e metrica;
    public final C10680e vip;

    public C16263e(C14118e c14118e, C10680e c10680e, C10680e c10680e2, View view) {
        this.ad = c14118e;
        this.vip = c10680e;
        this.metrica = c10680e2;
        this.license = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final boolean ad(Menu menu) {
        int i;
        C17828e c17828e = (C17828e) this.vip.invoke();
        if (AbstractC7890e.billing(c17828e, null)) {
            return false;
        }
        menu.clear();
        ?? r0 = c17828e.ad;
        int size = r0.size();
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC14299e abstractC14299e = (AbstractC14299e) r0.get(i4);
            if (abstractC14299e instanceof C16118e) {
                i = i2 + 1;
                Object obj = abstractC14299e.ad;
                C16118e c16118e = (C16118e) abstractC14299e;
                MenuItem add = menu.add(i3, AbstractC7890e.billing(obj, AbstractC14533e.license) ? R.id.cut : AbstractC7890e.billing(obj, AbstractC14533e.appmetrica) ? R.id.copy : AbstractC7890e.billing(obj, AbstractC14533e.purchase) ? R.id.paste : AbstractC7890e.billing(obj, AbstractC14533e.billing) ? R.id.selectAll : AbstractC7890e.billing(obj, AbstractC14533e.yandex) ? R.id.autofill : i2, i2, c16118e.vip);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC17274e(c16118e, this, 0));
            } else {
                if (abstractC14299e instanceof C15304e) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i2 + 1;
                        C15304e c15304e = (C15304e) abstractC14299e;
                        AbstractC17305e.license(menu, i2, this.license.getContext(), c15304e.vip, c15304e.metrica);
                    }
                } else if (abstractC14299e instanceof C10892e) {
                    i3++;
                }
            }
            i2 = i;
        }
        return true;
    }
}
