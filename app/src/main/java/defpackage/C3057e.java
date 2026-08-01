package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؐۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3057e implements InterfaceC18107e {
    public final /* synthetic */ C15793e metrica;

    public C3057e(C15793e c15793e) {
        this.metrica = c15793e;
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
        List advert = this.metrica.advert(str);
        if (advert.isEmpty()) {
            return null;
        }
        return advert;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eُۘٙ */
    public final Set mo458e() {
        C15793e c15793e = this.metrica;
        c15793e.getClass();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = c15793e.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(c15793e.billing(i));
        }
        return DesugarCollections.unmodifiableSet(treeSet);
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eؙِۡ */
    public final String mo459e(String str) {
        List mo457e = mo457e(str);
        if (mo457e != null) {
            return (String) AbstractC13480e.m3604this(mo457e);
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
        return this.metrica.startapp().entrySet();
    }
}
