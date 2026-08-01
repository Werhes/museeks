package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10505e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f20722e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f20723e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f20724e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f20725e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20726e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f20727e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f20728e;

    public /* synthetic */ C10505e(C0160e c0160e, int i, int i2, Function1 function1, Function1 function12, InterfaceC3314e interfaceC3314e) {
        this.f20725e = c0160e;
        this.f20724e = i;
        this.f20723e = i2;
        this.f20722e = function1;
        this.f20728e = function12;
        this.f20727e = interfaceC3314e;
    }

    public /* synthetic */ C10505e(AbstractC2832e abstractC2832e, InterfaceC16719e interfaceC16719e, InterfaceC13158e interfaceC13158e, int i, int i2, C10935e c10935e) {
        this.f20725e = abstractC2832e;
        this.f20722e = interfaceC16719e;
        this.f20728e = interfaceC13158e;
        this.f20724e = i;
        this.f20723e = i2;
        this.f20727e = c10935e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20726e) {
            case 0:
                AbstractC2832e abstractC2832e = (AbstractC2832e) this.f20725e;
                InterfaceC16719e interfaceC16719e = (InterfaceC16719e) this.f20722e;
                InterfaceC13158e interfaceC13158e = (InterfaceC13158e) this.f20728e;
                C10935e c10935e = (C10935e) this.f20727e;
                AbstractC17074e.vip((AbstractC3698e) obj, abstractC2832e, interfaceC16719e, interfaceC13158e.getLayoutDirection(), this.f20724e, this.f20723e, c10935e.ad);
                return Unit.INSTANCE;
            default:
                C0160e c0160e = (C0160e) this.f20725e;
                Function1 function1 = (Function1) this.f20722e;
                Function1 function12 = (Function1) this.f20728e;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f20727e;
                C17213e c17213e = (C17213e) obj;
                List list = c0160e.ad;
                c17213e.mopub(list.size(), null, new C6262e(15, list), new C2892e(2039820996, true, new C11847e(list, this.f20724e, this.f20723e, function1, function12, interfaceC3314e)));
                String str = c0160e.vip;
                if (str != null && str.length() > 0) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(493215258, true, new C5020e(c0160e, 1)), 3);
                }
                return Unit.INSTANCE;
        }
    }
}
