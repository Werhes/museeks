package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5833e extends AbstractC15363e {
    public static final C5833e advert;
    public final Map adcel;
    public final List appmetrica;
    public final List billing;
    public final List license;
    public final List mopub;
    public final List purchase;
    public final List startapp;
    public final C16975e yandex;

    static {
        List list = Collections.EMPTY_LIST;
        advert = new C5833e(BuildConfig.FLAVOR, list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C5833e(String str, List list, List list2, List list3, List list4, List list5, List list6, C16975e c16975e, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C18371e) list2.get(i)).ad;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        vip(arrayList, list3);
        vip(arrayList, list4);
        vip(arrayList, list5);
        vip(arrayList, list6);
        DesugarCollections.unmodifiableList(arrayList);
        this.license = DesugarCollections.unmodifiableList(list2);
        this.appmetrica = DesugarCollections.unmodifiableList(list3);
        this.purchase = DesugarCollections.unmodifiableList(list4);
        this.billing = DesugarCollections.unmodifiableList(list5);
        DesugarCollections.unmodifiableList(list6);
        this.yandex = c16975e;
        this.startapp = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.adcel = DesugarCollections.unmodifiableMap(map);
        this.mopub = DesugarCollections.unmodifiableList(list8);
    }

    public static ArrayList metrica(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    C8319e c8319e = (C8319e) list2.get(i3);
                    if (c8319e.f16997e == i && c8319e.f16996e == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public static void vip(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C8884e) list.get(i)).ad;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    @Override // defpackage.AbstractC15363e
    public final Object ad(List list) {
        ArrayList metrica = metrica(0, this.license, list);
        List list2 = Collections.EMPTY_LIST;
        return new C5833e(this.ad, this.vip, metrica, list2, metrica(1, this.purchase, list), metrica(2, this.billing, list), list2, this.yandex, this.startapp, this.metrica, this.adcel, this.mopub);
    }
}
