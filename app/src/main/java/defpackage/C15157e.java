package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15157e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11105e f30004e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f30005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15157e(C11105e c11105e, int i) {
        super(1);
        this.f30005e = i;
        this.f30004e = c11105e;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [eؚٗٗ, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30005e) {
            case 0:
                C11105e c11105e = this.f30004e;
                c11105e.license = true;
                c11105e.purchase.invoke();
                return Unit.INSTANCE;
            default:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                C11105e c11105e2 = this.f30004e;
                C10319e c10319e = c11105e2.vip;
                float f = c11105e2.mopub;
                float f2 = c11105e2.advert;
                C18478e mo782finally = interfaceC2235e.mo782finally();
                long m4560try = mo782finally.m4560try();
                mo782finally.m4557this().billing();
                try {
                    ((C5389e) mo782finally.f36228e).firebase(f, f2, 0L);
                    c10319e.ad(interfaceC2235e);
                    AbstractC0054e.m224this(mo782finally, m4560try);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    AbstractC0054e.m224this(mo782finally, m4560try);
                    throw th;
                }
        }
    }
}
