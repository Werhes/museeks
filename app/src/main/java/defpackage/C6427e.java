package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6427e implements InterfaceC18107e {
    public final Object license = AbstractC18039e.appmetrica(3, new C14515e(23, this));
    public final C12695e metrica;

    public C6427e(C12695e c12695e) {
        this.metrica = c12695e;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: const */
    public final boolean mo456const() {
        return true;
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean contains(String str) {
        return mo457e("X-Req-Hash") != null;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍۢؒ */
    public final List mo457e(String str) {
        C12695e c12695e = this.metrica;
        c12695e.getClass();
        List Signature = AbstractC7762e.Signature(new C2167e(new C1356e(new C16842e(c12695e, str, null)), new C17014e(23)));
        if (Signature.isEmpty()) {
            return null;
        }
        return Signature;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC4023e
    /* renamed from: eُۘٙ */
    public final Set mo458e() {
        return (Set) this.license.getValue();
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eؙِۡ */
    public final String mo459e(String str) {
        C4860e ad = this.metrica.ad(str);
        if (ad != null) {
            return ad.toString();
        }
        return null;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍٓۢ */
    public final /* bridge */ void mo460e(Function2 function2) {
        AbstractC1786e.ad(this, function2);
    }

    @Override // defpackage.InterfaceC4023e
    public final Set mopub() {
        Iterator it = this.metrica.license.vip().iterator();
        if (!it.hasNext()) {
            return C3295e.f7451e;
        }
        C1659e c1659e = new C1659e(this, ((Integer) it.next()).intValue());
        if (!it.hasNext()) {
            return Collections.singleton(c1659e);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(c1659e);
        while (it.hasNext()) {
            linkedHashSet.add(new C1659e(this, ((Integer) it.next()).intValue()));
        }
        return linkedHashSet;
    }
}
