package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3084e implements InterfaceC2784e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C3084e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC2784e
    public final void ad(C11469e c11469e) {
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                C3373e c3373e = (C3373e) obj;
                if (c3373e.license() == null) {
                    return;
                }
                C16480e c16480e = c3373e.applovin;
                c16480e.getClass();
                AbstractC13062e.metrica();
                c16480e.f32310e = true;
                c3373e.m1343goto(true);
                String purchase = c3373e.purchase();
                C5753e c5753e = (C5753e) c3373e.yandex;
                C6884e c6884e = c3373e.startapp;
                c6884e.getClass();
                C16990e m1345this = c3373e.m1345this(purchase, c5753e, c6884e);
                c3373e.inmobi = m1345this;
                Object[] objArr = {m1345this.metrica()};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                c3373e.m4158class(DesugarCollections.unmodifiableList(arrayList));
                c3373e.admob();
                C16480e c16480e2 = c3373e.applovin;
                c16480e2.getClass();
                AbstractC13062e.metrica();
                c16480e2.f32310e = false;
                c16480e2.metrica();
                return;
            case 1:
                C9301e c9301e = (C9301e) obj;
                if (c9301e.license() == null) {
                    return;
                }
                c9301e.m2542this((C5450e) c9301e.yandex, c9301e.startapp);
                c9301e.admob();
                return;
            case 2:
                Iterator it = ((C17018e) obj).amazon.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2784e) it.next()).ad(c11469e);
                }
                return;
            default:
                ((C16864e) obj).m4187abstract();
                return;
        }
    }
}
