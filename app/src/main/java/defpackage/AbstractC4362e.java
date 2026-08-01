package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4362e extends AbstractC8530e {
    public static final /* synthetic */ InterfaceC8614e[] purchase;
    public final C16622e appmetrica;
    public final C0394e license;
    public final C8624e metrica;
    public final C4956e vip;

    static {
        C12156e c12156e = new C12156e(AbstractC4362e.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        purchase = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(AbstractC4362e.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, c12232e)};
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eٖؑٚ, eٖۥٌ] */
    public AbstractC4362e(C4956e c4956e, List list, List list2, List list3, Function0 function0) {
        this.vip = c4956e;
        C18277e c18277e = (C18277e) c4956e.f10517e;
        ((C11047e) c18277e.metrica).getClass();
        this.metrica = new C8624e(this, list, list2, list3);
        C6272e c6272e = (C6272e) c18277e.ad;
        C0327e c0327e = new C0327e(0, function0);
        c6272e.getClass();
        this.license = new C16622e(c6272e, c0327e);
        C3411e c3411e = new C3411e(16, this);
        c6272e.getClass();
        this.appmetrica = new C16622e(c6272e, c3411e);
    }

    public abstract Set Signature();

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        C8624e c8624e = this.metrica;
        C0394e c0394e = c8624e.billing;
        InterfaceC8614e interfaceC8614e = C8624e.adcel[0];
        return !((Set) c0394e.invoke()).contains(c0520e) ? C13664e.f27089e : (Collection) c8624e.license.invoke(c0520e);
    }

    public void adcel(C0520e c0520e, ArrayList arrayList) {
    }

    public boolean admob(C0520e c0520e) {
        return smaato().contains(c0520e);
    }

    public abstract C11709e advert(C0520e c0520e);

    public abstract Set amazon();

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        if (admob(c0520e)) {
            return (InterfaceC5052e) ((C12917e) ((C18277e) this.vip.f10517e).remoteconfig).vip.invoke(new C4712e(advert(c0520e), null));
        }
        C8624e c8624e = this.metrica;
        if (c8624e.metrica.keySet().contains(c0520e)) {
            return (InterfaceC9794e) c8624e.purchase.invoke(c0520e);
        }
        return null;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set billing() {
        C0394e c0394e = this.metrica.yandex;
        InterfaceC8614e interfaceC8614e = C8624e.adcel[1];
        return (Set) c0394e.invoke();
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set license() {
        InterfaceC8614e interfaceC8614e = purchase[1];
        return (Set) this.appmetrica.invoke();
    }

    public abstract Set loadAd();

    public void mopub(C0520e c0520e, ArrayList arrayList) {
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        C8624e c8624e = this.metrica;
        C0394e c0394e = c8624e.yandex;
        InterfaceC8614e interfaceC8614e = C8624e.adcel[1];
        return !((Set) c0394e.invoke()).contains(c0520e) ? C13664e.f27089e : (Collection) c8624e.appmetrica.invoke(c0520e);
    }

    public final Set smaato() {
        InterfaceC8614e interfaceC8614e = purchase[0];
        return (Set) this.license.invoke();
    }

    public final List startapp(C4942e c4942e, Function1 function1) {
        ArrayList arrayList = new ArrayList(0);
        if (c4942e.ad(C4942e.purchase)) {
            yandex(arrayList);
        }
        C8624e c8624e = this.metrica;
        c8624e.getClass();
        C0394e c0394e = c8624e.billing;
        C0394e c0394e2 = c8624e.yandex;
        C11021e c11021e = C11021e.f21841e;
        boolean ad = c4942e.ad(C4942e.adcel);
        C13664e c13664e = C13664e.f27089e;
        if (ad) {
            InterfaceC8614e interfaceC8614e = C8624e.adcel[1];
            Set<C0520e> set = (Set) c0394e2.invoke();
            ArrayList arrayList2 = new ArrayList();
            for (C0520e c0520e : set) {
                if (((Boolean) function1.invoke(c0520e)).booleanValue()) {
                    InterfaceC8614e interfaceC8614e2 = C8624e.adcel[1];
                    arrayList2.addAll(!((Set) c0394e2.invoke()).contains(c0520e) ? c13664e : (Collection) c8624e.appmetrica.invoke(c0520e));
                }
            }
            AbstractC5167e.signatures(c11021e, arrayList2);
            arrayList.addAll(arrayList2);
        }
        if (c4942e.ad(C4942e.startapp)) {
            InterfaceC8614e interfaceC8614e3 = C8624e.adcel[0];
            Set<C0520e> set2 = (Set) c0394e.invoke();
            ArrayList arrayList3 = new ArrayList();
            for (C0520e c0520e2 : set2) {
                if (((Boolean) function1.invoke(c0520e2)).booleanValue()) {
                    InterfaceC8614e interfaceC8614e4 = C8624e.adcel[0];
                    arrayList3.addAll(!((Set) c0394e.invoke()).contains(c0520e2) ? c13664e : (Collection) c8624e.license.invoke(c0520e2));
                }
            }
            AbstractC5167e.signatures(c11021e, arrayList3);
            arrayList.addAll(arrayList3);
        }
        if (c4942e.ad(C4942e.advert)) {
            for (C0520e c0520e3 : smaato()) {
                if (((Boolean) function1.invoke(c0520e3)).booleanValue()) {
                    AbstractC9386e.vip(arrayList, (InterfaceC5052e) ((C12917e) ((C18277e) this.vip.f10517e).remoteconfig).vip.invoke(new C4712e(advert(c0520e3), null)));
                }
            }
        }
        if (c4942e.ad(C4942e.billing)) {
            for (C0520e c0520e4 : c8624e.metrica.keySet()) {
                if (((Boolean) function1.invoke(c0520e4)).booleanValue()) {
                    AbstractC9386e.vip(arrayList, (InterfaceC9794e) c8624e.purchase.invoke(c0520e4));
                }
            }
        }
        return AbstractC9386e.license(arrayList);
    }

    public boolean subscription(C0530e c0530e) {
        return true;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set vip() {
        C0394e c0394e = this.metrica.billing;
        InterfaceC8614e interfaceC8614e = C8624e.adcel[0];
        return (Set) c0394e.invoke();
    }

    public abstract void yandex(ArrayList arrayList);
}
