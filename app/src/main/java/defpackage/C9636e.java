package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9636e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3675e f19109e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Block f19110e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19111e;

    public /* synthetic */ C9636e(Catalog2Block catalog2Block, C3675e c3675e, int i) {
        this.f19111e = i;
        this.f19110e = catalog2Block;
        this.f19109e = c3675e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19111e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C8407e c8407e = AbstractC11854e.vip;
                    Catalog2Block catalog2Block = this.f19110e;
                    boolean purchase = c13770e.purchase(catalog2Block);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (purchase || m3681throw == c5170e) {
                        m3681throw = new C0855e(catalog2Block, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    Function0 function0 = (Function0) m3681throw;
                    C3675e c3675e = this.f19109e;
                    boolean yandex = c13770e.yandex(c3675e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex || m3681throw2 == c5170e) {
                        m3681throw2 = new C17322e(c3675e, 0);
                        c13770e.m3682throws(m3681throw2);
                    }
                    c8407e.ad(false, function0, (Function0) m3681throw2, c13770e, 3078);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C8407e c8407e2 = AbstractC11854e.vip;
                    Catalog2Block catalog2Block2 = this.f19110e;
                    boolean purchase2 = c13770e2.purchase(catalog2Block2);
                    Object m3681throw3 = c13770e2.m3681throw();
                    Object obj3 = C2987e.ad;
                    if (purchase2 || m3681throw3 == obj3) {
                        m3681throw3 = new C0855e(catalog2Block2, 1);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    Function0 function02 = (Function0) m3681throw3;
                    C3675e c3675e2 = this.f19109e;
                    boolean yandex2 = c13770e2.yandex(c3675e2);
                    Object m3681throw4 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw4 == obj3) {
                        m3681throw4 = new C17322e(c3675e2, 1);
                        c13770e2.m3682throws(m3681throw4);
                    }
                    c8407e2.ad(true, function02, (Function0) m3681throw4, c13770e2, 3078);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
