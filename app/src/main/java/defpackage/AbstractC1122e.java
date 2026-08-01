package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1122e {
    public static final C14767e ad;

    static {
        C18139e c18139e = C18139e.ad;
        C11918e c11918e = new C11918e(C18139e.vip, AbstractC4972e.purchase, 0);
        C0520e billing = AbstractC4972e.billing.ad.billing();
        C7468e c7468e = C6272e.appmetrica;
        C14767e c14767e = new C14767e(c11918e, billing, c7468e);
        c14767e.f29209e = 4;
        c14767e.f29211e = AbstractC6050e.appmetrica;
        List singletonList = Collections.singletonList(C1428e.m606e(c14767e, 2, C0520e.appmetrica("T"), 0, c7468e));
        if (c14767e.f29210e != null) {
            throw new IllegalStateException("Type parameters are already set for " + c14767e.getName());
        }
        ArrayList arrayList = new ArrayList(singletonList);
        c14767e.f29210e = arrayList;
        c14767e.f29208e = new C2886e(c14767e, arrayList, c14767e.f29207e, c14767e.f29206e);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C14767e.billing(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C7283e) ((InterfaceC16528e) it.next())).f29665e = c14767e.mo1458e();
        }
        ad = c14767e;
    }
}
