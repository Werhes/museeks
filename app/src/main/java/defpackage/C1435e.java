package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۤٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1435e implements InterfaceC8528e {
    public static final /* synthetic */ InterfaceC8614e[] purchase = {AbstractC3820e.ad.yandex(new C12156e(C1435e.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public final C0394e appmetrica;
    public final C5218e license;
    public final C3646e metrica;
    public final C11980e vip;

    /* JADX WARN: Type inference failed for: r4v2, types: [eٖؑٚ, eٖۥٌ] */
    public C1435e(C11980e c11980e, C3825e c3825e, C3646e c3646e) {
        this.vip = c11980e;
        this.metrica = c3646e;
        this.license = new C5218e(c11980e, c3825e, c3646e);
        InterfaceC11542e interfaceC11542e = ((C17241e) c11980e.f23950e).ad;
        C3411e c3411e = new C3411e(28, this);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.appmetrica = new C16622e(c6272e, c3411e);
    }

    @Override // defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        String str = this.metrica.f29618e.ad.ad;
        c0520e.vip();
        InterfaceC8528e[] yandex = yandex();
        Collection ad = this.license.ad(c0520e, enumC2192e);
        for (InterfaceC8528e interfaceC8528e : yandex) {
            ad = AbstractC14161e.metrica(ad, interfaceC8528e.ad(c0520e, enumC2192e));
        }
        return ad == null ? C3295e.f7451e : ad;
    }

    @Override // defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        String str = this.metrica.f29618e.ad.ad;
        c0520e.vip();
        InterfaceC4077e interfaceC4077e = null;
        InterfaceC5052e tapsense = this.license.tapsense(c0520e, null);
        if (tapsense != null) {
            return tapsense;
        }
        for (InterfaceC8528e interfaceC8528e : yandex()) {
            InterfaceC4077e appmetrica = interfaceC8528e.appmetrica(c0520e, enumC2192e);
            if (appmetrica != null) {
                if (!(appmetrica instanceof InterfaceC2978e) || !((InterfaceC17577e) appmetrica).mo1942e()) {
                    return appmetrica;
                }
                if (interfaceC4077e == null) {
                    interfaceC4077e = appmetrica;
                }
            }
        }
        return interfaceC4077e;
    }

    @Override // defpackage.InterfaceC8528e
    public final Set billing() {
        InterfaceC8528e[] yandex = yandex();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8528e interfaceC8528e : yandex) {
            AbstractC13480e.inmobi(linkedHashSet, interfaceC8528e.billing());
        }
        linkedHashSet.addAll(this.license.billing());
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC8528e
    public final Set license() {
        InterfaceC8528e[] yandex = yandex();
        HashSet metrica = AbstractC17540e.metrica(yandex.length == 0 ? C13664e.f27089e : new C8950e(0, yandex));
        if (metrica == null) {
            return null;
        }
        metrica.addAll(this.license.license());
        return metrica;
    }

    @Override // defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        InterfaceC8528e[] yandex = yandex();
        Collection metrica = this.license.metrica(c4942e, function1);
        for (InterfaceC8528e interfaceC8528e : yandex) {
            metrica = AbstractC14161e.metrica(metrica, interfaceC8528e.metrica(c4942e, function1));
        }
        return metrica == null ? C3295e.f7451e : metrica;
    }

    @Override // defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        String str = this.metrica.f29618e.ad.ad;
        c0520e.vip();
        InterfaceC8528e[] yandex = yandex();
        this.license.getClass();
        Collection collection = C13664e.f27089e;
        for (InterfaceC8528e interfaceC8528e : yandex) {
            collection = AbstractC14161e.metrica(collection, interfaceC8528e.purchase(c0520e, enumC2192e));
        }
        return collection == null ? C3295e.f7451e : collection;
    }

    public final String toString() {
        return "scope for " + this.metrica;
    }

    @Override // defpackage.InterfaceC8528e
    public final Set vip() {
        InterfaceC8528e[] yandex = yandex();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8528e interfaceC8528e : yandex) {
            AbstractC13480e.inmobi(linkedHashSet, interfaceC8528e.vip());
        }
        linkedHashSet.addAll(this.license.vip());
        return linkedHashSet;
    }

    public final InterfaceC8528e[] yandex() {
        InterfaceC8614e interfaceC8614e = purchase[0];
        return (InterfaceC8528e[]) this.appmetrica.invoke();
    }
}
