package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14421e {
    public static final C8208e metrica;
    public static final InterfaceC4911e ad = AbstractC1213e.vip("io.ktor.client.plugins.HttpCallValidator");
    public static final C0909e vip = new C0909e("HttpResponseValidator", (Function0) C3436e.f7690e, (Function1) new C14407e(9));

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(Boolean.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(Boolean.TYPE);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        metrica = new C8208e("ExpectSuccessAttributeKey", new C12025e(vip2, interfaceC13984e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ad(java.util.List r4, java.lang.Throwable r5, defpackage.InterfaceC4393e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C7153e
            if (r0 == 0) goto L13
            r0 = r7
            eًؚٔ r0 = (defpackage.C7153e) r0
            int r1 = r0.f14643e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14643e = r1
            goto L18
        L13:
            eًؚٔ r0 = new eًؚٔ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14644e
            int r0 = r0.f14643e
            if (r0 == 0) goto L32
            r4 = 1
            if (r0 == r4) goto L24
            r4 = 2
            if (r0 != r4) goto L28
        L24:
            defpackage.AbstractC2003e.purchase(r7)
            goto L30
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L30:
            r4 = 0
            goto L58
        L32:
            defpackage.AbstractC2003e.purchase(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Processing exception "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " for request "
            r7.append(r5)
            eٌؙٔ r5 = r6.getUrl()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            eٕؗٞ r6 = defpackage.AbstractC14421e.ad
            r6.amazon(r5)
            java.util.Iterator r4 = r4.iterator()
        L58:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L61
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L61:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L6f
            eٔٚؖ r4 = new eٔٚؖ
            r5 = 10
            r4.<init>(r5)
            throw r4
        L6f:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14421e.ad(java.util.List, java.lang.Throwable, eَؖۜ, eُؑ۠):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(java.util.List r5, defpackage.AbstractC16824e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C10511e
            if (r0 == 0) goto L13
            r0 = r7
            eَؚۚ r0 = (defpackage.C10511e) r0
            int r1 = r0.f20736e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20736e = r1
            goto L18
        L13:
            eَؚۚ r0 = new eَؚۚ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20738e
            int r1 = r0.f20736e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            int r5 = r0.f20739e
            java.util.Iterator r6 = r0.f20735e
            eؘٗٙ r1 = r0.f20737e
            defpackage.AbstractC2003e.purchase(r7)
            r7 = r1
            goto L61
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.AbstractC2003e.purchase(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Validating response for request "
            r7.<init>(r1)
            eؗٝٝ r1 = r6.vip()
            eَؖۜ r1 = r1.f10751e
            if (r1 == 0) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            eٌؙٔ r1 = r1.getUrl()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            eٕؗٞ r1 = defpackage.AbstractC14421e.ad
            r1.amazon(r7)
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r6.next()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0.f20737e = r7
            r0.f20735e = r6
            r0.f20739e = r5
            r0.f20736e = r2
            java.lang.Object r1 = r1.invoke(r7, r0)
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r1 != r3) goto L61
            return r3
        L7e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14421e.vip(java.util.List, eؘٗٙ, eُؑ۠):java.lang.Object");
    }
}
