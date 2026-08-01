package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٞؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8091e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7344e f16439e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16440e;

    public /* synthetic */ C8091e(C7344e c7344e, int i) {
        this.f16440e = i;
        this.f16439e = c7344e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16440e) {
            case 0:
                InterfaceC9153e interfaceC9153e = (InterfaceC9153e) this.f16439e.f15066e.invoke();
                int ad = interfaceC9153e.ad();
                int i = 0;
                while (true) {
                    if (i >= ad) {
                        i = -1;
                    } else if (!interfaceC9153e.vip(i).equals(obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Integer) obj).intValue();
                C7344e c7344e = this.f16439e;
                InterfaceC9153e interfaceC9153e2 = (InterfaceC9153e) c7344e.f15066e.invoke();
                if (intValue < 0 || intValue >= interfaceC9153e2.ad()) {
                    StringBuilder premium = AbstractC4653e.premium("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    premium.append(interfaceC9153e2.ad());
                    premium.append(')');
                    AbstractC8889e.ad(premium.toString());
                }
                AbstractC5336e.purchase(c7344e.m3623e(), null, 0, new C11143e(c7344e, intValue, (InterfaceC5083e) null, 2), 3);
                return Boolean.TRUE;
        }
    }
}
