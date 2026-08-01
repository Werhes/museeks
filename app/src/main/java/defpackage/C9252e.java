package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9252e implements InterfaceC14956e {
    public final C11980e ad;
    public final C1159e vip;

    public C9252e(C17241e c17241e) {
        this.ad = new C11980e(c17241e, C9616e.f19076e, new C12242e(null));
        C6272e c6272e = (C6272e) c17241e.ad;
        c6272e.getClass();
        this.vip = new C1159e(c6272e, new ConcurrentHashMap(3, 1.0f, 2), new C3801e(1), 0);
    }

    @Override // defpackage.InterfaceC14956e
    public final List ad(C12816e c12816e) {
        return Collections.singletonList(license(c12816e));
    }

    @Override // defpackage.InterfaceC14956e
    public final Collection crashlytics(C12816e c12816e, Function1 function1) {
        List list = (List) license(c12816e).f8201e.invoke();
        return list == null ? C13664e.f27089e : list;
    }

    public final C3646e license(C12816e c12816e) {
        ((C17241e) this.ad.f23950e).vip.getClass();
        C2708e c2708e = new C2708e(this, new C3825e(c12816e), 1);
        C1159e c1159e = this.vip;
        c1159e.getClass();
        Object invoke = c1159e.invoke(new C6391e(c12816e, c2708e));
        if (invoke != null) {
            return (C3646e) invoke;
        }
        C1159e.ad(3);
        throw null;
    }

    @Override // defpackage.InterfaceC14956e
    public final void metrica(C12816e c12816e, ArrayList arrayList) {
        arrayList.add(license(c12816e));
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C17241e) this.ad.f23950e).loadAd;
    }

    @Override // defpackage.InterfaceC14956e
    public final boolean vip(C12816e c12816e) {
        ((C17241e) this.ad.f23950e).vip.getClass();
        return false;
    }
}
