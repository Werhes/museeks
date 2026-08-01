package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5513e extends UnsupportedOperationException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f11788e;

    public C5513e(AbstractC16824e abstractC16824e, InterfaceC7227e interfaceC7227e, InterfaceC7227e interfaceC7227e2) {
        StringBuilder sb = new StringBuilder("\n        Expected response body of the type '");
        sb.append(interfaceC7227e2);
        sb.append("' but was '");
        sb.append(interfaceC7227e);
        sb.append("'\n        In response from `");
        sb.append(AbstractC11263e.mopub(abstractC16824e).getUrl());
        sb.append("`\n        Response status `");
        sb.append(abstractC16824e.billing());
        sb.append("`\n        Response header `ContentType: ");
        sb.append(abstractC16824e.ad().mo459e("Content-Type"));
        sb.append("` \n        Request header `Accept: ");
        InterfaceC4393e interfaceC4393e = abstractC16824e.vip().f10751e;
        sb.append((interfaceC4393e == null ? null : interfaceC4393e).ad().mo459e("Accept"));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f11788e = AbstractC17540e.license(sb.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f11788e;
    }
}
