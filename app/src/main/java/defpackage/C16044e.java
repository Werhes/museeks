package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16044e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f31607e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ long f31608e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1940e f31609e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14609e f31610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16044e(C14609e c14609e, InterfaceC1940e interfaceC1940e, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31610e = c14609e;
        this.f31609e = interfaceC1940e;
        this.f31608e = j;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C16044e c16044e = new C16044e(this.f31610e, this.f31609e, this.f31608e, interfaceC5083e);
        c16044e.f31607e = obj;
        return c16044e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16044e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object c12763e;
        Throwable th;
        AbstractC2003e.purchase(obj);
        ArrayList arrayList = AbstractC1876e.ad;
        C14609e c14609e = this.f31610e;
        InterfaceC1940e interfaceC1940e = this.f31609e;
        long j = this.f31608e;
        try {
            C9674e c9674e = new C9674e(AbstractC11062e.f21949e.mo1914break(C10301e.f20323e, false));
            try {
                C8028e c8028e = AbstractC0232e.license;
                AbstractC16049e abstractC16049e = c14609e.vip;
                C8264e c8264e = new C8264e(interfaceC1940e, new C4431e(j, abstractC16049e.amazon(), abstractC16049e.getAd(), abstractC16049e.getVip(), abstractC16049e.getMetrica()));
                c8028e.getClass();
                AbstractC4508e.license(c8028e, new C6594e(16, c9674e), C8264e.Companion.serializer(), c8264e);
                Unit unit = Unit.INSTANCE;
                try {
                    c9674e.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    c9674e.close();
                } catch (Throwable th4) {
                    AbstractC13362e.license(th, th4);
                }
            }
        } catch (Throwable th5) {
            c12763e = new C12763e(th5);
        }
        if (th != null) {
            throw th;
        }
        c12763e = Unit.INSTANCE;
        if (C13523e.ad(c12763e) != null) {
            AbstractC11062e.f21949e.loadAd(C10301e.f20323e, false);
        }
        return new C13523e(c12763e);
    }
}
