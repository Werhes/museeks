package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؒٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3083e {
    public final Object ad;
    public AbstractC1006e license;
    public C16396e metrica;
    public final C15816e vip = new C15816e(27);
    public final ArrayList appmetrica = new ArrayList();

    public C3083e(List list) {
        this.ad = list;
    }

    public final void ad(C16396e c16396e) {
        C15816e c15816e = this.vip;
        if (((ArrayList) c15816e.f31190e).isEmpty()) {
            this.metrica = c16396e;
            return;
        }
        ArrayList arrayList = (ArrayList) c15816e.f31190e;
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("Unable to peek an element into empty stack");
        }
        C16396e c16396e2 = (C16396e) AbstractC13480e.m3570break(arrayList);
        ArrayList arrayList2 = c16396e2.license;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c16396e2.license = arrayList2;
        }
        arrayList2.add(c16396e);
    }

    public final String toString() {
        return "Trace for " + this.ad;
    }
}
