package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5659e {
    public final InterfaceC10481e ad;
    public final C14137e appmetrica = AbstractC12501e.ad(-1, 0, null, 6);
    public C8419e license;
    public final C14194e metrica;
    public final InterfaceC18435e vip;

    public C5659e(C4993e c4993e, InterfaceC18435e interfaceC18435e, C14194e c14194e) {
        this.ad = c4993e;
        this.vip = interfaceC18435e;
        this.metrica = c14194e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
    
        if (defpackage.AbstractC16653e.ad(r2, r10, r3, r1) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005b, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:31:0x00d3, B:34:0x00e9], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r11v1, types: [eؚٖؓ, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C5659e r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5659e.ad(eؘٕۨ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C16084e
            if (r0 == 0) goto L13
            r0 = r6
            eٌٖۘ r0 = (defpackage.C16084e) r0
            int r1 = r0.f31677e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31677e = r1
            goto L18
        L13:
            eٌٖۘ r0 = new eٌٖۘ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31675e
            int r1 = r0.f31677e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            eؘٕۨ r0 = r0.f31676e
            defpackage.AbstractC2003e.purchase(r6)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            eؘٕۨ r1 = r0.f31676e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4d
        L3a:
            defpackage.AbstractC2003e.purchase(r6)
            eٟؔٛ r6 = defpackage.C2704e.appmetrica
            r0.f31676e = r5
            r0.f31677e = r3
            eٖٓٞ r1 = r5.appmetrica
            java.lang.Object r6 = r1.metrica(r0, r6)
            if (r6 != r4) goto L4c
            goto L5b
        L4c:
            r1 = r5
        L4d:
            eٌُؑ r6 = r1.license
            if (r6 == 0) goto L5e
            r0.f31676e = r1
            r0.f31677e = r2
            java.lang.Object r6 = defpackage.AbstractC6629e.purchase(r6, r0)
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            r0 = r1
        L5d:
            r1 = r0
        L5e:
            r6 = 0
            r1.license = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5659e.metrica(eُؑ۠):java.lang.Object");
    }

    public final boolean vip(EnumC10320e enumC10320e, float f, Function0 function0, Function1 function1) {
        boolean metrica;
        int ordinal = enumC10320e.ordinal();
        InterfaceC10481e interfaceC10481e = this.ad;
        if (ordinal == 0) {
            metrica = interfaceC10481e.metrica();
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            metrica = interfaceC10481e.license();
        }
        if (!metrica) {
            return false;
        }
        if (this.license == null) {
            this.license = AbstractC5336e.purchase(this.vip, null, 0, new C13037e(this, null, 0), 3);
        }
        this.appmetrica.amazon(new C2704e(enumC10320e, f, function0, function1));
        return true;
    }
}
