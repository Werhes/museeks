package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14345e extends C7460e implements Function3 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C14345e f28374e = new C7460e(3, C3796e.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3796e c3796e = (C3796e) obj;
        InterfaceC11221e interfaceC11221e = (InterfaceC11221e) obj2;
        long j = c3796e.ad;
        if (j <= 0) {
            ((C16259e) interfaceC11221e).f31935e = Unit.INSTANCE;
        } else {
            RunnableC11247e runnableC11247e = new RunnableC11247e(interfaceC11221e, c3796e, 0);
            C16259e c16259e = (C16259e) interfaceC11221e;
            InterfaceC8850e interfaceC8850e = c16259e.f31939e;
            c16259e.f31936e = AbstractC16481e.license(interfaceC8850e).ad(j, runnableC11247e, interfaceC8850e);
        }
        return Unit.INSTANCE;
    }
}
