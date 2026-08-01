package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: eَْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13171e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC13270e f26150e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26151e;

    public /* synthetic */ C13171e(AbstractC13270e abstractC13270e, int i) {
        this.f26151e = i;
        this.f26150e = abstractC13270e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f26151e) {
            case 0:
                return ((InterfaceC5334e) obj).amazon().startapp(this.f26150e.signatures());
            default:
                C0520e c0520e = (C0520e) obj;
                C16113e advert = this.f26150e.advert();
                C12816e c12816e = AbstractC4972e.mopub;
                C5266e c5266e = ((C14887e) advert.mo1886e(c12816e)).f29499e;
                if (c5266e == null) {
                    AbstractC13270e.ad(11);
                    throw null;
                }
                InterfaceC4077e appmetrica = c5266e.appmetrica(c0520e, EnumC2192e.f5578e);
                if (appmetrica == null) {
                    throw new AssertionError("Built-in class " + c12816e.ad(c0520e) + " is not found");
                }
                if (appmetrica instanceof InterfaceC5052e) {
                    return (InterfaceC5052e) appmetrica;
                }
                throw new AssertionError("Must be a class descriptor " + c0520e + ", but was " + appmetrica);
        }
    }
}
