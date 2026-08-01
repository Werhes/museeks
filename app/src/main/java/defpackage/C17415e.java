package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۦٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17415e {
    public final ArrayList ad;
    public final CarText appmetrica;
    public final InterfaceC16383e license;
    public final InterfaceC17370e metrica;
    public final int vip;

    public C17415e(ItemList itemList) {
        this.vip = itemList.getSelectedIndex();
        this.metrica = itemList.getOnSelectedDelegate();
        this.license = itemList.getOnItemVisibilityChangedDelegate();
        this.appmetrica = itemList.getNoItemsMessage();
        this.ad = new ArrayList(itemList.getItems());
    }
}
