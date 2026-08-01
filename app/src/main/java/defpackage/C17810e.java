package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17810e implements InterfaceC12179e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C13578e f34897e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f34898e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f34899e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ EnumC14621e f34900e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ EnumC14621e f34901e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7185e f34902e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C17651e f34903e;

    /* JADX WARN: Multi-variable type inference failed */
    public C17810e(EnumC14621e enumC14621e, C4246e c4246e, InterfaceC18435e interfaceC18435e, EnumC14621e enumC14621e2, C13578e c13578e, C17651e c17651e, Function2 function2) {
        this.f34901e = enumC14621e;
        this.f34899e = c4246e;
        this.f34898e = interfaceC18435e;
        this.f34900e = enumC14621e2;
        this.f34897e = c13578e;
        this.f34903e = c17651e;
        this.f34902e = (AbstractC7185e) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        EnumC14621e enumC14621e2 = this.f34901e;
        C4246e c4246e = this.f34899e;
        if (enumC14621e == enumC14621e2) {
            c4246e.f9318e = AbstractC5336e.purchase(this.f34898e, null, 0, new C1247e(this.f34903e, (Function2) this.f34902e, (InterfaceC5083e) null), 3);
            return;
        }
        if (enumC14621e == this.f34900e) {
            InterfaceC10500e interfaceC10500e = (InterfaceC10500e) c4246e.f9318e;
            if (interfaceC10500e != null) {
                interfaceC10500e.Signature(null);
            }
            c4246e.f9318e = null;
        }
        if (enumC14621e == EnumC14621e.ON_DESTROY) {
            this.f34897e.billing(Unit.INSTANCE);
        }
    }
}
