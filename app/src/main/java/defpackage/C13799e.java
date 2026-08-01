package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13799e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11944e f27353e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27354e;

    public /* synthetic */ C13799e(InterfaceC11944e interfaceC11944e, int i) {
        this.f27354e = i;
        this.f27353e = interfaceC11944e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27354e) {
            case 0:
                this.f27353e.vip(((C2152e) obj).ad, C5107e.f10953e);
                return Unit.INSTANCE;
            case 1:
                C2401e c2401e = (C2401e) obj;
                this.f27353e.appmetrica(AbstractC17957e.startapp(c2401e, false));
                c2401e.ad();
                return Unit.INSTANCE;
            default:
                C2401e c2401e2 = (C2401e) obj;
                this.f27353e.appmetrica(AbstractC17957e.startapp(c2401e2, false));
                c2401e2.ad();
                return Unit.INSTANCE;
        }
    }
}
