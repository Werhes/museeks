package defpackage;

import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10709e {
    public final C11467e ad;
    public final C6799e adcel;
    public final C8422e appmetrica;
    public final ExecutorC3603e billing;
    public final C8823e license;
    public final C11223e metrica;
    public final C17011e purchase;
    private volatile InterfaceC10500e serverJob;
    public final C8823e startapp;
    public final C5389e vip;
    public final ExecutorC3603e yandex;

    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, eٓٗۢ] */
    public C10709e(C11467e c11467e, C5389e c5389e, boolean z, C8422e c8422e, C17011e c17011e) {
        String str;
        C3168e c3168e = (C3168e) c11467e.f23069e;
        C11223e c11223e = new C11223e(z);
        C5891e m1243e = c3168e.m1243e("ktor.deployment.shutdown.url");
        int i = 0;
        if (m1243e != null && (str = (String) ((Map) m1243e.f12440e).get((String) m1243e.f12439e)) != null) {
            AbstractC2094e.license(c11223e, C17495e.f34313e, new C18513e(str, i));
        }
        int i2 = 3;
        InterfaceC5083e interfaceC5083e = null;
        c11223e.mopub(C11223e.f22479e, new C12358e(i2, i, interfaceC5083e));
        this.ad = c11467e;
        this.vip = c5389e;
        this.metrica = c11223e;
        C8823e c8823e = new C8823e();
        this.license = c8823e;
        ?? obj = new Object();
        obj.ad = true;
        TimeZone timeZone = AbstractC0187e.ad;
        obj.vip = System.currentTimeMillis();
        C8208e c8208e = C6582e.f13569e;
        c11223e.f22481e.mopub(C13886e.f27525e, new C16895e(i2, 1, interfaceC5083e));
        c11223e.mopub(C11223e.f22480e, new C9056e((InterfaceC4911e) c11467e.f23070e, c11223e.f22483e, null));
        c5389e.m1896goto(AbstractC4340e.ad, new C12439e((Object) obj, c11223e, 12));
        c5389e.m1896goto(AbstractC4340e.license, new C12439e((Object) obj, c11467e, 13));
        this.appmetrica = c8422e;
        this.purchase = c17011e;
        C15420e c15420e = AbstractC6731e.ad;
        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
        this.billing = executorC3603e;
        this.yandex = executorC3603e;
        C8823e c8823e2 = new C8823e();
        this.startapp = c8823e2;
        C6799e ad = AbstractC6629e.ad();
        this.adcel = ad;
        this.serverJob = AbstractC6629e.ad();
        this.serverJob = AbstractC5336e.purchase(AbstractC9743e.ad(((C5033e) c17011e.invoke()).f10720e.mo394const(executorC3603e)), null, 2, new C5443e(this, c8823e, ad, c8823e2, c11467e, null), 1);
        this.serverJob.mo692else(new C0609e(19, this));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eؙۧؐ, eُۥٔ] */
    public static final C6992e vip(C10709e c10709e, InterfaceC18435e interfaceC18435e, InterfaceC16859e interfaceC16859e) {
        String metrica = interfaceC16859e.metrica();
        int vip = interfaceC16859e.vip();
        long j = c10709e.appmetrica.license;
        C5279e c5279e = new C5279e(j, vip, metrica);
        InterfaceC5083e interfaceC5083e = null;
        C1053e c1053e = new C1053e(c10709e, interfaceC5083e, 1);
        InterfaceC4911e interfaceC4911e = AbstractC13335e.ad;
        C8823e c8823e = new C8823e();
        C6799e ad = AbstractC6629e.ad();
        C8419e appmetrica = AbstractC5336e.appmetrica(4, new C5621e("server-root-" + c5279e), interfaceC18435e, new C16600e(ad, interfaceC5083e, 9));
        C4510e c4510e = new C4510e(interfaceC18435e.advert());
        C17647e c17647e = C14157e.f27993e;
        long admob = AbstractC0326e.admob(j, EnumC15934e.SECONDS);
        C8419e purchase = AbstractC5336e.purchase(interfaceC18435e, AbstractC5797e.vip(appmetrica, new C5621e("accept-" + c5279e)), 0, new C12865e(c4510e, c5279e, c8823e, new C6799e(appmetrica), admob, c1053e, null), 2);
        purchase.mo692else(new C9041e(ad, c8823e, 23));
        appmetrica.mo692else(new C2109e(6, c4510e));
        return new C6992e(appmetrica, purchase, c8823e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(long r9, long r11, defpackage.AbstractC10731e r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.C0800e
            if (r0 == 0) goto L13
            r0 = r13
            eؒؓۗ r0 = (defpackage.C0800e) r0
            int r1 = r0.f3183e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3183e = r1
            goto L18
        L13:
            eؒؓۗ r0 = new eؒؓۗ
            r0.<init>(r8, r13)
        L18:
            java.lang.Object r13 = r0.f3186e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f3183e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.AbstractC2003e.purchase(r13)
            return r13
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            long r11 = r0.f3182e
            long r9 = r0.f3184e
            defpackage.AbstractC2003e.purchase(r13)
            goto L56
        L3b:
            defpackage.AbstractC2003e.purchase(r13)
            eؙۧؐ r13 = r8.adcel
            r13.m2245e()
            eؕۡٗ r13 = new eؕۡٗ
            r2 = 2
            r13.<init>(r8, r5, r2)
            r0.f3184e = r9
            r0.f3182e = r11
            r0.f3183e = r4
            java.lang.Object r13 = defpackage.AbstractC8306e.mopub(r9, r13, r0)
            if (r13 != r1) goto L56
            goto L73
        L56:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 != 0) goto L75
            eَٟۙ r13 = r8.serverJob
            r13.Signature(r5)
            long r6 = r11 - r9
            eؕۡٗ r13 = new eؕۡٗ
            r2 = 1
            r13.<init>(r8, r5, r2)
            r0.f3184e = r9
            r0.f3182e = r11
            r0.f3183e = r3
            java.lang.Object r9 = defpackage.AbstractC8306e.mopub(r6, r13, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            return r9
        L75:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10709e.license(long, long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(1:(2:10|11)(2:13|14))(1:15))(1:27)|16|17|18|(2:20|(1:22))|11))|29|6|(0)(0)|16|17|18|(0)|11) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r5 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r5.license("Some handlers have thrown an exception", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r8.tapsense(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(boolean r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C14738e
            if (r0 == 0) goto L13
            r0 = r8
            eٕٔ۟ r0 = (defpackage.C14738e) r0
            int r1 = r0.f29165e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29165e = r1
            goto L18
        L13:
            eٕٔ۟ r0 = new eٕٔ۟
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f29163e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f29165e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.AbstractC2003e.purchase(r8)
            goto L72
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            boolean r7 = r0.f29164e
            defpackage.AbstractC2003e.purchase(r8)
            goto L4d
        L38:
            defpackage.AbstractC2003e.purchase(r8)
            eَٟۙ r8 = r6.serverJob
            r8.start()
            eٌٝؐ r8 = r6.startapp
            r0.f29164e = r7
            r0.f29165e = r4
            java.lang.Object r8 = r8.tapsense(r0)
            if (r8 != r1) goto L4d
            goto L71
        L4d:
            eؘؓٞ r8 = r6.vip
            eؒۙ۠ r2 = defpackage.AbstractC4340e.appmetrica
            eِؒۜ r4 = r6.ad
            java.lang.Object r5 = r4.f23070e
            eٕؗٞ r5 = (defpackage.InterfaceC4911e) r5
            r8.premium(r2, r4)     // Catch: java.lang.Throwable -> L5b
            goto L63
        L5b:
            r8 = move-exception
            if (r5 == 0) goto L63
            java.lang.String r2 = "Some handlers have thrown an exception"
            r5.license(r2, r8)
        L63:
            if (r7 == 0) goto L72
            eَٟۙ r8 = r6.serverJob
            r0.f29164e = r7
            r0.f29165e = r3
            java.lang.Object r7 = r8.mo696protected(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10709e.metrica(boolean, eُؑ۠):java.lang.Object");
    }
}
