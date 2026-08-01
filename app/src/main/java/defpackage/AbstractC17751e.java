package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17751e {
    public static final C2892e ad = new C2892e(1492977131, false, new C11832e(29));
    public static final C2892e vip = new C2892e(862229331, false, new C15480e(22));

    public static final Object ad(InterfaceC5077e interfaceC5077e, Function0 function0, AbstractC10731e abstractC10731e) {
        Object obj;
        AbstractC17732e adcel;
        Object mo2243while;
        C14742e c14742e;
        AbstractC13616e abstractC13616e = (AbstractC13616e) interfaceC5077e;
        boolean z = abstractC13616e.f27022e.f27016e;
        if (!z) {
            return Unit.INSTANCE;
        }
        if (!z) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e.f27011e;
        C13915e mopub = AbstractC5851e.mopub(interfaceC5077e);
        loop0: while (true) {
            obj = null;
            if (mopub == null) {
                break;
            }
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 524288) != 0) {
                while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 524288) != 0) {
                        AbstractC13616e abstractC13616e3 = abstractC13616e2;
                        C12431e c12431e = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof InterfaceC6756e) {
                                obj = abstractC13616e3;
                                break loop0;
                            }
                            if ((abstractC13616e3.f27014e & 524288) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                                int i = 0;
                                for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                    if ((abstractC13616e4.f27014e & 524288) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC13616e3 = abstractC13616e4;
                                        } else {
                                            if (c12431e == null) {
                                                c12431e = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e3 != null) {
                                                c12431e.license(abstractC13616e3);
                                                abstractC13616e3 = null;
                                            }
                                            c12431e.license(abstractC13616e4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e);
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
        InterfaceC6756e interfaceC6756e = (InterfaceC6756e) obj;
        return (interfaceC6756e != null && (mo2243while = interfaceC6756e.mo2243while((adcel = AbstractC5851e.adcel(interfaceC5077e)), new C14194e(function0, adcel, 2), abstractC10731e)) == EnumC2821e.f6782e) ? mo2243while : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eّۜۖ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appmetrica(defpackage.C15074e r3, defpackage.C4017e r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L1d
            eٔؐۛ r4 = r4.f8940e
            eۤۡ r4 = r4.f28537e
            eؚٜٔ r4 = r4.m4557this()
            android.graphics.Canvas r0 = defpackage.AbstractC16863e.ad
            eَِٔ r4 = (defpackage.C11648e) r4
            android.graphics.Canvas r4 = r4.ad
            boolean r4 = r4.isHardwareAccelerated()
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = r2
        L1e:
            boolean r0 = defpackage.AbstractC15384e.metrica(r3)
            if (r0 == 0) goto L41
            if (r4 == 0) goto L41
            eّؔۨ r4 = r3.f29858e
            boolean r0 = r4 instanceof defpackage.C15134e
            if (r0 == 0) goto L2e
            r0 = r4
            goto L33
        L2e:
            eٔۨۗ r0 = new eٔۨۗ
            r0.<init>(r3)
        L33:
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L97
            eّؔۨ r4 = r3.f29858e
            r4.vip()
            r3.f29858e = r0
            return
        L41:
            if (r0 == 0) goto L7f
            eّؔۨ r4 = r3.f29858e
            boolean r0 = r4 instanceof defpackage.C12988e
            if (r0 == 0) goto L4a
            goto L6d
        L4a:
            boolean r4 = defpackage.C12988e.yandex
            r0 = 0
            if (r4 == 0) goto L6c
            eْؒ۠ r4 = new eْؒ۠     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L55
            goto L5c
        L55:
            r4 = move-exception
            eّۜۖ r1 = new eّۜۖ
            r1.<init>(r4)
            r4 = r1
        L5c:
            java.lang.Throwable r1 = defpackage.C13523e.ad(r4)
            if (r1 == 0) goto L64
            defpackage.C12988e.yandex = r2
        L64:
            boolean r1 = r4 instanceof defpackage.C12763e
            if (r1 == 0) goto L69
            goto L6a
        L69:
            r0 = r4
        L6a:
            eْؒ۠ r0 = (defpackage.C12988e) r0
        L6c:
            r4 = r0
        L6d:
            if (r4 == 0) goto L7f
            eّؔۨ r0 = r3.f29858e
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L97
            eّؔۨ r0 = r3.f29858e
            r0.vip()
            r3.f29858e = r4
            goto L97
        L7f:
            eّؔۨ r4 = r3.f29858e
            boolean r0 = r4 instanceof defpackage.C14068e
            if (r0 != 0) goto L97
            eٓٙ۠ r0 = new eٓٙ۠
            r0.<init>(r3)
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L97
            eّؔۨ r4 = r3.f29858e
            r4.vip()
            r3.f29858e = r0
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17751e.appmetrica(eٔۤۙ, eَؖؓ):void");
    }

    public static String license(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static String metrica(List list) {
        Collections.sort(list);
        StringBuilder sb = new StringBuilder(list.size() * 16);
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size()) {
                sb.append(" ");
            }
            sb.append((String) list.get(i));
        }
        return sb.toString().trim();
    }

    public static final boolean vip(long j, long j2) {
        return j == j2;
    }
}
