package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2243e implements InterfaceC7224e {
    public final /* synthetic */ C5435e ad;
    public final C5609e appmetrica;
    public final C9424e license;
    public final C18464e metrica;
    public final C14826e vip;

    public C2243e(C5435e c5435e) {
        this.ad = c5435e;
        C14826e license = AbstractC8461e.license(this);
        this.vip = license;
        C10345e c10345e = new C10345e(this, 0);
        C10345e c10345e2 = new C10345e(this, 1);
        C18464e c18464e = new C18464e(license, Collections.singletonList(new C5933e(new C3950e(c10345e, null), new C9335e(3, C6609e.ad, C6609e.class, "checkDuplicateSession", "checkDuplicateSession(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 14), c10345e2)));
        this.metrica = c18464e;
        InterfaceC10540e interfaceC10540e = c5435e.ad;
        interfaceC10540e.smaato(new C16783e(interfaceC10540e, this, 1));
        if (interfaceC10540e.getState() == EnumC10668e.f21012e) {
            C8419e c8419e = (C8419e) c18464e.f36192e;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            c18464e.f36192e = null;
        } else {
            interfaceC10540e.smaato(new C5934e(5, this));
        }
        interfaceC10540e.smaato(new C16783e(interfaceC10540e, this, 0));
        C9424e c9424e = new C9424e();
        this.license = c9424e;
        int i = 0;
        int i2 = 0;
        this.appmetrica = AbstractC14437e.vip(this, c9424e, InterfaceC17396e.Companion.serializer(), new C0682e(0, this, C2243e.class, "initialStack", "initialStack()Ljava/util/List;", i2, i, 5), true, new C14874e(2, this, C2243e.class, "createChild", "createChild(Lua/itaysonlab/vkxtv/components/VkxTvRootComponent$Config;Lcom/arkivanov/decompose/ComponentContext;)Lua/itaysonlab/vkxtv/core/ComposeComponent;", i2, i, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C2243e r8, defpackage.AbstractC10731e r9) {
        /*
            eٍّؔ r0 = r8.license
            boolean r1 = r9 instanceof defpackage.C12820e
            if (r1 == 0) goto L15
            r1 = r9
            eّۢؕ r1 = (defpackage.C12820e) r1
            int r2 = r1.f25640e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f25640e = r2
            goto L1a
        L15:
            eّۢؕ r1 = new eّۢؕ
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f25639e
            int r2 = r1.f25640e
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.AbstractC2003e.purchase(r9)
            goto L9f
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.AbstractC2003e.purchase(r9)
            e٘۠ؒ r9 = defpackage.AbstractC1831e.ad()
            eًۛ۠ r9 = r9.purchase
            java.lang.Object r9 = r9.purchase
            eُْٔ r9 = (defpackage.C14688e) r9
            eؑۚٝ r9 = r9.f29092e
            java.lang.Object r9 = r9.getValue()
            eؑؒ r9 = (defpackage.C0029e) r9
            if (r9 == 0) goto L89
            long r4 = r9.vip
            eًۛ۠ r9 = defpackage.AbstractC1831e.vip()
            java.lang.Object r9 = r9.billing
            eۤۤ r9 = (defpackage.C18479e) r9
            long r6 = r9.ad
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L89
            e٘۠ؒ r9 = defpackage.AbstractC1831e.ad()
            eًۛ۠ r9 = r9.purchase
            java.lang.Object r9 = r9.yandex
            eُْٔ r9 = (defpackage.C14688e) r9
            eؑۚٝ r9 = r9.f29092e
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L89
            eؓۛٔ r9 = new eؓۛٔ
            r1 = 29
            r9.<init>(r1)
            defpackage.AbstractC14966e.metrica(r0, r9)
            eٔٛۤ r9 = r8.vip
            eٗ٘ٗ r0 = new eٗ٘ٗ
            r1 = 15
            r2 = 0
            r0.<init>(r8, r2, r1)
            r8 = 3
            r1 = 0
            defpackage.AbstractC5336e.purchase(r9, r2, r1, r0, r8)
            goto Lca
        L89:
            e٘۠ؒ r8 = defpackage.AbstractC1831e.ad()
            r8.ad()
            e٘۠ؒ r8 = defpackage.AbstractC1831e.ad()
            r1.f25640e = r3
            java.lang.Object r8 = r8.vip(r1)
            eٟؔۙ r9 = defpackage.EnumC2821e.f6782e
            if (r8 != r9) goto L9f
            return r9
        L9f:
            e٘۠ؒ r8 = defpackage.AbstractC1831e.ad()
            eًۛ۠ r8 = r8.purchase
            java.lang.Object r8 = r8.yandex
            eُْٔ r8 = (defpackage.C14688e) r8
            eؑۚٝ r8 = r8.f29092e
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc1
            eۣٗۚ r8 = new eۣٗۚ
            r9 = 0
            r8.<init>(r9)
            defpackage.AbstractC14966e.metrica(r0, r8)
            goto Lca
        Lc1:
            eۣٗۚ r8 = new eۣٗۚ
            r9 = 1
            r8.<init>(r9)
            defpackage.AbstractC14966e.metrica(r0, r8)
        Lca:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2243e.ad(eؘؓۧ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.license;
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.vip;
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.appmetrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.ad;
    }
}
