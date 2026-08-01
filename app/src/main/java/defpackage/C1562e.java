package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1562e implements InterfaceC18107e {
    public final InterfaceC18107e metrica;
    public final boolean purchase;
    public final C10095e license = new C10095e(0);
    public final LinkedHashSet appmetrica = new LinkedHashSet();

    public C1562e(InterfaceC18107e interfaceC18107e) {
        this.metrica = interfaceC18107e;
        this.purchase = interfaceC18107e.mo456const();
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: const */
    public final boolean mo456const() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean contains(String str) {
        return mo457e("X-Req-Hash") != null;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍۢؒ */
    public final List mo457e(String str) {
        if (this.appmetrica.contains(str)) {
            return null;
        }
        C10095e c10095e = this.license;
        return ((Map) c10095e.f36443e).containsKey(str) ? c10095e.mo856e(str) : this.metrica.mo457e(str);
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eُۘٙ */
    public final Set mo458e() {
        return AbstractC4511e.smaato(AbstractC4511e.loadAd(this.metrica.mo458e(), ((Map) this.license.f36443e).keySet()), this.appmetrica);
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
        LinkedHashSet loadAd = AbstractC4511e.loadAd(this.metrica.mopub(), this.license.m2759e().mopub());
        ArrayList arrayList = new ArrayList();
        for (Object obj : loadAd) {
            if (!this.appmetrica.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return AbstractC13480e.m3582e(arrayList);
    }
}
