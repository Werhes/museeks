package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C7589e f2293e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f2294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0287e(C7589e c7589e, int i) {
        super(0);
        this.f2294e = i;
        this.f2293e = c7589e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC5083e interfaceC5083e;
        Object obj;
        switch (this.f2294e) {
            case 0:
                C7589e c7589e = this.f2293e;
                boolean z = c7589e.billing;
                C7558e c7558e = c7589e.purchase;
                C13610e c13610e = c7589e.vip;
                if (!z && c13610e.vip() && c7558e.appmetrica()) {
                    List metrica = c7589e.metrica();
                    int size = metrica.size();
                    int i = 0;
                    while (true) {
                        interfaceC5083e = null;
                        if (i < size) {
                            obj = metrica.get(i);
                            if (!((C16223e) obj).license().vip()) {
                                i++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    C16223e c16223e = (C16223e) obj;
                    if (c16223e != null) {
                        InterfaceC6512e interfaceC6512e = c16223e.license().purchase;
                        if (interfaceC6512e instanceof C13540e) {
                            C13540e c13540e = (C13540e) interfaceC6512e;
                            AbstractC5336e.purchase(c13610e.f27001e, null, 0, new C7602e(c7589e, new C13540e(c13540e.ad, c13540e.vip, new C2152e((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L))), interfaceC5083e, 7), 3);
                        }
                        c7589e.billing = true;
                    }
                }
                return new C2152e(((C2152e) c7558e.license()).ad);
            default:
                List vip = this.f2293e.vip();
                int size2 = vip.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C16223e c16223e2 = (C16223e) vip.get(i2);
                    if (c16223e2.license().vip() && c16223e2.yandex()) {
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
