package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10680e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1403e f21038e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0438e f21039e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21040e;

    public /* synthetic */ C10680e(C0438e c0438e, InterfaceC1403e interfaceC1403e, int i) {
        this.f21040e = i;
        this.f21039e = c0438e;
        this.f21038e = interfaceC1403e;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [eّؖٝ, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21040e) {
            case 0:
                C0438e c0438e = this.f21039e;
                C17161e c17161e = c0438e.purchase;
                C14515e c14515e = new C14515e(6, this.f21038e);
                ?? obj = new Object();
                c0438e.appmetrica.metrica("dataBuilder", c17161e, new Celse(obj, c14515e, 6));
                Object obj2 = obj.f9318e;
                if (obj2 == null) {
                    obj2 = Unit.INSTANCE;
                }
                return (C17828e) obj2;
            case 1:
                C0438e c0438e2 = this.f21039e;
                C17161e c17161e2 = c0438e2.billing;
                C10680e c10680e = new C10680e(c0438e2, this.f21038e, 2);
                ?? obj3 = new Object();
                c0438e2.appmetrica.metrica("positioner", c17161e2, new Celse(obj3, c10680e, 6));
                Object obj4 = obj3.f9318e;
                if (obj4 == null) {
                    obj4 = Unit.INSTANCE;
                }
                return (C0763e) obj4;
            default:
                Object invoke = this.f21039e.metrica.invoke();
                if (!((InterfaceC0043e) invoke).billing()) {
                    invoke = null;
                }
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) invoke;
                return interfaceC0043e == null ? C0763e.appmetrica : this.f21038e.loadAd(interfaceC0043e).amazon(interfaceC0043e.mo211this(0L));
        }
    }
}
