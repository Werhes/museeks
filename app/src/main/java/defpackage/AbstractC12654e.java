package defpackage;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12654e extends AbstractC8530e {
    public static final /* synthetic */ InterfaceC8614e[] smaato;
    public final C0394e adcel;
    public final C1159e advert;
    public final C0394e appmetrica;
    public final C8286e billing;
    public final C3117e license;
    public final AbstractC12654e metrica;
    public final C0394e mopub;
    public final C1159e purchase;
    public final C0394e startapp;
    public final C11980e vip;
    public final C1159e yandex;

    static {
        C12156e c12156e = new C12156e(AbstractC12654e.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        smaato = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(AbstractC12654e.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, c12232e), AbstractC4653e.tapsense(AbstractC12654e.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, c12232e)};
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؕؔۡ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eٖؑٚ, eٖۥٌ] */
    public AbstractC12654e(C11980e c11980e, C12092e c12092e) {
        this.vip = c11980e;
        this.metrica = c12092e;
        InterfaceC11542e interfaceC11542e = ((C17241e) c11980e.f23950e).ad;
        C16926e c16926e = new C16926e(this, 0);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.license = new C16622e(c6272e, c16926e);
        C16926e c16926e2 = new C16926e(this, 1);
        C6272e c6272e2 = (C6272e) interfaceC11542e;
        c6272e2.getClass();
        this.appmetrica = new C16622e(c6272e2, c16926e2);
        this.purchase = ((C6272e) interfaceC11542e).vip(new C15642e(this, 0));
        this.billing = ((C6272e) interfaceC11542e).metrica(new C15642e(this, 1));
        this.yandex = ((C6272e) interfaceC11542e).vip(new C15642e(this, 2));
        C16926e c16926e3 = new C16926e(this, 2);
        C6272e c6272e3 = (C6272e) interfaceC11542e;
        c6272e3.getClass();
        this.startapp = new C16622e(c6272e3, c16926e3);
        C16926e c16926e4 = new C16926e(this, 3);
        C6272e c6272e4 = (C6272e) interfaceC11542e;
        c6272e4.getClass();
        this.adcel = new C16622e(c6272e4, c16926e4);
        C16926e c16926e5 = new C16926e(this, 4);
        C6272e c6272e5 = (C6272e) interfaceC11542e;
        c6272e5.getClass();
        this.mopub = new C16622e(c6272e5, c16926e5);
        this.advert = ((C6272e) interfaceC11542e).vip(new C15642e(this, 3));
    }

    public static AbstractC1186e advert(C6185e c6185e, C11980e c11980e) {
        return ((C18478e) c11980e.f23948e).m4538e(c6185e.purchase(), AbstractC10510e.purchase(2, c6185e.ad().getDeclaringClass().isAnnotation(), null, 6));
    }

    public static C13486e signatures(C11980e c11980e, AbstractC14957e abstractC14957e, List list) {
        C6571e c6571e;
        AbstractC1186e abstractC1186e;
        C0520e c0520e;
        C0520e appmetrica;
        C18478e c18478e = (C18478e) c11980e.f23948e;
        C17241e c17241e = (C17241e) c11980e.f23950e;
        InterfaceC5334e interfaceC5334e = c17241e.loadAd;
        C8950e m3580e = AbstractC13480e.m3580e(list);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3580e, 10));
        Iterator it = m3580e.iterator();
        boolean z = false;
        while (true) {
            C2320e c2320e = (C2320e) it;
            if (!c2320e.f5836e.hasNext()) {
                return new C13486e(AbstractC13480e.m3575continue(arrayList), z);
            }
            C9817e c9817e = (C9817e) c2320e.next();
            int i = c9817e.ad;
            C10034e c10034e = (C10034e) c9817e.vip;
            C11168e adcel = AbstractC8495e.adcel(c11980e, c10034e);
            C9265e purchase = AbstractC10510e.purchase(2, false, null, 7);
            AbstractC16397e abstractC16397e = c10034e.ad;
            if (c10034e.license) {
                C12860e c12860e = abstractC16397e instanceof C12860e ? (C12860e) abstractC16397e : null;
                if (c12860e == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + c10034e);
                }
                AbstractC15728e m4537e = c18478e.m4537e(c12860e, purchase, true);
                c6571e = new C6571e(m4537e, interfaceC5334e.amazon().purchase(m4537e));
            } else {
                c6571e = new C6571e(c18478e.m4538e(abstractC16397e, purchase), null);
            }
            AbstractC1186e abstractC1186e2 = (AbstractC1186e) c6571e.f13544e;
            AbstractC1186e abstractC1186e3 = (AbstractC1186e) c6571e.f13543e;
            if (AbstractC7890e.billing(abstractC14957e.getName().vip(), "equals") && list.size() == 1 && interfaceC5334e.amazon().loadAd().equals(abstractC1186e2)) {
                appmetrica = C0520e.appmetrica("other");
            } else {
                String str = c10034e.metrica;
                C0520e license = str != null ? C0520e.license(str) : null;
                if (license == null) {
                    z = true;
                }
                if (license == null) {
                    appmetrica = C0520e.appmetrica("p" + i);
                } else {
                    abstractC1186e = abstractC1186e2;
                    c0520e = license;
                    arrayList.add(new C13043e(abstractC14957e, null, i, adcel, c0520e, abstractC1186e, false, false, false, abstractC1186e3, c17241e.adcel.pro(c10034e)));
                }
            }
            abstractC1186e = abstractC1186e2;
            c0520e = appmetrica;
            arrayList.add(new C13043e(abstractC14957e, null, i, adcel, c0520e, abstractC1186e, false, false, false, abstractC1186e3, c17241e.adcel.pro(c10034e)));
        }
    }

    public abstract C16169e Signature();

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        return !vip().contains(c0520e) ? C13664e.f27089e : (Collection) this.yandex.invoke(c0520e);
    }

    public void adcel(C0520e c0520e, ArrayList arrayList) {
    }

    public abstract InterfaceC15498e admob();

    public abstract void amazon(C0520e c0520e, ArrayList arrayList);

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set billing() {
        InterfaceC8614e interfaceC8614e = smaato[1];
        return (Set) this.adcel.invoke();
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set license() {
        InterfaceC8614e interfaceC8614e = smaato[2];
        return (Set) this.mopub.invoke();
    }

    public abstract Set loadAd();

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public Collection metrica(C4942e c4942e, Function1 function1) {
        return (Collection) this.license.invoke();
    }

    public abstract InterfaceC16359e mopub();

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, eؕٛؓ] */
    public final C0782e pro(C6185e c6185e) {
        C11980e c11980e = this.vip;
        C6185e c6185e2 = c6185e;
        int i = 1;
        C0782e m401e = C0782e.m401e(admob(), AbstractC8495e.adcel(c11980e, c6185e), c6185e2.vip(), ((C17241e) c11980e.f23950e).adcel.pro(c6185e), ((InterfaceC16359e) this.appmetrica.invoke()).vip(c6185e2.vip()) != null && ((ArrayList) c6185e.billing()).isEmpty());
        C11980e vip = AbstractC8787e.vip(c11980e, m401e, c6185e, 0, c11980e.f23951e);
        ArrayList typeParameters = c6185e.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10383e) vip.f23949e).license((C0317e) it.next()));
        }
        C13486e signatures = signatures(vip, m401e, c6185e.billing());
        C4296e remoteconfig = remoteconfig(arrayList, advert(c6185e, vip), signatures.vip);
        List list = remoteconfig.license;
        C16169e Signature = Signature();
        ArrayList arrayList2 = remoteconfig.metrica;
        List list2 = remoteconfig.vip;
        AbstractC1186e abstractC1186e = remoteconfig.ad;
        boolean isAbstract = Modifier.isAbstract(c6185e2.ad().getModifiers());
        boolean isFinal = Modifier.isFinal(c6185e2.ad().getModifiers());
        if (isAbstract) {
            i = 4;
        } else if (!isFinal) {
            i = 3;
        }
        m401e.mo405e(null, Signature, C13664e.f27089e, arrayList2, list2, abstractC1186e, i, AbstractC2194e.license(c6185e2.appmetrica()), C9139e.f18290e);
        m401e.m404e(false, signatures.metrica);
        if (list.isEmpty()) {
            return m401e;
        }
        ((C17241e) vip.f23950e).appmetrica.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        return !billing().contains(c0520e) ? C13664e.f27089e : (Collection) this.advert.invoke(c0520e);
    }

    public abstract C4296e remoteconfig(ArrayList arrayList, AbstractC1186e abstractC1186e, List list);

    public abstract void smaato(LinkedHashSet linkedHashSet, C0520e c0520e);

    public abstract Set startapp(C4942e c4942e, C8865e c8865e);

    public boolean subscription(C0782e c0782e) {
        return true;
    }

    public String toString() {
        return "Lazy scope for " + admob();
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set vip() {
        InterfaceC8614e interfaceC8614e = smaato[0];
        return (Set) this.startapp.invoke();
    }

    public abstract Set yandex(C4942e c4942e, Function1 function1);
}
