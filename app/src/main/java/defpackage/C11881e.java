package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11881e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5372e f23812e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23813e;

    public /* synthetic */ C11881e(InterfaceC5372e interfaceC5372e, int i) {
        this.f23813e = i;
        this.f23812e = interfaceC5372e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23813e) {
            case 0:
                C8181e c8181e = (C8181e) obj;
                InterfaceC5372e interfaceC5372e = this.f23812e;
                if (interfaceC5372e == null) {
                    return null;
                }
                return AbstractC6190e.appmetrica(C15565e.Companion.serializer(interfaceC5372e), new C15565e(c8181e.vip, c8181e.ad));
            case 1:
                C8633e c8633e = (C8633e) obj;
                InterfaceC5372e interfaceC5372e2 = this.f23812e;
                if (interfaceC5372e2 == null) {
                    return null;
                }
                Object ad = c8633e.ad(C15565e.Companion.serializer(interfaceC5372e2));
                if (ad == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                C15565e c15565e = (C15565e) ad;
                return new C8181e(c15565e.vip, c15565e.ad);
            case 2:
                List list = (List) obj;
                InterfaceC5372e interfaceC5372e3 = this.f23812e;
                if (interfaceC5372e3 != null) {
                    return AbstractC6190e.appmetrica(new C13758e(interfaceC5372e3, 0), list);
                }
                return null;
            default:
                C8633e c8633e2 = (C8633e) obj;
                InterfaceC5372e interfaceC5372e4 = this.f23812e;
                if (interfaceC5372e4 == null) {
                    return null;
                }
                Object ad2 = c8633e2.ad(new C13758e(interfaceC5372e4, 0));
                if (ad2 != null) {
                    return (List) ad2;
                }
                throw new IllegalStateException("Required value was null.");
        }
    }
}
