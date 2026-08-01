package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15570e implements InterfaceC2784e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ AbstractC16510e vip;

    public /* synthetic */ C15570e(AbstractC16510e abstractC16510e, Object obj, int i) {
        this.ad = i;
        this.vip = abstractC16510e;
        this.metrica = obj;
    }

    @Override // defpackage.InterfaceC2784e
    public final void ad(C11469e c11469e) {
        int i = this.ad;
        Object obj = this.metrica;
        AbstractC16510e abstractC16510e = this.vip;
        switch (i) {
            case 0:
                C12477e c12477e = (C12477e) abstractC16510e;
                AbstractC17977e abstractC17977e = (AbstractC17977e) obj;
                if (c12477e.license() == null) {
                    return;
                }
                AbstractC13062e.metrica();
                C12417e c12417e = c12477e.ads;
                if (c12417e != null) {
                    c12417e.vip();
                    c12477e.ads = null;
                }
                C1385e c1385e = c12477e.applovin;
                if (c1385e != null) {
                    c1385e.ad();
                    c12477e.applovin = null;
                }
                abstractC17977e.license();
                c12477e.purchase();
                C9654e c9654e = (C9654e) c12477e.yandex;
                C6884e c6884e = c12477e.startapp;
                c6884e.getClass();
                C16990e m3352goto = c12477e.m3352goto(c9654e, c6884e);
                c12477e.isPro = m3352goto;
                Object[] objArr = {m3352goto.metrica()};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                c12477e.m4158class(DesugarCollections.unmodifiableList(arrayList));
                c12477e.admob();
                return;
            default:
                C17086e c17086e = (C17086e) abstractC16510e;
                c17086e.m4158class(Collections.singletonList(c17086e.m4245this((Size) obj).metrica()));
                c17086e.admob();
                return;
        }
    }
}
