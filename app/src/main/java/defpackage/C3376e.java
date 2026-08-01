package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3376e implements InterfaceC5599e {
    public static AbstractC11069e metrica(C12025e c12025e) {
        InterfaceC7227e interfaceC7227e = c12025e.ad;
        if (!AbstractC7654e.class.isAssignableFrom(((InterfaceC18155e) interfaceC7227e).subs())) {
            throw new IllegalArgumentException((c12025e + " is not assignable from Message").toString());
        }
        InterfaceC18155e interfaceC18155e = (InterfaceC18155e) interfaceC7227e;
        for (Field field : interfaceC18155e.subs().getDeclaredFields()) {
            if (AbstractC11069e.class.isAssignableFrom(field.getType())) {
                return (AbstractC11069e) interfaceC18155e.subs().getDeclaredField(field.getName()).get(null);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC5599e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(java.nio.charset.Charset r4, defpackage.C12025e r5, defpackage.InterfaceC13033e r6, defpackage.AbstractC10731e r7) {
        /*
            r3 = this;
            boolean r4 = r7 instanceof defpackage.C0231e
            if (r4 == 0) goto L13
            r4 = r7
            eَۣؑ r4 = (defpackage.C0231e) r4
            int r0 = r4.f1472e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f1472e = r0
            goto L18
        L13:
            eَۣؑ r4 = new eَۣؑ
            r4.<init>(r3, r7)
        L18:
            java.lang.Object r7 = r4.f1470e
            int r0 = r4.f1472e
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            eُ٘ۤ r4 = r4.f1471e
            defpackage.AbstractC2003e.purchase(r7)
            goto L44
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            eُ٘ۤ r5 = metrica(r5)
            r4.f1471e = r5
            r4.f1472e = r1
            java.lang.Object r7 = defpackage.AbstractC11263e.tapsense(r6, r4)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r7 != r4) goto L43
            return r4
        L43:
            r4 = r5
        L44:
            eؘۧۧ r7 = (defpackage.InterfaceC6079e) r7
            eؘؘۧ r5 = new eؘؘۧ
            r5.<init>(r7)
            eُْۗ r6 = new eُْۗ
            r6.<init>(r5)
            r4.getClass()
            e٘ؕ۠ r5 = new e٘ؕ۠
            r5.<init>(r6)
            java.lang.Object r4 = r4.metrica(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3376e.ad(java.nio.charset.Charset, eِ۟ۥ, eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [eِٖۢ, eِٜؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC5599e
    public final Object vip(C1622e c1622e, Charset charset, C12025e c12025e, Object obj, AbstractC10731e abstractC10731e) {
        if (obj == null) {
            throw new IllegalArgumentException("value can't be null");
        }
        AbstractC11069e metrica = metrica(c12025e);
        ?? obj2 = new Object();
        metrica.appmetrica(obj2, obj);
        return new C3404e(obj2.subs(obj2.f31731e), AbstractC7312e.license, 4);
    }
}
