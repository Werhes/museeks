package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۧ */
/* loaded from: classes.dex */
public final class C6071e {
    public final AbstractC13616e ad;
    public C6071e appmetrica;
    public final C0500e license;
    public final C13915e metrica;
    public final int purchase;
    public final boolean vip;

    public C6071e(AbstractC13616e abstractC13616e, boolean z, C13915e c13915e, C0500e c0500e) {
        this.ad = abstractC13616e;
        this.vip = z;
        this.metrica = c13915e;
        this.license = c0500e;
        this.purchase = c13915e.f27594e;
    }

    public static /* synthetic */ List adcel(int i, C6071e c6071e) {
        return c6071e.startapp((i & 1) != 0 ? !c6071e.vip : false, (i & 2) == 0);
    }

    public final boolean Signature() {
        return this.vip && this.license.f2575e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final C0763e ad(AbstractC17732e abstractC17732e) {
        AbstractC6126e abstractC6126e;
        C6071e advert = advert();
        if (advert == null) {
            return C0763e.appmetrica;
        }
        AbstractC13616e abstractC13616e = (AbstractC13616e) advert.metrica.f27592e.billing;
        if ((abstractC13616e.f27020e & 8) != 0) {
            loop0: while (abstractC13616e != null) {
                if ((abstractC13616e.f27014e & 8) != 0) {
                    abstractC6126e = abstractC13616e;
                    ?? r6 = 0;
                    while (abstractC6126e != 0) {
                        if (abstractC6126e instanceof InterfaceC17453e) {
                            if (abstractC6126e.smaato()) {
                                break loop0;
                            }
                        } else if ((abstractC6126e.f27014e & 8) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                            AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                            int i = 0;
                            abstractC6126e = abstractC6126e;
                            r6 = r6;
                            while (abstractC13616e2 != null) {
                                if ((abstractC13616e2.f27014e & 8) != 0) {
                                    i++;
                                    r6 = r6;
                                    if (i == 1) {
                                        abstractC6126e = abstractC13616e2;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC6126e != 0) {
                                            r6.license(abstractC6126e);
                                            abstractC6126e = 0;
                                        }
                                        r6.license(abstractC13616e2);
                                    }
                                }
                                abstractC13616e2 = abstractC13616e2.f27024e;
                                abstractC6126e = abstractC6126e;
                                r6 = r6;
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC6126e = AbstractC5851e.vip(r6);
                    }
                }
                if ((abstractC13616e.f27020e & 8) == 0) {
                    break;
                }
                abstractC13616e = abstractC13616e.f27024e;
            }
        }
        abstractC6126e = 0;
        InterfaceC17453e interfaceC17453e = (InterfaceC17453e) abstractC6126e;
        AbstractC17732e yandex = interfaceC17453e != null ? AbstractC5851e.yandex(interfaceC17453e, 8) : null;
        return yandex == null ? advert.ad(abstractC17732e) : yandex.mo208goto(abstractC17732e, true);
    }

    public final boolean admob() {
        if (loadAd() || !adcel(4, this).isEmpty()) {
            return false;
        }
        C13915e tapsense = this.metrica.tapsense();
        while (true) {
            if (tapsense == null) {
                tapsense = null;
                break;
            }
            C0500e inmobi = tapsense.inmobi();
            if (inmobi != null && inmobi.f2575e) {
                break;
            }
            tapsense = tapsense.tapsense();
        }
        return tapsense == null;
    }

    public final C6071e advert() {
        C13915e c13915e;
        C6071e c6071e = this.appmetrica;
        if (c6071e != null) {
            return c6071e;
        }
        C13915e c13915e2 = this.metrica;
        boolean z = this.vip;
        if (z) {
            c13915e = c13915e2.tapsense();
            while (c13915e != null) {
                C0500e inmobi = c13915e.inmobi();
                if (inmobi != null && inmobi.f2575e) {
                    break;
                }
                c13915e = c13915e.tapsense();
            }
        }
        c13915e = null;
        if (c13915e == null) {
            C13915e tapsense = c13915e2.tapsense();
            while (true) {
                if (tapsense == null) {
                    c13915e = null;
                    break;
                }
                if (tapsense.f27592e.yandex(8)) {
                    c13915e = tapsense;
                    break;
                }
                tapsense = tapsense.tapsense();
            }
        }
        if (c13915e == null) {
            return null;
        }
        return AbstractC0250e.metrica(c13915e, z);
    }

    public final C0500e amazon() {
        return this.license;
    }

    public final void appmetrica(ArrayList arrayList, ArrayList arrayList2) {
        remoteconfig(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C6071e c6071e = (C6071e) arrayList.get(size2);
            if (c6071e.Signature()) {
                arrayList2.add(c6071e);
            } else if (!c6071e.license.f2577e) {
                c6071e.appmetrica(arrayList, arrayList2);
            }
        }
    }

    public final C0763e billing() {
        AbstractC17732e license = license();
        if (license != null) {
            if (!license.mo2524e().f27016e) {
                license = null;
            }
            if (license != null) {
                return AbstractC0890e.metrica(license).mo208goto(license, true);
            }
        }
        return C0763e.appmetrica;
    }

    public final AbstractC17732e license() {
        AbstractC17732e yandex;
        if (!loadAd()) {
            InterfaceC17453e purchase = purchase();
            return (purchase == null || (yandex = AbstractC5851e.yandex(purchase, 8)) == null) ? (C14747e) this.metrica.f27592e.license : yandex;
        }
        C6071e advert = advert();
        if (advert != null) {
            return advert.license();
        }
        return null;
    }

    public final boolean loadAd() {
        return this.appmetrica != null;
    }

    public final void metrica(C13915e c13915e, ArrayList arrayList) {
        C12431e applovin = c13915e.applovin();
        Object[] objArr = applovin.f24870e;
        int i = applovin.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e2 = (C13915e) objArr[i2];
            if (c13915e2.m3708extends() && !c13915e2.f27620e) {
                if (c13915e2.f27592e.yandex(8)) {
                    arrayList.add(AbstractC0250e.metrica(c13915e2, this.vip));
                } else {
                    metrica(c13915e2, arrayList);
                }
            }
        }
    }

    public final C0500e mopub() {
        boolean Signature = Signature();
        C0500e c0500e = this.license;
        if (!Signature) {
            return c0500e;
        }
        C0500e yandex = c0500e.yandex();
        subscription(new ArrayList(), yandex);
        return yandex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC17453e purchase() {
        AbstractC13616e abstractC13616e;
        boolean z;
        boolean z2 = this.license.f2575e;
        C13915e c13915e = this.metrica;
        Object obj = null;
        if (!z2) {
            AbstractC13616e abstractC13616e2 = (AbstractC13616e) c13915e.f27592e.billing;
            if ((abstractC13616e2.f27020e & 8) != 0) {
                loop3: while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 8) != 0) {
                        abstractC13616e = abstractC13616e2;
                        C12431e c12431e = null;
                        while (abstractC13616e != null) {
                            if (abstractC13616e instanceof InterfaceC17453e) {
                                if (((InterfaceC17453e) abstractC13616e).smaato()) {
                                    obj = abstractC13616e;
                                }
                            } else if ((abstractC13616e.f27014e & 8) != 0 && (abstractC13616e instanceof AbstractC6126e)) {
                                int i = 0;
                                for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                    if ((abstractC13616e3.f27014e & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC13616e = abstractC13616e3;
                                        } else {
                                            if (c12431e == null) {
                                                c12431e = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e != null) {
                                                c12431e.license(abstractC13616e);
                                                abstractC13616e = null;
                                            }
                                            c12431e.license(abstractC13616e3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC13616e = AbstractC5851e.vip(c12431e);
                        }
                    }
                    if ((abstractC13616e2.f27020e & 8) == 0) {
                        break;
                    }
                    abstractC13616e2 = abstractC13616e2.f27024e;
                }
            }
            return (InterfaceC17453e) obj;
        }
        AbstractC13616e abstractC13616e4 = (AbstractC13616e) c13915e.f27592e.billing;
        if ((abstractC13616e4.f27020e & 8) != 0) {
            abstractC13616e = null;
            while (abstractC13616e4 != null) {
                if ((abstractC13616e4.f27014e & 8) != 0) {
                    AbstractC13616e abstractC13616e5 = abstractC13616e4;
                    C12431e c12431e2 = null;
                    while (abstractC13616e5 != null) {
                        if (abstractC13616e5 instanceof InterfaceC17453e) {
                            InterfaceC17453e interfaceC17453e = (InterfaceC17453e) abstractC13616e5;
                            if (interfaceC17453e.smaato()) {
                                if (interfaceC17453e.mo359e()) {
                                    return interfaceC17453e;
                                }
                                if (abstractC13616e == null) {
                                    abstractC13616e = interfaceC17453e;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (abstractC13616e5.f27014e & 8) != 0 && (abstractC13616e5 instanceof AbstractC6126e)) {
                            int i2 = 0;
                            for (AbstractC13616e abstractC13616e6 = ((AbstractC6126e) abstractC13616e5).f12873e; abstractC13616e6 != null; abstractC13616e6 = abstractC13616e6.f27024e) {
                                if ((abstractC13616e6.f27014e & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        abstractC13616e5 = abstractC13616e6;
                                    } else {
                                        if (c12431e2 == null) {
                                            c12431e2 = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC13616e5 != null) {
                                            c12431e2.license(abstractC13616e5);
                                            abstractC13616e5 = null;
                                        }
                                        c12431e2.license(abstractC13616e6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        abstractC13616e5 = AbstractC5851e.vip(c12431e2);
                    }
                }
                if ((abstractC13616e4.f27020e & 8) == 0) {
                    break;
                }
                abstractC13616e4 = abstractC13616e4.f27024e;
            }
            obj = abstractC13616e;
        }
        return (InterfaceC17453e) obj;
    }

    public final List remoteconfig(ArrayList arrayList, boolean z) {
        if (loadAd()) {
            return C13664e.f27089e;
        }
        metrica(this.metrica, arrayList);
        if (z) {
            C0500e c0500e = this.license;
            C0583e c0583e = c0500e.f2578e;
            Object billing = c0583e.billing(AbstractC9058e.applovin);
            if (billing == null) {
                billing = null;
            }
            C11796e c11796e = (C11796e) billing;
            if (c11796e != null && c0500e.f2575e && !arrayList.isEmpty()) {
                arrayList.add(vip(c11796e, new C17097e(29, c11796e)));
            }
            C16591e c16591e = AbstractC9058e.ad;
            if (c0583e.metrica(c16591e) && !arrayList.isEmpty() && c0500e.f2575e) {
                Object billing2 = c0583e.billing(c16591e);
                if (billing2 == null) {
                    billing2 = null;
                }
                List list = (List) billing2;
                String str = list != null ? (String) AbstractC13480e.m3604this(list) : null;
                if (str != null) {
                    arrayList.add(0, vip(null, new C10570e(0, str)));
                }
            }
        }
        return arrayList;
    }

    public final C0763e smaato() {
        InterfaceC5077e purchase = purchase();
        if (purchase == null) {
            return ((C14747e) this.metrica.f27592e.license).m4413e();
        }
        AbstractC13616e abstractC13616e = ((AbstractC13616e) purchase).f27022e;
        Object billing = this.license.f2578e.billing(AbstractC10789e.vip);
        if (billing == null) {
            billing = null;
        }
        boolean z = billing != null;
        if (!abstractC13616e.f27022e.f27016e) {
            return C0763e.appmetrica;
        }
        if (z) {
            return AbstractC5851e.yandex(abstractC13616e, 8).m4413e();
        }
        AbstractC17732e yandex = AbstractC5851e.yandex(abstractC13616e, 8);
        return AbstractC0890e.metrica(yandex).mo208goto(yandex, true);
    }

    public final List startapp(boolean z, boolean z2) {
        if (!z && this.license.f2577e) {
            return C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList();
        if (!Signature()) {
            return remoteconfig(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        appmetrica(arrayList, arrayList2);
        return arrayList2;
    }

    public final void subscription(ArrayList arrayList, C0500e c0500e) {
        if (this.license.f2577e) {
            return;
        }
        remoteconfig(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C6071e c6071e = (C6071e) arrayList.get(size2);
            if (!c6071e.Signature()) {
                c0500e.adcel(c6071e.license);
                c6071e.subscription(arrayList, c0500e);
            }
        }
    }

    public final C6071e vip(C11796e c11796e, Function1 function1) {
        C0500e c0500e = new C0500e();
        c0500e.f2575e = false;
        c0500e.f2577e = false;
        function1.invoke(c0500e);
        C6071e c6071e = new C6071e(new C5791e(function1), false, new C13915e(true, this.purchase + (c11796e != null ? 1000000000 : 2000000000)), c0500e);
        c6071e.appmetrica = this;
        return c6071e;
    }

    public final C0763e yandex() {
        AbstractC17732e license = license();
        if (license != null) {
            if (!license.mo2524e().f27016e) {
                license = null;
            }
            if (license != null) {
                return AbstractC0890e.vip(license, true);
            }
        }
        return C0763e.appmetrica;
    }
}
