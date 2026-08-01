package defpackage;

import android.graphics.Canvas;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7314e extends AbstractC16858e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14971e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f14972e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f14973e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f14974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7314e(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.f14973e = i;
        this.f14972e = obj;
        this.f14974e = obj2;
        this.f14971e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7314e(C9820e c9820e, C13915e c13915e, C9820e c9820e2) {
        super(1);
        this.f14973e = 0;
        this.f14972e = c9820e;
        this.f14971e = c13915e;
        this.f14974e = c9820e2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7314e(C11795e c11795e, C8212e c8212e, Function1 function1) {
        super(1);
        this.f14973e = 7;
        this.f14972e = c11795e;
        this.f14974e = c8212e;
        this.f14971e = (AbstractC16858e) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [eؚٗٗ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v7, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC8501e interfaceC8501e;
        int i = this.f14973e;
        EnumC9253e enumC9253e = EnumC9253e.f18468e;
        r5 = null;
        C13220e c13220e = null;
        boolean z = false;
        Object[] objArr = 0;
        Object obj2 = this.f14971e;
        Object obj3 = this.f14972e;
        Object obj4 = this.f14974e;
        switch (i) {
            case 0:
                C9820e c9820e = (C9820e) obj3;
                C13915e c13915e = (C13915e) obj2;
                C9820e c9820e2 = (C9820e) obj4;
                InterfaceC14576e m4557this = ((InterfaceC2235e) obj).mo782finally().m4557this();
                if (c9820e.getView().getVisibility() != 8) {
                    c9820e.f19651e = true;
                    InterfaceC16590e interfaceC16590e = c13915e.f27599e;
                    ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = interfaceC16590e instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e ? (ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC5014e != null) {
                        Canvas canvas = AbstractC16863e.ad;
                        Canvas canvas2 = ((C11648e) m4557this).ad;
                        viewTreeObserverOnGlobalLayoutListenerC5014e.getAndroidViewsHandler$ui().getClass();
                        c9820e2.draw(canvas2);
                    }
                    c9820e.f19651e = false;
                }
                return Unit.INSTANCE;
            case 1:
                return new C18034e(objArr == true ? 1 : 0, (C12742e) obj3, obj4, (C15921e) obj2);
            case 2:
                return ((Boolean) obj).booleanValue() == ((Boolean) ((C11120e) obj3).vip.license.getValue()).booleanValue() ? (C0763e) obj4 : (C0763e) obj2;
            case 3:
                C7556e c7556e = (C7556e) obj;
                if (!c7556e.f27016e) {
                    return EnumC9253e.f18466e;
                }
                if (c7556e.f15384e != null) {
                    AbstractC14070e.metrica("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                Function1 function1 = c7556e.f15385e;
                InterfaceC13418e interfaceC13418e = function1 != null ? (InterfaceC13418e) function1.invoke((C6057e) obj3) : null;
                c7556e.f15384e = interfaceC13418e;
                Object[] objArr2 = interfaceC13418e != null;
                if (objArr2 != false) {
                    ((ViewOnDragListenerC18365e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert((C7556e) obj4)).getDragAndDropManager()).vip.add(c7556e);
                }
                C9302e c9302e = (C9302e) obj2;
                if (!c9302e.f18534e && objArr2 == false) {
                    r6 = false;
                }
                c9302e.f18534e = r6;
                return enumC9253e;
            case 4:
                InterfaceC6459e interfaceC6459e = (InterfaceC6459e) obj;
                C7556e c7556e2 = (C7556e) interfaceC6459e;
                if (!((ViewOnDragListenerC18365e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert((C7556e) obj4)).getDragAndDropManager()).vip.contains(c7556e2) || !AbstractC7844e.ad(c7556e2, AbstractC0882e.license((C6057e) obj2))) {
                    return enumC9253e;
                }
                ((C4246e) obj3).f9318e = interfaceC6459e;
                return EnumC9253e.f18465e;
            case 5:
                C10122e c10122e = (C10122e) obj;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj4;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) obj3;
                c10122e.metrica(interfaceC16132e2 != null ? ((Number) interfaceC16132e2.getValue()).floatValue() : 1.0f);
                c10122e.advert(interfaceC16132e != null ? ((Number) interfaceC16132e.getValue()).floatValue() : 1.0f);
                c10122e.smaato(interfaceC16132e != null ? ((Number) interfaceC16132e.getValue()).floatValue() : 1.0f);
                InterfaceC16132e interfaceC16132e3 = (InterfaceC16132e) obj2;
                c10122e.admob(interfaceC16132e3 != null ? ((C13220e) interfaceC16132e3.getValue()).ad : C13220e.vip);
                return Unit.INSTANCE;
            case 6:
                C18351e c18351e = (C18351e) obj4;
                C2128e c2128e = (C2128e) obj2;
                int ordinal = ((EnumC10292e) obj).ordinal();
                if (ordinal == 0) {
                    C12395e c12395e = c18351e.ad.license;
                    if (c12395e != null) {
                        c13220e = new C13220e(c12395e.vip);
                    } else {
                        C12395e c12395e2 = c2128e.ad.license;
                        if (c12395e2 != null) {
                            c13220e = new C13220e(c12395e2.vip);
                        }
                    }
                } else if (ordinal == 1) {
                    c13220e = (C13220e) obj3;
                } else {
                    if (ordinal != 2) {
                        throw new C14803e(10);
                    }
                    C12395e c12395e3 = c2128e.ad.license;
                    if (c12395e3 != null) {
                        c13220e = new C13220e(c12395e3.vip);
                    } else {
                        C12395e c12395e4 = c18351e.ad.license;
                        if (c12395e4 != null) {
                            c13220e = new C13220e(c12395e4.vip);
                        }
                    }
                }
                return new C13220e(c13220e != null ? c13220e.ad : C13220e.vip);
            case 7:
                C11795e c11795e = (C11795e) obj;
                if (!AbstractC7890e.billing(c11795e, (C11795e) obj3)) {
                    if (AbstractC7890e.billing(c11795e, ((C8212e) obj4).metrica)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    z = ((Boolean) ((AbstractC16858e) obj2).invoke(c11795e)).booleanValue();
                }
                return Boolean.valueOf(z);
            case 8:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                C4017e c4017e = (C4017e) obj3;
                C14434e c14434e = c4017e.f8940e;
                InterfaceC8501e interfaceC8501e2 = c4017e.f8939e;
                c4017e.f8939e = (InterfaceC8501e) obj4;
                try {
                    InterfaceC14388e m4534extends = interfaceC2235e.mo782finally().m4534extends();
                    EnumC7792e m4562while = interfaceC2235e.mo782finally().m4562while();
                    InterfaceC14576e m4557this2 = interfaceC2235e.mo782finally().m4557this();
                    long m4560try = interfaceC2235e.mo782finally().m4560try();
                    C16446e c16446e = (C16446e) interfaceC2235e.mo782finally().f36227e;
                    Function1 function12 = (Function1) obj2;
                    InterfaceC14388e m4534extends2 = c14434e.f28537e.m4534extends();
                    EnumC7792e m4562while2 = c14434e.f28537e.m4562while();
                    InterfaceC14576e m4557this3 = c14434e.f28537e.m4557this();
                    long m4560try2 = c14434e.f28537e.m4560try();
                    C18478e c18478e = c14434e.f28537e;
                    try {
                        C16446e c16446e2 = (C16446e) c18478e.f36227e;
                        c18478e.m4532const(m4534extends);
                        c18478e.m4542for(m4562while);
                        c18478e.m4541finally(m4557this2);
                        c18478e.m4533continue(m4560try);
                        c18478e.f36227e = c16446e;
                        m4557this2.billing();
                        try {
                            function12.invoke(c4017e);
                            m4557this2.admob();
                            C18478e c18478e2 = c14434e.f28537e;
                            c18478e2.m4532const(m4534extends2);
                            c18478e2.m4542for(m4562while2);
                            c18478e2.m4541finally(m4557this3);
                            c18478e2.m4533continue(m4560try2);
                            c18478e2.f36227e = c16446e2;
                            c4017e.f8939e = interfaceC8501e2;
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            interfaceC8501e = interfaceC8501e2;
                            try {
                                m4557this2.admob();
                                C18478e c18478e3 = c14434e.f28537e;
                                c18478e3.m4532const(m4534extends2);
                                c18478e3.m4542for(m4562while2);
                                c18478e3.m4541finally(m4557this3);
                                c18478e3.m4533continue(m4560try2);
                                c18478e3.f36227e = c16446e2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                c4017e.f8939e = interfaceC8501e;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC8501e = interfaceC8501e2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC8501e = interfaceC8501e2;
                }
            case 9:
                C2164e c2164e = (C2164e) obj;
                long vip = c2164e.vip();
                C10743e c10743e = (C10743e) obj3;
                return Boolean.valueOf(((Boolean) c10743e.yandex.invoke((C0763e) obj4, AbstractC18489e.billing(AbstractC12246e.ad((float) ((int) (vip >> 32)), (float) ((int) (vip & 4294967295L))), AbstractC8116e.startapp(c2164e.metrica())))).booleanValue() && c10743e.admob.contains(c2164e.ad.mopub) && ((Boolean) ((Function1) obj2).invoke(c2164e)).booleanValue());
            case 10:
                InterfaceC2235e interfaceC2235e2 = (InterfaceC2235e) obj;
                AbstractC4653e.admob(interfaceC2235e2, (AbstractC4457e) obj3, 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC4653e.admob(interfaceC2235e2, (AbstractC4457e) obj4, 0L, 0L, 0.0f, null, null, 13, 62);
                long j = C3618e.metrica;
                AbstractC4653e.subscription(interfaceC2235e2, j, 0L, 0L, 0.0f, new C13121e(interfaceC2235e2.mo497instanceof((float) 0.5d), 0.0f, 0, 0, null, 30), null, 0, 110);
                C15036e c15036e = (C15036e) obj2;
                float f = 6;
                long yandex = interfaceC2235e2.yandex();
                long ad = AbstractC12246e.ad(c15036e.vip * C2108e.purchase(yandex), (1.0f - c15036e.metrica) * C2108e.metrica(yandex));
                float f2 = 2;
                AbstractC4653e.mopub(interfaceC2235e2, C3618e.appmetrica, interfaceC2235e2.mo497instanceof(f), ad, new C13121e(interfaceC2235e2.mo497instanceof(f2), 0.0f, 0, 0, null, 30), 104);
                AbstractC4653e.mopub(interfaceC2235e2, j, interfaceC2235e2.mo497instanceof(f - f2), ad, new C13121e(interfaceC2235e2.mo497instanceof(1), 0.0f, 0, 0, null, 30), 104);
                return Unit.INSTANCE;
            default:
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                C1954e c1954e = (C1954e) obj4;
                InterfaceC0043e license = abstractC3698e.license();
                if (license != null) {
                    if (((InterfaceC13158e) obj3).mo398transient()) {
                        c1954e.f5147e.f27006e = license;
                    } else {
                        c1954e.f5147e.f26999e = license;
                    }
                }
                abstractC3698e.billing((AbstractC2832e) obj2, 0, 0, 0.0f);
                return Unit.INSTANCE;
        }
    }
}
