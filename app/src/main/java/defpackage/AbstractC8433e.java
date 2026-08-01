package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8433e {
    public static C11106e metrica;
    public static final C2892e ad = new C2892e(-206901865, false, new C15480e(2));
    public static final C2892e vip = new C2892e(220787534, false, new C15480e(3));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.C2892e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C14244e
            if (r0 == 0) goto L13
            r0 = r5
            eٓۜؗ r0 = (defpackage.C14244e) r0
            int r1 = r0.f28155e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28155e = r1
            goto L18
        L13:
            eٓۜؗ r0 = new eٓۜؗ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28156e
            int r1 = r0.f28155e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            defpackage.AbstractC2003e.purchase(r5)
            eٔٚؖ r4 = new eٔٚؖ
            r5 = 9
            r4.<init>(r5)
            throw r4
        L34:
            defpackage.AbstractC2003e.purchase(r5)
            eٌِٞ r5 = r0.f21135e
            eٕۢٝ r1 = defpackage.C15802e.f31137e
            eؗؒۚ r5 = r5.mo397public(r1)
            eًۘ r5 = (defpackage.C18326e) r5
            if (r5 == 0) goto L49
            r0.f28155e = r2
            r5.ad(r4, r0)
            return
        L49:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8433e.ad(eؔ۟ٓ, eُؑ۠):void");
    }

    public static boolean license(String str) {
        return str == null || str.isEmpty();
    }

    public static final void metrica(InterfaceC12424e interfaceC12424e, C17469e c17469e, C2362e c2362e) {
        C11106e c11106e = metrica;
        if (c11106e == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        InterfaceC2881e metrica2 = ((C3862e) c11106e.f22008e).metrica(interfaceC12424e.billing());
        C16575e c16575e = new C16575e(metrica2.subscription(), AbstractC17943e.ad);
        C13391e c13391e = C13391e.f26642e;
        C10302e c10302e = new C10302e(metrica2, null, c16575e, null, c13391e, c13391e, (C9576e) c11106e.f22007e, (C5891e) c11106e.f22006e, (InterfaceC4311e) c11106e.f22009e);
        c10302e.m2793throw(c17469e.ad);
        c10302e.m2790goto(c17469e.vip);
        c10302e.m2789extends(c17469e.ad());
        c10302e.m2792native(c17469e.metrica);
        List list = c17469e.purchase;
        AbstractC9464e.yandex("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list + ", featureGroup = " + c2362e);
        synchronized (c10302e.f20330e) {
            C9205e c9205e = c10302e.f20346e;
            InterfaceC3232e interfaceC3232e = c10302e.f20331e;
            c9205e.startapp(interfaceC3232e);
            C9205e c9205e2 = c10302e.f20337e;
            if (c9205e2 != null) {
                c9205e2.startapp(interfaceC3232e);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(c10302e.f20329e);
            linkedHashSet.addAll(list);
            HashMap purchase = C10302e.purchase(linkedHashSet, c2362e);
            try {
                try {
                    c10302e.pro(linkedHashSet, c10302e.f20337e != null);
                    C10302e.m2787class(purchase);
                } catch (IllegalArgumentException e) {
                    throw new Exception(e);
                }
            } catch (Throwable th) {
                C10302e.m2787class(purchase);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [eّؖٝ, java.lang.Object] */
    public static final Object vip(C11795e c11795e, int i, Function1 function1) {
        int i2;
        int i3;
        Object obj;
        AbstractC13616e abstractC13616e;
        C2993e m3236e;
        C14742e c14742e;
        if (!c11795e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = c11795e.f27022e.f27011e;
        C13915e mopub = AbstractC5851e.mopub(c11795e);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (mopub == null) {
                abstractC13616e = null;
                break;
            }
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 1024) != 0) {
                while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 1024) != 0) {
                        abstractC13616e = abstractC13616e2;
                        C12431e c12431e = null;
                        while (abstractC13616e != null) {
                            if (abstractC13616e instanceof C11795e) {
                                break loop0;
                            }
                            if ((abstractC13616e.f27014e & 1024) != 0 && (abstractC13616e instanceof AbstractC6126e)) {
                                int i4 = 0;
                                for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                    if ((abstractC13616e3.f27014e & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC13616e = abstractC13616e3;
                                        } else {
                                            if (c12431e == null) {
                                                c12431e = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e != null) {
                                                c12431e.license(abstractC13616e);
                                                abstractC13616e = null;
                                            }
                                            c12431e.license(abstractC13616e3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC13616e = AbstractC5851e.vip(c12431e);
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
        C11795e c11795e2 = (C11795e) abstractC13616e;
        if ((c11795e2 != null && AbstractC7890e.billing(c11795e2.m3236e(), c11795e.m3236e())) || (m3236e = c11795e.m3236e()) == null) {
            return null;
        }
        int i5 = 5;
        if (i != 5) {
            i5 = 6;
            if (i != 6) {
                i5 = 3;
                if (i != 3) {
                    i5 = 4;
                    if (i != 4) {
                        if (i == 1) {
                            i3 = 2;
                        } else if (i != 2) {
                            throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                        }
                        if (m3236e.f7035e.ad() > 0 || !m3236e.f7035e.license() || !m3236e.f27016e) {
                            return function1.invoke(C2993e.f7033e);
                        }
                        int vip2 = m3236e.m1224e(i3) ? m3236e.f7035e.vip() : m3236e.f7035e.appmetrica();
                        ?? obj2 = new Object();
                        C6594e c6594e = m3236e.f7036e;
                        c6594e.getClass();
                        C9504e c9504e = new C9504e(vip2, vip2);
                        ((C12431e) c6594e.f13613e).license(c9504e);
                        obj2.f9318e = c9504e;
                        int metrica2 = m3236e.f7035e.metrica() * 2;
                        int ad2 = m3236e.f7035e.ad();
                        if (metrica2 > ad2) {
                            metrica2 = ad2;
                        }
                        while (obj == null && m3236e.m1225e((C9504e) obj2.f9318e, i3) && i2 < metrica2) {
                            C9504e c9504e2 = (C9504e) obj2.f9318e;
                            int i6 = c9504e2.ad;
                            int i7 = c9504e2.vip;
                            if (m3236e.m1224e(i3)) {
                                i7++;
                            } else {
                                i6--;
                            }
                            C6594e c6594e2 = m3236e.f7036e;
                            c6594e2.getClass();
                            C9504e c9504e3 = new C9504e(i6, i7);
                            ((C12431e) c6594e2.f13613e).license(c9504e3);
                            ((C12431e) m3236e.f7036e.f13613e).smaato((C9504e) obj2.f9318e);
                            obj2.f9318e = c9504e3;
                            i2++;
                            AbstractC5851e.mopub(m3236e).advert();
                            obj = function1.invoke(new C8205e(m3236e, obj2, i3));
                        }
                        ((C12431e) m3236e.f7036e.f13613e).smaato((C9504e) obj2.f9318e);
                        AbstractC5851e.mopub(m3236e).advert();
                        return obj;
                    }
                }
            }
        }
        i3 = i5;
        if (m3236e.f7035e.ad() > 0) {
        }
        return function1.invoke(C2993e.f7033e);
    }
}
