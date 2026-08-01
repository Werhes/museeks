package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۢ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12826e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2347e f25648e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25649e;

    public /* synthetic */ C12826e(C2347e c2347e, int i) {
        this.f25649e = i;
        this.f25648e = c2347e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25649e) {
            case 0:
                this.f25648e.f5881e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                C2347e c2347e = this.f25648e;
                InterfaceC5738e interfaceC5738e = (InterfaceC5738e) c2347e.f5879e.getValue();
                if (interfaceC5738e instanceof C10705e) {
                    C5658e.ad.vip(((C10705e) interfaceC5738e).ad);
                    c2347e.purchase();
                } else {
                    c2347e.f5881e.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 2:
                this.f25648e.purchase();
                return Unit.INSTANCE;
            case 3:
                this.f25648e.f10582e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC1786e.signatures(new StringBuilder("https://id."), AbstractC7205e.metrica, "/about/faq/users/registration_and_login/login/QR/20314"))));
                return Unit.INSTANCE;
            case 4:
                this.f25648e.f5881e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                this.f25648e.purchase();
                return Unit.INSTANCE;
            default:
                EnumC10002e enumC10002e = EnumC10002e.f19759e;
                C2347e c2347e2 = this.f25648e;
                c2347e2.m808interface(enumC10002e);
                c2347e2.m807goto(C15142e.ad);
                return Unit.INSTANCE;
        }
    }
}
