package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۠ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17302e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9512e f33945e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33946e;

    public /* synthetic */ C17302e(AbstractC9512e abstractC9512e, int i) {
        this.f33946e = i;
        this.f33945e = abstractC9512e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33946e) {
            case 0:
                AbstractC9512e abstractC9512e = this.f33945e;
                C0576e c0576e = abstractC9512e.f18866e;
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.m1741abstract(c17213e, new C2892e(-828933298, true, new C8035e(5, abstractC9512e)), 3);
                if (((Boolean) abstractC9512e.f18867e.getValue()).booleanValue()) {
                    AbstractC5087e.premium(c17213e, null, null, C4094e.metrica, 3);
                }
                if (!((InterfaceC8346e) c0576e.getValue()).isEmpty()) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(6023956, true, new C5925e(abstractC9512e, 0)), 3);
                }
                InterfaceC8346e interfaceC8346e = (InterfaceC8346e) c0576e.getValue();
                c17213e.mopub(((AbstractC7674e) interfaceC8346e).subs(), null, new C6262e(0, interfaceC8346e), new C2892e(802480018, true, new C4290e(interfaceC8346e, abstractC9512e, 11)));
                return Unit.INSTANCE;
            default:
                this.f33945e.f18868e.setValue((String) obj);
                return Unit.INSTANCE;
        }
    }
}
