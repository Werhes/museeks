package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11117e implements InterfaceC16132e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C0576e f22028e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f22029e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C13540e f22030e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0576e f22031e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C15867e f22032e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0576e f22033e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0576e f22034e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f22035e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0576e f22036e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public AbstractC3424e f22037e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11139e f22038e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f22039e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C2616e f22040e;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Map, java.lang.Object] */
    public C11117e(C13119e c13119e, Object obj, AbstractC3424e abstractC3424e, C11139e c11139e) {
        this.f22029e = c13119e;
        this.f22038e = c11139e;
        C0576e startapp = AbstractC14533e.startapp(obj);
        this.f22033e = startapp;
        Object obj2 = null;
        C0576e startapp2 = AbstractC14533e.startapp(AbstractC12696e.purchase(0.0f, 0.0f, null, 7));
        this.f22031e = startapp2;
        this.f22036e = AbstractC14533e.startapp(new C9260e((InterfaceC6512e) startapp2.getValue(), c11139e, obj, startapp.getValue(), abstractC3424e));
        this.f22028e = AbstractC14533e.startapp(Boolean.TRUE);
        this.f22040e = new C2616e(-1.0f);
        this.f22034e = AbstractC14533e.startapp(obj);
        this.f22037e = abstractC3424e;
        this.f22032e = new C15867e(metrica().vip());
        Float f = (Float) AbstractC5392e.vip.get(c11139e);
        if (f != null) {
            float floatValue = f.floatValue();
            AbstractC3424e abstractC3424e2 = (AbstractC3424e) c11139e.ad.invoke(obj);
            int vip = abstractC3424e2.vip();
            for (int i = 0; i < vip; i++) {
                abstractC3424e2.appmetrica(i, floatValue);
            }
            obj2 = this.f22038e.vip.invoke(abstractC3424e2);
        }
        this.f22030e = AbstractC12696e.purchase(0.0f, 0.0f, obj2, 3);
    }

    public final void appmetrica(Object obj, boolean z) {
        C0576e c0576e = this.f22033e;
        boolean billing = AbstractC7890e.billing(null, c0576e.getValue());
        C15867e c15867e = this.f22032e;
        C0576e c0576e2 = this.f22036e;
        InterfaceC6512e interfaceC6512e = this.f22030e;
        if (billing) {
            c0576e2.setValue(new C9260e(interfaceC6512e, this.f22038e, obj, obj, this.f22037e.metrica()));
            this.f22039e = true;
            c15867e.startapp(metrica().vip());
            return;
        }
        C0576e c0576e3 = this.f22031e;
        if (!z || this.f22035e) {
            interfaceC6512e = (InterfaceC6512e) c0576e3.getValue();
        } else if (((InterfaceC6512e) c0576e3.getValue()) instanceof C13540e) {
            interfaceC6512e = (InterfaceC6512e) c0576e3.getValue();
        }
        C13119e c13119e = this.f22029e;
        long appmetrica = c13119e.appmetrica();
        C0576e c0576e4 = c13119e.yandex;
        long j = 0;
        c0576e2.setValue(new C9260e(appmetrica <= 0 ? interfaceC6512e : new C15399e(interfaceC6512e, c13119e.appmetrica()), this.f22038e, obj, c0576e.getValue(), this.f22037e));
        c15867e.startapp(metrica().vip());
        this.f22039e = false;
        c0576e4.setValue(Boolean.TRUE);
        if (c13119e.billing()) {
            C12742e c12742e = c13119e.startapp;
            int size = c12742e.size();
            for (int i = 0; i < size; i++) {
                C11117e c11117e = (C11117e) c12742e.get(i);
                j = Math.max(j, c11117e.f22032e.purchase());
                c11117e.license();
            }
            c0576e4.setValue(Boolean.FALSE);
        }
    }

    public final void billing(Object obj, InterfaceC6512e interfaceC6512e) {
        if (this.f22039e && AbstractC7890e.billing(obj, null)) {
            return;
        }
        C0576e c0576e = this.f22033e;
        boolean billing = AbstractC7890e.billing(c0576e.getValue(), obj);
        C2616e c2616e = this.f22040e;
        if (billing && c2616e.purchase() == -1.0f) {
            return;
        }
        c0576e.setValue(obj);
        this.f22031e.setValue(interfaceC6512e);
        float purchase = c2616e.purchase();
        C0576e c0576e2 = this.f22034e;
        Object value = purchase == -3.0f ? obj : c0576e2.getValue();
        C0576e c0576e3 = this.f22028e;
        appmetrica(value, !((Boolean) c0576e3.getValue()).booleanValue());
        c0576e3.setValue(Boolean.valueOf(c2616e.purchase() == -3.0f));
        if (c2616e.purchase() >= 0.0f) {
            c0576e2.setValue(metrica().purchase(c2616e.purchase() * ((float) metrica().vip())));
        } else if (c2616e.purchase() == -3.0f) {
            c0576e2.setValue(obj);
        }
        this.f22039e = false;
        c2616e.startapp(-1.0f);
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        return this.f22034e.getValue();
    }

    public final void license() {
        if (this.f22040e.purchase() == -1.0f) {
            this.f22035e = true;
            boolean billing = AbstractC7890e.billing(metrica().metrica, metrica().license);
            C0576e c0576e = this.f22034e;
            if (billing) {
                c0576e.setValue(metrica().metrica);
            } else {
                c0576e.setValue(metrica().purchase(0L));
                this.f22037e = metrica().license(0L);
            }
        }
    }

    public final C9260e metrica() {
        return (C9260e) this.f22036e.getValue();
    }

    public final void purchase(Object obj, Object obj2, InterfaceC6512e interfaceC6512e) {
        this.f22033e.setValue(obj2);
        this.f22031e.setValue(interfaceC6512e);
        if (AbstractC7890e.billing(metrica().license, obj) && AbstractC7890e.billing(metrica().metrica, obj2)) {
            return;
        }
        appmetrica(obj, false);
    }

    public final String toString() {
        return "current value: " + this.f22034e.getValue() + ", target: " + this.f22033e.getValue() + ", spec: " + ((InterfaceC6512e) this.f22031e.getValue());
    }
}
