package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16481e {
    public static final C16448e adcel;
    public static final C16448e billing;
    public static final C16448e purchase;
    public static final C16448e startapp;
    public static final C16448e yandex;
    public static final C2892e ad = new C2892e(953586052, false, new C10418e(8));
    public static final C2892e vip = new C2892e(2097351324, false, new C9868e(15));
    public static final C2892e metrica = new C2892e(814897977, false, new C9868e(16));
    public static final C2892e license = new C2892e(993148372, false, new C9868e(17));
    public static final C16448e appmetrica = new C16448e(1, 2, 0);
    public static final C16448e mopub = new C16448e(11, 12, 6);

    static {
        int i = 4;
        purchase = new C16448e(3, i, 1);
        billing = new C16448e(i, 5, 2);
        int i2 = 7;
        yandex = new C16448e(6, i2, 3);
        int i3 = 8;
        startapp = new C16448e(i2, i3, 4);
        adcel = new C16448e(i3, 9, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.AbstractC10731e r4) {
        /*
            boolean r0 = r4 instanceof defpackage.C0728e
            if (r0 == 0) goto L13
            r0 = r4
            eؑۧۡ r0 = (defpackage.C0728e) r0
            int r1 = r0.f3021e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3021e = r1
            goto L18
        L13:
            eؑۧۡ r0 = new eؑۧۡ
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f3022e
            int r1 = r0.f3021e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L29:
            defpackage.AbstractC2003e.purchase(r4)
            goto L47
        L2d:
            defpackage.AbstractC2003e.purchase(r4)
            r0.f3021e = r2
            eْۢ٘ r4 = new eْۢ٘
            eًؗۖ r0 = defpackage.AbstractC10558e.startapp(r0)
            r4.<init>(r2, r0)
            r4.tapsense()
            java.lang.Object r4 = r4.signatures()
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r4 != r0) goto L47
            return
        L47:
            eٔٚؖ r4 = new eٔٚؖ
            r0 = 9
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16481e.ad(eُؑ۠):void");
    }

    public static float appmetrica(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final AbstractC10226e billing(AbstractC15728e abstractC15728e) {
        C14376e c14376e;
        InterfaceC5021e loadAd = abstractC15728e.loadAd();
        C14376e c14376e2 = loadAd instanceof C14376e ? (C14376e) loadAd : null;
        if (c14376e2 != null) {
            LinkedHashSet<AbstractC1186e> linkedHashSet = c14376e2.f28431e;
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(linkedHashSet, 10));
            boolean z = false;
            for (AbstractC1186e abstractC1186e : linkedHashSet) {
                if (AbstractC11957e.appmetrica(abstractC1186e)) {
                    abstractC1186e = purchase(abstractC1186e.subscription(), false);
                    z = true;
                }
                arrayList.add(abstractC1186e);
            }
            if (z) {
                AbstractC1186e abstractC1186e2 = c14376e2.f28432e;
                if (abstractC1186e2 == null) {
                    abstractC1186e2 = null;
                } else if (AbstractC11957e.appmetrica(abstractC1186e2)) {
                    abstractC1186e2 = purchase(abstractC1186e2.subscription(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c14376e = new C14376e(linkedHashSet2);
                c14376e.f28432e = abstractC1186e2;
            } else {
                c14376e = null;
            }
            if (c14376e != null) {
                return c14376e.vip();
            }
        }
        return null;
    }

    public static final InterfaceC13591e license(InterfaceC8850e interfaceC8850e) {
        InterfaceC4595e mo397public = interfaceC8850e.mo397public(C12575e.f25235e);
        InterfaceC13591e interfaceC13591e = mo397public instanceof InterfaceC13591e ? (InterfaceC13591e) mo397public : null;
        return interfaceC13591e == null ? AbstractC12387e.ad : interfaceC13591e;
    }

    public static final Object metrica(long j, InterfaceC5083e interfaceC5083e) {
        Object vip2 = vip(yandex(j), interfaceC5083e);
        return vip2 == EnumC2821e.f6782e ? vip2 : Unit.INSTANCE;
    }

    public static final AbstractC15728e purchase(AbstractC15728e abstractC15728e, boolean z) {
        C12519e amazon = C17354e.amazon(abstractC15728e, z);
        if (amazon != null) {
            return amazon;
        }
        AbstractC10226e billing2 = billing(abstractC15728e);
        return billing2 != null ? billing2 : abstractC15728e.pro(false);
    }

    public static final AbstractC10226e startapp(AbstractC10226e abstractC10226e, AbstractC10226e abstractC10226e2) {
        return AbstractC4520e.purchase(abstractC10226e) ? abstractC10226e : new Cinstanceof(abstractC10226e, abstractC10226e2);
    }

    public static final Object vip(long j, InterfaceC5083e interfaceC5083e) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        if (j < Long.MAX_VALUE) {
            license(c13578e.f26926e).license(j, c13578e);
        }
        Object signatures = c13578e.signatures();
        return signatures == EnumC2821e.f6782e ? signatures : Unit.INSTANCE;
    }

    public static final long yandex(long j) {
        C17647e c17647e = C14157e.f27993e;
        boolean z = j > 0;
        if (z) {
            return C14157e.license(C14157e.billing(j, AbstractC0326e.admob(999999L, EnumC15934e.NANOSECONDS)));
        }
        if (z) {
            throw new C14803e(10);
        }
        return 0L;
    }
}
