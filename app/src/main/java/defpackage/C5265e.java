package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5265e extends C7460e implements Function3 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C5265e f11343e = new C7460e(3, C6467e.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6467e c6467e = (C6467e) obj;
        InterfaceC11221e interfaceC11221e = (InterfaceC11221e) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6467e.f13374e;
        c6467e.getClass();
        while (true) {
            Object obj4 = C6467e.f13374e.get(c6467e);
            if (!(obj4 instanceof InterfaceC1648e)) {
                if (!(obj4 instanceof C1427e)) {
                    obj4 = AbstractC15211e.startapp(obj4);
                }
                ((C16259e) interfaceC11221e).f31935e = obj4;
            } else if (c6467e.m2172e(obj4) >= 0) {
                ((C16259e) interfaceC11221e).f31936e = AbstractC6629e.smaato(c6467e, true, new C16856e(c6467e, interfaceC11221e, 0));
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
