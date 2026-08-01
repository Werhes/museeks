package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18001e extends C6467e implements InterfaceC5083e, InterfaceC18435e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC8850e f35291e;

    public AbstractC18001e(InterfaceC8850e interfaceC8850e, boolean z) {
        super(z);
        m2180private((InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e));
        this.f35291e = interfaceC8850e.mo394const(this);
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return this.f35291e;
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f35291e;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        Throwable ad = C13523e.ad(obj);
        if (ad != null) {
            obj = new C1427e(ad, false);
        }
        Object m2176instanceof = m2176instanceof(obj);
        if (m2176instanceof == AbstractC15211e.vip) {
            return;
        }
        signatures(m2176instanceof);
    }

    /* renamed from: eٌؖۡ */
    public void mo852e(Object obj) {
    }

    /* renamed from: eُٓؓ */
    public void mo854e(Throwable th, boolean z) {
    }

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public final void m4472e(int i, AbstractC18001e abstractC18001e, Function2 function2) {
        Object invoke;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            try {
                AbstractC7214e.advert(AbstractC10558e.startapp(AbstractC10558e.yandex(abstractC18001e, this, function2)), Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                AbstractC17673e.license(this, th);
                throw null;
            }
        }
        if (m2467class != 1) {
            if (m2467class == 2) {
                AbstractC10558e.startapp(AbstractC10558e.yandex(abstractC18001e, this, function2)).billing(Unit.INSTANCE);
                return;
            }
            if (m2467class != 3) {
                throw new C14803e(10);
            }
            try {
                InterfaceC8850e interfaceC8850e = this.f35291e;
                Object purchase = AbstractC2745e.purchase(interfaceC8850e, null);
                try {
                    if (function2 instanceof AbstractC9049e) {
                        AbstractC9476e.purchase(2, function2);
                        invoke = function2.invoke(abstractC18001e, this);
                    } else {
                        invoke = AbstractC10558e.mopub(function2, abstractC18001e, this);
                    }
                    AbstractC2745e.appmetrica(interfaceC8850e, purchase);
                    if (invoke != EnumC2821e.f6782e) {
                        billing(invoke);
                    }
                } catch (Throwable th2) {
                    AbstractC2745e.appmetrica(interfaceC8850e, purchase);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof C15295e) {
                    th = ((C15295e) th).f30221e;
                }
                billing(new C12763e(th));
            }
        }
    }

    @Override // defpackage.C6467e
    public final String firebase() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.C6467e
    /* renamed from: strictfp */
    public final void mo2181strictfp(C14803e c14803e) {
        AbstractC15849e.license(this.f35291e, c14803e);
    }

    @Override // defpackage.C6467e
    /* renamed from: throws */
    public final void mo2186throws(Object obj) {
        if (!(obj instanceof C1427e)) {
            mo852e(obj);
        } else {
            C1427e c1427e = (C1427e) obj;
            mo854e(c1427e.ad, C1427e.vip.get(c1427e) == 1);
        }
    }
}
