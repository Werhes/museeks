package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9964e implements InterfaceC7387e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f19680e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f19681e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f19682e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f19683e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f19684e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f19685e;

    public C9964e() {
        this.f19681e = new LinkedHashMap();
        this.f19683e = new LinkedHashMap();
        this.f19680e = new LinkedHashMap();
        this.f19685e = new C14407e(12);
        this.f19684e = true;
        this.f19682e = true;
        boolean z = AbstractC6015e.ad;
    }

    public C9964e(Context context, String str, InterfaceC2276e interfaceC2276e, C4731e c4731e, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.f19681e = interfaceC2276e;
        this.f19683e = context;
        this.f19680e = str;
        this.f19685e = c4731e;
        this.f19684e = z2;
        this.f19682e = z3;
    }

    public C9964e(C11246e c11246e, C17381e c17381e) {
        this.f19683e = c11246e;
        this.f19681e = new C5982e(c17381e);
        this.f19684e = true;
    }

    @Override // defpackage.InterfaceC7387e
    public void Signature(C4194e c4194e) {
        InterfaceC7387e interfaceC7387e = (InterfaceC7387e) this.f19685e;
        if (interfaceC7387e != null) {
            interfaceC7387e.Signature(c4194e);
            c4194e = ((InterfaceC7387e) this.f19685e).isVip();
        }
        ((C5982e) this.f19681e).Signature(c4194e);
    }

    public void ad(InterfaceC13464e interfaceC13464e, Function1 function1) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f19683e;
        linkedHashMap.put(interfaceC13464e.getKey(), new C6056e((Function1) linkedHashMap.get(interfaceC13464e.getKey()), function1, 0));
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f19681e;
        if (linkedHashMap2.containsKey(interfaceC13464e.getKey())) {
            return;
        }
        linkedHashMap2.put(interfaceC13464e.getKey(), new C2109e(2, interfaceC13464e));
    }

    @Override // defpackage.InterfaceC7387e
    public long inmobi() {
        if (this.f19684e) {
            return ((C5982e) this.f19681e).inmobi();
        }
        InterfaceC7387e interfaceC7387e = (InterfaceC7387e) this.f19685e;
        interfaceC7387e.getClass();
        return interfaceC7387e.inmobi();
    }

    @Override // defpackage.InterfaceC7387e
    public boolean isPro() {
        if (this.f19684e) {
            ((C5982e) this.f19681e).getClass();
            return false;
        }
        InterfaceC7387e interfaceC7387e = (InterfaceC7387e) this.f19685e;
        interfaceC7387e.getClass();
        return interfaceC7387e.isPro();
    }

    @Override // defpackage.InterfaceC7387e
    public C4194e isVip() {
        InterfaceC7387e interfaceC7387e = (InterfaceC7387e) this.f19685e;
        return interfaceC7387e != null ? interfaceC7387e.isVip() : (C4194e) ((C5982e) this.f19681e).f12592e;
    }

    public void metrica(C9964e c9964e) {
        this.f19684e = c9964e.f19684e;
        this.f19682e = c9964e.f19682e;
        ((LinkedHashMap) this.f19681e).putAll((LinkedHashMap) c9964e.f19681e);
        ((LinkedHashMap) this.f19683e).putAll((LinkedHashMap) c9964e.f19683e);
        ((LinkedHashMap) this.f19680e).putAll((LinkedHashMap) c9964e.f19680e);
    }

    public void vip(AbstractC0241e abstractC0241e) {
        InterfaceC7387e interfaceC7387e;
        InterfaceC7387e appmetrica = abstractC0241e.appmetrica();
        if (appmetrica == null || appmetrica == (interfaceC7387e = (InterfaceC7387e) this.f19685e)) {
            return;
        }
        if (interfaceC7387e != null) {
            throw new C5681e(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f19685e = appmetrica;
        this.f19680e = abstractC0241e;
        ((C9860e) appmetrica).Signature((C4194e) ((C5982e) this.f19681e).f12592e);
    }
}
