package defpackage;

import j$.time.DateTimeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15297e {
    public static final C6607e ad = new C6607e(0);

    public static final String ad(InterfaceC11824e interfaceC11824e, int i) {
        String ad2 = interfaceC11824e.ad(i);
        return interfaceC11824e.vip(i) ? AbstractC17861e.Signature(".", ad2) : ad2;
    }

    public static final C5471e appmetrica(C5471e c5471e, int i, C17705e c17705e) {
        long j = i;
        try {
            C18506e purchase = AbstractC12447e.purchase(j, c17705e.metrica);
            long j2 = purchase.ad;
            long j3 = purchase.vip;
            C17647e c17647e = C14157e.f27993e;
            return c5471e.vip(AbstractC0326e.admob(j2, EnumC15934e.SECONDS)).vip(AbstractC0326e.admob(j3, EnumC15934e.NANOSECONDS));
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            C5471e c5471e2 = C5471e.f11744e;
            return C13023e.metrica(j > 0 ? Long.MAX_VALUE : Long.MIN_VALUE, 0L);
        }
    }

    public static final AbstractC10385e billing(C3545e c3545e, InterfaceC11824e interfaceC11824e) {
        if (AbstractC1787e.f4831break.appmetrica(c3545e.f7988e).booleanValue()) {
            EnumC0791e enumC0791e = c3545e.f7990e;
            int i = enumC0791e != null ? AbstractC7574e.ad[enumC0791e.ordinal()] : -1;
            if (i == 1) {
                return new C3012e((byte) c3545e.f7997e);
            }
            if (i == 2) {
                return new C7105e((short) c3545e.f7997e);
            }
            if (i == 3) {
                return new C6867e((int) c3545e.f7997e);
            }
            if (i == 4) {
                return new C18377e(c3545e.f7997e);
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + c3545e.f7990e).toString());
        }
        EnumC0791e enumC0791e2 = c3545e.f7990e;
        switch (enumC0791e2 != null ? AbstractC7574e.ad[enumC0791e2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new C14803e(10);
            case 1:
                return new C3553e((byte) c3545e.f7997e);
            case 2:
                return new C2420e((short) c3545e.f7997e);
            case 3:
                return new C0670e((int) c3545e.f7997e);
            case 4:
                return new C0329e(c3545e.f7997e);
            case 5:
                return new C5900e((char) c3545e.f7997e);
            case 6:
                return new C16045e(c3545e.f7987e);
            case 7:
                return new C16945e(c3545e.f8001e);
            case 8:
                return new C2116e(c3545e.f7997e != 0);
            case 9:
                return new C2055e(interfaceC11824e.getString(c3545e.f8000e));
            case 10:
                String ad2 = ad(interfaceC11824e, c3545e.f7995e);
                int i2 = c3545e.f7989e;
                return i2 == 0 ? new C18014e(ad2) : new C7200e(ad2, i2);
            case 11:
                return new C11061e(ad(interfaceC11824e, c3545e.f7995e), interfaceC11824e.getString(c3545e.f7998e));
            case 12:
                return new C6211e(purchase(c3545e.f7991e, interfaceC11824e));
            case 13:
                List list = c3545e.f7996e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC10385e billing = billing((C3545e) it.next(), interfaceC11824e);
                    if (billing != null) {
                        arrayList.add(billing);
                    }
                }
                return new C10103e(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.C8221e r4, long r5, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C10399e
            if (r0 == 0) goto L13
            r0 = r7
            eَٝؔ r0 = (defpackage.C10399e) r0
            int r1 = r0.f20553e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20553e = r1
            goto L18
        L13:
            eَٝؔ r0 = new eَٝؔ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20554e
            int r1 = r0.f20553e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r7)
            goto L50
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r7)
            eؘُٛ r7 = new eؘُٛ
            eُؗؒ r1 = defpackage.C4590e.f9888e
            java.lang.String r3 = "users.get"
            r7.<init>(r3, r1)
            java.lang.String r1 = "fields"
            java.lang.String r3 = "photo_100"
            r7.ad(r1, r3)
            java.lang.String r1 = "user_id"
            r7.metrica(r5, r1)
            r0.f20553e = r2
            java.lang.Object r7 = r4.license(r7, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r7 != r4) goto L50
            return r4
        L50:
            eٍؒۢ r7 = (defpackage.AbstractC9200e) r7
            eَؘٚ r4 = defpackage.C10091e.f19936e
            eٍؒۢ r4 = defpackage.AbstractC3425e.yandex(r7, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15297e.license(eًۛ۠, long, eُؑ۠):java.lang.Object");
    }

    public static final C13578e metrica(InterfaceC5083e interfaceC5083e) {
        C13578e c13578e;
        C13578e c13578e2;
        if (!(interfaceC5083e instanceof C3843e)) {
            return new C13578e(1, interfaceC5083e);
        }
        C3843e c3843e = (C3843e) interfaceC5083e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3843e.f8479e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c3843e);
            c13578e = null;
            C2443e c2443e = AbstractC7214e.vip;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c3843e, c2443e);
                c13578e2 = null;
                break;
            }
            if (obj instanceof C13578e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c3843e, obj, c2443e)) {
                    if (atomicReferenceFieldUpdater.get(c3843e) != obj) {
                        break;
                    }
                }
                c13578e2 = (C13578e) obj;
                break loop0;
            }
            if (obj != c2443e && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c13578e2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C13578e.f26924e;
            Object obj2 = atomicReferenceFieldUpdater2.get(c13578e2);
            if (!(obj2 instanceof C11634e) || ((C11634e) obj2).license == null) {
                C13578e.f26925e.set(c13578e2, 536870911);
                atomicReferenceFieldUpdater2.set(c13578e2, C15583e.f30749e);
                c13578e = c13578e2;
            } else {
                c13578e2.Signature();
            }
            if (c13578e != null) {
                return c13578e;
            }
        }
        return new C13578e(2, interfaceC5083e);
    }

    public static final C11056e purchase(C4599e c4599e, InterfaceC11824e interfaceC11824e) {
        String ad2 = ad(interfaceC11824e, c4599e.f9908e);
        List<C14481e> list = c4599e.f9910e;
        ArrayList arrayList = new ArrayList();
        for (C14481e c14481e : list) {
            AbstractC10385e billing = billing(c14481e.f28626e, interfaceC11824e);
            C6571e c6571e = billing != null ? new C6571e(interfaceC11824e.getString(c14481e.f28624e), billing) : null;
            if (c6571e != null) {
                arrayList.add(c6571e);
            }
        }
        return new C11056e(ad2, AbstractC10064e.mopub(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C8221e r4, java.lang.String r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C17468e
            if (r0 == 0) goto L13
            r0 = r6
            e٘ؑؔ r0 = (defpackage.C17468e) r0
            int r1 = r0.f34214e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34214e = r1
            goto L18
        L13:
            e٘ؑؔ r0 = new e٘ؑؔ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34215e
            int r1 = r0.f34214e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L50
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            eؘُٛ r6 = new eؘُٛ
            eؘؗؑ r1 = defpackage.C5438e.f11675e
            java.lang.String r3 = "users.get"
            r6.<init>(r3, r1)
            java.lang.String r1 = "fields"
            java.lang.String r3 = "photo_100"
            r6.ad(r1, r3)
            java.lang.String r1 = "access_token"
            r6.ad(r1, r5)
            r0.f34214e = r2
            java.lang.Object r6 = r4.license(r6, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r6 != r4) goto L50
            return r4
        L50:
            eٍؒۢ r6 = (defpackage.AbstractC9200e) r6
            eؑۢۨ r4 = defpackage.C0651e.f2911e
            eٍؒۢ r4 = defpackage.AbstractC3425e.yandex(r6, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15297e.vip(eًۛ۠, java.lang.String, eُؑ۠):java.lang.Object");
    }
}
