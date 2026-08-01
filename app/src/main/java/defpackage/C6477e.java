package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6477e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12561e f13389e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f13390e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f13391e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f13392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6477e(C9243e c9243e, C14843e c14843e, Function2 function2) {
        super(2);
        this.f13391e = 4;
        this.f13390e = c9243e;
        this.f13392e = c14843e;
        this.f13389e = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6477e(Object obj, Object obj2, InterfaceC12561e interfaceC12561e, int i, int i2) {
        super(2);
        this.f13391e = i2;
        this.f13390e = obj;
        this.f13392e = obj2;
        this.f13389e = interfaceC12561e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13391e) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC18275e.ad((Function0) this.f13390e, (C9207e) this.f13392e, (C2892e) this.f13389e, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
            case 1:
                ((Number) obj2).intValue();
                AbstractC9464e.ad((Function1) this.f13390e, (InterfaceC12864e) this.f13392e, (Function1) this.f13389e, (C13770e) obj, AbstractC5190e.advert(55));
                return Unit.INSTANCE;
            case 2:
                ((Number) obj2).intValue();
                AbstractC11473e.ad((InterfaceC16590e) this.f13390e, (C1774e) this.f13392e, (Function2) this.f13389e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                ((Number) obj2).intValue();
                AbstractC7150e.ad((InterfaceC12864e) this.f13390e, (C15036e) this.f13392e, (Function2) this.f13389e, (C13770e) obj, 1);
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                C9243e c9243e = (C9243e) this.f13390e;
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = c9243e.f18449e;
                    boolean yandex = c13770e.yandex(c9243e);
                    Object m3681throw = c13770e.m3681throw();
                    InterfaceC5083e interfaceC5083e = null;
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C7989e(c9243e, interfaceC5083e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC17680e.license(c13770e, viewTreeObserverOnGlobalLayoutListenerC5014e, (Function2) m3681throw);
                    boolean yandex2 = c13770e.yandex(c9243e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C7989e(c9243e, interfaceC5083e, 1);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC17680e.license(c13770e, viewTreeObserverOnGlobalLayoutListenerC5014e, (Function2) m3681throw2);
                    ((C14843e) this.f13392e).ad(viewTreeObserverOnGlobalLayoutListenerC5014e, (Function2) this.f13389e, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
