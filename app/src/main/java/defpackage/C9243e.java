package defpackage;

import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9243e implements InterfaceC12254e, InterfaceC12179e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Function2 f18445e = AbstractC3695e.ad;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f18446e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17489e f18447e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC0003e f18448e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e f18449e;

    public C9243e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, C17489e c17489e) {
        this.f18449e = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.f18447e = c17489e;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        if (enumC14621e == EnumC14621e.ON_DESTROY) {
            ad();
        } else {
            if (enumC14621e != EnumC14621e.ON_CREATE || this.f18446e) {
                return;
            }
            vip(this.f18445e);
        }
    }

    @Override // defpackage.InterfaceC12254e
    public final void ad() {
        if (!this.f18446e) {
            this.f18446e = true;
            this.f18449e.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC0003e abstractC0003e = this.f18448e;
            if (abstractC0003e != null) {
                abstractC0003e.vip(this);
            }
            this.f18448e = null;
        }
        this.f18447e.ad();
    }

    public final void vip(Function2 function2) {
        this.f18449e.setOnReadyForComposition(new C5337e(this, function2, 15));
    }
}
