package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18465e implements InterfaceC8528e {
    public final C5363e appmetrica = new C5363e(new C17197e(8, this));
    public HashMap license;
    public final C4542e metrica;
    public final InterfaceC8528e vip;

    public C18465e(InterfaceC8528e interfaceC8528e, C4542e c4542e) {
        this.vip = interfaceC8528e;
        this.metrica = new C4542e(AbstractC4224e.smaato(c4542e.purchase()));
    }

    @Override // defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        return startapp(this.vip.ad(c0520e, enumC2192e));
    }

    @Override // defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC4077e appmetrica = this.vip.appmetrica(c0520e, enumC2192e);
        if (appmetrica != null) {
            return (InterfaceC4077e) yandex(appmetrica);
        }
        return null;
    }

    @Override // defpackage.InterfaceC8528e
    public final Set billing() {
        return this.vip.billing();
    }

    @Override // defpackage.InterfaceC8528e
    public final Set license() {
        return this.vip.license();
    }

    @Override // defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        return (Collection) this.appmetrica.getValue();
    }

    @Override // defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        return startapp(this.vip.purchase(c0520e, enumC2192e));
    }

    public final Collection startapp(Collection collection) {
        if (this.metrica.ad.appmetrica() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(yandex((InterfaceC15498e) it.next()));
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC8528e
    public final Set vip() {
        return this.vip.vip();
    }

    public final InterfaceC15498e yandex(InterfaceC15498e interfaceC15498e) {
        C4542e c4542e = this.metrica;
        if (c4542e.ad.appmetrica()) {
            return interfaceC15498e;
        }
        if (this.license == null) {
            this.license = new HashMap();
        }
        HashMap hashMap = this.license;
        Object obj = hashMap.get(interfaceC15498e);
        if (obj == null) {
            if (!(interfaceC15498e instanceof InterfaceC7681e)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC15498e).toString());
            }
            obj = ((InterfaceC7681e) interfaceC15498e).remoteconfig(c4542e);
            if (obj == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC15498e + " substitution fails");
            }
            hashMap.put(interfaceC15498e, obj);
        }
        return (InterfaceC15498e) obj;
    }
}
