package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14506e extends AbstractC7185e implements Function5 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f28686e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C7145e f28687e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ List f28688e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Set f28689e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f28690e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C10263e f28691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14506e(C7145e c7145e, InterfaceC5083e interfaceC5083e, List list, Set set) {
        super(5, interfaceC5083e);
        this.f28688e = list;
        this.f28689e = set;
        this.f28687e = c7145e;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Set set = this.f28689e;
        C14506e c14506e = new C14506e(this.f28687e, (InterfaceC5083e) obj5, this.f28688e, set);
        c14506e.f28691e = (C10263e) obj2;
        c14506e.f28690e = obj3;
        return c14506e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C10263e c10263e = this.f28691e;
        Object obj2 = this.f28690e;
        int i = this.f28686e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            return obj;
        }
        AbstractC2003e.purchase(obj);
        this.f28691e = null;
        this.f28690e = null;
        this.f28686e = 1;
        Object ad = AbstractC15641e.ad(this.f28688e, this.f28689e, this.f28687e, c10263e, obj2, this);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        return ad == enumC2821e ? enumC2821e : ad;
    }
}
