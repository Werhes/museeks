package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6229e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f13032e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f13033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6229e(C4246e c4246e, int i) {
        super(1);
        this.f13033e = i;
        this.f13032e = c4246e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f13033e) {
            case 0:
                this.f13032e.f9318e = (C11795e) obj;
                return Boolean.TRUE;
            case 1:
                AbstractC12811e abstractC12811e = (AbstractC12811e) obj;
                C4246e c4246e = this.f13032e;
                Object obj2 = c4246e.f9318e;
                if (obj2 == null && abstractC12811e.f25627e) {
                    c4246e.f9318e = abstractC12811e;
                } else if (obj2 != null) {
                    abstractC12811e.getClass();
                }
                return Boolean.TRUE;
            default:
                InterfaceC5077e interfaceC5077e = (InterfaceC6459e) obj;
                if (((AbstractC13616e) interfaceC5077e).f27022e.f27016e) {
                    this.f13032e.f9318e = interfaceC5077e;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
