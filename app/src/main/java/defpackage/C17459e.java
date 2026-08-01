package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؐۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17459e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f34188e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ View f34189e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f34190e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ String f34191e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f34192e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f34193e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C12692e f34194e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34195e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14609e f34196e;

    public C17459e(C12692e c12692e, C15274e c15274e, View view, InterfaceC16132e interfaceC16132e, Function1 function1, C14609e c14609e, boolean z, String str, Function1 function12) {
        this.f34194e = c12692e;
        this.f34190e = c15274e;
        this.f34189e = view;
        this.f34192e = interfaceC16132e;
        this.f34188e = function1;
        this.f34196e = c14609e;
        this.f34195e = z;
        this.f34191e = str;
        this.f34193e = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Number) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            Object obj4 = this.f34189e;
            boolean yandex = c13770e.yandex(obj4);
            Object obj5 = this.f34192e;
            boolean purchase = yandex | c13770e.purchase(obj5);
            Object m3681throw = c13770e.m3681throw();
            Object obj6 = C2987e.ad;
            if (purchase || m3681throw == obj6) {
                m3681throw = new C17874e(obj4, obj5, 16);
                c13770e.m3682throws(m3681throw);
            }
            Function1 function1 = (Function1) m3681throw;
            boolean yandex2 = c13770e.yandex(obj4) | c13770e.purchase(obj5);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == obj6) {
                m3681throw2 = new C1021e(obj4, obj5, 12);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC12864e billing = AbstractC5542e.billing(this.f34194e, this.f34190e, function1, (Function0) m3681throw2, 17);
            InterfaceC17220e interfaceC17220e = (InterfaceC17220e) c13770e.adcel(AbstractC10746e.ad);
            Object obj7 = this.f34188e;
            boolean purchase2 = c13770e.purchase(obj7);
            C14609e c14609e = this.f34196e;
            boolean purchase3 = purchase2 | c13770e.purchase(c14609e);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase3 || m3681throw3 == obj6) {
                m3681throw3 = new C1021e(obj7, c14609e, 13);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC12864e advert = AbstractC12220e.advert(AbstractC18007e.metrica(AbstractC9546e.metrica(C0115e.f1276e, this.f34190e, interfaceC17220e, false, null, (Function0) m3681throw3, 28), 1.0f), 16, 6);
            boolean z = this.f34195e;
            boolean billing2 = c13770e.billing(z);
            Object m3681throw4 = c13770e.m3681throw();
            if (billing2 || m3681throw4 == obj6) {
                m3681throw4 = new C5569e(z);
                c13770e.m3682throws(m3681throw4);
            }
            Function0 function0 = (Function0) m3681throw4;
            String str = this.f34191e;
            boolean purchase4 = c13770e.purchase(str);
            Object m3681throw5 = c13770e.m3681throw();
            if (purchase4 || m3681throw5 == obj6) {
                m3681throw5 = new C11639e(str, 3);
                c13770e.m3682throws(m3681throw5);
            }
            C14155e.vip(function0, (Function0) m3681throw5, this.f34193e, c14609e, billing, advert, c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
