package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11461e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14748e f23064e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23065e;

    public /* synthetic */ C11461e(C14748e c14748e, int i) {
        this.f23065e = i;
        this.f23064e = c14748e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23065e) {
            case 0:
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, AbstractC16540e.vip, 3);
                AbstractC5087e.premium(c17213e, null, null, new C2892e(1623475733, true, new C6599e(25, this.f23064e)), 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC16540e.metrica, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC16540e.license, 3);
                return Unit.INSTANCE;
            default:
                ((Boolean) obj).getClass();
                C6703e c6703e = ((AppActivity) this.f23064e.pro()).f36546e;
                C2038e c2038e = c6703e.ad.f36546e.metrica;
                int i = AbstractC3489e.ad;
                int i2 = AbstractC3489e.vip;
                C0916e c0916e = c2038e.vip;
                c0916e.ad.startapp(i);
                c0916e.vip.startapp(i2);
                c6703e.metrica.getClass();
                return Unit.INSTANCE;
        }
    }
}
