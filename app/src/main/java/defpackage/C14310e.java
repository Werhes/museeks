package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۡ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14310e implements InterfaceC8528e {
    public final InterfaceC8528e[] metrica;
    public final String vip;

    public C14310e(String str, InterfaceC8528e[] interfaceC8528eArr) {
        this.vip = str;
        this.metrica = interfaceC8528eArr;
    }

    @Override // defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC8528e[] interfaceC8528eArr = this.metrica;
        int length = interfaceC8528eArr.length;
        if (length == 0) {
            return C13664e.f27089e;
        }
        if (length == 1) {
            return interfaceC8528eArr[0].ad(c0520e, enumC2192e);
        }
        Collection collection = null;
        for (InterfaceC8528e interfaceC8528e : interfaceC8528eArr) {
            collection = AbstractC14161e.metrica(collection, interfaceC8528e.ad(c0520e, enumC2192e));
        }
        return collection == null ? C3295e.f7451e : collection;
    }

    @Override // defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC4077e interfaceC4077e = null;
        for (InterfaceC8528e interfaceC8528e : this.metrica) {
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
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8528e interfaceC8528e : this.metrica) {
            AbstractC13480e.inmobi(linkedHashSet, interfaceC8528e.billing());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC8528e
    public final Set license() {
        InterfaceC8528e[] interfaceC8528eArr = this.metrica;
        return AbstractC17540e.metrica(interfaceC8528eArr.length == 0 ? C13664e.f27089e : new C8950e(0, interfaceC8528eArr));
    }

    @Override // defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        InterfaceC8528e[] interfaceC8528eArr = this.metrica;
        int length = interfaceC8528eArr.length;
        if (length == 0) {
            return C13664e.f27089e;
        }
        if (length == 1) {
            return interfaceC8528eArr[0].metrica(c4942e, function1);
        }
        Collection collection = null;
        for (InterfaceC8528e interfaceC8528e : interfaceC8528eArr) {
            collection = AbstractC14161e.metrica(collection, interfaceC8528e.metrica(c4942e, function1));
        }
        return collection == null ? C3295e.f7451e : collection;
    }

    @Override // defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC8528e[] interfaceC8528eArr = this.metrica;
        int length = interfaceC8528eArr.length;
        if (length == 0) {
            return C13664e.f27089e;
        }
        if (length == 1) {
            return interfaceC8528eArr[0].purchase(c0520e, enumC2192e);
        }
        Collection collection = null;
        for (InterfaceC8528e interfaceC8528e : interfaceC8528eArr) {
            collection = AbstractC14161e.metrica(collection, interfaceC8528e.purchase(c0520e, enumC2192e));
        }
        return collection == null ? C3295e.f7451e : collection;
    }

    public final String toString() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC8528e
    public final Set vip() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8528e interfaceC8528e : this.metrica) {
            AbstractC13480e.inmobi(linkedHashSet, interfaceC8528e.vip());
        }
        return linkedHashSet;
    }
}
