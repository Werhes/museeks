package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6557e extends AbstractC13933e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10312e f13492e = new C10312e(24);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C6557e f13491e = new C6557e(C13664e.f27089e);

    /* JADX WARN: Type inference failed for: r5v0, types: [eؘۙۛ, java.lang.Object, eٕٛۘ] */
    public C6557e(List list) {
        this.f27639e = C2190e.f5569e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11720e c11720e = (C11720e) it.next();
            c11720e.getClass();
            int admob = f13492e.admob(AbstractC3820e.ad.vip(C11720e.class).license());
            int appmetrica = this.f27639e.appmetrica();
            if (appmetrica != 0) {
                if (appmetrica == 1) {
                    AbstractC5877e abstractC5877e = this.f27639e;
                    try {
                        C3794e c3794e = (C3794e) abstractC5877e;
                        int i = c3794e.f8403e;
                        if (i == admob) {
                            this.f27639e = new C3794e(admob, c11720e);
                        } else {
                            ?? obj = new Object();
                            obj.f30748e = new Object[20];
                            obj.f30747e = 0;
                            obj.billing(i, c3794e.f8404e);
                            this.f27639e = obj;
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException(AbstractC13933e.appmetrica(abstractC5877e, 1, "OneElementArrayMap"), e);
                    }
                }
                this.f27639e.billing(admob, c11720e);
            } else {
                AbstractC5877e abstractC5877e2 = this.f27639e;
                if (!(abstractC5877e2 instanceof C2190e)) {
                    throw new IllegalStateException(AbstractC13933e.appmetrica(abstractC5877e2, 0, "EmptyArrayMap"));
                }
                this.f27639e = new C3794e(admob, c11720e);
            }
        }
    }
}
