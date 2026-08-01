package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۢۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18084e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f35469e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f35470e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f35471e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35472e;

    public /* synthetic */ C18084e(int i, Object obj, boolean z, boolean z2) {
        this.f35472e = i;
        this.f35471e = obj;
        this.f35470e = z;
        this.f35469e = z2;
    }

    public /* synthetic */ C18084e(boolean z, boolean z2, Function0 function0) {
        this.f35472e = 1;
        this.f35470e = z;
        this.f35469e = z2;
        this.f35471e = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35472e) {
            case 0:
                InterfaceC15671e interfaceC15671e = (InterfaceC15671e) obj;
                long ad = ((InterfaceC6790e) this.f35471e).ad();
                interfaceC15671e.appmetrica(AbstractC1163e.metrica, new C4167e(this.f35470e ? EnumC12813e.f25631e : EnumC12813e.f25630e, ad, this.f35469e ? 1 : 3, (9223372034707292159L & ad) != 9205357640488583168L));
                return Unit.INSTANCE;
            case 1:
                Function0 function0 = (Function0) this.f35471e;
                InterfaceC15671e interfaceC15671e2 = (InterfaceC15671e) obj;
                AbstractC14594e.smaato(interfaceC15671e2, this.f35470e);
                AbstractC14594e.metrica(interfaceC15671e2, new C1319e(10, function0));
                interfaceC15671e2.appmetrica(AbstractC10789e.metrica, new C10591e(null, new C10673e(26)));
                if (!this.f35469e) {
                    AbstractC14594e.ad(interfaceC15671e2);
                }
                return Unit.INSTANCE;
            default:
                C3766e c3766e = (C3766e) obj;
                float f = (int) (((C12729e) this.f35471e).ad >> 32);
                c3766e.ad(EnumC3856e.f8687e, 0.0f);
                if (this.f35470e) {
                    c3766e.ad(EnumC3856e.f8690e, f);
                }
                if (this.f35469e) {
                    c3766e.ad(EnumC3856e.f8688e, -f);
                }
                return Unit.INSTANCE;
        }
    }
}
