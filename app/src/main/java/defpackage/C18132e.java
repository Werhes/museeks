package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۥۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18132e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EnumC5155e f35539e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f35540e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f35541e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f35542e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, e٘ۥۥ] */
    public static C18132e billing() {
        ?? abstractC9594e = new AbstractC9594e();
        abstractC9594e.f35540e = -1;
        abstractC9594e.f35539e = EnumC5155e.PACKAGE;
        return abstractC9594e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        yandex((C10905e) abstractC2649e);
        return this;
    }

    public final Object clone() {
        C18132e billing = billing();
        billing.yandex(purchase());
        return billing;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r2, defpackage.C18521e r3) {
        /*
            r1 = this;
            r3 = 0
            eٌُْ r0 = defpackage.C10905e.f21603e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٍُٖ r0 = new eٍُٖ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.yandex(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            eؙِۛ r0 = r2.f28108e     // Catch: java.lang.Throwable -> Lf
            eٍُٖ r0 = (defpackage.C10905e) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.yandex(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18132e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C10905e purchase = purchase();
        if (purchase.ad()) {
            return purchase;
        }
        throw new C14803e();
    }

    public final C10905e purchase() {
        C10905e c10905e = new C10905e(this);
        int i = this.f35541e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c10905e.f21605e = this.f35540e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c10905e.f21607e = this.f35542e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c10905e.f21604e = this.f35539e;
        c10905e.f21606e = i2;
        return c10905e;
    }

    public final void yandex(C10905e c10905e) {
        if (c10905e == C10905e.f21602e) {
            return;
        }
        int i = c10905e.f21606e;
        if ((i & 1) == 1) {
            int i2 = c10905e.f21605e;
            this.f35541e = 1 | this.f35541e;
            this.f35540e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c10905e.f21607e;
            this.f35541e = 2 | this.f35541e;
            this.f35542e = i3;
        }
        if ((i & 4) == 4) {
            EnumC5155e enumC5155e = c10905e.f21604e;
            enumC5155e.getClass();
            this.f35541e = 4 | this.f35541e;
            this.f35539e = enumC5155e;
        }
        this.f19037e = this.f19037e.billing(c10905e.f21608e);
    }
}
