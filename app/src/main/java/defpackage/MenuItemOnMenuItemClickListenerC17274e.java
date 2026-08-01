package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۜٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC17274e implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC17274e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.ad) {
            case 0:
                ((C16118e) this.vip).license.invoke(((C16263e) this.metrica).ad);
                return true;
            default:
                AbstractC11815e.m3275while((Context) this.vip, (TextClassification) this.metrica);
                return true;
        }
    }
}
