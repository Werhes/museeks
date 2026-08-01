package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3254e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9518e f7400e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7401e;

    public /* synthetic */ C3254e(C9518e c9518e, int i) {
        this.f7401e = i;
        this.f7400e = c9518e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7401e) {
            case 0:
                return Float.valueOf(this.f7400e.f18878e.purchase());
            case 1:
                this.f7400e.m2592instanceof(true);
                return Unit.INSTANCE;
            case 2:
                this.f7400e.m2592instanceof(false);
                return Unit.INSTANCE;
            case 3:
                C9518e c9518e = this.f7400e;
                c9518e.m2592instanceof(false);
                AbstractC5336e.purchase(AbstractC4608e.metrica(c9518e.vip()), null, 0, new C7236e(c9518e, (InterfaceC5083e) null, 13), 3);
                return Unit.INSTANCE;
            case 4:
                C9518e c9518e2 = this.f7400e;
                c9518e2.f18874e.setValue(Boolean.valueOf(!c9518e2.m2591import()));
                c9518e2.f18879e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                C9518e c9518e3 = this.f7400e;
                c9518e3.f18879e.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                c9518e3.f18874e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                this.f7400e.f18877e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 7:
                this.f7400e.m2592instanceof(false);
                return Unit.INSTANCE;
            default:
                this.f7400e.m2592instanceof(false);
                return Unit.INSTANCE;
        }
    }
}
