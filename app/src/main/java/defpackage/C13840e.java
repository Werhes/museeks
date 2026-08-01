package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13840e implements InterfaceC14620e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object[] f27412e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f27413e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC5039e f27414e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f27415e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC12163e f27416e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C13465e f27417e = new C13465e(23, this);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public InterfaceC10153e f27418e;

    public C13840e(InterfaceC12163e interfaceC12163e, InterfaceC5039e interfaceC5039e, String str, Object obj, Object[] objArr) {
        this.f27416e = interfaceC12163e;
        this.f27414e = interfaceC5039e;
        this.f27413e = str;
        this.f27415e = obj;
        this.f27412e = objArr;
    }

    @Override // defpackage.InterfaceC14620e
    public final void ad() {
        InterfaceC10153e interfaceC10153e = this.f27418e;
        if (interfaceC10153e != null) {
            ((C15024e) interfaceC10153e).ads();
        }
    }

    public final void license() {
        String ad;
        InterfaceC5039e interfaceC5039e = this.f27414e;
        if (this.f27418e != null) {
            throw new IllegalArgumentException(("entry(" + this.f27418e + ") is not null").toString());
        }
        if (interfaceC5039e != null) {
            C13465e c13465e = this.f27417e;
            Object invoke = c13465e.invoke();
            if (invoke == null || interfaceC5039e.metrica(invoke)) {
                this.f27418e = interfaceC5039e.purchase(this.f27413e, c13465e);
                return;
            }
            if (invoke instanceof InterfaceC16595e) {
                InterfaceC16595e interfaceC16595e = (InterfaceC16595e) invoke;
                if (interfaceC16595e.vip() == C10990e.f21771e || interfaceC16595e.vip() == C12575e.f25232e || interfaceC16595e.vip() == C10990e.f21769e) {
                    ad = "MutableState containing " + interfaceC16595e.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    ad = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                ad = AbstractC10510e.ad(invoke);
            }
            throw new IllegalArgumentException(ad);
        }
    }

    @Override // defpackage.InterfaceC14620e
    public final void metrica() {
        license();
    }

    @Override // defpackage.InterfaceC14620e
    public final void vip() {
        InterfaceC10153e interfaceC10153e = this.f27418e;
        if (interfaceC10153e != null) {
            ((C15024e) interfaceC10153e).ads();
        }
    }
}
