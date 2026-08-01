package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15686e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30896e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C18464e f30897e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f30898e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15686e(C18464e c18464e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30896e = i;
        this.f30897e = c18464e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30896e) {
            case 0:
                C15686e c15686e = new C15686e(this.f30897e, interfaceC5083e, 0);
                c15686e.f30898e = obj;
                return c15686e;
            default:
                C15686e c15686e2 = new C15686e(this.f30897e, interfaceC5083e, 1);
                c15686e2.f30898e = obj;
                return c15686e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30896e) {
            case 0:
                return ((C15686e) advert((InterfaceC5083e) obj2, (C5788e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C15686e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [eّٕ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [eِؒۜ, java.lang.Object] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        InterfaceC13984e interfaceC13984e;
        int i = this.f30896e;
        C18464e c18464e = this.f30897e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        InterfaceC5083e interfaceC5083e = null;
        switch (i) {
            case 0:
                C5788e c5788e = (C5788e) this.f30898e;
                int i2 = this.f30899e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0318e c0318e = c5788e.ad;
                    C2394e c2394e = C2394e.f6116e;
                    c18464e.getClass();
                    String ad = AbstractC0852e.ad();
                    EnumC13735e enumC13735e = EnumC13735e.AndroidTv;
                    C0193e c0193e = C0193e.f1409e;
                    C9441e c9441e = new C9441e(ad, enumC13735e, "8.12.1_pub", 99167, c0193e);
                    List list = (List) c18464e.f36190e;
                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C5933e) it.next()).getClass();
                        arrayList.add("auth");
                    }
                    C0072e c0072e = new C0072e(1, c9441e, arrayList, c0193e);
                    ((C12213e) c0318e.loadAd()).billing(c2394e);
                    InterfaceC7227e vip = AbstractC3820e.ad.vip(C0072e.class);
                    try {
                        interfaceC13984e = AbstractC3820e.ad(C0072e.class);
                    } catch (Throwable unused) {
                        interfaceC13984e = null;
                    }
                    C12025e c12025e = new C12025e(vip, interfaceC13984e);
                    this.f30898e = null;
                    this.f30899e = 1;
                    if (c0318e.mo325static(c0072e, c12025e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f30898e;
                int i3 = this.f30899e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C4870e c4870e = new C4870e(c18464e, null, 22);
                    String str = AbstractC3849e.ad;
                    List singletonList = Collections.singletonList(str);
                    ?? obj2 = new Object();
                    obj2.ad = 0;
                    Unit unit = Unit.INSTANCE;
                    InterfaceC16859e[] interfaceC16859eArr = (InterfaceC16859e[]) Arrays.copyOf(new InterfaceC16859e[]{obj2}, 1);
                    ClassLoader classLoader = AbstractC15849e.class.getClassLoader();
                    AbstractC1213e.vip("io.ktor.server.Application");
                    C3168e c3168e = new C3168e(0);
                    InterfaceC4911e vip2 = AbstractC1213e.vip("io.ktor.server.Application");
                    C5389e c5389e = new C5389e(12);
                    ?? obj3 = new Object();
                    obj3.f23072e = classLoader;
                    obj3.f23070e = vip2;
                    obj3.f23069e = c3168e;
                    obj3.f23071e = c5389e;
                    ArrayList arrayList2 = new ArrayList();
                    Collections.singletonList(str);
                    boolean z = AbstractC6015e.ad;
                    InterfaceC8850e mo394const = interfaceC18435e.advert().mo394const(C2693e.f6576e);
                    arrayList2.add(c4870e);
                    C12856e c12856e = new C12856e(new C12344e((C11467e) obj3, AbstractC13480e.m3575continue(arrayList2), singletonList, z, mo394const), new C10739e(20, interfaceC16859eArr));
                    this.f30898e = null;
                    this.f30899e = 1;
                    C15420e c15420e = AbstractC6731e.ad;
                    if (AbstractC5336e.advert(ExecutorC3603e.f8134e, new C9042e(c12856e, interfaceC5083e, 19), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
