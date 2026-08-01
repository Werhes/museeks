package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4073e extends C9442e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f9042e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f9043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4073e(AbstractC16824e abstractC16824e, String str, int i) {
        super(abstractC16824e, str);
        this.f9042e = i;
        switch (i) {
            case 1:
                super(abstractC16824e, str);
                StringBuilder sb = new StringBuilder("Unhandled redirect: ");
                InterfaceC4393e interfaceC4393e = abstractC16824e.vip().f10751e;
                sb.append((interfaceC4393e == null ? null : interfaceC4393e).getMethod().ad);
                sb.append(' ');
                InterfaceC4393e interfaceC4393e2 = abstractC16824e.vip().f10751e;
                sb.append((interfaceC4393e2 != null ? interfaceC4393e2 : null).getUrl());
                sb.append(". Status: ");
                sb.append(abstractC16824e.billing());
                sb.append(". Text: \"");
                this.f9043e = AbstractC4653e.applovin(sb, str, '\"');
                return;
            case 2:
                super(abstractC16824e, str);
                StringBuilder sb2 = new StringBuilder("Server error(");
                InterfaceC4393e interfaceC4393e3 = abstractC16824e.vip().f10751e;
                sb2.append((interfaceC4393e3 == null ? null : interfaceC4393e3).getMethod().ad);
                sb2.append(' ');
                InterfaceC4393e interfaceC4393e4 = abstractC16824e.vip().f10751e;
                sb2.append((interfaceC4393e4 != null ? interfaceC4393e4 : null).getUrl());
                sb2.append(": ");
                sb2.append(abstractC16824e.billing());
                sb2.append(". Text: \"");
                this.f9043e = AbstractC4653e.applovin(sb2, str, '\"');
                return;
            default:
                StringBuilder sb3 = new StringBuilder("Client request(");
                InterfaceC4393e interfaceC4393e5 = abstractC16824e.vip().f10751e;
                sb3.append((interfaceC4393e5 == null ? null : interfaceC4393e5).getMethod().ad);
                sb3.append(' ');
                InterfaceC4393e interfaceC4393e6 = abstractC16824e.vip().f10751e;
                sb3.append((interfaceC4393e6 != null ? interfaceC4393e6 : null).getUrl());
                sb3.append(") invalid: ");
                sb3.append(abstractC16824e.billing());
                sb3.append(". Text: \"");
                this.f9043e = AbstractC4653e.applovin(sb3, str, '\"');
                return;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f9042e) {
            case 0:
                return this.f9043e;
            case 1:
                return this.f9043e;
            default:
                return this.f9043e;
        }
    }
}
