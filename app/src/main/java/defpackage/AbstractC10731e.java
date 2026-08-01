package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10731e extends AbstractC9049e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient InterfaceC5083e f21134e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC8850e f21135e;

    public AbstractC10731e(InterfaceC5083e interfaceC5083e) {
        this(interfaceC5083e, interfaceC5083e != null ? interfaceC5083e.admob() : null);
    }

    public AbstractC10731e(InterfaceC5083e interfaceC5083e, InterfaceC8850e interfaceC8850e) {
        super(interfaceC5083e);
        this.f21135e = interfaceC8850e;
    }

    @Override // defpackage.AbstractC9049e
    public void Signature() {
        InterfaceC5083e interfaceC5083e = this.f21134e;
        if (interfaceC5083e != null && interfaceC5083e != this) {
            ((InterfaceC5972e) admob().mo397public(C12575e.f25235e)).crashlytics(interfaceC5083e);
        }
        this.f21134e = C3966e.f8850e;
    }

    @Override // defpackage.InterfaceC5083e
    public InterfaceC8850e admob() {
        return this.f21135e;
    }
}
