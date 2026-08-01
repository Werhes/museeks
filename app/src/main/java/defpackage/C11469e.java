package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11469e {
    public static final List adcel = Arrays.asList(1, 5, 3);
    public final ArrayList ad;
    public final List appmetrica;
    public final C9937e billing;
    public final List license;
    public final List metrica;
    public final InterfaceC2784e purchase;
    public final InputConfiguration startapp;
    public final C1673e vip;
    public final int yandex;

    public C11469e(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C9937e c9937e, InterfaceC2784e interfaceC2784e, InputConfiguration inputConfiguration, int i, C1673e c1673e) {
        this.ad = arrayList;
        this.metrica = DesugarCollections.unmodifiableList(arrayList2);
        this.license = DesugarCollections.unmodifiableList(arrayList3);
        this.appmetrica = DesugarCollections.unmodifiableList(arrayList4);
        this.purchase = interfaceC2784e;
        this.billing = c9937e;
        this.startapp = inputConfiguration;
        this.yandex = i;
        this.vip = c1673e;
    }

    public static C11469e ad() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C4069e license = C4069e.license();
        ArrayList arrayList5 = new ArrayList();
        C5489e ad = C5489e.ad();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C17015e vip = C17015e.vip(license);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        C18543e c18543e = C18543e.vip;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = ad.ad;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new C11469e(arrayList, arrayList2, arrayList3, arrayList4, new C9937e(arrayList6, vip, -1, arrayList7, new C18543e(arrayMap)), null, null, 0, null);
    }

    public final List vip() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            C1673e c1673e = (C1673e) it.next();
            arrayList.add(c1673e.ad);
            Iterator it2 = c1673e.vip.iterator();
            while (it2.hasNext()) {
                arrayList.add((AbstractC5113e) it2.next());
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
