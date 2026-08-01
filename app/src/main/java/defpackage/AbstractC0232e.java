package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0232e implements InterfaceC14190e {
    public static final C8028e license = new AbstractC0232e(new C10195e(false, false, false, false, true, "    ", false, "type", false, true, 3), AbstractC16398e.ad);
    public final C10195e ad;
    public final C15816e metrica = new C15816e(9);
    public final C10068e vip;

    public AbstractC0232e(C10195e c10195e, C10068e c10068e) {
        this.ad = c10195e;
        this.vip = c10068e;
    }

    @Override // defpackage.InterfaceC13417e
    public final C10068e ad() {
        return this.vip;
    }

    public final Object appmetrica(InterfaceC5372e interfaceC5372e, String str) {
        C2115e c2115e = new C2115e(str);
        Object billing = new C1243e(this, EnumC6813e.f14026e, c2115e, interfaceC5372e.appmetrica(), null).billing(interfaceC5372e);
        c2115e.loadAd();
        return billing;
    }

    public final Object license(InterfaceC5372e interfaceC5372e, AbstractC1948e abstractC1948e) {
        InterfaceC11754e c6578e;
        String str = null;
        if (abstractC1948e instanceof C4030e) {
            c6578e = new C0203e(this, (C4030e) abstractC1948e, str, 12);
        } else if (abstractC1948e instanceof C7960e) {
            c6578e = new C0688e(this, (C7960e) abstractC1948e);
        } else {
            if (!(abstractC1948e instanceof C3093e) && !abstractC1948e.equals(C11549e.INSTANCE)) {
                throw new C14803e(10);
            }
            c6578e = new C6578e(this, (AbstractC16920e) abstractC1948e, null);
        }
        return c6578e.billing(interfaceC5372e);
    }

    public final String purchase(InterfaceC5372e interfaceC5372e, Object obj) {
        C13572e c13572e = new C13572e(9, false);
        C18078e c18078e = C18078e.metrica;
        c13572e.f26878e = c18078e.license(128);
        try {
            AbstractC4508e.license(this, c13572e, interfaceC5372e, obj);
            String c13572e2 = c13572e.toString();
            c18078e.vip((char[]) c13572e.f26878e);
            return c13572e2;
        } catch (Throwable th) {
            C18078e.metrica.vip((char[]) c13572e.f26878e);
            throw th;
        }
    }
}
