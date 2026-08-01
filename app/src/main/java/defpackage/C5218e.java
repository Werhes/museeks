package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5218e extends AbstractC7722e {
    public final C16622e Signature;
    public final C8286e admob;
    public final C3825e amazon;
    public final C3646e loadAd;

    public C5218e(C11980e c11980e, C3825e c3825e, C3646e c3646e) {
        super(c11980e, null);
        this.amazon = c3825e;
        this.loadAd = c3646e;
        InterfaceC11542e interfaceC11542e = ((C17241e) c11980e.f23950e).ad;
        C1021e c1021e = new C1021e(c11980e, this, 0);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.Signature = new C16622e(c6272e, c1021e);
        this.admob = ((C6272e) interfaceC11542e).metrica(new C17874e(this, c11980e, 13));
    }

    @Override // defpackage.AbstractC12654e
    public final InterfaceC15498e admob() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        return tapsense(c0520e, null);
    }

    @Override // defpackage.AbstractC12654e
    public final Set loadAd() {
        return C3295e.f7451e;
    }

    @Override // defpackage.AbstractC12654e, defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        if (!c4942e.ad(C4942e.advert | C4942e.appmetrica)) {
            return C13664e.f27089e;
        }
        Iterable iterable = (Iterable) this.license.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC15498e interfaceC15498e = (InterfaceC15498e) obj;
            if ((interfaceC15498e instanceof InterfaceC5052e) && ((Boolean) function1.invoke(((InterfaceC5052e) interfaceC15498e).getName())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC12654e
    public final InterfaceC16359e mopub() {
        return C1674e.ad;
    }

    @Override // defpackage.AbstractC12654e, defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        return C13664e.f27089e;
    }

    @Override // defpackage.AbstractC12654e
    public final void smaato(LinkedHashSet linkedHashSet, C0520e c0520e) {
    }

    @Override // defpackage.AbstractC12654e
    public final Set startapp(C4942e c4942e, C8865e c8865e) {
        return C3295e.f7451e;
    }

    public final InterfaceC5052e tapsense(C0520e c0520e, C17070e c17070e) {
        C0520e c0520e2 = AbstractC13893e.ad;
        if (c0520e.vip().length() <= 0 || c0520e.f2666e) {
            return null;
        }
        Set set = (Set) this.Signature.invoke();
        if (c17070e == null && set != null && !set.contains(c0520e.vip())) {
            return null;
        }
        return (InterfaceC5052e) this.admob.invoke(new C8215e(c0520e, c17070e));
    }

    @Override // defpackage.AbstractC12654e
    public final Set yandex(C4942e c4942e, Function1 function1) {
        if (!c4942e.ad(C4942e.appmetrica)) {
            return C3295e.f7451e;
        }
        Set set = (Set) this.Signature.invoke();
        if (set == null) {
            this.amazon.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(C0520e.appmetrica((String) it.next()));
        }
        return hashSet;
    }
}
