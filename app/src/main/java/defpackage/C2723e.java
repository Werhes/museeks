package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2723e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6608e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f6609e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f6610e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f6611e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6612e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f6613e;

    public /* synthetic */ C2723e(C0763e c0763e, C10435e c10435e, AbstractC4457e abstractC4457e, float f, C17985e c17985e) {
        this.f6609e = c0763e;
        this.f6611e = c10435e;
        this.f6608e = abstractC4457e;
        this.f6610e = f;
        this.f6613e = c17985e;
    }

    public /* synthetic */ C2723e(C4246e c4246e, float f, InterfaceC8377e interfaceC8377e, C16747e c16747e, Function1 function1) {
        this.f6609e = c4246e;
        this.f6610e = f;
        this.f6611e = interfaceC8377e;
        this.f6608e = c16747e;
        this.f6613e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f6612e) {
            case 0:
                C0763e c0763e = (C0763e) this.f6609e;
                C10435e c10435e = (C10435e) this.f6611e;
                AbstractC4457e abstractC4457e = (AbstractC4457e) this.f6608e;
                float f = this.f6610e;
                C17985e c17985e = (C17985e) this.f6613e;
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                float f2 = -c0763e.ad;
                float f3 = -c0763e.vip;
                ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(f2, f3);
                try {
                    AbstractC4653e.loadAd(interfaceC2235e, c10435e.appmetrica, abstractC4457e, 0.0f, new C13121e(f * 2, 0.0f, 0, 0, null, 30), null, 0, 52);
                    float f4 = 1;
                    float intBitsToFloat = (Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) + f4) / Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32));
                    float intBitsToFloat2 = (Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) + f4) / Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L));
                    long mo779e = interfaceC2235e.mo779e();
                    C18478e mo782finally = interfaceC2235e.mo782finally();
                    long m4560try = mo782finally.m4560try();
                    mo782finally.m4557this().billing();
                    try {
                        ((C5389e) mo782finally.f36228e).firebase(intBitsToFloat, intBitsToFloat2, mo779e);
                        j = m4560try;
                    } catch (Throwable th) {
                        th = th;
                        j = m4560try;
                    }
                    try {
                        AbstractC4653e.loadAd(interfaceC2235e, c17985e, abstractC4457e, 0.0f, null, null, 0, 28);
                        mo782finally.m4557this().admob();
                        mo782finally.m4533continue(j);
                        ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-f2, -f3);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        mo782finally.m4557this().admob();
                        mo782finally.m4533continue(j);
                        throw th;
                    }
                } catch (Throwable th3) {
                    ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-f2, -f3);
                    throw th3;
                }
            default:
                C4246e c4246e = (C4246e) this.f6609e;
                AbstractC7844e.adcel((C17142e) c4246e.f9318e, ((Long) obj).longValue(), this.f6610e, (InterfaceC8377e) this.f6611e, (C16747e) this.f6608e, (Function1) this.f6613e);
                return Unit.INSTANCE;
        }
    }
}
