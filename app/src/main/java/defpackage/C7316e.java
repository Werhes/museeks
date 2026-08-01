package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٝٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7316e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14981e = 1;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f14982e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f14983e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f14984e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f14985e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14986e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f14987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7316e(C0149e c0149e, InterfaceC8632e interfaceC8632e, InterfaceC9543e interfaceC9543e, C7744e c7744e, NativePointer nativePointer, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14986e = c0149e;
        this.f14983e = interfaceC8632e;
        this.f14985e = interfaceC9543e;
        this.f14982e = c7744e;
        this.f14984e = nativePointer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7316e(C7558e c7558e, List list, C16330e c16330e, C2616e c2616e, C7558e c7558e2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14986e = c7558e;
        this.f14985e = list;
        this.f14982e = c16330e;
        this.f14984e = c2616e;
        this.f14983e = c7558e2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14981e) {
            case 0:
                C7316e c7316e = new C7316e((C7558e) this.f14986e, (List) this.f14985e, (C16330e) this.f14982e, (C2616e) this.f14984e, (C7558e) this.f14983e, interfaceC5083e);
                c7316e.f14987e = obj;
                return c7316e;
            default:
                C7316e c7316e2 = new C7316e((C0149e) this.f14986e, (InterfaceC8632e) this.f14983e, (InterfaceC9543e) this.f14985e, (C7744e) this.f14982e, (NativePointer) this.f14984e, interfaceC5083e);
                c7316e2.f14987e = obj;
                return c7316e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f14981e) {
            case 0:
                return ((C7316e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7316e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        InterfaceC5083e interfaceC5083e = null;
        int i = 0;
        switch (this.f14981e) {
            case 0:
                AbstractC2003e.purchase(obj);
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f14987e;
                C7558e c7558e = (C7558e) this.f14986e;
                List list = (List) this.f14985e;
                C16330e c16330e = (C16330e) this.f14982e;
                C2616e c2616e = (C2616e) this.f14984e;
                C7558e c7558e2 = (C7558e) this.f14983e;
                if (interfaceC18435e.advert().mo397public(C5170e.f11067e) != null) {
                    throw new ClassCastException();
                }
                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C6365e(c7558e, list, c16330e, c2616e, null), 3);
                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C1583e(c7558e2, interfaceC5083e, i), 3);
                return Unit.INSTANCE;
            default:
                InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) this.f14987e;
                AbstractC2003e.purchase(obj);
                AbstractC6629e.yandex(interfaceC18435e2.advert());
                C0149e c0149e = (C0149e) this.f14986e;
                long ptr$cinterop_release = ((LongPointerWrapper) c0149e.startapp().yandex().f33290e).getPtr$cinterop_release();
                int i2 = AbstractC6026e.ad;
                realmcJNI.realm_refresh(ptr$cinterop_release, new boolean[]{false});
                InterfaceC16883e subscription = ((InterfaceC8632e) this.f14983e).subscription();
                InterfaceC14666e billing = subscription.billing(c0149e.startapp());
                AbstractC1984e loadAd = subscription.loadAd((InterfaceC9543e) this.f14985e);
                if (billing != null) {
                    ((C7744e) this.f14982e).ad = new C10523e(billing.tapsense((NativePointer) this.f14984e, new C0912e(6, billing, c0149e, loadAd)));
                } else {
                    loadAd.appmetrica(null, null);
                }
                return Unit.INSTANCE;
        }
    }
}
