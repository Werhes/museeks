package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11031e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f21849e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f21850e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21851e = 0;

    public /* synthetic */ C11031e(Function0 function0, boolean z) {
        this.f21849e = function0;
        this.f21850e = z;
    }

    public /* synthetic */ C11031e(boolean z, Function0 function0) {
        this.f21850e = z;
        this.f21849e = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f21851e) {
            case 0:
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj;
                C13770e c13770e = (C13770e) obj2;
                ((Integer) obj3).getClass();
                c13770e.m3676strictfp(-196777734);
                final long j = ((C15331e) c13770e.adcel(AbstractC8389e.ad)).ad;
                boolean appmetrica = c13770e.appmetrica(j);
                final Function0 function0 = this.f21849e;
                boolean purchase = appmetrica | c13770e.purchase(function0);
                final boolean z = this.f21850e;
                boolean billing = purchase | c13770e.billing(z);
                Object m3681throw = c13770e.m3681throw();
                if (billing || m3681throw == C2987e.ad) {
                    m3681throw = new Function1() { // from class: eؙ۟ۛ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            C8953e c8953e = (C8953e) obj4;
                            return c8953e.ad(new C1510e(function0, z, AbstractC9357e.appmetrica(c8953e, Float.intBitsToFloat((int) (c8953e.f17969e.yandex() >> 32)) / 2.0f), new C2815e(j, 5)));
                        }
                    };
                    c13770e.m3682throws(m3681throw);
                }
                InterfaceC12864e license = AbstractC5750e.license(interfaceC12864e, (Function1) m3681throw);
                c13770e.Signature(false);
                return license;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    Function0 function02 = this.f21849e;
                    boolean purchase2 = c13770e2.purchase(function02);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (purchase2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C17897e(8, function02);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC2705e.ad(this.f21850e, (Function1) m3681throw2, null, false, null, c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
