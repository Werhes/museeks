package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٞ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6544e implements InterfaceC0619e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8208e f13466e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f13467e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10739e f13468e;

    public C6544e(String str, C10739e c10739e, Function1 function1) {
        InterfaceC13984e interfaceC13984e;
        this.f13468e = c10739e;
        this.f13467e = function1;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(C4524e.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(C4524e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        this.f13466e = new C8208e(str, new C12025e(vip, interfaceC13984e));
    }

    @Override // defpackage.InterfaceC0619e
    public final C8208e getKey() {
        return this.f13466e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [eؚۛۖ, kotlin.jvm.functions.Function0] */
    @Override // defpackage.InterfaceC0619e
    public final Object vip(AbstractC4125e abstractC4125e, Function1 function1) {
        C5033e c5033e;
        C13065e c13065e = (C13065e) abstractC4125e;
        if (c13065e instanceof C11997e) {
            c5033e = AbstractC12044e.ad((InterfaceC9215e) c13065e);
        } else {
            if (!(c13065e instanceof C5033e)) {
                throw new IllegalStateException(("Unsupported pipeline type: " + AbstractC3820e.ad.vip(c13065e.getClass())).toString());
            }
            c5033e = (C5033e) c13065e;
        }
        Object invoke = ((C7460e) this.f13468e.f21138e).invoke();
        function1.invoke(invoke);
        C16701e c16701e = new C16701e(c5033e, c13065e, invoke, this.f13466e);
        this.f13467e.invoke(c16701e);
        Iterator it = c16701e.vip.iterator();
        while (it.hasNext()) {
            ((C10699e) it.next()).ad.invoke(c16701e.ad());
        }
        Iterator it2 = c16701e.metrica.iterator();
        while (it2.hasNext()) {
            ((C10699e) it2.next()).ad.invoke(c16701e.ad().f25995e);
        }
        Iterator it3 = c16701e.license.iterator();
        while (it3.hasNext()) {
            ((C10699e) it3.next()).ad.invoke(c16701e.ad().f25996e);
        }
        Iterator it4 = c16701e.appmetrica.iterator();
        while (it4.hasNext()) {
            ((C10699e) it4.next()).ad.invoke(c16701e.ad().f25996e);
        }
        Iterator it5 = c16701e.purchase.iterator();
        while (it5.hasNext()) {
            AbstractC8736e abstractC8736e = (AbstractC8736e) it5.next();
            C13065e ad = c16701e.ad();
            abstractC8736e.getClass();
            ad.mopub(C13065e.f25992e, new C9878e(null, null));
        }
        return new C4524e(0);
    }
}
