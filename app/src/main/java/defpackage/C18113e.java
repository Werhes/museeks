package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۤۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18113e {
    public AbstractC17471e ad;
    public ArrayList vip;

    public static long ad(C17455e c17455e, long j) {
        AbstractC17471e abstractC17471e = c17455e.license;
        ArrayList arrayList = c17455e.mopub;
        if (abstractC17471e instanceof C18332e) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC12462e interfaceC12462e = (InterfaceC12462e) arrayList.get(i);
            if (interfaceC12462e instanceof C17455e) {
                C17455e c17455e2 = (C17455e) interfaceC12462e;
                if (c17455e2.license != abstractC17471e) {
                    j2 = Math.min(j2, ad(c17455e2, c17455e2.purchase + j));
                }
            }
        }
        C17455e c17455e3 = abstractC17471e.startapp;
        C17455e c17455e4 = abstractC17471e.yandex;
        if (c17455e != c17455e3) {
            return j2;
        }
        long adcel = j - abstractC17471e.adcel();
        return Math.min(Math.min(j2, ad(c17455e4, adcel)), adcel - c17455e4.purchase);
    }

    public static long vip(C17455e c17455e, long j) {
        AbstractC17471e abstractC17471e = c17455e.license;
        ArrayList arrayList = c17455e.mopub;
        if (abstractC17471e instanceof C18332e) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC12462e interfaceC12462e = (InterfaceC12462e) arrayList.get(i);
            if (interfaceC12462e instanceof C17455e) {
                C17455e c17455e2 = (C17455e) interfaceC12462e;
                if (c17455e2.license != abstractC17471e) {
                    j2 = Math.max(j2, vip(c17455e2, c17455e2.purchase + j));
                }
            }
        }
        C17455e c17455e3 = abstractC17471e.yandex;
        C17455e c17455e4 = abstractC17471e.startapp;
        if (c17455e != c17455e3) {
            return j2;
        }
        long adcel = abstractC17471e.adcel() + j;
        return Math.max(Math.max(j2, vip(c17455e4, adcel)), adcel - c17455e4.purchase);
    }
}
