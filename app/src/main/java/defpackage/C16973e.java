package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16973e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8004e f33235e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33236e;

    public /* synthetic */ C16973e(C8004e c8004e) {
        this.f33236e = 2;
        this.f33235e = c8004e;
    }

    public /* synthetic */ C16973e(C8004e c8004e, int i, int i2) {
        this.f33236e = i2;
        this.f33235e = c8004e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33236e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f33235e.m2375private((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f33235e.m2374package((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C8004e c8004e = this.f33235e;
                    boolean yandex = c13770e.yandex(c8004e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C15101e c15101e = new C15101e(0, c8004e, C8004e.class, "activateQrScanner", "activateQrScanner()V", 0, 0, 12);
                        c13770e.m3682throws(c15101e);
                        m3681throw = c15101e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC12797e.admob, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f33235e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
