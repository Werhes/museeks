package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17829e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4457e f34936e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f34937e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C15036e f34938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17829e(AbstractC4457e abstractC4457e, C15036e c15036e, int i) {
        super(1);
        this.f34937e = i;
        this.f34936e = abstractC4457e;
        this.f34938e = c15036e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34937e) {
            case 0:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                float purchase = C2108e.purchase(interfaceC2235e.yandex());
                float metrica = C2108e.metrica(interfaceC2235e.yandex());
                C18478e mo782finally = interfaceC2235e.mo782finally();
                long m4560try = mo782finally.m4560try();
                mo782finally.m4557this().billing();
                ((C5389e) mo782finally.f36228e).appmetrica(0.0f, 0.0f, purchase, metrica, 1);
                long j = C3618e.license;
                long j2 = C3618e.appmetrica;
                float mo497instanceof = interfaceC2235e.mo497instanceof(8);
                int ceil = (int) Math.ceil(C2108e.purchase(interfaceC2235e.yandex()) / mo497instanceof);
                int ceil2 = (int) Math.ceil(C2108e.metrica(interfaceC2235e.yandex()) / mo497instanceof);
                int i = 0;
                while (true) {
                    int i2 = 2;
                    if (i >= ceil) {
                        AbstractC0054e.m224this(mo782finally, m4560try);
                        AbstractC4653e.admob(interfaceC2235e, this.f34936e, 0L, 0L, 0.0f, null, null, 0, 126);
                        AbstractC4653e.subscription(interfaceC2235e, C3618e.metrica, 0L, 0L, 0.0f, new C13121e(interfaceC2235e.mo497instanceof((float) 0.5d), 0.0f, 0, 0, null, 30), null, 0, 110);
                        float f = 1;
                        float purchase2 = (f - this.f34938e.license) * C2108e.purchase(interfaceC2235e.yandex());
                        float mo497instanceof2 = interfaceC2235e.mo497instanceof(4);
                        float mo497instanceof3 = interfaceC2235e.mo497instanceof(f);
                        AbstractC18129e.metrica(interfaceC2235e, AbstractC12246e.ad(purchase2 - mo497instanceof2, -mo497instanceof3), AbstractC5092e.ad(mo497instanceof2 * 2.0f, (2 * mo497instanceof3) + C2108e.metrica(interfaceC2235e.yandex())), mo497instanceof3);
                        return Unit.INSTANCE;
                    }
                    int i3 = 0;
                    while (i3 < ceil2) {
                        AbstractC4653e.subscription(interfaceC2235e, (i + i3) % i2 == 0 ? j : j2, AbstractC12246e.ad(i * mo497instanceof, i3 * mo497instanceof), AbstractC5092e.ad(mo497instanceof, mo497instanceof), 0.0f, null, null, 0, 120);
                        i3++;
                        i = i;
                        ceil = ceil;
                        mo497instanceof = mo497instanceof;
                        ceil2 = ceil2;
                        i2 = 2;
                    }
                    i++;
                }
            default:
                InterfaceC2235e interfaceC2235e2 = (InterfaceC2235e) obj;
                AbstractC4653e.admob(interfaceC2235e2, this.f34936e, 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC4653e.subscription(interfaceC2235e2, C3618e.metrica, 0L, 0L, 0.0f, new C13121e(interfaceC2235e2.mo497instanceof((float) 0.5d), 0.0f, 0, 0, null, 30), null, 0, 110);
                float metrica2 = C2108e.metrica(interfaceC2235e2.yandex());
                float f2 = metrica2 - ((this.f34938e.ad * metrica2) / 360.0f);
                float mo497instanceof4 = interfaceC2235e2.mo497instanceof(4);
                float mo497instanceof5 = interfaceC2235e2.mo497instanceof(1);
                AbstractC18129e.metrica(interfaceC2235e2, AbstractC12246e.ad(-mo497instanceof5, f2 - mo497instanceof4), AbstractC5092e.ad((2 * mo497instanceof5) + C2108e.purchase(interfaceC2235e2.yandex()), mo497instanceof4 * 2.0f), mo497instanceof5);
                return Unit.INSTANCE;
        }
    }
}
