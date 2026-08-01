package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523e {
    public final boolean ad;
    public final Action appmetrica;
    public final ArrayList billing;
    public final CarText license;
    public final ArrayList metrica;
    public final ActionStrip purchase;
    public final ItemList vip;
    public final Header yandex;

    public C1523e(ListTemplate listTemplate) {
        this.ad = listTemplate.isLoading();
        this.appmetrica = listTemplate.getHeaderAction();
        this.license = listTemplate.getTitle();
        this.vip = listTemplate.getSingleList();
        this.metrica = new ArrayList(listTemplate.getSectionedLists());
        this.purchase = listTemplate.getActionStrip();
        this.billing = new ArrayList(listTemplate.getActions());
        this.yandex = listTemplate.getHeader();
    }
}
