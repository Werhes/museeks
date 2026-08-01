package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16075e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18046e f31671e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31672e;

    public /* synthetic */ C16075e(C18046e c18046e, int i) {
        this.f31672e = i;
        this.f31671e = c18046e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f31672e;
        C18046e c18046e = this.f31671e;
        switch (i) {
            case 0:
                InterfaceC5083e interfaceC5083e = null;
                C4738e c4738e = new C4738e(c18046e, interfaceC5083e, 3);
                C7602e c7602e = new C7602e(c18046e, interfaceC5083e, 18);
                C16075e c16075e = new C16075e(c18046e, 2);
                Unit unit = Unit.INSTANCE;
                ((C2860e) obj).ad.add(new C7488e(c7602e, c4738e, c16075e));
                return Unit.INSTANCE;
            case 1:
                C11787e c11787e = ((C18141e) obj).vip;
                String str = c18046e.yandex;
                if (AbstractC5304e.inmobi(str, "/", false) || AbstractC5304e.inmobi(str, "?", false) || AbstractC5304e.inmobi(str, "#", false)) {
                    AbstractC1515e.ad.smaato("DefaultRequest.host was set to '" + str + "', which is not a valid host. Host must not contain scheme, path, query or fragment. Use `url(...)` or `url{ ... }` instead.");
                }
                c11787e.ad = str;
                c11787e.license = C16063e.f31628e;
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(AbstractC7890e.billing(((C10263e) obj).ad.ad, c18046e.yandex));
        }
    }
}
