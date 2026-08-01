package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9975e extends AbstractC9882e {
    public final C14137e billing;
    public C8419e yandex;

    public C9975e(C11950e c11950e, C9786e c9786e, InterfaceC14388e interfaceC14388e) {
        super(c11950e, c9786e, interfaceC14388e);
        this.billing = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e5, code lost:
    
        if (r0.invoke(r3, r7) != r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (r16.m2749implements(r0, r7) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r0v11, types: [eُؚٓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [eّؖٝ, java.lang.Object] */
    /* renamed from: case, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2752case(defpackage.C9975e r16, defpackage.C11950e r17, defpackage.C15889e r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9975e.m2752case(eَؑؖ, eِۙ, eٖؐؐ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: final, reason: not valid java name */
    public static C15889e m2753final(C14137e c14137e) {
        C15889e c15889e = null;
        C4300e license = AbstractC16342e.license(new license((Object) new C16419e(c14137e, 1), (InterfaceC5083e) (0 == true ? 1 : 0), 3));
        while (license.hasNext()) {
            C15889e c15889e2 = (C15889e) license.next();
            if (c15889e != null) {
                c15889e2 = c15889e.ad(c15889e2);
            }
            c15889e = c15889e2;
        }
        return c15889e;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* renamed from: catch, reason: not valid java name */
    public final boolean m2754catch(C2561e c2561e) {
        boolean z;
        boolean z2;
        boolean z3;
        C14137e c14137e;
        C11950e c11950e = (C11950e) this.vip;
        C2401e c2401e = (C2401e) AbstractC13480e.m3604this(c2561e.ad);
        if (c2401e != null) {
            List list = c2401e.smaato;
            if (list == null) {
                list = C13664e.f27089e;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                c14137e = this.billing;
                if (i >= size) {
                    break;
                }
                C15715e c15715e = (C15715e) list.get(i);
                long j = c15715e.license ^ (-9223372034707292160L);
                if (!(c11950e.startapp(c11950e.appmetrica(j)) == 0.0f)) {
                    z3 = !(c14137e.amazon(new C15889e(j, c15715e.ad, false)) instanceof C8870e) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = c2401e.advert ^ (-9223372034707292160L);
            boolean z4 = c2561e.purchase == 12;
            if (!(c11950e.startapp(c11950e.appmetrica(j2)) == 0.0f) || z4) {
                if (!(c14137e.amazon(new C15889e(j2, c2401e.vip, z4)) instanceof C8870e) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.metrica) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
