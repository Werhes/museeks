package defpackage;

import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12011e extends AbstractC8761e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f24020e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13475e f24021e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f24022e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC1186e f24023e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13475e f24024e;

    static {
        C12156e c12156e = new C12156e(C12011e.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f24020e = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C12011e.class, "arguments", "getArguments()Ljava/util/List;", 0, c12232e)};
    }

    public C12011e(AbstractC1186e abstractC1186e) {
        this(abstractC1186e, null, false);
    }

    public C12011e(AbstractC1186e abstractC1186e, Function0 function0, boolean z) {
        super(function0);
        this.f24023e = abstractC1186e;
        this.f24022e = z;
        this.f24024e = AbstractC2426e.vip(null, new C7663e(this, 0));
        this.f24021e = AbstractC2426e.vip(null, new C12056e(this, function0, 12));
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC13984e adcel() {
        AbstractC15728e subscription = this.f24023e.subscription();
        Cinstanceof cinstanceof = subscription instanceof Cinstanceof ? (Cinstanceof) subscription : null;
        AbstractC10226e abstractC10226e = cinstanceof != null ? cinstanceof.f36405e : null;
        if (abstractC10226e != null) {
            return new C12011e(abstractC10226e, this.f17665e, true);
        }
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean admob() {
        AbstractC1186e abstractC1186e = this.f24023e;
        if (abstractC1186e != null) {
            C0520e c0520e = AbstractC13270e.appmetrica;
            return AbstractC13270e.ads(abstractC1186e, AbstractC0206e.vip);
        }
        AbstractC13270e.ad(138);
        throw null;
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC7227e advert() {
        InterfaceC4077e advert = this.f24023e.loadAd().advert();
        InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
        if (interfaceC5052e != null) {
            String str = C0696e.ad;
            if (C0696e.adcel.containsKey(AbstractC14300e.purchase(interfaceC5052e))) {
                return AbstractC17749e.ad ? new C11005e((InterfaceC7227e) isVip(), AbstractC2876e.billing(interfaceC5052e).ad.ad, new C12857e(interfaceC5052e, 0), new C12857e(interfaceC5052e, 1)) : AbstractC2728e.purchase(AbstractC2876e.billing(interfaceC5052e), (InterfaceC7227e) isVip());
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean amazon() {
        return this.f24023e.subscription() instanceof C12519e;
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: class */
    public final AbstractC8761e mo2501class(boolean z) {
        AbstractC1186e abstractC1186e = this.f24023e;
        return ((abstractC1186e.subscription() instanceof AbstractC14773e) || abstractC1186e.Signature() != z) ? new C12011e(AbstractC11957e.billing(abstractC1186e, z), this.f17665e, false) : this;
    }

    @Override // defpackage.AbstractC8761e
    public final AbstractC8761e crashlytics() {
        AbstractC15728e subscription = this.f24023e.subscription();
        if (subscription instanceof AbstractC14773e) {
            return new C12011e(((AbstractC14773e) subscription).f29222e);
        }
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean equals(Object obj) {
        if (!AbstractC17749e.ad) {
            return super.equals(obj);
        }
        if (!(obj instanceof C12011e)) {
            return false;
        }
        C12011e c12011e = (C12011e) obj;
        return AbstractC7890e.billing(this.f24023e, c12011e.f24023e) && AbstractC7890e.billing(isVip(), c12011e.isVip()) && signatures().equals(c12011e.signatures());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r4 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r4 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r0 = r4;
     */
    @Override // defpackage.AbstractC8761e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC8761e firebase(boolean r4) {
        /*
            r3 = this;
            eٜؒؒ r0 = r3.f24023e
            if (r4 == 0) goto L11
            eٕۛٙ r4 = r0.subscription()
            r1 = 1
            eّٗؓ r4 = defpackage.C17354e.amazon(r4, r1)
            if (r4 == 0) goto L21
        Lf:
            r0 = r4
            goto L21
        L11:
            boolean r4 = r0 instanceof defpackage.C12519e
            if (r4 == 0) goto L19
            r4 = r0
            eّٗؓ r4 = (defpackage.C12519e) r4
            goto L1a
        L19:
            r4 = 0
        L1a:
            if (r4 == 0) goto L21
            eَْ r4 = r4.f25058e
            if (r4 == 0) goto L21
            goto Lf
        L21:
            eِۜۦ r4 = new eِۜۦ
            eْۙۜ r1 = r3.f17665e
            r2 = 0
            r4.<init>(r0, r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12011e.firebase(boolean):eٌ٘٘");
    }

    @Override // defpackage.InterfaceC11034e
    public final List getAnnotations() {
        return AbstractC5965e.vip(this.f24023e);
    }

    /* renamed from: goto, reason: not valid java name */
    public final InterfaceC0861e m3311goto(AbstractC1186e abstractC1186e) {
        AbstractC1186e vip;
        if (this.f24022e) {
            InterfaceC4077e advert = abstractC1186e.loadAd().advert();
            C5572e c5572e = advert instanceof C5572e ? (C5572e) advert : null;
            if (c5572e != null) {
                return new C13967e(AbstractC2876e.billing(c5572e));
            }
        }
        InterfaceC4077e advert2 = abstractC1186e.loadAd().advert();
        if (advert2 instanceof InterfaceC5052e) {
            Class yandex = AbstractC5965e.yandex((InterfaceC5052e) advert2);
            if (yandex != null) {
                if (!AbstractC13270e.isPro(abstractC1186e)) {
                    if (AbstractC11957e.appmetrica(abstractC1186e)) {
                        return new C8404e(yandex);
                    }
                    Class cls = (Class) AbstractC2677e.vip.get(yandex);
                    if (cls != null) {
                        yandex = cls;
                    }
                    return new C8404e(yandex);
                }
                AbstractC16232e abstractC16232e = (AbstractC16232e) AbstractC13480e.m3603synchronized(abstractC1186e.mopub());
                if (abstractC16232e == null || (vip = abstractC16232e.vip()) == null) {
                    return new C8404e(yandex);
                }
                InterfaceC0861e m3311goto = m3311goto(AbstractC11957e.billing(vip, true));
                if (m3311goto != null) {
                    return new C8404e(Array.newInstance((Class<?>) ((InterfaceC18155e) AbstractC12751e.adcel(m3311goto)).subs(), 0).getClass());
                }
                throw new Error("Cannot determine classifier for array element type: " + this);
            }
        } else if (advert2 instanceof InterfaceC16046e) {
            return new C17936e(null, (InterfaceC16046e) advert2);
        }
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final int hashCode() {
        if (!AbstractC17749e.ad) {
            return super.hashCode();
        }
        int hashCode = this.f24023e.hashCode() * 31;
        InterfaceC0861e isVip = isVip();
        return signatures().hashCode() + ((hashCode + (isVip != null ? isVip.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: interface */
    public final AbstractC8761e mo2502interface() {
        AbstractC15728e subscription = this.f24023e.subscription();
        if (subscription instanceof AbstractC14773e) {
            return new C12011e(((AbstractC14773e) subscription).f29221e);
        }
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean isPro() {
        return this.f24023e instanceof C13902e;
    }

    @Override // defpackage.InterfaceC13984e
    public final InterfaceC0861e isVip() {
        InterfaceC8614e interfaceC8614e = f24020e[0];
        return (InterfaceC0861e) this.f24024e.invoke();
    }

    @Override // defpackage.InterfaceC13984e
    public final List signatures() {
        InterfaceC8614e interfaceC8614e = f24020e[1];
        return (List) this.f24021e.invoke();
    }

    @Override // defpackage.InterfaceC13984e
    public final boolean startapp() {
        return this.f24023e.Signature();
    }

    @Override // defpackage.AbstractC8761e
    public final boolean subs() {
        InterfaceC4077e advert = this.f24023e.loadAd().advert();
        AbstractC13445e abstractC13445e = null;
        if (advert != null && (advert instanceof InterfaceC5052e) && AbstractC13270e.m3539this(advert)) {
            int i = AbstractC2876e.ad;
            abstractC13445e = AbstractC16155e.startapp(AbstractC14300e.purchase(advert));
        }
        return AbstractC7890e.billing(abstractC13445e, C2597e.metrica);
    }
}
