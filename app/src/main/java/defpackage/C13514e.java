package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۜؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13514e extends C1613e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ThreadLocal f26807e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13514e(defpackage.InterfaceC5083e r3, defpackage.InterfaceC8850e r4) {
        /*
            r2 = this;
            eؚؕ۠ r0 = defpackage.C6924e.f14185e
            eؗؒۚ r1 = r4.mo397public(r0)
            if (r1 != 0) goto Ld
            eٌِٞ r0 = r4.mo394const(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f26807e = r0
            eٌِٞ r3 = r3.admob()
            eّٚۖ r0 = defpackage.C12575e.f25235e
            eؗؒۚ r3 = r3.mo397public(r0)
            boolean r3 = r3 instanceof defpackage.AbstractC3743e
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.AbstractC2745e.purchase(r4, r3)
            defpackage.AbstractC2745e.appmetrica(r4, r3)
            r2.m3613e(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13514e.<init>(eًؗۖ, eٌِٞ):void");
    }

    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public final void m3613e(InterfaceC8850e interfaceC8850e, Object obj) {
        this.threadLocalIsSet = true;
        this.f26807e.set(new C6571e(interfaceC8850e, obj));
    }

    @Override // defpackage.C1613e
    /* renamed from: eؘؕۥ */
    public final void mo654e() {
        m3615e();
    }

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final boolean m3614e() {
        boolean z = this.threadLocalIsSet && this.f26807e.get() == null;
        this.f26807e.remove();
        return !z;
    }

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public final void m3615e() {
        if (this.threadLocalIsSet) {
            C6571e c6571e = (C6571e) this.f26807e.get();
            if (c6571e != null) {
                AbstractC2745e.appmetrica((InterfaceC8850e) c6571e.f13544e, c6571e.f13543e);
            }
            this.f26807e.remove();
        }
    }

    @Override // defpackage.C1613e, defpackage.C6467e
    public final void signatures(Object obj) {
        m3615e();
        Object billing = AbstractC14161e.billing(obj);
        InterfaceC5083e interfaceC5083e = this.f4530e;
        InterfaceC8850e admob = interfaceC5083e.admob();
        Object purchase = AbstractC2745e.purchase(admob, null);
        C13514e subscription = purchase != AbstractC2745e.vip ? AbstractC6494e.subscription(interfaceC5083e, admob, purchase) : null;
        try {
            interfaceC5083e.billing(billing);
            Unit unit = Unit.INSTANCE;
            if (subscription == null || subscription.m3614e()) {
                AbstractC2745e.appmetrica(admob, purchase);
            }
        } catch (Throwable th) {
            if (subscription == null || subscription.m3614e()) {
                AbstractC2745e.appmetrica(admob, purchase);
            }
            throw th;
        }
    }
}
