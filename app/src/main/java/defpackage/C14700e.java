package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14700e extends AbstractC16858e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f29117e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f29118e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f29119e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f29120e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f29121e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f29122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14700e(Object obj, C15274e c15274e, Function0 function0, boolean z, Function1 function1, Function2 function2) {
        super(3);
        this.f29119e = obj;
        this.f29118e = c15274e;
        this.f29120e = function0;
        this.f29117e = z;
        this.f29122e = function1;
        this.f29121e = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj;
        C13770e c13770e = (C13770e) obj2;
        ((Number) obj3).intValue();
        c13770e.m3676strictfp(1321786060);
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            C12261e c12261e = new C12261e(AbstractC17680e.startapp(c13770e));
            c13770e.m3682throws(c12261e);
            m3681throw = c12261e;
        }
        InterfaceC18435e interfaceC18435e = ((C12261e) m3681throw).f24591e;
        c13770e.m3676strictfp(-98757340);
        Object m3681throw2 = c13770e.m3681throw();
        if (m3681throw2 == c5170e) {
            m3681throw2 = AbstractC14533e.startapp(null);
            c13770e.m3682throws(m3681throw2);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw2;
        c13770e.Signature(false);
        c13770e.m3676strictfp(-98754771);
        Object m3681throw3 = c13770e.m3681throw();
        if (m3681throw3 == c5170e) {
            m3681throw3 = AbstractC14533e.startapp(Boolean.FALSE);
            c13770e.m3682throws(m3681throw3);
        }
        InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw3;
        c13770e.Signature(false);
        c13770e.m3676strictfp(-98752375);
        boolean yandex = c13770e.yandex(interfaceC18435e);
        C15274e c15274e = this.f29118e;
        boolean purchase = yandex | c13770e.purchase(c15274e);
        Function0 function0 = this.f29120e;
        boolean purchase2 = purchase | c13770e.purchase(function0);
        Object m3681throw4 = c13770e.m3681throw();
        if (purchase2 || m3681throw4 == c5170e) {
            C11759e c11759e = new C11759e(this.f29120e, interfaceC3314e2, interfaceC3314e, interfaceC18435e, this.f29118e);
            c13770e.m3682throws(c11759e);
            m3681throw4 = c11759e;
        }
        c13770e.Signature(false);
        AbstractC17680e.vip(this.f29119e, (Function1) m3681throw4, c13770e);
        boolean z = this.f29117e;
        Boolean valueOf = Boolean.valueOf(z);
        c13770e.m3676strictfp(-98737076);
        boolean billing = c13770e.billing(z) | c13770e.yandex(C9616e.f19067e) | c13770e.yandex(interfaceC18435e) | c13770e.purchase(c15274e) | c13770e.purchase(this.f29122e) | c13770e.purchase(function0) | c13770e.purchase(this.f29121e);
        Object m3681throw5 = c13770e.m3681throw();
        if (billing || m3681throw5 == c5170e) {
            C17315e c17315e = new C17315e(this.f29117e, this.f29121e, this.f29122e, interfaceC3314e2, interfaceC18435e, this.f29118e, interfaceC3314e, this.f29120e, null);
            c13770e.m3682throws(c17315e);
            m3681throw5 = c17315e;
        }
        c13770e.Signature(false);
        C2561e c2561e = AbstractC0845e.ad;
        InterfaceC12864e premium = interfaceC12864e.premium(new C8128e(this.f29119e, valueOf, null, new C9614e((Function2) m3681throw5), 4));
        c13770e.Signature(false);
        return premium;
    }
}
