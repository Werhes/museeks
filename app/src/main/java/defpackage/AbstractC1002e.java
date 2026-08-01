package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1002e {
    public static final InterfaceC4911e ad = AbstractC1213e.vip("io.ktor.client.plugins.auth.Auth");
    public static final C8208e license;
    public static final C0909e metrica;
    public static final C8208e vip;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(Unit.class);
        InterfaceC13984e interfaceC13984e2 = null;
        try {
            interfaceC13984e = AbstractC3820e.ad(Unit.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        vip = new C8208e("auth-request", new C12025e(vip2, interfaceC13984e));
        metrica = new C0909e("Auth", (Function0) C16748e.f32839e, (Function1) new C17014e(1));
        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(List.class);
        try {
            C5538e c5538e = C5538e.metrica;
            interfaceC13984e2 = AbstractC3820e.vip(List.class, AbstractC16704e.license(AbstractC3820e.ad(C7488e.class)));
        } catch (Throwable unused2) {
        }
        license = new C8208e("AuthProviders", new C12025e(vip3, interfaceC13984e2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C4371e r4, defpackage.C5042e r5, defpackage.C7488e r6, defpackage.C10263e r7, defpackage.AbstractC0198e r8, defpackage.AbstractC10731e r9) {
        /*
            boolean r8 = r9 instanceof defpackage.C6879e
            if (r8 == 0) goto L13
            r8 = r9
            eؚِؓ r8 = (defpackage.C6879e) r8
            int r0 = r8.f14124e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.f14124e = r0
            goto L18
        L13:
            eؚِؓ r8 = new eؚِؓ
            r8.<init>(r9)
        L18:
            java.lang.Object r9 = r8.f14126e
            int r0 = r8.f14124e
            r1 = 2
            r2 = 1
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L32
            if (r0 != r1) goto L2a
            defpackage.AbstractC2003e.purchase(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            eَٔٔ r4 = r8.f14127e
            eؗٝٝ r5 = r8.f14123e
            eؖۚ۟ r6 = r8.f14125e
            defpackage.AbstractC2003e.purchase(r9)
            goto L5c
        L3c:
            defpackage.AbstractC2003e.purchase(r9)
            eَٔٔ r9 = new eَٔٔ
            r9.<init>()
            eُۥٔ r0 = r7.appmetrica
            r9.appmetrica = r0
            r9.metrica(r7)
            r8.f14125e = r4
            r8.f14123e = r5
            r8.f14127e = r9
            r8.f14124e = r2
            java.lang.Object r6 = r6.ad(r9, r8)
            if (r6 != r3) goto L5a
            goto L99
        L5a:
            r6 = r4
            r4 = r9
        L5c:
            eؘۙٗ r7 = r4.purchase
            eًۛؗ r9 = defpackage.AbstractC1002e.vip
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r7.billing(r9, r0)
            eٕؗٞ r7 = defpackage.AbstractC1002e.ad
            boolean r9 = r7.yandex()
            r0 = 0
            if (r9 == 0) goto L89
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Sending new request to "
            r9.<init>(r2)
            eَؖۜ r5 = r5.f10751e
            if (r5 == 0) goto L7a
            goto L7b
        L7a:
            r5 = r0
        L7b:
            eٌؙٔ r5 = r5.getUrl()
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            r7.amazon(r5)
        L89:
            r8.f14125e = r0
            r8.f14123e = r0
            r8.f14127e = r0
            r8.f14124e = r1
            eِؐؐ r5 = r6.f9506e
            java.lang.Object r4 = r5.ad(r4, r8)
            if (r4 != r3) goto L9a
        L99:
            return r3
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1002e.ad(eؖۚ۟, eؗٝٝ, eؚ۟ۚ, eَٔٔ, eٌؙؑ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C8017e r7, defpackage.C8208e r8, defpackage.C5042e r9, defpackage.C7488e r10, defpackage.C10263e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1002e.vip(eًٙ۟, eًۛؗ, eؗٝٝ, eؚ۟ۚ, eَٔٔ, eُؑ۠):java.lang.Object");
    }
}
