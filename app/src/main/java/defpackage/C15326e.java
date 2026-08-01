package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15326e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15052e f30246e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30247e;

    public /* synthetic */ C15326e(C15052e c15052e, int i) {
        this.f30247e = i;
        this.f30246e = c15052e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30247e) {
            case 0:
                this.f30246e.m2514goto(new C5299e(1));
                return Unit.INSTANCE;
            case 1:
                this.f30246e.m2514goto(new C5299e(4));
                return Unit.INSTANCE;
            case 2:
                this.f30246e.m2514goto(new C0963e((String) null, 3));
                return Unit.INSTANCE;
            case 3:
                this.f30246e.m2514goto(new C1718e());
                return Unit.INSTANCE;
            case 4:
                ((AppActivity) this.f30246e.pro()).f36542e.license(C2576e.f6436e);
                return Unit.INSTANCE;
            case 5:
                this.f30246e.m2514goto(new C5769e());
                return Unit.INSTANCE;
            case 6:
                this.f30246e.m2514goto(new C5299e(0));
                return Unit.INSTANCE;
            case 7:
                this.f30246e.m2514goto(new C5299e(2));
                return Unit.INSTANCE;
            case 8:
                new C2347e().signatures(this.f30246e.pro());
                return Unit.INSTANCE;
            case 9:
                new C4320e().signatures(this.f30246e.pro());
                return Unit.INSTANCE;
            case 10:
                AbstractC7237e.metrica(this.f30246e.pro(), new C5422e());
                return Unit.INSTANCE;
            case 11:
                C14027e c14027e = C14027e.ad;
                Activity pro = this.f30246e.pro();
                c14027e.getClass();
                C14027e.appmetrica(pro);
                return Unit.INSTANCE;
            case 12:
                this.f30246e.m2514goto(new Cpublic());
                return Unit.INSTANCE;
            case 13:
                this.f30246e.m2514goto(new AbstractC10347e(0));
                return Unit.INSTANCE;
            default:
                this.f30246e.m2514goto(new C5299e(3));
                return Unit.INSTANCE;
        }
    }
}
