package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11003e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f21791e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public EnumC8270e f21792e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f21793e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C13212e f21794e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, eُٔ۟] */
    public static C11003e billing() {
        ?? abstractC9594e = new AbstractC9594e();
        abstractC9594e.f21792e = EnumC8270e.INV;
        abstractC9594e.f21794e = C13212e.f26218e;
        return abstractC9594e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        yandex((C16578e) abstractC2649e);
        return this;
    }

    public final Object clone() {
        C11003e billing = billing();
        billing.yandex(purchase());
        return billing;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r3, defpackage.C18521e r4) {
        /*
            r2 = this;
            r0 = 0
            eٌُْ r1 = defpackage.C16578e.f32522e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٌٖۢ r1 = new eٌٖۢ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.yandex(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eٌٖۢ r4 = (defpackage.C16578e) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.yandex(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11003e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C16578e purchase = purchase();
        if (purchase.ad()) {
            return purchase;
        }
        throw new C14803e();
    }

    public final C16578e purchase() {
        C16578e c16578e = new C16578e(this);
        int i = this.f21793e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c16578e.f32524e = this.f21792e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c16578e.f32526e = this.f21794e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c16578e.f32523e = this.f21791e;
        c16578e.f32525e = i2;
        return c16578e;
    }

    public final void yandex(C16578e c16578e) {
        C13212e c13212e;
        if (c16578e == C16578e.f32521e) {
            return;
        }
        if ((c16578e.f32525e & 1) == 1) {
            EnumC8270e enumC8270e = c16578e.f32524e;
            enumC8270e.getClass();
            this.f21793e = 1 | this.f21793e;
            this.f21792e = enumC8270e;
        }
        if ((c16578e.f32525e & 2) == 2) {
            C13212e c13212e2 = c16578e.f32526e;
            if ((this.f21793e & 2) != 2 || (c13212e = this.f21794e) == C13212e.f26218e) {
                this.f21794e = c13212e2;
            } else {
                C3333e subscription = C13212e.subscription(c13212e);
                subscription.startapp(c13212e2);
                this.f21794e = subscription.billing();
            }
            this.f21793e |= 2;
        }
        if ((c16578e.f32525e & 4) == 4) {
            int i = c16578e.f32523e;
            this.f21793e = 4 | this.f21793e;
            this.f21791e = i;
        }
        this.f19037e = this.f19037e.billing(c16578e.f32527e);
    }
}
