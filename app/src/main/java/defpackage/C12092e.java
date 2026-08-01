package defpackage;

import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12092e extends AbstractC12654e {
    public static final /* synthetic */ int tapsense = 0;
    public final boolean Signature;
    public final C0394e admob;
    public final InterfaceC5052e amazon;
    public final C17070e loadAd;
    public final C0394e pro;
    public final C0394e remoteconfig;
    public final C8286e signatures;
    public final C0394e subscription;

    /* JADX WARN: Type inference failed for: r5v1, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [eٖؑٚ, eٖۥٌ] */
    public C12092e(C11980e c11980e, InterfaceC5052e interfaceC5052e, C17070e c17070e, boolean z, C12092e c12092e) {
        super(c11980e, c12092e);
        this.amazon = interfaceC5052e;
        this.loadAd = c17070e;
        this.Signature = z;
        InterfaceC11542e interfaceC11542e = ((C17241e) c11980e.f23950e).ad;
        C12056e c12056e = new C12056e(this, c11980e, 28);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.admob = new C16622e(c6272e, c12056e);
        C14276e c14276e = new C14276e(this, 0);
        C6272e c6272e2 = (C6272e) interfaceC11542e;
        c6272e2.getClass();
        this.subscription = new C16622e(c6272e2, c14276e);
        C17197e c17197e = new C17197e(c11980e, this);
        C6272e c6272e3 = (C6272e) interfaceC11542e;
        c6272e3.getClass();
        this.remoteconfig = new C16622e(c6272e3, c17197e);
        C14276e c14276e2 = new C14276e(this, 1);
        C6272e c6272e4 = (C6272e) interfaceC11542e;
        c6272e4.getClass();
        this.pro = new C16622e(c6272e4, c14276e2);
        this.signatures = ((C6272e) interfaceC11542e).metrica(new C17874e(this, c11980e, 11));
    }

    public static C1117e ads(C1117e c1117e, InterfaceC16528e interfaceC16528e, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return c1117e;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            C1117e c1117e2 = (C1117e) it.next();
            if (!AbstractC7890e.billing(c1117e, c1117e2) && c1117e2.f29664e == null && crashlytics(c1117e2, interfaceC16528e)) {
                return (C1117e) c1117e.mo471e().signatures().build();
            }
        }
        return c1117e;
    }

    /* renamed from: class, reason: not valid java name */
    public static C1117e m3320class(InterfaceC2188e interfaceC2188e, String str, Function1 function1) {
        C1117e c1117e;
        Iterator it = ((Iterable) function1.invoke(C0520e.appmetrica(str))).iterator();
        do {
            c1117e = null;
            if (!it.hasNext()) {
                break;
            }
            C1117e c1117e2 = (C1117e) it.next();
            C1117e c1117e3 = c1117e2;
            if (c1117e3.mo330e().size() == 0) {
                C0399e c0399e = InterfaceC9853e.ad;
                AbstractC1186e abstractC1186e = c1117e3.f29665e;
                if (abstractC1186e == null ? false : c0399e.vip(abstractC1186e, interfaceC2188e.ad())) {
                    c1117e = c1117e2;
                }
            }
        } while (c1117e == null);
        return c1117e;
    }

    public static boolean crashlytics(InterfaceC16528e interfaceC16528e, InterfaceC16528e interfaceC16528e2) {
        return C14514e.metrica.amazon(interfaceC16528e2, interfaceC16528e, true).vip() == 1 && !AbstractC12501e.vip(interfaceC16528e2, interfaceC16528e);
    }

    public static boolean firebase(C1117e c1117e, C1117e c1117e2) {
        int i = AbstractC7347e.advert;
        if (AbstractC7890e.billing(c1117e.getName().vip(), "removeAt") && AbstractC7890e.billing(AbstractC5209e.metrica(c1117e), AbstractC7928e.billing.appmetrica)) {
            c1117e2 = c1117e2.vip();
        }
        return crashlytics(c1117e2, c1117e);
    }

    /* renamed from: goto, reason: not valid java name */
    public static C1117e m3321goto(InterfaceC2188e interfaceC2188e, Function1 function1) {
        C1117e c1117e;
        AbstractC1186e abstractC1186e;
        String vip = interfaceC2188e.getName().vip();
        C12816e c12816e = AbstractC7903e.ad;
        StringBuilder sb = new StringBuilder("set");
        sb.append(AbstractC7903e.vip(vip) ? vip.substring(2) : AbstractC6022e.metrica(vip));
        Iterator it = ((Iterable) function1.invoke(C0520e.appmetrica(sb.toString()))).iterator();
        do {
            c1117e = null;
            if (!it.hasNext()) {
                break;
            }
            C1117e c1117e2 = (C1117e) it.next();
            C1117e c1117e3 = c1117e2;
            if (c1117e3.mo330e().size() == 1 && (abstractC1186e = c1117e3.f29665e) != null) {
                C0520e c0520e = AbstractC13270e.appmetrica;
                if (AbstractC13270e.crashlytics(abstractC1186e, AbstractC0206e.license) && InterfaceC9853e.ad.ad(((C13043e) AbstractC13480e.m3590instanceof(c1117e3.mo330e())).ad(), interfaceC2188e.ad())) {
                    c1117e = c1117e2;
                }
            }
        } while (c1117e == null);
        return c1117e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C1117e premium(defpackage.C1117e r4) {
        /*
            r0 = r4
            eٔۛؖ r0 = (defpackage.AbstractC14957e) r0
            java.util.List r0 = r0.mo330e()
            java.lang.Object r0 = defpackage.AbstractC13480e.m3569abstract(r0)
            eْؖؕ r0 = (defpackage.C13043e) r0
            r1 = 0
            if (r0 == 0) goto L7b
            r2 = r0
            eٖؑ٘ r2 = (defpackage.AbstractC0338e) r2
            eٜؒؒ r2 = r2.ad()
            eٜؗ٘ r2 = r2.loadAd()
            eْؖٝ r2 = r2.advert()
            if (r2 == 0) goto L36
            int r3 = defpackage.AbstractC2876e.ad
            eْۢٙ r2 = defpackage.AbstractC14300e.purchase(r2)
            boolean r3 = r2.license()
            if (r3 == 0) goto L2e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L36
            eّۡۜ r2 = r2.startapp()
            goto L37
        L36:
            r2 = r1
        L37:
            eّۡۜ r3 = defpackage.AbstractC4972e.billing
            boolean r2 = defpackage.AbstractC7890e.billing(r2, r3)
            if (r2 == 0) goto L40
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 != 0) goto L44
            goto L7b
        L44:
            eٗؓٚ r1 = r4.mo471e()
            eٔۛؖ r4 = (defpackage.AbstractC14957e) r4
            java.util.List r4 = r4.mo330e()
            java.util.List r4 = defpackage.AbstractC13480e.crashlytics(r4)
            eٗؓٚ r4 = r1.ad(r4)
            eٖؑ٘ r0 = (defpackage.AbstractC0338e) r0
            eٜؒؒ r0 = r0.ad()
            java.util.List r0 = r0.mopub()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            eٖٕٞ r0 = (defpackage.AbstractC16232e) r0
            eٜؒؒ r0 = r0.vip()
            eٗؓٚ r4 = r4.remoteconfig(r0)
            eٖ۟ؖ r4 = r4.build()
            eٕؒ٘ r4 = (defpackage.C1117e) r4
            if (r4 == 0) goto L7a
            r0 = 1
            r4.f29670e = r0
        L7a:
            return r4
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12092e.premium(eٕؒ٘):eٕؒ٘");
    }

    @Override // defpackage.AbstractC12654e
    public final C16169e Signature() {
        InterfaceC5052e interfaceC5052e = this.amazon;
        if (interfaceC5052e != null) {
            int i = AbstractC14300e.ad;
            return interfaceC5052e.mo1727e();
        }
        AbstractC14300e.ad(0);
        throw null;
    }

    @Override // defpackage.AbstractC12654e, defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        Object obj = this.vip.f23950e;
        return super.ad(c0520e, enumC2192e);
    }

    @Override // defpackage.AbstractC12654e
    public final void adcel(C0520e c0520e, ArrayList arrayList) {
        boolean billing = this.loadAd.billing();
        C11980e c11980e = this.vip;
        if (billing) {
            C0394e c0394e = this.appmetrica;
            if (((InterfaceC16359e) c0394e.invoke()).vip(c0520e) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((C1117e) it.next()).mo330e().isEmpty()) {
                            break;
                        }
                    }
                }
                C13313e vip = ((InterfaceC16359e) c0394e.invoke()).vip(c0520e);
                C11168e adcel = AbstractC8495e.adcel(c11980e, vip);
                C17241e c17241e = (C17241e) c11980e.f23950e;
                C0782e m401e = C0782e.m401e(this.amazon, adcel, vip.vip(), c17241e.adcel.pro(vip), true);
                AbstractC1186e m4538e = ((C18478e) c11980e.f23948e).m4538e(vip.purchase(), AbstractC10510e.purchase(2, false, null, 6));
                C16169e Signature = Signature();
                C8268e c8268e = AbstractC6050e.appmetrica;
                C13664e c13664e = C13664e.f27089e;
                m401e.mo405e(null, Signature, c13664e, c13664e, c13664e, m4538e, 3, c8268e, null);
                m401e.f3157e = 1;
                c17241e.billing.getClass();
                arrayList.add(m401e);
            }
        }
        ((C10990e) ((C17241e) c11980e.f23950e).inmobi).getClass();
    }

    @Override // defpackage.AbstractC12654e
    public final InterfaceC15498e admob() {
        return this.amazon;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.AbstractC12654e
    public final void amazon(C0520e c0520e, ArrayList arrayList) {
        C0520e c0520e2;
        boolean isAnnotation = this.loadAd.ad.isAnnotation();
        C11980e c11980e = this.vip;
        if (isAnnotation) {
            c0520e2 = c0520e;
            C6185e c6185e = (C6185e) AbstractC13480e.m3599static(((InterfaceC16359e) this.appmetrica.invoke()).metrica(c0520e2));
            if (c6185e != null) {
                C6185e c6185e2 = c6185e;
                C2398e m827e = C2398e.m827e(this.amazon, AbstractC8495e.adcel(c11980e, c6185e), AbstractC2194e.license(c6185e2.appmetrica()), false, c6185e2.vip(), ((C17241e) c11980e.f23950e).adcel.pro(c6185e), false);
                C7901e metrica = AbstractC7518e.metrica(m827e, C4590e.f9885e);
                m827e.m2780e(metrica, null, null, null);
                AbstractC1186e advert = AbstractC12654e.advert(c6185e, AbstractC8787e.vip(c11980e, m827e, c6185e, 0, c11980e.f23951e));
                C16169e Signature = Signature();
                C13664e c13664e = C13664e.f27089e;
                m827e.m2781e(advert, c13664e, Signature, null, c13664e);
                metrica.f15974e = advert;
                arrayList.add(m827e);
            }
        } else {
            c0520e2 = c0520e;
        }
        Set m3324native = m3324native(c0520e);
        if (m3324native.isEmpty()) {
            return;
        }
        int i = C7495e.f15273e;
        C7495e billing = AbstractC9464e.billing();
        C7495e billing2 = AbstractC9464e.billing();
        isPro(m3324native, arrayList, billing, new C7146e(this, 0));
        isPro(AbstractC4511e.smaato(m3324native, billing), billing2, null, new C7146e(this, 1));
        LinkedHashSet loadAd = AbstractC4511e.loadAd(m3324native, billing2);
        C17241e c17241e = (C17241e) c11980e.f23950e;
        C0520e c0520e3 = c0520e2;
        arrayList.addAll(AbstractC8913e.startapp(c0520e3, loadAd, arrayList, this.amazon, c17241e.purchase, ((C0399e) c17241e.signatures).metrica));
    }

    public final Collection applovin() {
        boolean z = this.Signature;
        InterfaceC5052e interfaceC5052e = this.amazon;
        if (z) {
            return interfaceC5052e.mo1459goto().ad();
        }
        ((C0399e) ((C17241e) this.vip.f23950e).signatures).getClass();
        return interfaceC5052e.mo1459goto().ad();
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        C8286e c8286e;
        InterfaceC5052e interfaceC5052e;
        Object obj = this.vip.f23950e;
        C12092e c12092e = (C12092e) this.metrica;
        return (c12092e == null || (c8286e = c12092e.signatures) == null || (interfaceC5052e = (InterfaceC5052e) c8286e.invoke(c0520e)) == null) ? (InterfaceC4077e) this.signatures.invoke(c0520e) : interfaceC5052e;
    }

    /* renamed from: extends, reason: not valid java name */
    public final boolean m3322extends(C1117e c1117e) {
        Collection adcel;
        C1117e c1117e2 = c1117e;
        C0520e name = c1117e2.getName();
        String vip = name.vip();
        C12816e c12816e = AbstractC7903e.ad;
        int i = 12;
        if (AbstractC6507e.pro(vip, "get", false) || AbstractC6507e.pro(vip, "is", false)) {
            C0520e metrica = AbstractC7640e.metrica(name, "get", null, 12);
            if (metrica == null) {
                metrica = AbstractC7640e.metrica(name, "is", null, 8);
            }
            adcel = AbstractC6874e.adcel(metrica);
        } else if (AbstractC6507e.pro(vip, "set", false)) {
            adcel = AbstractC1660e.isPro(new C0520e[]{AbstractC7640e.metrica(name, "set", null, 4), AbstractC7640e.metrica(name, "set", "is", 4)});
        } else {
            adcel = (List) AbstractC3380e.vip.get(name);
            if (adcel == null) {
                adcel = C13664e.f27089e;
            }
        }
        if (!adcel.isEmpty()) {
            Iterator it = adcel.iterator();
            loop0: while (it.hasNext()) {
                Set<InterfaceC2188e> m3324native = m3324native((C0520e) it.next());
                if (!(m3324native instanceof Collection) || !m3324native.isEmpty()) {
                    for (InterfaceC2188e interfaceC2188e : m3324native) {
                        if (subs(interfaceC2188e, new C17874e(c1117e, this, i)) && (interfaceC2188e.mo2386e() || !AbstractC6507e.pro(c1117e2.getName().vip(), "set", false))) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = AbstractC7928e.ad;
        C0520e c0520e = (C0520e) AbstractC7928e.mopub.get(c1117e2.getName());
        if (c0520e != null) {
            LinkedHashSet m3325this = m3325this(c0520e);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : m3325this) {
                if (AbstractC5400e.license((C1117e) obj) != null) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC16733e mo471e = c1117e.mo471e();
                mo471e.inmobi(c0520e);
                mo471e.applovin();
                mo471e.billing();
                C1117e c1117e3 = (C1117e) mo471e.build();
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (firebase((C1117e) it2.next(), c1117e3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i2 = AbstractC15540e.advert;
        if (AbstractC7928e.appmetrica.contains(c1117e2.getName())) {
            LinkedHashSet m3325this2 = m3325this(c1117e2.getName());
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = m3325this2.iterator();
            while (it3.hasNext()) {
                InterfaceC16528e ad = AbstractC15540e.ad((C1117e) it3.next());
                if (ad != null) {
                    arrayList3.add(ad);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    InterfaceC16528e interfaceC16528e = (InterfaceC16528e) it4.next();
                    if (AbstractC7890e.billing(AbstractC5209e.vip(c1117e, 2), AbstractC5209e.vip(interfaceC16528e.vip(), 2)) && !crashlytics(c1117e, interfaceC16528e)) {
                        return false;
                    }
                }
            }
        }
        C1117e premium = premium(c1117e);
        if (premium != null) {
            LinkedHashSet<C1117e> m3325this3 = m3325this(c1117e2.getName());
            if (!m3325this3.isEmpty()) {
                for (C1117e c1117e4 : m3325this3) {
                    if (c1117e4.tapsense() && crashlytics(premium, c1117e4)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inmobi(defpackage.C0520e r10, java.util.LinkedHashSet r11, java.util.LinkedHashSet r12, java.util.AbstractSet r13, kotlin.jvm.functions.Function1 r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12092e.inmobi(eؑۘٛ, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    /* renamed from: interface, reason: not valid java name */
    public final C1117e m3323interface(InterfaceC2188e interfaceC2188e, Function1 function1) {
        C0520e c0520e;
        C7901e metrica = interfaceC2188e.metrica();
        String str = null;
        C7901e c7901e = metrica != null ? (C7901e) AbstractC5400e.license(metrica) : null;
        if (c7901e != null) {
            AbstractC13270e.applovin(c7901e);
            InterfaceC0390e vip = AbstractC2876e.vip(AbstractC2876e.startapp(c7901e), C11633e.f23362e);
            if (vip != null && (c0520e = (C0520e) AbstractC3380e.ad.get(AbstractC2876e.billing(vip))) != null) {
                str = c0520e.vip();
            }
        }
        return (str == null || AbstractC5400e.appmetrica(this.amazon, c7901e)) ? m3320class(interfaceC2188e, AbstractC7903e.ad(interfaceC2188e.getName().vip()), function1) : m3320class(interfaceC2188e, str, function1);
    }

    public final void isPro(Set set, AbstractCollection abstractCollection, C7495e c7495e, Function1 function1) {
        C2042e c2042e;
        C2398e c2398e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2188e interfaceC2188e = (InterfaceC2188e) it.next();
            if (subs(interfaceC2188e, function1)) {
                C1117e m3323interface = m3323interface(interfaceC2188e, function1);
                C1117e m3321goto = interfaceC2188e.mo2386e() ? m3321goto(interfaceC2188e, function1) : null;
                if (m3321goto != null) {
                    m3321goto.mo1718extends();
                    m3323interface.mo1718extends();
                }
                C1117e c1117e = m3323interface;
                C1117e c1117e2 = m3323interface;
                C2398e c2398e2 = new C2398e(this.amazon, C4590e.f9885e, c1117e.mo1718extends(), c1117e.advert(), m3321goto != null, interfaceC2188e.getName(), c1117e2.adcel(), null, 1, false, null);
                AbstractC1186e abstractC1186e = c1117e.f29665e;
                C16169e Signature = Signature();
                C13664e c13664e = C13664e.f27089e;
                c2398e2.m2781e(abstractC1186e, c13664e, Signature, null, c13664e);
                C7901e startapp = AbstractC7518e.startapp(c2398e2, m3323interface.getAnnotations(), false, c1117e2.adcel());
                startapp.f31282e = m3323interface;
                startapp.m2354e(c2398e2.ad());
                if (m3321goto != null) {
                    C1117e c1117e3 = m3321goto;
                    C13043e c13043e = (C13043e) AbstractC13480e.m3604this(c1117e3.mo330e());
                    if (c13043e == null) {
                        throw new AssertionError("No parameter found for " + m3321goto);
                    }
                    c2042e = AbstractC7518e.adcel(c2398e2, m3321goto.getAnnotations(), c13043e.getAnnotations(), false, c1117e3.advert(), m3321goto.adcel());
                    c2042e.f31282e = m3321goto;
                } else {
                    c2042e = null;
                }
                c2398e2.m2780e(startapp, c2042e, null, null);
                c2398e = c2398e2;
            } else {
                c2398e = null;
            }
            if (c2398e != null) {
                abstractCollection.add(c2398e);
                if (c7495e != null) {
                    c7495e.add(interfaceC2188e);
                    return;
                }
                return;
            }
        }
    }

    public final void isVip(LinkedHashSet linkedHashSet, C0520e c0520e, ArrayList arrayList, boolean z) {
        C17241e c17241e = (C17241e) this.vip.f23950e;
        LinkedHashSet<C1117e> startapp = AbstractC8913e.startapp(c0520e, arrayList, linkedHashSet, this.amazon, c17241e.purchase, ((C0399e) c17241e.signatures).metrica);
        if (!z) {
            linkedHashSet.addAll(startapp);
            return;
        }
        ArrayList m3584final = AbstractC13480e.m3584final(linkedHashSet, startapp);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(startapp, 10));
        for (C1117e c1117e : startapp) {
            InterfaceC0390e license = AbstractC5400e.license(c1117e);
            if (license == null) {
                int i = AbstractC15540e.advert;
                license = !AbstractC7928e.appmetrica.contains(c1117e.getName()) ? null : AbstractC2876e.vip(c1117e, C15146e.f29964e);
            }
            C1117e c1117e2 = (C1117e) license;
            if (c1117e2 != null) {
                c1117e = ads(c1117e, c1117e2, m3584final);
            }
            arrayList2.add(c1117e);
        }
        linkedHashSet.addAll(arrayList2);
    }

    @Override // defpackage.AbstractC12654e
    public final Set loadAd() {
        if (this.loadAd.ad.isAnnotation()) {
            return vip();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC16359e) this.appmetrica.invoke()).purchase());
        Iterator it = this.amazon.mo1459goto().ad().iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(linkedHashSet, ((AbstractC1186e) it.next()).mo483e().billing());
        }
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC12654e
    public final InterfaceC16359e mopub() {
        return new C14969e(this.loadAd, C8865e.f17804e);
    }

    /* renamed from: native, reason: not valid java name */
    public final Set m3324native(C0520e c0520e) {
        Collection applovin = applovin();
        ArrayList arrayList = new ArrayList();
        Iterator it = applovin.iterator();
        while (it.hasNext()) {
            Collection purchase = ((AbstractC1186e) it.next()).mo483e().purchase(c0520e, EnumC2192e.f5572e);
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(purchase, 10));
            Iterator it2 = purchase.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC2188e) it2.next());
            }
            AbstractC13480e.inmobi(arrayList, arrayList2);
        }
        return AbstractC13480e.m3582e(arrayList);
    }

    @Override // defpackage.AbstractC12654e, defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        Object obj = this.vip.f23950e;
        return super.purchase(c0520e, enumC2192e);
    }

    @Override // defpackage.AbstractC12654e
    public final C4296e remoteconfig(ArrayList arrayList, AbstractC1186e abstractC1186e, List list) {
        ((C17241e) this.vip.f23950e).appmetrica.getClass();
        if (this.amazon != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new C4296e(abstractC1186e, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC12654e
    public final void smaato(LinkedHashSet linkedHashSet, C0520e c0520e) {
        LinkedHashSet m3325this = m3325this(c0520e);
        ArrayList arrayList = AbstractC7928e.ad;
        if (!AbstractC7928e.adcel.contains(c0520e)) {
            int i = AbstractC15540e.advert;
            if (!AbstractC7928e.appmetrica.contains(c0520e)) {
                if (!m3325this.isEmpty()) {
                    Iterator it = m3325this.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC16528e) it.next()).tapsense()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : m3325this) {
                    if (m3322extends((C1117e) obj)) {
                        arrayList2.add(obj);
                    }
                }
                isVip(linkedHashSet, c0520e, arrayList2, false);
                return;
            }
        }
        int i2 = C7495e.f15273e;
        C7495e billing = AbstractC9464e.billing();
        LinkedHashSet startapp = AbstractC8913e.startapp(c0520e, m3325this, C13664e.f27089e, this.amazon, InterfaceC13521e.tapsense, ((C0399e) ((C17241e) this.vip.f23950e).signatures).metrica);
        int i3 = 0;
        int i4 = 0;
        inmobi(c0520e, linkedHashSet, startapp, linkedHashSet, new C2098e(1, this, C12092e.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i4, i3, 18));
        inmobi(c0520e, linkedHashSet, startapp, billing, new C2098e(1, this, C12092e.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i4, i3, 19));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m3325this) {
            if (m3322extends((C1117e) obj2)) {
                arrayList3.add(obj2);
            }
        }
        isVip(linkedHashSet, c0520e, AbstractC13480e.m3584final(arrayList3, billing), true);
    }

    @Override // defpackage.AbstractC12654e
    public final Set startapp(C4942e c4942e, C8865e c8865e) {
        Collection ad = this.amazon.mo1459goto().ad();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(linkedHashSet, ((AbstractC1186e) it.next()).mo483e().vip());
        }
        C0394e c0394e = this.appmetrica;
        linkedHashSet.addAll(((InterfaceC16359e) c0394e.invoke()).ad());
        linkedHashSet.addAll(((InterfaceC16359e) c0394e.invoke()).appmetrica());
        linkedHashSet.addAll(yandex(c4942e, c8865e));
        ((C10990e) ((C17241e) this.vip.f23950e).inmobi).getClass();
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    public final boolean subs(InterfaceC2188e interfaceC2188e, Function1 function1) {
        if (interfaceC2188e.metrica() == null) {
            return false;
        }
        C1117e m3323interface = m3323interface(interfaceC2188e, function1);
        C1117e m3321goto = m3321goto(interfaceC2188e, function1);
        if (m3323interface == null) {
            return false;
        }
        if (interfaceC2188e.mo2386e()) {
            return m3321goto != null && m3321goto.mo1718extends() == m3323interface.mo1718extends();
        }
        return true;
    }

    @Override // defpackage.AbstractC12654e
    public final boolean subscription(C0782e c0782e) {
        if (this.loadAd.ad.isAnnotation()) {
            return false;
        }
        return m3322extends(c0782e);
    }

    public final void tapsense(ArrayList arrayList, C10687e c10687e, int i, C6185e c6185e, AbstractC1186e abstractC1186e, AbstractC1186e abstractC1186e2) {
        InterfaceC16083e interfaceC16083e;
        C11064e c11064e = C4590e.f9885e;
        C0520e vip = c6185e.vip();
        if (abstractC1186e == null) {
            AbstractC11957e.ad(2);
            throw null;
        }
        AbstractC15728e billing = AbstractC11957e.billing(abstractC1186e, false);
        Object defaultValue = c6185e.ad.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = AbstractC2677e.ad;
            interfaceC16083e = Enum.class.isAssignableFrom(cls) ? new C16910e(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new C15026e(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new C17745e(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new C17255e(null, (Class) defaultValue) : new C4451e(null, defaultValue);
        } else {
            interfaceC16083e = null;
        }
        arrayList.add(new C13043e(c10687e, null, i, c11064e, vip, billing, interfaceC16083e != null, false, false, abstractC1186e2 != null ? AbstractC11957e.billing(abstractC1186e2, false) : null, ((C17241e) this.vip.f23950e).adcel.pro(c6185e)));
    }

    /* renamed from: this, reason: not valid java name */
    public final LinkedHashSet m3325this(C0520e c0520e) {
        Collection applovin = applovin();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = applovin.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(linkedHashSet, ((AbstractC1186e) it.next()).mo483e().ad(c0520e, EnumC2192e.f5572e));
        }
        return linkedHashSet;
    }

    /* renamed from: throw, reason: not valid java name */
    public final ArrayList m3326throw(C0520e c0520e) {
        Collection metrica = ((InterfaceC16359e) this.appmetrica.invoke()).metrica(c0520e);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(metrica, 10));
        Iterator it = metrica.iterator();
        while (it.hasNext()) {
            arrayList.add(pro((C6185e) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC12654e
    public final String toString() {
        return "Lazy Java member scope for " + this.loadAd.vip();
    }

    /* renamed from: while, reason: not valid java name */
    public final ArrayList m3327while(C0520e c0520e) {
        LinkedHashSet m3325this = m3325this(c0520e);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m3325this) {
            C1117e c1117e = (C1117e) obj;
            if (AbstractC5400e.license(c1117e) == null && AbstractC15540e.ad(c1117e) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC12654e
    public final Set yandex(C4942e c4942e, Function1 function1) {
        return AbstractC4511e.loadAd((Set) this.subscription.invoke(), ((Map) this.pro.invoke()).keySet());
    }
}
