package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9355e implements InterfaceC14956e {
    public final List ad;
    public final String vip;

    public C9355e(List list, String str) {
        this.ad = list;
        this.vip = str;
        list.size();
        AbstractC13480e.m3582e(list).size();
    }

    @Override // defpackage.InterfaceC14956e
    public final List ad(C12816e c12816e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            AbstractC8439e.appmetrica((InterfaceC14956e) it.next(), c12816e, arrayList);
        }
        return AbstractC13480e.m3575continue(arrayList);
    }

    @Override // defpackage.InterfaceC14956e
    public final Collection crashlytics(C12816e c12816e, Function1 function1) {
        HashSet hashSet = new HashSet();
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC14956e) it.next()).crashlytics(c12816e, function1));
        }
        return hashSet;
    }

    @Override // defpackage.InterfaceC14956e
    public final void metrica(C12816e c12816e, ArrayList arrayList) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            AbstractC8439e.appmetrica((InterfaceC14956e) it.next(), c12816e, arrayList);
        }
    }

    public final String toString() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC14956e
    public final boolean vip(C12816e c12816e) {
        List list = this.ad;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC8439e.yandex((InterfaceC14956e) it.next(), c12816e)) {
                return false;
            }
        }
        return true;
    }
}
