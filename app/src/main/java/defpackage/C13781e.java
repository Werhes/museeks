package defpackage;

import j$.util.concurrent.ConcurrentMap$EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13781e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C8017e f27330e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ C8208e f27331e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C8017e f27332e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public /* synthetic */ C10263e f27333e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f27334e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ List f27335e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f27336e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Iterator f27337e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C8208e f27338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13781e(List list, C8017e c8017e, C8208e c8208e, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f27335e = list;
        this.f27332e = c8017e;
        this.f27331e = c8208e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C8017e c8017e = this.f27332e;
        C8208e c8208e = this.f27331e;
        C13781e c13781e = new C13781e(this.f27335e, c8017e, c8208e, (InterfaceC5083e) obj4);
        c13781e.f27333e = (C10263e) obj2;
        return c13781e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Iterator it;
        int i;
        C8208e c8208e;
        C8017e c8017e;
        C10263e c10263e = this.f27333e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        int i2 = this.f27336e;
        if (i2 == 0) {
            AbstractC2003e.purchase(obj);
            List list = this.f27335e;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((Boolean) ((C7488e) obj2).vip.invoke(c10263e)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            C8017e c8017e2 = this.f27332e;
            C8208e c8208e2 = this.f27331e;
            it = arrayList.iterator();
            i = 0;
            c8208e = c8208e2;
            c8017e = c8017e2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f27334e;
            it = this.f27337e;
            c8208e = this.f27338e;
            c8017e = this.f27330e;
            AbstractC2003e.purchase(obj);
        }
        while (it.hasNext()) {
            C7488e c7488e = (C7488e) it.next();
            InterfaceC4911e interfaceC4911e = AbstractC1002e.ad;
            if (interfaceC4911e.yandex()) {
                interfaceC4911e.amazon("Adding auth headers for " + c10263e.ad + " from provider " + c7488e);
            }
            ((Map) c10263e.purchase.ad(c8208e, new C1349e(23))).put(c7488e, new Integer(((C5619e) ConcurrentMap$EL.computeIfAbsent(c8017e.f16271e, c7488e, new C17607e(new C17897e(2, new C1349e(22))))).atomic));
            this.f27333e = c10263e;
            this.f27330e = c8017e;
            this.f27338e = c8208e;
            this.f27337e = it;
            this.f27334e = i;
            this.f27336e = 1;
            if (c7488e.ad(c10263e, this) == enumC2821e) {
                return enumC2821e;
            }
        }
        return Unit.INSTANCE;
    }
}
